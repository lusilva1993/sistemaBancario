public class Cliente {

    private Conta conta;
    private String nome;
    private String cpf;

    private String senha;

    public Cliente (Conta conta, String nome, String cpf, String senha){
        this.conta = conta;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }



}
