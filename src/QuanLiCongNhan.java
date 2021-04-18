import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiCongNhan {
    List<CongNhan>congNhanList=new ArrayList<>();
    //them cong nhan
    public void addCongNhan(CongNhan congNhan){
        congNhanList.add(congNhan);
    }
    //hien thi cong nhan
    public void showCongNhan(){
        for (CongNhan congNhan:congNhanList){
            congNhan.showInfoCongNhan();
        }
    }
    //Tim ten cong nhan
    public void findNameCongNhan(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten cong nhan muon tim keim :");
        String name=scanner.nextLine();
        for (CongNhan congNhan:congNhanList){
            if (congNhan.getName().equals(name)){
                congNhan.showInfoCongNhan();
            }
        }
    }
}
