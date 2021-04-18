import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLiCanBo quanLiCanBo = new QuanLiCanBo();
        QuanLiNhanVien quanLiNhanVien=new QuanLiNhanVien();
        QuanLiCongNhan quanLiCongNhan=new QuanLiCongNhan();
        QuanLiKySu quanLiKySu=new QuanLiKySu();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    CanBo canBo = new CanBo();
                    canBo.inputInfoCanbo();
                    quanLiCanBo.addInfoCanBo(canBo);
                    break;
                }

                case 2:{
                    quanLiCanBo.showCanBo();
                    break;
                }
                case 3:{
                    quanLiCanBo.findName();
                    break;
                }
                case 4:{
                    NhanVien nhanVien=new NhanVien();
                    nhanVien.inputInfoNhanVien();
                    quanLiNhanVien.addInFoNhanVien(nhanVien);
                    break;
                }
                case 5:{
                    quanLiNhanVien.showNhanVien();
                    break;
                }
                case 6:{
                    quanLiNhanVien.FindNameNhanVien();
                    break;
                }
                case 7:{
                    CongNhan congNhan=new CongNhan();
                    congNhan.inputInfoCongNhan();
                    quanLiCongNhan.addCongNhan(congNhan);
                    break;
                }
                case 8:{
                    quanLiCongNhan.showCongNhan();
                    break;
                }
                case 9:{
                    quanLiCongNhan.findNameCongNhan();
                    break;
                }
                case 10:{
                    KySu kySu=new KySu();
                    kySu.inputInfoKySu();
                    quanLiKySu.addKySu(kySu);
                    break;
                }
                case 11:{
                    quanLiKySu.showKySu();
                    break;
                }
                case 12:{
                    quanLiKySu.findNameKySu();
                    break;
                }

            }
        } while (choice!=0);
    }

    private static void menu() {
        System.out.println("Nhập lựa chọn của bạn : ");
        System.out.println("1. Nhập thông tin can bo");
        System.out.println("2. Hiển thị thông tin can bo");
        System.out.println("3. Tim kiem theo ten can bo");
        System.out.println("4 .Nhap thong tin nhan vien");
        System.out.println("5. Hien thi thong tin cua nhan vien");
        System.out.println("6. Tim kiem theo ten Nhan Vien");
        System.out.println("7 .Nhap thong tin cong nhan");
        System.out.println("8. Hien thi thong tin cua cong nhan");
        System.out.println("9. Tim kiem theo ten cong nhan");
        System.out.println("10 .Nhap thong tin ky su");
        System.out.println("11. Hien thi thong tin cua ky su");
        System.out.println("12. Tim kiem theo ten ky su");
        System.out.println("13. Exit");
    }
}
