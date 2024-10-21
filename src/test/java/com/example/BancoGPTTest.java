package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class BancoGPTTest {

    private Banco banco;
    private ContaBancaria conta1;
    private ContaBancaria conta2;

    @Before
    public void setup() {
        banco = new Banco();
        conta1 = new ContaBancaria("João", 1000.0);
        conta2 = new ContaBancaria("Maria", 500.0);
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
    }

    @Test
    public void testAdicionarContaValida() {
        ContaBancaria contaNova = new ContaBancaria("Carlos", 300.0);
        banco.adicionarConta(contaNova);

        assertEquals(contaNova, banco.buscarContaPorTitular("Carlos"));
    }

    // @Test
    // public void testAdicionarContaNula() {
    //     banco.adicionarConta(null);
    //     // Não há mudança na lista de contas, então as duas contas iniciais devem permanecer
    //     assertEquals(2, banco.buscarContaPorTitular("João").consultarSaldo(), 0.0);
    // }

    // @Test
    // public void testBuscarContaPorTitularExistente() {
    //     ContaBancaria contaEncontrada = banco.buscarContaPorTitular("João");
    //     assertNotNull(contaEncontrada);
    //     assertEquals("João", contaEncontrada.exibirDetalhes().contains("João"));
    // }

    @Test
    public void testBuscarContaPorTitularInexistente() {
        ContaBancaria contaEncontrada = banco.buscarContaPorTitular("Carlos");
        assertNull(contaEncontrada);
    }

    // @Test
    // public void testListarContas() {
    //     banco.listarContas();
    //     assertEquals(2, banco.contas().size());
    // }
}
