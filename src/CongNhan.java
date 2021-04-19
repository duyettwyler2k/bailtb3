import java.util.Scanner;

public class CongNhan extends CanBo {
    private String baccongnhan;

    public CongNhan() {
    }

    public CongNhan(String baccongnhan) {
        this.baccongnhan = baccongnhan;
    }

    public String getBaccongnhan() {
        return baccongnhan;
    }

    public void setBaccongnhan(String baccongnhan) {
        this.baccongnhan = baccongnhan;
    }
    public void inputInfoCongNhan(){
        super.inputInfoCanbo();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bac cong nhan la :");
        this.baccongnhan=scanner.nextLine();


    }
    public void showInfoCongNhan(){
        super.showInfoCanbo();
        System.out.printf("Bac cong nhan la : %s",this.baccongnhan);
    }
}
