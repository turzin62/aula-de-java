public class Livro {
    String titulo;
    String autor;
    //info do livro
    void detalhe() {
        System.out.println("titulo: " + titulo);
        System.out.println("autor " + autor);
    }
    public static void main(String[] args) {
        //livro
        Livro livro1 = new Livro();
        livro1.titulo = "senhor dos aneis";
        livro1.autor = "JR tolkien";
        livro1.detalhe();
    }
}