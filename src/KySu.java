import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhdaotao;

    public KySu() {
    }

    public KySu(String nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }

    public String getNganhdaotao() {
        return nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }
    public void inputInfoKySu(){
        super.inputInfoCanbo();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap nganh dao tao ");
    }
    public void showInfoKySu(){
        super.showInfoCanbo();
        System.out.printf("Nganh dao tao la :%s",this.nganhdaotao);
    }
}
