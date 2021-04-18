import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiCanBo {
    List<CanBo> canBoList = new ArrayList<>();

    //them thanh vien
    public void addInfoCanBo(CanBo canBo) {
        canBoList.add(canBo);
    }

    //hien thi
    public void showCanBo() {
        for (CanBo canBo : canBoList) {
            canBo.showInfoCanbo();
        }
    }
    //tim theo ten
    public void findName(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten can bo muon hien thi");
        String name=scanner.nextLine();
        for (CanBo canBo:canBoList){
            if(canBo.getName().equals(name)){
                canBo.showInfoCanbo();
            } else System.out.println("khong tim thay ten");
        }
    }
}
