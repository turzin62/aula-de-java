import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("qual a data de hoje? (formato dd/mm/yyyy): ");
        String dataAtualStr = leitor.next();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        Date dataAtual = null;
        try {
            dataAtual = formato.parse(dataAtualStr);
        } catch (Exception e) {
            System.out.println("Data inválida.");
            return;
        }

        System.out.println("qual o dia do seu nascimento? ");
        int nascimento_dia = leitor.nextInt();
        System.out.println("qual o mes do seu nascimento? ");
        int nascimento_mes = leitor.nextInt();
        System.out.println("qual o ano do seu nascimento? ");
        int nascimento_ano = leitor.nextInt();

        Calendar nascimento = Calendar.getInstance();
        nascimento.set(nascimento_ano, nascimento_mes - 1, nascimento_dia); // janeiro e o mes 0

        Calendar atual = Calendar.getInstance();
        atual.setTime(dataAtual);

        int idadeAnos = atual.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);

        if (atual.get(Calendar.MONTH) < nascimento.get(Calendar.MONTH) || 
           (atual.get(Calendar.MONTH) == nascimento.get(Calendar.MONTH) && atual.get(Calendar.DAY_OF_MONTH) < nascimento.get(Calendar.DAY_OF_MONTH))) {
            idadeAnos--;
        }

        int anosParaMeses = idadeAnos * 12;
        int mesesExtras = atual.get(Calendar.MONTH) - nascimento.get(Calendar.MONTH);
        if (mesesExtras < 0) mesesExtras += 12;
        int idadeMeses = anosParaMeses + mesesExtras;

        long diferencaMillis = atual.getTimeInMillis() - nascimento.getTimeInMillis();
        long idadeDias = diferencaMillis / (1000 * 60 * 60 * 24);

        System.out.println("sua idade em anos: " + idadeAnos);
        System.out.println("sua idade em meses: " + idadeMeses);
        System.out.println("sua idade em dias: " + idadeDias);
    }
}
