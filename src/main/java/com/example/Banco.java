package com.example;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        if (conta != null) {
            contas.add(conta);
        }
    }

    public ContaBancaria buscarContaPorTitular(String titular) {
        for (ContaBancaria conta : contas) {
            if (conta != null && conta.exibirDetalhes() != null && conta.exibirDetalhes().contains(titular)) {
                return conta;
            }
        }
        return null;
    }

    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            for (ContaBancaria conta : contas) {
                if (conta != null) {
                    System.out.println(conta.exibirDetalhes());
                } else {
                    System.out.println("Conta nula.");
                }
            }
        }
    }
}
