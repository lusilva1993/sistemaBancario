import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int escolha = 0;

        Conta conta1 = new Conta("1234", "2323", 165.0);
        Cliente cliente1 = new Cliente (conta1, "Juvenal", "666", "1234");

        Conta conta2 = new Conta("6789", "6767", 500.0);
        Cliente cliente2 = new Cliente (conta1, "Patricia", "111", "2222");

        boolean islogado = false;
        while (!islogado){
            System.out.println("Vamos logar!");
            System.out.println("Digite o CPF:");
            String cpf = scan.nextLine();
            System.out.println("Digite a senha: ");
            String senha = scan.nextLine();
            if(cliente1.getCpf().equals(cpf) && cliente1.getSenha().equals(senha) ||
                    cliente2.getCpf().equals(cpf) && cliente2.getSenha().equals(senha)){
                islogado = true;
            }else{
                System.out.println("Informações inválidas!");
            }
        }

        while(escolha != 0){
            System.out.println();
            System.out.println("Digite o valor da operção desejada");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Realizar transferencia");
            System.out.println("0 - Finalizar sessão.");
            System.out.print("Realizar operação: ");
            escolha = scan.nextInt();
            System.out.println();


        System.out.println("Hello world!");
    }
}