import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println ("digite o salario: ");
        double salarioAtual =leitor.nextDouble();

        System.out.println ("digite qual a porcentagem de aumento: ");
        double fator = leitor.nextDouble() /100;

        double aumento = salarioAtual * fator;
        double salariofinal = aumento + salarioAtual;
        System.out.println("o aumento de salario foi de " + salariofinal);
    }

}
