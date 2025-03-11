public class Banco {
    double saldo = 0;
    void depositar(double valor) {
        saldo += valor;
    }
    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else{
            System.out.println("saldo insuficient3");
        }
    }
    double getSaldo(){
        return saldo;
    }
    public static void main(String[] args) {
        Banco conta = new Banco ();
        conta.depositar(2000);
        conta.sacar(500);
        System.out.println("saldo final " +conta.getSaldo());
    }
}