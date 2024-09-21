import entities.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de revisão de dados do banco!");
        System.out.println("Favor insira seu nome");
        String nome = scanner.nextLine();
        System.out.println("Insira o numero");
        Integer numero = scanner.nextInt();
        System.out.println("Insira o numero da Agencia: ");
        String agencia = scanner.nextLine(); scanner.nextLine();
        System.out.println("Insira o saldo de sua conta: ");
        Double saldo = scanner.nextDouble();

        Conta conta = new Conta(numero, agencia, nome, saldo);
        System.out.println("Olá " + conta.getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " +
                conta.getNumeroConta() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque");


    }
}