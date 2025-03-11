public class Tanque {
    double capacidadeMaxima = 50.0;
    double combustivelAtual = 0;

    void abastecer(double litros) {
        if (combustivelAtual + litros > capacidadeMaxima) {
            combustivelAtual = capacidadeMaxima;
        } else {
            combustivelAtual += litros;
        }
    }

    public static void main(String[] args) {
        Tanque v = new Tanque();
        v.abastecer(30);
        v.abastecer(25);
        System.out.println("Combustível atual: " + v.combustivelAtual + "L");
    }
}
