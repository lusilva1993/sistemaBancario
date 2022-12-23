/*

21/12/2022 - POO 1

Sistema Bancário
- Deposito
- Sacar
- Transferir

- Transferir apenas se tiver saldo
- Sacar apenas se tiver saldo

- Todos os atributos tem que ser privados

Grupo: Luciana Ferreira, Maria Thereza, Guilerme Costa Silva
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int escolha = 0;

        Cliente clienteLogado = null;

        boolean islogado = false;

        Conta conta1 = new Conta("1234", "2323", 165.0);
        Cliente cliente1 = new Cliente (conta1, "Juvenal", "666", "1234");

        Conta conta2 = new Conta("6789", "6767", 500.0);
        Cliente cliente2 = new Cliente (conta2, "Patricia", "111", "2222");

        while (!islogado){
            System.out.println("Bem vindo ao Banco PoloTech");
            System.out.println("Para logar digite o CPF:");
            String cpf = scan.nextLine();
            System.out.println("Digite a senha: ");
            String senha = scan.nextLine();
            if (cliente1.getCpf().equals(cpf) && cliente1.getSenha().equals(senha)) {
                clienteLogado = cliente1;
                islogado = true;
            } else if (cliente2.getCpf().equals(cpf) && cliente2.getSenha().equals(senha)) {
                clienteLogado = cliente2;
                islogado = true;

            } else {
                System.out.println("Informações inválidas!");
            }
        }

        while (islogado) {
            System.out.println();
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Sacar ");
            System.out.println("2 - Depositar ");
            System.out.println("3 - Realizar transferencia ");
            System.out.println("0 - Finalizar sessão.");
            System.out.print("Realizar operação: ");
            escolha = scan.nextInt();
            System.out.println();

            if (escolha == 0) {
                islogado = false;
                System.out.println("Deslogou do banco!");
            } else if (escolha == 1) {
                System.out.println("Digite o valor do saque: ");
                double retirada = scan.nextDouble();
                Conta.sacar(clienteLogado, retirada);

            } else if (escolha == 2) {
                System.out.println("Digite o valor a depositar: ");
                double deposito = scan.nextDouble();
                Conta.depositar(clienteLogado, deposito);

            } else {
                System.out.println("Informe o numero da conta que deseja realizar a transferencia: ");
                String contaTransferir = scan.next();

                System.out.println("Informe o valor: ");
                double valorTransferencia = scan.nextDouble();
                double saldoClienteLogado = clienteLogado.getConta().getSaldo();


                if (!contaTransferir.equals(clienteLogado.getConta().getNumConta())
                        && contaTransferir.equals(cliente1.getConta().getNumConta())) {

                    Conta.transferir(clienteLogado, cliente1, saldoClienteLogado, valorTransferencia);

                } else if (!contaTransferir.equals(clienteLogado.getConta().getNumConta())
                        && contaTransferir.equals(cliente2.getConta().getNumConta())) {

                    Conta.transferir(clienteLogado, cliente2, saldoClienteLogado, valorTransferencia);

                } else {
                    System.out.println("Opção inválida!");
                }
            }
        }
        System.out.println("Encerrou tudo!");
    }
}