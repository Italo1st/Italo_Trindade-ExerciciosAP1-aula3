//ex9aula3 Italo Trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);
        double salariobruto, prestacao;

        System.out.println(" Digite o valor do salário bruto abaixo: ");
        salariobruto= e.nextDouble();

        System.out.println("Digite o valor da prestação abaixo: ");
        prestacao= e.nextDouble();

        if(prestacao>(salariobruto*0.3)){
            System.out.println("Emprestimo não pode ser concedido! ");
        }
        else {
            System.out.println("Emprestimo concedido com sucesso! ");
        }
        e.close();
    }
}
