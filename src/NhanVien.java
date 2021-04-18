import java.util.Scanner;

public class NhanVien extends CanBo {
    private String quanlicongviec;

    public NhanVien() {}

    public NhanVien(String name, String dateOfbirth, String sex, double adress, String quanlicongviec) {
        super(name, dateOfbirth, sex, adress);
        this.quanlicongviec = quanlicongviec;
    }

    public String getQuanlicongviec() {
        return quanlicongviec;
    }

    public void setQuanlicongviec(String quanlicongviec) {
        this.quanlicongviec = quanlicongviec;
    }
    public void inputInfoNhanVien(){
        super.inputInfoCanbo();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cong viec la gi :");
        this.quanlicongviec=scanner.nextLine();
    }
    public void showInfoNhanVien(){
        super.showInfoCanbo();
        System.out.printf("Cong viec la : %s \n",this.quanlicongviec);
    }

}
