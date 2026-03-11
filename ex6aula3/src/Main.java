import java.util.Scanner;

public class Main {
    public static void main( String[] args){
        double altura, pesoIdeal;
        Scanner e=new Scanner(System.in);

        System.out.println("escreva sua altura (em centímetros): ");
        altura= e.nextDouble();

        System.out.println("qual seu sexo? (m ou f): ");
        char sexo= e.next(). charAt(0);

        if (sexo=='m'|| sexo=='M'){
            pesoIdeal=(52+(0.75*(altura-154.4)));
        }
        else {
           pesoIdeal=(52+(0.67*(altura-152.4)));
        }

        System.out.printf("Seu peso ideal é: %.2f KG %n" , pesoIdeal);

        e.close();
    }

}