public class Conta {

    private String numConta;
    private String agencia;
    private double saldo;

    public Conta(String numConta, String agencia, double saldo){
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public static void saldo(Cliente clienteLogado){
        System.out.println("Saldo da conta: "+ clienteLogado.getConta().getSaldo());
    }
    public static void transferir(Cliente clienteLogado, Cliente clienteTransferencia,
                                  double saldoClienteLogado, double valorTransferencia) {
        if (valorTransferencia > 0 && clienteLogado.getConta().getSaldo() >= valorTransferencia) {
            clienteLogado.getConta().setSaldo(saldoClienteLogado -= valorTransferencia);
            double saldoCli1 = clienteTransferencia.getConta().getSaldo();
            clienteTransferencia.getConta().setSaldo(saldoCli1 += valorTransferencia);
            System.out.println("Operação de transferência feita com sucesso!");
            System.out.println("Saldo da conta: " + clienteLogado.getConta().getSaldo());

        } else {
            System.out.println("Saldo indisponível!");
        }

    }

    public static void depositar(Cliente cliente, double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Valor inválido!");
        } else {
            double saldo = cliente.getConta().getSaldo();
            cliente.getConta().setSaldo(saldo += valorDeposito);
            System.out.println("Depósito feito");
            System.out.println("Saldo da conta: " + cliente.getConta().getSaldo());
        }
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
}
