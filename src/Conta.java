public class Conta {

    private String numConta;
    private String agencia;
    private double saldo;

    public Conta(String numConta, String agencia, double saldo){
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void sacar(Cliente cliente, double valorSaque) {
        if (cliente.getConta().getSaldo() >= valorSaque) {
            double saldo = cliente.getConta().getSaldo();
            cliente.getConta().setSaldo(saldo -= valorSaque);
            System.out.println("Saque feito!");
            System.out.println("Saldo da conta: " + cliente.getConta().getSaldo());
        } else {
            System.out.println("Saldo indisponível!");
        }

    }

}
