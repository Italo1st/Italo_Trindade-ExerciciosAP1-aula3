//ex11aula3 Italo trindade
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner e=new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade= e.nextInt();

        if ((idade>=5)&&(idade<=7)){
            System.out.println("sua categoria é infantilA ");
        } else if ((idade>=8)&&(idade<=10)) {
            System.out.println("sua categoria é infantilB ");
        } else if ((idade>=11)&&(idade<=13)) {
            System.out.println("sua categoria é infantilC ");
        } else if ((idade>=14)&&(idade<=17)) {
            System.out.println("sua categoria é infantilD ");
        }else {
            System.out.println("sua categoria é Sênior ");
        }
        e.close();
    }
}
