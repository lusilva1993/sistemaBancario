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

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
