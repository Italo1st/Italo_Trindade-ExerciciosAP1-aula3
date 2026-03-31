//ex10aula3 Italo trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digite um número abaixo: ");
        num1= e.nextInt();

        System.out.println("Digite um número abaixo: ");
        num2= e.nextInt();

        System.out.println("Digite um número abaixo: ");
        num3= e.nextInt();

        if((num1==num2)&&(num2==num3)) {
            System.out.println("Os números são iguais ");
        } else if ((num1>num2)&&(num1>num3)) {
            System.out.println("O maior numero digitado foi " + num1);
        }else if ((num2>num1)&&(num2>num3)) {
            System.out.println("O maior numero digitado foi " + num2);
        }else {
            System.out.println("O maior numero digitado foi " + num3);
        }
        e.close();
    }
}
