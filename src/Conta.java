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
}
