import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int Idade;

        System.out.println("Digite sua idade: ");
        Idade = e.nextInt();

        if (Idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }

        e.close();
    }
}