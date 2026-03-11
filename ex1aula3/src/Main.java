import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);


        double result, num1;

        System.out.println("Digite um numero: ");
        num1=e.nextInt();

        if (num1>=20){
        result=(num1/2);
            System.out.println("O numero que você digitou, quando dividido por 2 resulta em: " + result);
        }
        else{
            System.out.println("O numero digitado é: " + num1);
        }

        e.close();
    }
}