//ex12aula3 Italo Trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);

        double salario, inss;

        System.out.println("Digite seu salário abaixo: ");
        salario=e.nextDouble();

        if (salario<=600){
            System.out.println("Seu salário é isento de impostos ");
        } else if ((salario>=600)&&(salario<=1200)) {
            inss=(salario*0.2);
            salario=(salario-inss);
            System.out.println("Seu salário é de " + salario + " e seu desconto é de " + inss);
        }  else if ((salario>=1200)&&(salario<=2000)) {
            inss=(salario*0.25);
            salario=(salario-inss);
            System.out.println("Seu salário é de " + salario + " e seu desconto é de " + inss);
        } else {
            inss=(salario*0.3);
            salario=(salario-inss);
            System.out.println("Seu salário é de " + salario + " e seu desconto é de " + inss);
        }
        e.close();
    }
}
