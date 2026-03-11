import java.util.Scanner;

public class Main {
    public static void main( String[] args){
        double peso, altura, alturacalculo, imc;
        Scanner e=new Scanner(System.in);

        System.out.println(" escreva seu peso (em kg): ");
        peso= e.nextDouble();

        System.out.println(" escreva sua altura (em metros): ");
        altura= e.nextDouble();

        alturacalculo= Math.pow(altura, 2);
        imc= peso/alturacalculo;

        if ((imc>=18.5)&&(imc<=24.9)){
            System.out.printf(" Seu imc está saudavel! e é de %.2f%n", imc);
        }
        else{
            System.out.printf(" Seu imc está alterado, cuidado! seu imc é de %.2f%n", imc);
        }
        e.close();
    }

}