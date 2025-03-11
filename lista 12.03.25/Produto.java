public class Produto {
    String nome;
    double valor;
    double desconto;
    double PrecoFinal() {
        return preco - (valor * desconto / 100);
    }
    public static void main(String[] args) {
        Produto p = new Produto();
        p.nome = "cafe";
        p.valor = 90.0;
        p.desconto = 10;
        System.out.println("com desconto fica " +p.calcularPrecoFinal());
    }
}