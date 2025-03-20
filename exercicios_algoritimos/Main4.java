import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("qual o peso do saco de racao (kg): ");
        double pesoKg = leitor.nextDouble();

        System.out.println("qual a quantidade de racao para o gato 1 por dia (gramas): ");
        double Gato1 = leitor.nextDouble();

        System.out.println("q8al a quantidade de racao para o gato 2 por dia (gramas): ");
        double Gato2 = leitor.nextDouble();


        double pesoSacoGramas = pesoKg * 1000;
        double consumoDiario = Gato1 + Gato2;
        double consumoTotal = consumoDiario * 5;
        double racaoRestante = pesoSacoGramas - consumoTotal;

        System.out.println("depois de 5 dias sobram " + racaoRestante + " gramas de racao no saco.");
    }
}
