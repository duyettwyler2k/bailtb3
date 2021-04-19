import java.util.Scanner;

public class CanBo {
    private String name;
    private String dateOfbirth;
    private String sex;
    private double adress;

    public CanBo() {
    };

    public CanBo(String name, String dateOfbirth, String sex, double adress) {
        this.name = name;
        this.dateOfbirth = dateOfbirth;
        this.sex = sex;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getAdress() {
        return adress;
    }

    public void setAdress(double adress) {
        this.adress = adress;
    }
    public void inputInfoCanbo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ho va ten :");
        this.name=scanner.nextLine();
        System.out.println("Ngay thang nam sinh :");
        this.dateOfbirth=scanner.nextLine();
        System.out.println("Nhap gioi tinh  :");
        this.sex=scanner.nextLine();
        System.out.println("Nhap dia chi");
        this.adress=scanner.nextDouble();

    }
    public void showInfoCanbo(){
        System.out.printf("Ho ten la %s , Ngay thang nam sinh : %s,Gioi tinh : %s, Dia chi : %s \n",name,dateOfbirth,sex,adress);
    }
}
