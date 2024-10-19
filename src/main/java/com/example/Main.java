package com.example;

public class Main {
    public static void main(String[] args) {
        // Criando o banco
        Banco banco = new Banco();

        // Criando contas
        ContaBancaria conta1 = new ContaBancaria("João", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("Maria", 500.0);

        // Adicionando contas ao banco
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        // Exibindo todas as contas
        banco.listarContas();

        // João saca 200 reais
        conta1.sacar(200.0);
        System.out.println("Saldo do João após saque: " + conta1.consultarSaldo());

        // Maria deposita 150 reais
        conta2.depositar(150.0);
        System.out.println("Saldo da Maria após depósito: " + conta2.consultarSaldo());
    }
}
