public class Retangulo {
    double largura;
    double altura;

    double Area() {
        return largura * altura;
    }
    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        r.largura = 5.3;
        r.altura = 5.7;
        System.out.println("area =" +r.Area());
    }
}