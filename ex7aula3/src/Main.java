import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);
        double salario, bonus, salariofinal, tempoempresa;

        System.out.println("Digite seu salário abaixo: ");
        salario= e.nextDouble();

        System.out.println("Digite a quantos anos está na empresa: ");
        tempoempresa= e.nextDouble();

        if (tempoempresa>=5){
            bonus= (salario*0.2);
            salariofinal= (salario + bonus);
            System.out.println("Você receberá um bonus de R$" + bonus + " e seu novo salário será de " + salariofinal);
        }
        else {
            bonus= (salario*0.1);
            salariofinal= (salario + bonus);
            System.out.println("Você receberá um bonus de R$" + bonus + " e seu novo salário será de " + salariofinal);
        }
        e.close();
    }
}
