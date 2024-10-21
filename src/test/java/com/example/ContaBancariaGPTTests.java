package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContaBancariaGPTTests {

    private ContaBancaria conta;

    @Before
    public void setup() {
        conta = new ContaBancaria("João", 1000.0);
    }

    @Test
    public void testSacarValorValido() {
        boolean resultado = conta.sacar(500.0);
        assertTrue(resultado);
        assertEquals(500.0, conta.consultarSaldo(), 0.0);
    }

    @Test
    public void testSacarValorMaiorQueSaldo() {
        boolean resultado = conta.sacar(1500.0);
        assertFalse(resultado);
        assertEquals(1000.0, conta.consultarSaldo(), 0.0);
    }

    @Test
    public void testSacarValorNegativo() {
        boolean resultado = conta.sacar(-100.0);
        assertFalse(resultado);
        assertEquals(1000.0, conta.consultarSaldo(), 0.0);
    }

    @Test
    public void testDepositarValorValido() {
        conta.depositar(200.0);
        assertEquals(1200.0, conta.consultarSaldo(), 0.0);
    }

    @Test
    public void testDepositarValorNegativo() {
        conta.depositar(-200.0);
        assertEquals(1000.0, conta.consultarSaldo(), 0.0);
    }

    @Test
    public void testExibirDetalhes() {
        String detalhes = conta.exibirDetalhes();
        assertEquals("Titular: João, Saldo: R$ 1000.0", detalhes);
    }
}
