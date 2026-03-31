//ex8aula3 Italo trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);
        String Senha;

        System.out.println("Digite a senha abaixo: ");
        Senha= e.nextLine();

        if (Senha.equals("R10p5")){
            System.out.println(" Acesso concedido! ");
        }
        else {
            System.out.println(" Acesso negado! ");
        }
        e.close();
    }
}
