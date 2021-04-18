import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiNhanVien {
    List<NhanVien>nhanVienList=new ArrayList<>();
    //them thanh vien lop nhan vien
    public void addInFoNhanVien(NhanVien nhanVien){
        nhanVienList.add(nhanVien);
    }
    //hien thi
    public void showNhanVien(){
        for (NhanVien nhanVien:nhanVienList){
            nhanVien.showInfoNhanVien();
        }
    }
    //tim theo ten nhan vien
    public void FindNameNhanVien(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten muon tim kiem :");
        String name=scanner.nextLine();
        for (NhanVien nhanVien:nhanVienList){
            if(nhanVien.getName().equals(name)){
                nhanVien.showInfoNhanVien();
            }
        }
    }
}
