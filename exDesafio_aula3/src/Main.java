//exDesafioAula3 Italo Trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int idade = e.nextInt();

        System.out.print("Você é alfabetizado? (s/n): ");
        char alfabetizado = e.next().charAt(0);

        if (idade < 16) {
            System.out.println("Você NÃO está apto a votar.");
        } else {
            if (idade >= 18 && idade <= 70 && alfabetizado == 's') {
                System.out.println("Você está apto e o voto é OBRIGATÓRIO.");
            } else {
                System.out.println("Você está apto e o voto é FACULTATIVO.");
            }
        }

        e.close();
    }
}
