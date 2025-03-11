public class Main {

    //pessoa
    static class Pessoa{
        String nome;
        int idade;

        //printa na tela o nome/idade
        void apresentacao() {
            System.out.println("Seu nome e " + nome + " voce tem " + idade + " anos.");
        }
    }

    public static void main (String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Arthur";
        pessoa1.idade = 20;
        pessoa1.apresentacao();
    }
}
