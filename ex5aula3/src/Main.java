//ex5aula3 Italo Trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);

        int Numero;

        System.out.println("Digite um numero: ");
        Numero= e.nextInt();

        if ((Numero>=50)&&(Numero<=100)){
            System.out.println("Pertence ao intervalo ");
        }
        else {
            System.out.println("Não pertence ao intervalo");
        }
      e.close();
    }
}
