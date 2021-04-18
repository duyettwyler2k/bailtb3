import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiKySu {
    List<KySu>kySuList=new ArrayList<>();
    //Them ky su
    public void addKySu(KySu kySu){
        kySuList.add(kySu);
    }
    //Hien thi ky su
    public void showKySu(){
        for (KySu kySu:kySuList){
            kySu.showInfoKySu();
        }
    }
    //Tim theo ten ky su
    public void findNameKySu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten ky su muon tim  kiem :");
        String name=scanner.nextLine();
        for (KySu kySu:kySuList){
            if(kySu.getName().equals(name)){
                kySu.showInfoKySu();
            }
        }
    }
}
