package com.example;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String exibirDetalhes() {
        return "Titular: " + titular + ", Saldo: R$ " + saldo;
    }
}
