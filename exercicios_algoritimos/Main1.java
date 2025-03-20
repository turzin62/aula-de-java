import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println ("digite o salario: ");

        double salarioAtual =leitor.nextDouble();
        double fator = 0.25;
        double aumento = salarioAtual * fator;
        double salariofinal = aumento + salarioAtual;
        System.out.println("o aumento de salario foi de " + salariofinal);
    }

}
