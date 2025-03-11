import java.util.ArrayList;

public class Agenda {
    static class Contato {
        String nome;
        String telefone;

        Contato(String nome, String telefone) {
            this.nome = nome;
            this.telefone = telefone;
        }
    }

    ArrayList<Contato> contatos = new ArrayList<>();

    void adicionarContato(String nome, String telefone) {
        contatos.add(new Contato(nome, telefone));
    }

    void removerContato(String nome) {
        contatos.removeIf(c -> c.nome.equals(nome));
    }

    void buscarContato(String nome) {
        for (Contato c : contatos) {
            if (c.nome.equals(nome)) {
                System.out.println("Contato: " + c.nome + " - " + c.telefone);
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarContato("Jao", "1234-5678");
        agenda.adicionarContato("Maria", "9876-5432");
        agenda.buscarContato("Maria");
        agenda.removerContato("Jao");
        agenda.buscarContato("Jao");
    }
}
