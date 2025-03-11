public class Salario {
    String nome;
    double salario;

    void aumentoSalarial(double percentual) {
        salario += salario * (percentual / 100);
    }
    public static void main(String[] args) {
        Salario f = new Salario();
        f.nome = "ronaldo";
        f.salario = 3500.0;
        f.aumentoSalarial(20);
        System.out.println("novo salario: " + f.salario);
    }
}