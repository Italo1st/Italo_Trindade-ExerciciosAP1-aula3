//ex3aula3 Italo trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);

        int num1, num2, result ;

        System.out.println("Digite o primeiro numero: ");
        num1=e.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2=e.nextInt();

        if (num1==num2){
            System.out.println("Numeros iguais ");
        }
        else {
            if (num1>num2){
                result= num1-num2;
                System.out.println("A diferença entre " + num1 + " e " + num2 + " é igual a: " + result );
            }
            else {
                result= num2-num1;
                System.out.println(" A diferença entre " + num2 + " e " + num1 + " é igual a: " +result );
            }
        }
    e.close();
    }

}
