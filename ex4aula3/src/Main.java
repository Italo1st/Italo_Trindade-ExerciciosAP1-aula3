//ex4aula3 Italo trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);

        float num1, num2;

        System.out.println("Digite o primeiro numero: ");
        num1=e.nextFloat();

        System.out.println("Digite o segundo numero: ");
        num2=e.nextFloat();

        if (num1>num2){
            System.out.println(num1 + "," + num2);
        }
        else {
            System.out.println(num2 + "," + num1);
        }
    e.close();
    }
}
