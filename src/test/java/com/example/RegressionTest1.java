package com.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar(0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str3, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0", (double) '#');
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        java.lang.String str11 = contaBancaria9.exibirDetalhes();
        boolean boolean13 = contaBancaria9.sacar((double) 0.0f);
        double double14 = contaBancaria9.consultarSaldo();
        contaBancaria9.depositar(88.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str11, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria39 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria41 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria43 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria46 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double47 = contaBancaria46.consultarSaldo();
        banco0.adicionarConta(contaBancaria46);
        banco0.listarContas();
        com.example.Banco banco50 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria53 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco50.adicionarConta(contaBancaria53);
        banco50.listarContas();
        banco50.listarContas();
        com.example.Banco banco57 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria60 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco57.adicionarConta(contaBancaria60);
        banco57.listarContas();
        banco57.listarContas();
        com.example.ContaBancaria contaBancaria66 = new com.example.ContaBancaria("", 10.0d);
        banco57.adicionarConta(contaBancaria66);
        com.example.ContaBancaria contaBancaria70 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria70.depositar((double) (byte) -1);
        banco57.adicionarConta(contaBancaria70);
        com.example.ContaBancaria contaBancaria75 = banco57.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str76 = contaBancaria75.exibirDetalhes();
        banco50.adicionarConta(contaBancaria75);
        com.example.ContaBancaria contaBancaria79 = banco50.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        boolean boolean81 = contaBancaria79.sacar(0.0d);
        banco0.adicionarConta(contaBancaria79);
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertNull(contaBancaria41);
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertNotNull(contaBancaria75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str76, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        double double7 = contaBancaria2.consultarSaldo();
        double double8 = contaBancaria2.consultarSaldo();
        java.lang.String str9 = contaBancaria2.exibirDetalhes();
        double double10 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str9, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0", (double) 10.0f);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double6 = contaBancaria5.consultarSaldo();
        banco0.adicionarConta(contaBancaria5);
        com.example.Banco banco8 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco8.adicionarConta(contaBancaria11);
        banco8.listarContas();
        banco8.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("", 10.0d);
        banco8.adicionarConta(contaBancaria17);
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria21.depositar((double) (byte) -1);
        banco8.adicionarConta(contaBancaria21);
        com.example.Banco banco25 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria28 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco25.adicionarConta(contaBancaria28);
        banco25.listarContas();
        banco25.listarContas();
        com.example.Banco banco32 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco32.adicionarConta(contaBancaria35);
        banco32.listarContas();
        banco32.listarContas();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("", 10.0d);
        banco32.adicionarConta(contaBancaria41);
        banco25.adicionarConta(contaBancaria41);
        banco8.adicionarConta(contaBancaria41);
        banco0.adicionarConta(contaBancaria41);
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria48.depositar((double) (-1));
        contaBancaria48.depositar(10.0d);
        double double53 = contaBancaria48.consultarSaldo();
        banco0.adicionarConta(contaBancaria48);
        com.example.ContaBancaria contaBancaria56 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 107.0d + "'", double53 == 107.0d);
        org.junit.Assert.assertNull(contaBancaria56);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria7 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria10.depositar(1.0d);
        contaBancaria10.depositar(0.0d);
        boolean boolean16 = contaBancaria10.sacar((double) 0);
        banco0.adicionarConta(contaBancaria10);
        org.junit.Assert.assertNull(contaBancaria7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria14 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertNull(contaBancaria14);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str10 = contaBancaria9.exibirDetalhes();
        contaBancaria9.depositar(0.0d);
        banco0.adicionarConta(contaBancaria9);
        contaBancaria9.depositar((double) (-1));
        contaBancaria9.depositar((double) ' ');
        contaBancaria9.depositar((double) 1);
        contaBancaria9.depositar(97.0d);
        double double22 = contaBancaria9.consultarSaldo();
        java.lang.String str23 = contaBancaria9.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 182.0d + "'", double22 == 182.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Titular: hi!, Saldo: R$ 182.0" + "'", str23, "Titular: hi!, Saldo: R$ 182.0");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 0.0d);
        banco0.adicionarConta(contaBancaria11);
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco4 = new com.example.Banco();
        com.example.Banco banco5 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco5.adicionarConta(contaBancaria8);
        banco4.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco4.adicionarConta(contaBancaria13);
        com.example.Banco banco15 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco15.adicionarConta(contaBancaria18);
        banco15.listarContas();
        banco15.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("", 10.0d);
        banco15.adicionarConta(contaBancaria24);
        banco4.adicionarConta(contaBancaria24);
        banco0.adicionarConta(contaBancaria24);
        boolean boolean29 = contaBancaria24.sacar((double) '#');
        java.lang.String str30 = contaBancaria24.exibirDetalhes();
        java.lang.String str31 = contaBancaria24.exibirDetalhes();
        contaBancaria24.depositar((double) 0.0f);
        java.lang.Class<?> wildcardClass34 = contaBancaria24.getClass();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str30, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str31, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        com.example.Banco banco37 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco37.adicionarConta(contaBancaria40);
        banco37.listarContas();
        com.example.ContaBancaria contaBancaria45 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco37.adicionarConta(contaBancaria45);
        banco37.listarContas();
        com.example.ContaBancaria contaBancaria50 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco37.adicionarConta(contaBancaria50);
        double double52 = contaBancaria50.consultarSaldo();
        double double53 = contaBancaria50.consultarSaldo();
        banco0.adicionarConta(contaBancaria50);
        boolean boolean56 = contaBancaria50.sacar(184.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) (-1L));
        contaBancaria2.depositar(88.0d);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 87.0" + "'", str5, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 87.0");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("", 0.0d);
        java.lang.String str5 = contaBancaria4.exibirDetalhes();
        double double6 = contaBancaria4.consultarSaldo();
        banco0.adicionarConta(contaBancaria4);
        com.example.Banco banco8 = new com.example.Banco();
        banco8.listarContas();
        banco8.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double14 = contaBancaria13.consultarSaldo();
        banco8.adicionarConta(contaBancaria13);
        com.example.Banco banco16 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco16.adicionarConta(contaBancaria19);
        banco16.listarContas();
        banco16.listarContas();
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("", 10.0d);
        banco16.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria29.depositar((double) (byte) -1);
        banco16.adicionarConta(contaBancaria29);
        com.example.Banco banco33 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco33.adicionarConta(contaBancaria36);
        banco33.listarContas();
        banco33.listarContas();
        com.example.Banco banco40 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco40.adicionarConta(contaBancaria43);
        banco40.listarContas();
        banco40.listarContas();
        com.example.ContaBancaria contaBancaria49 = new com.example.ContaBancaria("", 10.0d);
        banco40.adicionarConta(contaBancaria49);
        banco33.adicionarConta(contaBancaria49);
        banco16.adicionarConta(contaBancaria49);
        banco8.adicionarConta(contaBancaria49);
        banco0.adicionarConta(contaBancaria49);
        java.lang.Class<?> wildcardClass55 = banco0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str5, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) (short) 100);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria39 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria41 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria43 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria46 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double47 = contaBancaria46.consultarSaldo();
        banco0.adicionarConta(contaBancaria46);
        com.example.ContaBancaria contaBancaria50 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 84.0");
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertNull(contaBancaria41);
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertNull(contaBancaria50);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0", 104.0d);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        boolean boolean18 = contaBancaria13.sacar((double) (-1.0f));
        java.lang.String str19 = contaBancaria13.exibirDetalhes();
        contaBancaria13.depositar((double) (-1.0f));
        java.lang.String str22 = contaBancaria13.exibirDetalhes();
        boolean boolean24 = contaBancaria13.sacar(32.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str22, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str19 = contaBancaria18.exibirDetalhes();
        boolean boolean21 = contaBancaria18.sacar((double) (byte) -1);
        double double22 = contaBancaria18.consultarSaldo();
        boolean boolean24 = contaBancaria18.sacar((double) (-1));
        boolean boolean26 = contaBancaria18.sacar((double) '#');
        java.lang.String str27 = contaBancaria18.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: hi!, Saldo: R$ 17.0" + "'", str27, "Titular: hi!, Saldo: R$ 17.0");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0", (double) (-1));
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        double double4 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 107.0", (double) 100.0f);
        boolean boolean4 = contaBancaria2.sacar(84.0d);
        contaBancaria2.depositar((double) 100L);
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        java.lang.String str8 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 116.0" + "'", str7, "Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 116.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 116.0" + "'", str8, "Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 116.0");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco4 = new com.example.Banco();
        com.example.Banco banco5 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco5.adicionarConta(contaBancaria8);
        banco4.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco4.adicionarConta(contaBancaria13);
        com.example.Banco banco15 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco15.adicionarConta(contaBancaria18);
        banco15.listarContas();
        banco15.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("", 10.0d);
        banco15.adicionarConta(contaBancaria24);
        banco4.adicionarConta(contaBancaria24);
        banco0.adicionarConta(contaBancaria24);
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("hi!", 0.0d);
        banco0.adicionarConta(contaBancaria30);
        java.lang.Class<?> wildcardClass32 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(0.0d);
        java.lang.Class<?> wildcardClass6 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 87.0", 97.0d);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        com.example.Banco banco11 = new com.example.Banco();
        banco11.listarContas();
        com.example.Banco banco13 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco13.adicionarConta(contaBancaria16);
        banco13.listarContas();
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco13.adicionarConta(contaBancaria21);
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean27 = contaBancaria25.sacar((double) (-1L));
        contaBancaria25.depositar((-1.0d));
        banco13.adicionarConta(contaBancaria25);
        banco11.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria34 = new com.example.ContaBancaria("hi!", (double) ' ');
        banco11.adicionarConta(contaBancaria34);
        contaBancaria34.depositar(0.0d);
        banco0.adicionarConta(contaBancaria34);
        banco0.listarContas();
        java.lang.Class<?> wildcardClass40 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 9.0", (double) (byte) 0);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 9.0, Saldo: R$ 0.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 9.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0", 100.0d);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        boolean boolean18 = contaBancaria13.sacar((double) (-1.0f));
        java.lang.String str19 = contaBancaria13.exibirDetalhes();
        boolean boolean21 = contaBancaria13.sacar((double) '4');
        double double22 = contaBancaria13.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str24 = contaBancaria23.exibirDetalhes();
        banco0.adicionarConta(contaBancaria23);
        contaBancaria23.depositar((double) '4');
        double double28 = contaBancaria23.consultarSaldo();
        double double29 = contaBancaria23.consultarSaldo();
        java.lang.String str30 = contaBancaria23.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 52.0d + "'", double28 == 52.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 52.0d + "'", double29 == 52.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 52.0" + "'", str30, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 52.0");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        contaBancaria2.depositar((double) 1.0f);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria13 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria15 = banco0.buscarContaPorTitular("Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0");
        java.lang.Class<?> wildcardClass16 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria9);
        org.junit.Assert.assertNotNull(contaBancaria11);
        org.junit.Assert.assertNull(contaBancaria13);
        org.junit.Assert.assertNull(contaBancaria15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 97.0", (double) (short) 100);
        banco0.adicionarConta(contaBancaria21);
        java.lang.String str23 = contaBancaria21.exibirDetalhes();
        double double24 = contaBancaria21.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0" + "'", str23, "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 9.0, Saldo: R$ 0.0", (double) 0);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) 10L);
        contaBancaria2.depositar((double) (-1L));
        contaBancaria2.depositar((double) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean14 = contaBancaria12.sacar((double) (-1L));
        contaBancaria12.depositar((-1.0d));
        banco0.adicionarConta(contaBancaria12);
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria21 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        com.example.Banco banco22 = new com.example.Banco();
        com.example.Banco banco23 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco23.adicionarConta(contaBancaria26);
        banco22.adicionarConta(contaBancaria26);
        com.example.ContaBancaria contaBancaria30 = banco22.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco22.listarContas();
        com.example.Banco banco32 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco32.adicionarConta(contaBancaria35);
        banco32.listarContas();
        banco32.listarContas();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("", 10.0d);
        banco32.adicionarConta(contaBancaria41);
        com.example.ContaBancaria contaBancaria45 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria45.depositar((double) (byte) -1);
        banco32.adicionarConta(contaBancaria45);
        boolean boolean50 = contaBancaria45.sacar((double) (-1.0f));
        java.lang.String str51 = contaBancaria45.exibirDetalhes();
        double double52 = contaBancaria45.consultarSaldo();
        banco22.adicionarConta(contaBancaria45);
        boolean boolean55 = contaBancaria45.sacar((double) 0L);
        banco0.adicionarConta(contaBancaria45);
        java.lang.Class<?> wildcardClass57 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertNull(contaBancaria21);
        org.junit.Assert.assertNotNull(contaBancaria30);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str51, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (short) 0);
        boolean boolean4 = contaBancaria2.sacar(84.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) (short) -1);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 11.0", 182.0d);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.Banco banco2 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco2.adicionarConta(contaBancaria5);
        banco2.listarContas();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco2.adicionarConta(contaBancaria10);
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean16 = contaBancaria14.sacar((double) (-1L));
        contaBancaria14.depositar((-1.0d));
        banco2.adicionarConta(contaBancaria14);
        banco0.adicionarConta(contaBancaria14);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) ' ');
        banco0.adicionarConta(contaBancaria23);
        double double25 = contaBancaria23.consultarSaldo();
        contaBancaria23.depositar(88.0d);
        contaBancaria23.depositar((double) 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 32.0d + "'", double25 == 32.0d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0", 52.0d);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.Banco banco14 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco14.adicionarConta(contaBancaria17);
        banco14.listarContas();
        banco14.listarContas();
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("", 10.0d);
        banco14.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria27.depositar((double) (byte) -1);
        banco14.adicionarConta(contaBancaria27);
        com.example.ContaBancaria contaBancaria32 = banco14.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str33 = contaBancaria32.exibirDetalhes();
        banco7.adicionarConta(contaBancaria32);
        banco0.adicionarConta(contaBancaria32);
        boolean boolean37 = contaBancaria32.sacar(104.0d);
        boolean boolean39 = contaBancaria32.sacar((double) (-1L));
        double double40 = contaBancaria32.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str33, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 52.0d + "'", double40 == 52.0d);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) (short) 0);
        contaBancaria2.depositar(117.0d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria11.depositar((double) (byte) -1);
        double double14 = contaBancaria11.consultarSaldo();
        java.lang.String str15 = contaBancaria11.exibirDetalhes();
        banco0.adicionarConta(contaBancaria11);
        com.example.Banco banco17 = new com.example.Banco();
        banco17.listarContas();
        banco17.listarContas();
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double23 = contaBancaria22.consultarSaldo();
        banco17.adicionarConta(contaBancaria22);
        banco0.adicionarConta(contaBancaria22);
        java.lang.String str26 = contaBancaria22.exibirDetalhes();
        java.lang.String str27 = contaBancaria22.exibirDetalhes();
        contaBancaria22.depositar((double) 1.0f);
        java.lang.String str30 = contaBancaria22.exibirDetalhes();
        boolean boolean32 = contaBancaria22.sacar(20.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str26, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str27, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0" + "'", str30, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (byte) 0);
        boolean boolean6 = contaBancaria2.sacar((double) (-1));
        contaBancaria2.depositar((double) 0.0f);
        java.lang.String str9 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str9, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 52.0", 0.0d);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ -1.0");
        com.example.ContaBancaria contaBancaria15 = new com.example.ContaBancaria("Titular: , Saldo: R$ 0.0", 0.0d);
        java.lang.String str16 = contaBancaria15.exibirDetalhes();
        banco0.adicionarConta(contaBancaria15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0" + "'", str16, "Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.Banco banco2 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco2.adicionarConta(contaBancaria5);
        banco2.listarContas();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco2.adicionarConta(contaBancaria10);
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean16 = contaBancaria14.sacar((double) (-1L));
        contaBancaria14.depositar((-1.0d));
        banco2.adicionarConta(contaBancaria14);
        banco0.adicionarConta(contaBancaria14);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) ' ');
        banco0.adicionarConta(contaBancaria23);
        contaBancaria23.depositar(0.0d);
        boolean boolean28 = contaBancaria23.sacar(87.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.Banco banco9 = new com.example.Banco();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco9.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco9.adicionarConta(contaBancaria18);
        com.example.Banco banco20 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco20.adicionarConta(contaBancaria23);
        banco20.listarContas();
        banco20.listarContas();
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("", 10.0d);
        banco20.adicionarConta(contaBancaria29);
        banco9.adicionarConta(contaBancaria29);
        double double32 = contaBancaria29.consultarSaldo();
        banco0.adicionarConta(contaBancaria29);
        com.example.ContaBancaria contaBancaria35 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 9.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNull(contaBancaria35);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        boolean boolean25 = contaBancaria20.sacar((double) (-1.0f));
        java.lang.String str26 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria20);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria32 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
        com.example.ContaBancaria contaBancaria34 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria32);
        org.junit.Assert.assertNull(contaBancaria34);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double6 = contaBancaria5.consultarSaldo();
        banco0.adicionarConta(contaBancaria5);
        com.example.Banco banco8 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco8.adicionarConta(contaBancaria11);
        banco8.listarContas();
        banco8.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("", 10.0d);
        banco8.adicionarConta(contaBancaria17);
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria21.depositar((double) (byte) -1);
        banco8.adicionarConta(contaBancaria21);
        com.example.Banco banco25 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria28 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco25.adicionarConta(contaBancaria28);
        banco25.listarContas();
        banco25.listarContas();
        com.example.Banco banco32 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco32.adicionarConta(contaBancaria35);
        banco32.listarContas();
        banco32.listarContas();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("", 10.0d);
        banco32.adicionarConta(contaBancaria41);
        banco25.adicionarConta(contaBancaria41);
        banco8.adicionarConta(contaBancaria41);
        banco0.adicionarConta(contaBancaria41);
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria48.depositar((double) (-1));
        contaBancaria48.depositar(10.0d);
        double double53 = contaBancaria48.consultarSaldo();
        banco0.adicionarConta(contaBancaria48);
        contaBancaria48.depositar(162.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 107.0d + "'", double53 == 107.0d);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        banco0.adicionarConta(contaBancaria16);
        com.example.Banco banco19 = new com.example.Banco();
        com.example.Banco banco20 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco20.adicionarConta(contaBancaria23);
        banco19.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria27 = banco19.buscarContaPorTitular("hi!");
        boolean boolean29 = contaBancaria27.sacar((double) (-1.0f));
        contaBancaria27.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria27);
        com.example.ContaBancaria contaBancaria34 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria36 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 21.0");
        org.junit.Assert.assertNotNull(contaBancaria27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(contaBancaria34);
        org.junit.Assert.assertNull(contaBancaria36);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("", 0.0d);
        java.lang.String str5 = contaBancaria4.exibirDetalhes();
        double double6 = contaBancaria4.consultarSaldo();
        banco0.adicionarConta(contaBancaria4);
        java.lang.String str8 = contaBancaria4.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str5, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str8, "Titular: , Saldo: R$ 0.0");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco4 = new com.example.Banco();
        com.example.Banco banco5 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco5.adicionarConta(contaBancaria8);
        banco4.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco4.adicionarConta(contaBancaria13);
        com.example.Banco banco15 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco15.adicionarConta(contaBancaria18);
        banco15.listarContas();
        banco15.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("", 10.0d);
        banco15.adicionarConta(contaBancaria24);
        banco4.adicionarConta(contaBancaria24);
        banco0.adicionarConta(contaBancaria24);
        boolean boolean29 = contaBancaria24.sacar((double) '#');
        double double30 = contaBancaria24.consultarSaldo();
        double double31 = contaBancaria24.consultarSaldo();
        contaBancaria24.depositar(32.0d);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
        contaBancaria2.depositar(10.0d);
        double double7 = contaBancaria2.consultarSaldo();
        java.lang.String str8 = contaBancaria2.exibirDetalhes();
        double double9 = contaBancaria2.consultarSaldo();
        java.lang.String str10 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) 100L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 107.0d + "'", double7 == 107.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Titular: hi!, Saldo: R$ 107.0" + "'", str8, "Titular: hi!, Saldo: R$ 107.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 107.0d + "'", double9 == 107.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 107.0" + "'", str10, "Titular: hi!, Saldo: R$ 107.0");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0");
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria3);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) '#');
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str24 = contaBancaria23.exibirDetalhes();
        banco0.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria27 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        com.example.Banco banco28 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean33 = contaBancaria31.sacar((double) (-1L));
        banco28.adicionarConta(contaBancaria31);
        com.example.ContaBancaria contaBancaria36 = banco28.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria39 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria39.depositar((double) (byte) -1);
        double double42 = contaBancaria39.consultarSaldo();
        java.lang.String str43 = contaBancaria39.exibirDetalhes();
        banco28.adicionarConta(contaBancaria39);
        com.example.Banco banco45 = new com.example.Banco();
        banco45.listarContas();
        banco45.listarContas();
        com.example.ContaBancaria contaBancaria50 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double51 = contaBancaria50.consultarSaldo();
        banco45.adicionarConta(contaBancaria50);
        banco28.adicionarConta(contaBancaria50);
        java.lang.String str54 = contaBancaria50.exibirDetalhes();
        java.lang.String str55 = contaBancaria50.exibirDetalhes();
        banco0.adicionarConta(contaBancaria50);
        com.example.Banco banco57 = new com.example.Banco();
        com.example.Banco banco58 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria61 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco58.adicionarConta(contaBancaria61);
        banco57.adicionarConta(contaBancaria61);
        com.example.ContaBancaria contaBancaria66 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco57.adicionarConta(contaBancaria66);
        com.example.Banco banco68 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria71 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco68.adicionarConta(contaBancaria71);
        banco68.listarContas();
        banco68.listarContas();
        com.example.ContaBancaria contaBancaria77 = new com.example.ContaBancaria("", 10.0d);
        banco68.adicionarConta(contaBancaria77);
        banco57.adicionarConta(contaBancaria77);
        banco0.adicionarConta(contaBancaria77);
        double double81 = contaBancaria77.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(contaBancaria27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(contaBancaria36);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 52.0d + "'", double42 == 52.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str43, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str54, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str55, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco4 = new com.example.Banco();
        com.example.Banco banco5 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco5.adicionarConta(contaBancaria8);
        banco4.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco4.adicionarConta(contaBancaria13);
        com.example.Banco banco15 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco15.adicionarConta(contaBancaria18);
        banco15.listarContas();
        banco15.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("", 10.0d);
        banco15.adicionarConta(contaBancaria24);
        banco4.adicionarConta(contaBancaria24);
        banco0.adicionarConta(contaBancaria24);
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("hi!", 0.0d);
        banco0.adicionarConta(contaBancaria30);
        com.example.ContaBancaria contaBancaria33 = banco0.buscarContaPorTitular("hi!");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria37 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 107.0", (double) 100.0f);
        banco0.adicionarConta(contaBancaria37);
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) (short) 100);
        contaBancaria41.depositar((-1.0d));
        banco0.adicionarConta(contaBancaria41);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNotNull(contaBancaria33);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.Banco banco2 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco2.adicionarConta(contaBancaria5);
        banco2.listarContas();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco2.adicionarConta(contaBancaria10);
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean16 = contaBancaria14.sacar((double) (-1L));
        contaBancaria14.depositar((-1.0d));
        banco2.adicionarConta(contaBancaria14);
        banco0.adicionarConta(contaBancaria14);
        com.example.ContaBancaria contaBancaria22 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0, Saldo: R$ 1.0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(contaBancaria22);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean4 = contaBancaria2.sacar((double) '#');
        boolean boolean6 = contaBancaria2.sacar((double) 100);
        boolean boolean8 = contaBancaria2.sacar(88.0d);
        contaBancaria2.depositar((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0", (double) (byte) 10);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 10.0d);
        boolean boolean18 = contaBancaria16.sacar(0.0d);
        banco0.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", 0.0d);
        boolean boolean24 = contaBancaria22.sacar((double) 100L);
        contaBancaria22.depositar(182.0d);
        banco0.adicionarConta(contaBancaria22);
        contaBancaria22.depositar(149.0d);
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 84.0", (double) 'a');
        boolean boolean4 = contaBancaria2.sacar((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco6 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco6.adicionarConta(contaBancaria9);
        banco6.listarContas();
        banco6.listarContas();
        com.example.Banco banco13 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco13.adicionarConta(contaBancaria16);
        banco13.listarContas();
        banco13.listarContas();
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("", 10.0d);
        banco13.adicionarConta(contaBancaria22);
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria26.depositar((double) (byte) -1);
        banco13.adicionarConta(contaBancaria26);
        boolean boolean31 = contaBancaria26.sacar((double) (-1.0f));
        java.lang.String str32 = contaBancaria26.exibirDetalhes();
        contaBancaria26.depositar((double) (-1.0f));
        banco6.adicionarConta(contaBancaria26);
        banco6.listarContas();
        com.example.ContaBancaria contaBancaria38 = banco6.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        banco0.adicionarConta(contaBancaria38);
        com.example.ContaBancaria contaBancaria41 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str32, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria38);
        org.junit.Assert.assertNull(contaBancaria41);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        banco0.listarContas();
        java.lang.Class<?> wildcardClass6 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria19);
        java.lang.Class<?> wildcardClass21 = banco0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean23 = contaBancaria21.sacar((double) 100);
        double double24 = contaBancaria21.consultarSaldo();
        banco0.adicionarConta(contaBancaria21);
        com.example.ContaBancaria contaBancaria26 = null;
        banco0.adicionarConta(contaBancaria26);
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double31 = contaBancaria30.consultarSaldo();
        banco0.adicionarConta(contaBancaria30);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria35 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 11.0");
        com.example.ContaBancaria contaBancaria37 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 110.0");
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria35);
        org.junit.Assert.assertNull(contaBancaria37);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 10.0", 104.0d);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.Banco banco18 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco18.adicionarConta(contaBancaria21);
        banco17.adicionarConta(contaBancaria21);
        boolean boolean25 = contaBancaria21.sacar((double) (byte) 1);
        contaBancaria21.depositar((double) 1.0f);
        contaBancaria21.depositar(96.0d);
        banco0.adicionarConta(contaBancaria21);
        com.example.ContaBancaria contaBancaria32 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        contaBancaria32.depositar(104.0d);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(contaBancaria32);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str41 = contaBancaria40.exibirDetalhes();
        contaBancaria40.depositar(0.0d);
        contaBancaria40.depositar((double) 0L);
        java.lang.String str46 = contaBancaria40.exibirDetalhes();
        java.lang.String str47 = contaBancaria40.exibirDetalhes();
        java.lang.String str48 = contaBancaria40.exibirDetalhes();
        java.lang.String str49 = contaBancaria40.exibirDetalhes();
        banco0.adicionarConta(contaBancaria40);
        java.lang.Class<?> wildcardClass51 = contaBancaria40.getClass();
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str41, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str46, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str48, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str49, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 11.0", (double) 100L);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 84.0", (double) 'a');
        contaBancaria2.depositar(29.0d);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 9.0");
        com.example.Banco banco13 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean18 = contaBancaria16.sacar((double) (-1L));
        banco13.adicionarConta(contaBancaria16);
        banco13.listarContas();
        com.example.Banco banco21 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco21.adicionarConta(contaBancaria24);
        banco21.listarContas();
        banco21.listarContas();
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("", 10.0d);
        banco21.adicionarConta(contaBancaria30);
        com.example.ContaBancaria contaBancaria34 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria34.depositar((double) (byte) -1);
        banco21.adicionarConta(contaBancaria34);
        com.example.ContaBancaria contaBancaria39 = banco21.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria42 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean44 = contaBancaria42.sacar((double) 100);
        double double45 = contaBancaria42.consultarSaldo();
        banco21.adicionarConta(contaBancaria42);
        boolean boolean48 = contaBancaria42.sacar((double) (byte) 1);
        banco13.adicionarConta(contaBancaria42);
        banco0.adicionarConta(contaBancaria42);
        com.example.Banco banco51 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean56 = contaBancaria54.sacar((double) (-1L));
        banco51.adicionarConta(contaBancaria54);
        com.example.ContaBancaria contaBancaria59 = banco51.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria62 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria62.depositar((double) (byte) -1);
        double double65 = contaBancaria62.consultarSaldo();
        java.lang.String str66 = contaBancaria62.exibirDetalhes();
        banco51.adicionarConta(contaBancaria62);
        com.example.Banco banco68 = new com.example.Banco();
        banco68.listarContas();
        banco68.listarContas();
        com.example.ContaBancaria contaBancaria73 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double74 = contaBancaria73.consultarSaldo();
        banco68.adicionarConta(contaBancaria73);
        banco51.adicionarConta(contaBancaria73);
        java.lang.String str77 = contaBancaria73.exibirDetalhes();
        java.lang.String str78 = contaBancaria73.exibirDetalhes();
        contaBancaria73.depositar((double) 1.0f);
        java.lang.String str81 = contaBancaria73.exibirDetalhes();
        contaBancaria73.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria73);
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(contaBancaria59);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 52.0d + "'", double65 == 52.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str66, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str77, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str78, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0" + "'", str81, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.Banco banco30 = new com.example.Banco();
        banco30.listarContas();
        com.example.ContaBancaria contaBancaria33 = banco30.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco34 = new com.example.Banco();
        com.example.Banco banco35 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco35.adicionarConta(contaBancaria38);
        banco34.adicionarConta(contaBancaria38);
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco34.adicionarConta(contaBancaria43);
        com.example.Banco banco45 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco45.adicionarConta(contaBancaria48);
        banco45.listarContas();
        banco45.listarContas();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("", 10.0d);
        banco45.adicionarConta(contaBancaria54);
        banco34.adicionarConta(contaBancaria54);
        banco30.adicionarConta(contaBancaria54);
        banco0.adicionarConta(contaBancaria54);
        com.example.ContaBancaria contaBancaria61 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 100.0f);
        java.lang.String str62 = contaBancaria61.exibirDetalhes();
        boolean boolean64 = contaBancaria61.sacar(152.0d);
        banco0.adicionarConta(contaBancaria61);
        java.lang.Class<?> wildcardClass66 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str62, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean14 = contaBancaria12.sacar((double) (-1L));
        contaBancaria12.depositar((-1.0d));
        banco0.adicionarConta(contaBancaria12);
        contaBancaria12.depositar(29.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str41 = contaBancaria40.exibirDetalhes();
        contaBancaria40.depositar(0.0d);
        contaBancaria40.depositar((double) 0L);
        java.lang.String str46 = contaBancaria40.exibirDetalhes();
        java.lang.String str47 = contaBancaria40.exibirDetalhes();
        java.lang.String str48 = contaBancaria40.exibirDetalhes();
        java.lang.String str49 = contaBancaria40.exibirDetalhes();
        banco0.adicionarConta(contaBancaria40);
        banco0.listarContas();
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str41, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str46, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str48, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str49, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 100.0", (double) (short) -1);
        boolean boolean4 = contaBancaria2.sacar((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 52.0d);
        contaBancaria14.depositar(107.0d);
        boolean boolean18 = contaBancaria14.sacar(53.0d);
        banco0.adicionarConta(contaBancaria14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria9);
        org.junit.Assert.assertNotNull(contaBancaria11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0", (double) 100L);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria11.depositar((double) (byte) -1);
        double double14 = contaBancaria11.consultarSaldo();
        java.lang.String str15 = contaBancaria11.exibirDetalhes();
        banco0.adicionarConta(contaBancaria11);
        com.example.Banco banco17 = new com.example.Banco();
        banco17.listarContas();
        banco17.listarContas();
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double23 = contaBancaria22.consultarSaldo();
        banco17.adicionarConta(contaBancaria22);
        banco0.adicionarConta(contaBancaria22);
        java.lang.String str26 = contaBancaria22.exibirDetalhes();
        java.lang.String str27 = contaBancaria22.exibirDetalhes();
        contaBancaria22.depositar((double) 1.0f);
        double double30 = contaBancaria22.consultarSaldo();
        contaBancaria22.depositar((double) 10L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str26, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str27, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0", 97.0d);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("", 0.0d);
        java.lang.String str5 = contaBancaria4.exibirDetalhes();
        double double6 = contaBancaria4.consultarSaldo();
        banco0.adicionarConta(contaBancaria4);
        com.example.Banco banco8 = new com.example.Banco();
        banco8.listarContas();
        banco8.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double14 = contaBancaria13.consultarSaldo();
        banco8.adicionarConta(contaBancaria13);
        com.example.Banco banco16 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco16.adicionarConta(contaBancaria19);
        banco16.listarContas();
        banco16.listarContas();
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("", 10.0d);
        banco16.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria29.depositar((double) (byte) -1);
        banco16.adicionarConta(contaBancaria29);
        com.example.Banco banco33 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco33.adicionarConta(contaBancaria36);
        banco33.listarContas();
        banco33.listarContas();
        com.example.Banco banco40 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco40.adicionarConta(contaBancaria43);
        banco40.listarContas();
        banco40.listarContas();
        com.example.ContaBancaria contaBancaria49 = new com.example.ContaBancaria("", 10.0d);
        banco40.adicionarConta(contaBancaria49);
        banco33.adicionarConta(contaBancaria49);
        banco16.adicionarConta(contaBancaria49);
        banco8.adicionarConta(contaBancaria49);
        banco0.adicionarConta(contaBancaria49);
        com.example.ContaBancaria contaBancaria57 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) (byte) -1);
        banco0.adicionarConta(contaBancaria57);
        com.example.ContaBancaria contaBancaria60 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 107.0");
        banco0.listarContas();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str5, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria60);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) (-1L));
        contaBancaria2.depositar(88.0d);
        boolean boolean6 = contaBancaria2.sacar((double) 100);
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 87.0" + "'", str7, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 87.0");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        contaBancaria13.depositar((double) 1.0f);
        java.lang.Class<?> wildcardClass19 = contaBancaria13.getClass();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco4 = new com.example.Banco();
        com.example.Banco banco5 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco5.adicionarConta(contaBancaria8);
        banco4.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco4.adicionarConta(contaBancaria13);
        com.example.Banco banco15 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco15.adicionarConta(contaBancaria18);
        banco15.listarContas();
        banco15.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("", 10.0d);
        banco15.adicionarConta(contaBancaria24);
        banco4.adicionarConta(contaBancaria24);
        banco0.adicionarConta(contaBancaria24);
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("hi!", 0.0d);
        banco0.adicionarConta(contaBancaria30);
        com.example.ContaBancaria contaBancaria34 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 0.0d);
        banco0.adicionarConta(contaBancaria34);
        org.junit.Assert.assertNull(contaBancaria3);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str10 = contaBancaria9.exibirDetalhes();
        contaBancaria9.depositar(0.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria15 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str16 = contaBancaria15.exibirDetalhes();
        java.lang.Class<?> wildcardClass17 = contaBancaria15.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str16, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean14 = contaBancaria12.sacar((double) (-1L));
        contaBancaria12.depositar((-1.0d));
        banco0.adicionarConta(contaBancaria12);
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria21 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        com.example.Banco banco22 = new com.example.Banco();
        com.example.Banco banco23 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco23.adicionarConta(contaBancaria26);
        banco22.adicionarConta(contaBancaria26);
        com.example.ContaBancaria contaBancaria30 = banco22.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco22.listarContas();
        com.example.Banco banco32 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco32.adicionarConta(contaBancaria35);
        banco32.listarContas();
        banco32.listarContas();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("", 10.0d);
        banco32.adicionarConta(contaBancaria41);
        com.example.ContaBancaria contaBancaria45 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria45.depositar((double) (byte) -1);
        banco32.adicionarConta(contaBancaria45);
        boolean boolean50 = contaBancaria45.sacar((double) (-1.0f));
        java.lang.String str51 = contaBancaria45.exibirDetalhes();
        double double52 = contaBancaria45.consultarSaldo();
        banco22.adicionarConta(contaBancaria45);
        boolean boolean55 = contaBancaria45.sacar((double) 0L);
        banco0.adicionarConta(contaBancaria45);
        double double57 = contaBancaria45.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertNull(contaBancaria21);
        org.junit.Assert.assertNotNull(contaBancaria30);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str51, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 52.0d + "'", double57 == 52.0d);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        banco0.listarContas();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        banco10.listarContas();
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("", 10.0d);
        banco17.adicionarConta(contaBancaria26);
        banco10.adicionarConta(contaBancaria26);
        boolean boolean30 = contaBancaria26.sacar((double) 10.0f);
        java.lang.String str31 = contaBancaria26.exibirDetalhes();
        double double32 = contaBancaria26.consultarSaldo();
        banco0.adicionarConta(contaBancaria26);
        java.lang.Class<?> wildcardClass34 = contaBancaria26.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str31, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria6 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str10 = contaBancaria9.exibirDetalhes();
        boolean boolean12 = contaBancaria9.sacar((double) 100L);
        java.lang.String str13 = contaBancaria9.exibirDetalhes();
        banco0.adicionarConta(contaBancaria9);
        contaBancaria9.depositar((double) 1);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str10, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str13, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria21 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria23 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 84.0");
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria18);
        org.junit.Assert.assertNotNull(contaBancaria21);
        org.junit.Assert.assertNull(contaBancaria23);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str19 = contaBancaria18.exibirDetalhes();
        contaBancaria18.depositar((double) (-1.0f));
        java.lang.String str22 = contaBancaria18.exibirDetalhes();
        java.lang.String str23 = contaBancaria18.exibirDetalhes();
        contaBancaria18.depositar(84.0d);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str22, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str23, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str19 = contaBancaria18.exibirDetalhes();
        java.lang.String str20 = contaBancaria18.exibirDetalhes();
        boolean boolean22 = contaBancaria18.sacar((double) (short) 1);
        boolean boolean24 = contaBancaria18.sacar(9.0d);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str20, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.Banco banco28 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco28.adicionarConta(contaBancaria31);
        banco28.listarContas();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco28.adicionarConta(contaBancaria36);
        banco28.listarContas();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco28.adicionarConta(contaBancaria41);
        boolean boolean44 = contaBancaria41.sacar((-1.0d));
        banco0.adicionarConta(contaBancaria41);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria49 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria49.depositar((double) (byte) -1);
        double double52 = contaBancaria49.consultarSaldo();
        java.lang.String str53 = contaBancaria49.exibirDetalhes();
        java.lang.String str54 = contaBancaria49.exibirDetalhes();
        boolean boolean56 = contaBancaria49.sacar((double) ' ');
        banco0.adicionarConta(contaBancaria49);
        contaBancaria49.depositar(9.0d);
        contaBancaria49.depositar(29.0d);
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str53, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str54, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        boolean boolean25 = contaBancaria20.sacar((double) (-1.0f));
        java.lang.String str26 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria20);
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco33 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco33.adicionarConta(contaBancaria36);
        banco0.adicionarConta(contaBancaria36);
        com.example.ContaBancaria contaBancaria40 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria40);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco9 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco9.adicionarConta(contaBancaria12);
        banco9.listarContas();
        banco9.listarContas();
        com.example.Banco banco16 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco16.adicionarConta(contaBancaria19);
        banco16.listarContas();
        banco16.listarContas();
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("", 10.0d);
        banco16.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria29.depositar((double) (byte) -1);
        banco16.adicionarConta(contaBancaria29);
        com.example.ContaBancaria contaBancaria34 = banco16.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str35 = contaBancaria34.exibirDetalhes();
        banco9.adicionarConta(contaBancaria34);
        com.example.Banco banco37 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco37.adicionarConta(contaBancaria40);
        banco37.listarContas();
        com.example.ContaBancaria contaBancaria45 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco37.adicionarConta(contaBancaria45);
        banco37.listarContas();
        com.example.ContaBancaria contaBancaria50 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco37.adicionarConta(contaBancaria50);
        boolean boolean53 = contaBancaria50.sacar((-1.0d));
        banco9.adicionarConta(contaBancaria50);
        banco0.adicionarConta(contaBancaria50);
        boolean boolean57 = contaBancaria50.sacar((double) (short) 100);
        contaBancaria50.depositar(11.0d);
        org.junit.Assert.assertNotNull(contaBancaria34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str35, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        java.lang.String str9 = contaBancaria8.exibirDetalhes();
        boolean boolean11 = contaBancaria8.sacar(97.0d);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str9, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        boolean boolean25 = contaBancaria20.sacar((double) (-1.0f));
        java.lang.String str26 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 21.0", 100.0d);
        banco0.adicionarConta(contaBancaria32);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str41 = contaBancaria40.exibirDetalhes();
        contaBancaria40.depositar(0.0d);
        contaBancaria40.depositar((double) 0L);
        java.lang.String str46 = contaBancaria40.exibirDetalhes();
        java.lang.String str47 = contaBancaria40.exibirDetalhes();
        java.lang.String str48 = contaBancaria40.exibirDetalhes();
        java.lang.String str49 = contaBancaria40.exibirDetalhes();
        banco0.adicionarConta(contaBancaria40);
        com.example.Banco banco51 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco51.adicionarConta(contaBancaria54);
        banco51.listarContas();
        banco51.listarContas();
        com.example.Banco banco58 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria61 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco58.adicionarConta(contaBancaria61);
        banco58.listarContas();
        banco58.listarContas();
        com.example.ContaBancaria contaBancaria67 = new com.example.ContaBancaria("", 10.0d);
        banco58.adicionarConta(contaBancaria67);
        com.example.ContaBancaria contaBancaria71 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria71.depositar((double) (byte) -1);
        banco58.adicionarConta(contaBancaria71);
        boolean boolean76 = contaBancaria71.sacar((double) (-1.0f));
        java.lang.String str77 = contaBancaria71.exibirDetalhes();
        contaBancaria71.depositar((double) (-1.0f));
        banco51.adicionarConta(contaBancaria71);
        banco0.adicionarConta(contaBancaria71);
        com.example.ContaBancaria contaBancaria83 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 100.0");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str41, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str46, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str48, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str49, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str77, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria83);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria39 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria41 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria43 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria46 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 9.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertNull(contaBancaria41);
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertNull(contaBancaria46);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        banco10.listarContas();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("", 10.0d);
        banco10.adicionarConta(contaBancaria19);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria23.depositar((double) (byte) -1);
        banco10.adicionarConta(contaBancaria23);
        boolean boolean28 = contaBancaria23.sacar((double) (-1.0f));
        java.lang.String str29 = contaBancaria23.exibirDetalhes();
        double double30 = contaBancaria23.consultarSaldo();
        banco0.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria34 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria34.depositar((double) (-1));
        boolean boolean38 = contaBancaria34.sacar((double) (-1.0f));
        java.lang.String str39 = contaBancaria34.exibirDetalhes();
        boolean boolean41 = contaBancaria34.sacar(9.0d);
        banco0.adicionarConta(contaBancaria34);
        com.example.ContaBancaria contaBancaria44 = banco0.buscarContaPorTitular("Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass45 = contaBancaria44.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str39, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(contaBancaria44);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 42.0", (double) (short) 100);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria20);
        com.example.Banco banco22 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean27 = contaBancaria25.sacar((double) (-1L));
        banco22.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria30 = banco22.buscarContaPorTitular("");
        double double31 = contaBancaria30.consultarSaldo();
        banco0.adicionarConta(contaBancaria30);
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria35.depositar((double) (byte) -1);
        double double38 = contaBancaria35.consultarSaldo();
        java.lang.String str39 = contaBancaria35.exibirDetalhes();
        java.lang.String str40 = contaBancaria35.exibirDetalhes();
        boolean boolean42 = contaBancaria35.sacar((double) ' ');
        contaBancaria35.depositar((double) (short) 1);
        java.lang.String str45 = contaBancaria35.exibirDetalhes();
        banco0.adicionarConta(contaBancaria35);
        com.example.ContaBancaria contaBancaria48 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(contaBancaria30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 52.0d + "'", double38 == 52.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str39, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str40, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Titular: hi!, Saldo: R$ 21.0" + "'", str45, "Titular: hi!, Saldo: R$ 21.0");
        org.junit.Assert.assertNull(contaBancaria48);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 1.0", 96.0d);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) '4');
        boolean boolean9 = contaBancaria2.sacar(20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0", (double) 100.0f);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.Banco banco20 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco20.adicionarConta(contaBancaria23);
        banco20.listarContas();
        banco20.listarContas();
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("", 10.0d);
        banco20.adicionarConta(contaBancaria29);
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria33.depositar((double) (byte) -1);
        banco20.adicionarConta(contaBancaria33);
        com.example.ContaBancaria contaBancaria38 = banco20.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria40 = banco20.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str44 = contaBancaria43.exibirDetalhes();
        banco20.adicionarConta(contaBancaria43);
        contaBancaria43.depositar((double) '4');
        double double48 = contaBancaria43.consultarSaldo();
        banco0.adicionarConta(contaBancaria43);
        org.junit.Assert.assertNull(contaBancaria19);
        org.junit.Assert.assertNotNull(contaBancaria38);
        org.junit.Assert.assertNull(contaBancaria40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str44, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 52.0d + "'", double48 == 52.0d);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 53.0", 0.0d);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria2 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0");
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria2);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        banco0.listarContas();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        banco10.listarContas();
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("", 10.0d);
        banco17.adicionarConta(contaBancaria26);
        banco10.adicionarConta(contaBancaria26);
        boolean boolean30 = contaBancaria26.sacar((double) 10.0f);
        java.lang.String str31 = contaBancaria26.exibirDetalhes();
        double double32 = contaBancaria26.consultarSaldo();
        banco0.adicionarConta(contaBancaria26);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria37 = new com.example.ContaBancaria("", 0.0d);
        double double38 = contaBancaria37.consultarSaldo();
        banco0.adicionarConta(contaBancaria37);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str31, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        double double15 = contaBancaria13.consultarSaldo();
        double double16 = contaBancaria13.consultarSaldo();
        java.lang.String str17 = contaBancaria13.exibirDetalhes();
        boolean boolean19 = contaBancaria13.sacar((double) (short) 10);
        boolean boolean21 = contaBancaria13.sacar(104.0d);
        double double22 = contaBancaria13.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str17, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.Banco banco8 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco8.adicionarConta(contaBancaria11);
        banco8.listarContas();
        banco8.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("", 10.0d);
        banco8.adicionarConta(contaBancaria17);
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria21.depositar((double) (byte) -1);
        banco8.adicionarConta(contaBancaria21);
        boolean boolean26 = contaBancaria21.sacar((double) (-1.0f));
        java.lang.String str27 = contaBancaria21.exibirDetalhes();
        banco0.adicionarConta(contaBancaria21);
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str27, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.Banco banco30 = new com.example.Banco();
        banco30.listarContas();
        com.example.ContaBancaria contaBancaria33 = banco30.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco34 = new com.example.Banco();
        com.example.Banco banco35 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco35.adicionarConta(contaBancaria38);
        banco34.adicionarConta(contaBancaria38);
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco34.adicionarConta(contaBancaria43);
        com.example.Banco banco45 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco45.adicionarConta(contaBancaria48);
        banco45.listarContas();
        banco45.listarContas();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("", 10.0d);
        banco45.adicionarConta(contaBancaria54);
        banco34.adicionarConta(contaBancaria54);
        banco30.adicionarConta(contaBancaria54);
        banco0.adicionarConta(contaBancaria54);
        com.example.ContaBancaria contaBancaria60 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria64 = new com.example.ContaBancaria("hi!", 0.0d);
        boolean boolean66 = contaBancaria64.sacar((double) (byte) 100);
        java.lang.String str67 = contaBancaria64.exibirDetalhes();
        contaBancaria64.depositar((-1.0d));
        banco0.adicionarConta(contaBancaria64);
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertNull(contaBancaria60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Titular: hi!, Saldo: R$ 0.0" + "'", str67, "Titular: hi!, Saldo: R$ 0.0");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco4 = new com.example.Banco();
        com.example.Banco banco5 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco5.adicionarConta(contaBancaria8);
        banco4.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco4.adicionarConta(contaBancaria13);
        com.example.Banco banco15 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco15.adicionarConta(contaBancaria18);
        banco15.listarContas();
        banco15.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("", 10.0d);
        banco15.adicionarConta(contaBancaria24);
        banco4.adicionarConta(contaBancaria24);
        banco0.adicionarConta(contaBancaria24);
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("hi!", 0.0d);
        banco0.adicionarConta(contaBancaria30);
        com.example.ContaBancaria contaBancaria33 = banco0.buscarContaPorTitular("hi!");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria37 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 107.0", (double) 100.0f);
        banco0.adicionarConta(contaBancaria37);
        boolean boolean40 = contaBancaria37.sacar((double) (byte) -1);
        java.lang.String str41 = contaBancaria37.exibirDetalhes();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNotNull(contaBancaria33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 100.0" + "'", str41, "Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 100.0");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double6 = contaBancaria5.consultarSaldo();
        banco0.adicionarConta(contaBancaria5);
        com.example.Banco banco8 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco8.adicionarConta(contaBancaria11);
        banco8.listarContas();
        banco8.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("", 10.0d);
        banco8.adicionarConta(contaBancaria17);
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria21.depositar((double) (byte) -1);
        banco8.adicionarConta(contaBancaria21);
        com.example.Banco banco25 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria28 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco25.adicionarConta(contaBancaria28);
        banco25.listarContas();
        banco25.listarContas();
        com.example.Banco banco32 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco32.adicionarConta(contaBancaria35);
        banco32.listarContas();
        banco32.listarContas();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("", 10.0d);
        banco32.adicionarConta(contaBancaria41);
        banco25.adicionarConta(contaBancaria41);
        banco8.adicionarConta(contaBancaria41);
        banco0.adicionarConta(contaBancaria41);
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria48.depositar((double) (-1));
        contaBancaria48.depositar(10.0d);
        double double53 = contaBancaria48.consultarSaldo();
        banco0.adicionarConta(contaBancaria48);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria59 = new com.example.ContaBancaria("", 10.0d);
        contaBancaria59.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria59);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 107.0d + "'", double53 == 107.0d);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        java.lang.String str17 = contaBancaria13.exibirDetalhes();
        boolean boolean19 = contaBancaria13.sacar(0.0d);
        java.lang.Class<?> wildcardClass20 = contaBancaria13.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str17, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 9.0");
        com.example.Banco banco13 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco13.adicionarConta(contaBancaria16);
        banco13.listarContas();
        banco13.listarContas();
        com.example.ContaBancaria contaBancaria21 = banco13.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 10.0f);
        java.lang.String str25 = contaBancaria24.exibirDetalhes();
        banco13.adicionarConta(contaBancaria24);
        banco0.adicionarConta(contaBancaria24);
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertNotNull(contaBancaria21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0" + "'", str25, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 20.0", (double) 100L);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean14 = contaBancaria12.sacar((double) (-1L));
        contaBancaria12.depositar((-1.0d));
        banco0.adicionarConta(contaBancaria12);
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria21 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        com.example.Banco banco22 = new com.example.Banco();
        com.example.Banco banco23 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco23.adicionarConta(contaBancaria26);
        banco22.adicionarConta(contaBancaria26);
        com.example.ContaBancaria contaBancaria30 = banco22.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco22.listarContas();
        com.example.Banco banco32 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco32.adicionarConta(contaBancaria35);
        banco32.listarContas();
        banco32.listarContas();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("", 10.0d);
        banco32.adicionarConta(contaBancaria41);
        com.example.ContaBancaria contaBancaria45 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria45.depositar((double) (byte) -1);
        banco32.adicionarConta(contaBancaria45);
        boolean boolean50 = contaBancaria45.sacar((double) (-1.0f));
        java.lang.String str51 = contaBancaria45.exibirDetalhes();
        double double52 = contaBancaria45.consultarSaldo();
        banco22.adicionarConta(contaBancaria45);
        boolean boolean55 = contaBancaria45.sacar((double) 0L);
        banco0.adicionarConta(contaBancaria45);
        contaBancaria45.depositar(29.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertNull(contaBancaria21);
        org.junit.Assert.assertNotNull(contaBancaria30);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str51, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria16 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria16);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 10.0d);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) ' ');
        contaBancaria2.depositar((double) (short) 1);
        boolean boolean13 = contaBancaria2.sacar(0.0d);
        contaBancaria2.depositar((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0", (double) (byte) 0);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0, Saldo: R$ 0.0" + "'", str3, "Titular: Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 84.0", (double) (short) -1);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ -1.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ -1.0");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean23 = contaBancaria21.sacar((double) 100);
        double double24 = contaBancaria21.consultarSaldo();
        banco0.adicionarConta(contaBancaria21);
        com.example.ContaBancaria contaBancaria26 = null;
        banco0.adicionarConta(contaBancaria26);
        banco0.listarContas();
        com.example.Banco banco29 = new com.example.Banco();
        com.example.Banco banco30 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco30.adicionarConta(contaBancaria33);
        banco29.adicionarConta(contaBancaria33);
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco29.adicionarConta(contaBancaria38);
        com.example.ContaBancaria contaBancaria41 = banco29.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria43 = banco29.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria45 = banco29.buscarContaPorTitular("Titular: hi!, Saldo: R$ 117.0");
        com.example.ContaBancaria contaBancaria47 = banco29.buscarContaPorTitular("");
        banco0.adicionarConta(contaBancaria47);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNull(contaBancaria41);
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertNull(contaBancaria45);
        org.junit.Assert.assertNotNull(contaBancaria47);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria3.depositar(1.0d);
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco9 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco9.adicionarConta(contaBancaria12);
        banco9.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco9.adicionarConta(contaBancaria17);
        com.example.Banco banco19 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco19.adicionarConta(contaBancaria22);
        banco19.listarContas();
        banco19.listarContas();
        com.example.ContaBancaria contaBancaria28 = new com.example.ContaBancaria("", 10.0d);
        banco19.adicionarConta(contaBancaria28);
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria32.depositar((double) (byte) -1);
        banco19.adicionarConta(contaBancaria32);
        com.example.ContaBancaria contaBancaria37 = banco19.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str38 = contaBancaria37.exibirDetalhes();
        boolean boolean40 = contaBancaria37.sacar((double) (byte) -1);
        banco9.adicionarConta(contaBancaria37);
        double double42 = contaBancaria37.consultarSaldo();
        double double43 = contaBancaria37.consultarSaldo();
        banco0.adicionarConta(contaBancaria37);
        com.example.Banco banco45 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco45.adicionarConta(contaBancaria48);
        banco45.listarContas();
        banco45.listarContas();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("", 10.0d);
        banco45.adicionarConta(contaBancaria54);
        com.example.ContaBancaria contaBancaria58 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria58.depositar((double) (byte) -1);
        banco45.adicionarConta(contaBancaria58);
        banco45.listarContas();
        com.example.ContaBancaria contaBancaria65 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco45.adicionarConta(contaBancaria65);
        com.example.Banco banco67 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria70 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean72 = contaBancaria70.sacar((double) (-1L));
        banco67.adicionarConta(contaBancaria70);
        com.example.ContaBancaria contaBancaria75 = banco67.buscarContaPorTitular("");
        double double76 = contaBancaria75.consultarSaldo();
        banco45.adicionarConta(contaBancaria75);
        banco0.adicionarConta(contaBancaria75);
        org.junit.Assert.assertNotNull(contaBancaria37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str38, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 52.0d + "'", double42 == 52.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 52.0d + "'", double43 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(contaBancaria75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 10.0d + "'", double76 == 10.0d);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria3.depositar(1.0d);
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        contaBancaria9.depositar((double) (byte) 1);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria6 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str10 = contaBancaria9.exibirDetalhes();
        boolean boolean12 = contaBancaria9.sacar((double) 100L);
        java.lang.String str13 = contaBancaria9.exibirDetalhes();
        banco0.adicionarConta(contaBancaria9);
        java.lang.Class<?> wildcardClass15 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str10, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str13, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) ' ');
        java.lang.String str10 = contaBancaria2.exibirDetalhes();
        java.lang.String str11 = contaBancaria2.exibirDetalhes();
        double double12 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) (short) 100);
        contaBancaria2.depositar((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 20.0" + "'", str10, "Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Titular: hi!, Saldo: R$ 20.0" + "'", str11, "Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0", (double) 1.0f);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.Banco banco2 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco2.adicionarConta(contaBancaria5);
        banco2.listarContas();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco2.adicionarConta(contaBancaria10);
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean16 = contaBancaria14.sacar((double) (-1L));
        contaBancaria14.depositar((-1.0d));
        banco2.adicionarConta(contaBancaria14);
        banco0.adicionarConta(contaBancaria14);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) ' ');
        banco0.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria26 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 9.0");
        com.example.ContaBancaria contaBancaria28 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ -1.0");
        com.example.ContaBancaria contaBancaria30 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = contaBancaria30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(contaBancaria26);
        org.junit.Assert.assertNull(contaBancaria28);
        org.junit.Assert.assertNull(contaBancaria30);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 0);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 0.0", (double) 100L);
        double double3 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar(88.0d);
        java.lang.Class<?> wildcardClass6 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0);
        boolean boolean4 = contaBancaria2.sacar((double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        banco10.listarContas();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("", 10.0d);
        banco10.adicionarConta(contaBancaria19);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria23.depositar((double) (byte) -1);
        banco10.adicionarConta(contaBancaria23);
        boolean boolean28 = contaBancaria23.sacar((double) (-1.0f));
        java.lang.String str29 = contaBancaria23.exibirDetalhes();
        double double30 = contaBancaria23.consultarSaldo();
        banco0.adicionarConta(contaBancaria23);
        com.example.Banco banco32 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean37 = contaBancaria35.sacar((double) (-1L));
        banco32.adicionarConta(contaBancaria35);
        com.example.ContaBancaria contaBancaria40 = banco32.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria43.depositar((double) (byte) -1);
        double double46 = contaBancaria43.consultarSaldo();
        java.lang.String str47 = contaBancaria43.exibirDetalhes();
        banco32.adicionarConta(contaBancaria43);
        banco0.adicionarConta(contaBancaria43);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria52 = banco0.buscarContaPorTitular("hi!");
        boolean boolean54 = contaBancaria52.sacar((double) 0.0f);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(contaBancaria40);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 52.0d + "'", double46 == 52.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria24.depositar((double) (byte) -1);
        double double27 = contaBancaria24.consultarSaldo();
        java.lang.String str28 = contaBancaria24.exibirDetalhes();
        java.lang.String str29 = contaBancaria24.exibirDetalhes();
        boolean boolean31 = contaBancaria24.sacar((double) ' ');
        boolean boolean33 = contaBancaria24.sacar((double) (short) -1);
        banco0.adicionarConta(contaBancaria24);
        com.example.ContaBancaria contaBancaria36 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 87.0");
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str28, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(contaBancaria36);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        banco0.listarContas();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco10.adicionarConta(contaBancaria18);
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean24 = contaBancaria22.sacar((double) (-1L));
        contaBancaria22.depositar((-1.0d));
        banco10.adicionarConta(contaBancaria22);
        banco10.listarContas();
        com.example.ContaBancaria contaBancaria30 = banco10.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria32 = banco10.buscarContaPorTitular("");
        banco0.adicionarConta(contaBancaria32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(contaBancaria30);
        org.junit.Assert.assertNotNull(contaBancaria32);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria17);
        com.example.Banco banco19 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco19.adicionarConta(contaBancaria22);
        banco19.listarContas();
        banco19.listarContas();
        com.example.ContaBancaria contaBancaria28 = new com.example.ContaBancaria("", 10.0d);
        banco19.adicionarConta(contaBancaria28);
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria32.depositar((double) (byte) -1);
        banco19.adicionarConta(contaBancaria32);
        com.example.ContaBancaria contaBancaria37 = banco19.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean42 = contaBancaria40.sacar((double) 100);
        double double43 = contaBancaria40.consultarSaldo();
        banco19.adicionarConta(contaBancaria40);
        com.example.Banco banco45 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean50 = contaBancaria48.sacar((double) (-1L));
        banco45.adicionarConta(contaBancaria48);
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str55 = contaBancaria54.exibirDetalhes();
        contaBancaria54.depositar(0.0d);
        banco45.adicionarConta(contaBancaria54);
        contaBancaria54.depositar((double) (-1));
        banco19.adicionarConta(contaBancaria54);
        java.lang.String str62 = contaBancaria54.exibirDetalhes();
        boolean boolean64 = contaBancaria54.sacar(0.0d);
        banco0.adicionarConta(contaBancaria54);
        com.example.ContaBancaria contaBancaria67 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 10.0");
        org.junit.Assert.assertNotNull(contaBancaria37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str55, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str62, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(contaBancaria67);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", 100.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass4 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0", 0.0d);
        boolean boolean4 = contaBancaria2.sacar(20.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0", (double) (short) 1);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ 97.0", (double) (short) 0);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 42.0");
        java.lang.Class<?> wildcardClass20 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria39 = banco0.buscarContaPorTitular("hi!");
        contaBancaria39.depositar((double) (short) 100);
        org.junit.Assert.assertNotNull(contaBancaria39);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.Banco banco28 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco28.adicionarConta(contaBancaria31);
        banco28.listarContas();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco28.adicionarConta(contaBancaria36);
        banco28.listarContas();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco28.adicionarConta(contaBancaria41);
        boolean boolean44 = contaBancaria41.sacar((-1.0d));
        banco0.adicionarConta(contaBancaria41);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria49 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria49.depositar((double) (byte) -1);
        double double52 = contaBancaria49.consultarSaldo();
        java.lang.String str53 = contaBancaria49.exibirDetalhes();
        java.lang.String str54 = contaBancaria49.exibirDetalhes();
        boolean boolean56 = contaBancaria49.sacar((double) ' ');
        banco0.adicionarConta(contaBancaria49);
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str53, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str54, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (-1L));
        contaBancaria2.depositar((double) '4');
        java.lang.Class<?> wildcardClass7 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 117.0", 149.0d);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 1.0", 99.0d);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 21.0", (double) (byte) 100);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        double double4 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 21.0, Saldo: R$ 100.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 21.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria5 = banco0.buscarContaPorTitular("Titular: Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria5);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.Banco banco18 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco18.adicionarConta(contaBancaria21);
        banco17.adicionarConta(contaBancaria21);
        boolean boolean25 = contaBancaria21.sacar((double) (byte) 1);
        contaBancaria21.depositar((double) 1.0f);
        contaBancaria21.depositar(96.0d);
        banco0.adicionarConta(contaBancaria21);
        double double31 = contaBancaria21.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 193.0d + "'", double31 == 193.0d);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.Banco banco11 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean16 = contaBancaria14.sacar((double) (-1L));
        banco11.adicionarConta(contaBancaria14);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str21 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar(0.0d);
        banco11.adicionarConta(contaBancaria20);
        contaBancaria20.depositar((double) (-1));
        contaBancaria20.depositar((double) ' ');
        banco0.adicionarConta(contaBancaria20);
        double double30 = contaBancaria20.consultarSaldo();
        boolean boolean32 = contaBancaria20.sacar((double) (byte) 0);
        boolean boolean34 = contaBancaria20.sacar(182.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str21, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 84.0d + "'", double30 == 84.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria7 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria9 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 42.0");
        org.junit.Assert.assertNull(contaBancaria7);
        org.junit.Assert.assertNull(contaBancaria9);
        org.junit.Assert.assertNull(contaBancaria11);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.Banco banco30 = new com.example.Banco();
        banco30.listarContas();
        com.example.ContaBancaria contaBancaria33 = banco30.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco34 = new com.example.Banco();
        com.example.Banco banco35 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco35.adicionarConta(contaBancaria38);
        banco34.adicionarConta(contaBancaria38);
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco34.adicionarConta(contaBancaria43);
        com.example.Banco banco45 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco45.adicionarConta(contaBancaria48);
        banco45.listarContas();
        banco45.listarContas();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("", 10.0d);
        banco45.adicionarConta(contaBancaria54);
        banco34.adicionarConta(contaBancaria54);
        banco30.adicionarConta(contaBancaria54);
        banco0.adicionarConta(contaBancaria54);
        com.example.ContaBancaria contaBancaria61 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 100.0f);
        java.lang.String str62 = contaBancaria61.exibirDetalhes();
        boolean boolean64 = contaBancaria61.sacar(152.0d);
        banco0.adicionarConta(contaBancaria61);
        boolean boolean67 = contaBancaria61.sacar(182.0d);
        java.lang.String str68 = contaBancaria61.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str62, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str68, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
        contaBancaria2.depositar(10.0d);
        double double7 = contaBancaria2.consultarSaldo();
        double double8 = contaBancaria2.consultarSaldo();
        java.lang.String str9 = contaBancaria2.exibirDetalhes();
        java.lang.String str10 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 107.0d + "'", double7 == 107.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 107.0d + "'", double8 == 107.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Titular: hi!, Saldo: R$ 107.0" + "'", str9, "Titular: hi!, Saldo: R$ 107.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 107.0" + "'", str10, "Titular: hi!, Saldo: R$ 107.0");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0");
        org.junit.Assert.assertNull(contaBancaria12);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 97.0", (double) (short) 100);
        banco0.adicionarConta(contaBancaria21);
        com.example.ContaBancaria contaBancaria24 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria27 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 53.0");
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0", (double) 1.0f);
        boolean boolean32 = contaBancaria30.sacar(184.0d);
        banco0.adicionarConta(contaBancaria30);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria24);
        org.junit.Assert.assertNull(contaBancaria27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 10.0d);
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0", 10.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar((double) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 10.0" + "'", str3, "Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria9 = null;
        banco0.adicionarConta(contaBancaria9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria8);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 0.0", 152.0d);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 152.0d + "'", double3 == 152.0d);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) (-1L));
        contaBancaria2.depositar(88.0d);
        contaBancaria2.depositar(100.0d);
        double double7 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 187.0d + "'", double7 == 187.0d);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) ' ');
        double double10 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 100.0", 87.0d);
        boolean boolean4 = contaBancaria2.sacar(0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.Banco banco11 = new com.example.Banco();
        banco11.listarContas();
        com.example.ContaBancaria contaBancaria14 = banco11.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco15 = new com.example.Banco();
        com.example.Banco banco16 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco16.adicionarConta(contaBancaria19);
        banco15.adicionarConta(contaBancaria19);
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco15.adicionarConta(contaBancaria24);
        com.example.Banco banco26 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco26.adicionarConta(contaBancaria29);
        banco26.listarContas();
        banco26.listarContas();
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("", 10.0d);
        banco26.adicionarConta(contaBancaria35);
        banco15.adicionarConta(contaBancaria35);
        banco11.adicionarConta(contaBancaria35);
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("hi!", 0.0d);
        banco11.adicionarConta(contaBancaria41);
        contaBancaria41.depositar((double) (short) 100);
        banco0.adicionarConta(contaBancaria41);
        com.example.ContaBancaria contaBancaria47 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0");
        com.example.Banco banco48 = new com.example.Banco();
        banco48.listarContas();
        com.example.Banco banco50 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria53 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco50.adicionarConta(contaBancaria53);
        banco50.listarContas();
        com.example.ContaBancaria contaBancaria58 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco50.adicionarConta(contaBancaria58);
        com.example.ContaBancaria contaBancaria62 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean64 = contaBancaria62.sacar((double) (-1L));
        contaBancaria62.depositar((-1.0d));
        banco50.adicionarConta(contaBancaria62);
        banco48.adicionarConta(contaBancaria62);
        double double69 = contaBancaria62.consultarSaldo();
        banco0.adicionarConta(contaBancaria62);
        com.example.Banco banco71 = new com.example.Banco();
        com.example.Banco banco72 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria75 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco72.adicionarConta(contaBancaria75);
        banco71.adicionarConta(contaBancaria75);
        com.example.ContaBancaria contaBancaria80 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco71.adicionarConta(contaBancaria80);
        com.example.ContaBancaria contaBancaria83 = banco71.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria86 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean88 = contaBancaria86.sacar((double) (-1L));
        contaBancaria86.depositar((-1.0d));
        java.lang.String str91 = contaBancaria86.exibirDetalhes();
        double double92 = contaBancaria86.consultarSaldo();
        banco71.adicionarConta(contaBancaria86);
        java.lang.String str94 = contaBancaria86.exibirDetalhes();
        banco0.adicionarConta(contaBancaria86);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertNull(contaBancaria47);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertNull(contaBancaria83);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str91, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 10.0d + "'", double92 == 10.0d);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str94, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria5 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria7 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
        com.example.Banco banco8 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco8.adicionarConta(contaBancaria11);
        banco8.listarContas();
        banco8.listarContas();
        com.example.Banco banco15 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco15.adicionarConta(contaBancaria18);
        banco15.listarContas();
        banco15.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("", 10.0d);
        banco15.adicionarConta(contaBancaria24);
        com.example.ContaBancaria contaBancaria28 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria28.depositar((double) (byte) -1);
        banco15.adicionarConta(contaBancaria28);
        com.example.ContaBancaria contaBancaria33 = banco15.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str34 = contaBancaria33.exibirDetalhes();
        banco8.adicionarConta(contaBancaria33);
        com.example.ContaBancaria contaBancaria37 = banco8.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.Banco banco38 = new com.example.Banco();
        banco38.listarContas();
        com.example.ContaBancaria contaBancaria41 = banco38.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco42 = new com.example.Banco();
        com.example.Banco banco43 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria46 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco43.adicionarConta(contaBancaria46);
        banco42.adicionarConta(contaBancaria46);
        com.example.ContaBancaria contaBancaria51 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco42.adicionarConta(contaBancaria51);
        com.example.Banco banco53 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria56 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco53.adicionarConta(contaBancaria56);
        banco53.listarContas();
        banco53.listarContas();
        com.example.ContaBancaria contaBancaria62 = new com.example.ContaBancaria("", 10.0d);
        banco53.adicionarConta(contaBancaria62);
        banco42.adicionarConta(contaBancaria62);
        banco38.adicionarConta(contaBancaria62);
        banco8.adicionarConta(contaBancaria62);
        com.example.ContaBancaria contaBancaria69 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 100.0f);
        java.lang.String str70 = contaBancaria69.exibirDetalhes();
        boolean boolean72 = contaBancaria69.sacar(152.0d);
        banco8.adicionarConta(contaBancaria69);
        com.example.Banco banco74 = new com.example.Banco();
        com.example.Banco banco75 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria78 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco75.adicionarConta(contaBancaria78);
        banco74.adicionarConta(contaBancaria78);
        com.example.ContaBancaria contaBancaria82 = banco74.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco74.listarContas();
        banco74.listarContas();
        com.example.ContaBancaria contaBancaria87 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria87.depositar((double) (byte) -1);
        banco74.adicionarConta(contaBancaria87);
        contaBancaria87.depositar((double) 1.0f);
        banco8.adicionarConta(contaBancaria87);
        boolean boolean95 = contaBancaria87.sacar(0.0d);
        banco0.adicionarConta(contaBancaria87);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria5);
        org.junit.Assert.assertNull(contaBancaria7);
        org.junit.Assert.assertNotNull(contaBancaria33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str34, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria37);
        org.junit.Assert.assertNull(contaBancaria41);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str70, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(contaBancaria82);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria16 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("", 10.0d);
        banco17.adicionarConta(contaBancaria26);
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria30.depositar((double) (byte) -1);
        banco17.adicionarConta(contaBancaria30);
        com.example.ContaBancaria contaBancaria35 = banco17.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str36 = contaBancaria35.exibirDetalhes();
        banco0.adicionarConta(contaBancaria35);
        com.example.ContaBancaria contaBancaria39 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 11.0");
        com.example.Banco banco40 = new com.example.Banco();
        com.example.Banco banco41 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria44 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco41.adicionarConta(contaBancaria44);
        banco40.adicionarConta(contaBancaria44);
        com.example.ContaBancaria contaBancaria49 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco40.adicionarConta(contaBancaria49);
        com.example.Banco banco51 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco51.adicionarConta(contaBancaria54);
        banco51.listarContas();
        banco51.listarContas();
        com.example.ContaBancaria contaBancaria60 = new com.example.ContaBancaria("", 10.0d);
        banco51.adicionarConta(contaBancaria60);
        banco40.adicionarConta(contaBancaria60);
        com.example.Banco banco63 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria66 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco63.adicionarConta(contaBancaria66);
        banco63.listarContas();
        banco63.listarContas();
        com.example.ContaBancaria contaBancaria72 = new com.example.ContaBancaria("", 10.0d);
        banco63.adicionarConta(contaBancaria72);
        com.example.ContaBancaria contaBancaria76 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria76.depositar((double) (byte) -1);
        banco63.adicionarConta(contaBancaria76);
        com.example.ContaBancaria contaBancaria81 = banco63.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria84 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean86 = contaBancaria84.sacar((double) 100);
        double double87 = contaBancaria84.consultarSaldo();
        banco63.adicionarConta(contaBancaria84);
        banco40.adicionarConta(contaBancaria84);
        java.lang.String str90 = contaBancaria84.exibirDetalhes();
        contaBancaria84.depositar((double) ' ');
        contaBancaria84.depositar(0.0d);
        banco0.adicionarConta(contaBancaria84);
        org.junit.Assert.assertNull(contaBancaria16);
        org.junit.Assert.assertNotNull(contaBancaria35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str36, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria39);
        org.junit.Assert.assertNotNull(contaBancaria81);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str90, "Titular: hi!, Saldo: R$ -1.0");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.Banco banco30 = new com.example.Banco();
        banco30.listarContas();
        com.example.ContaBancaria contaBancaria33 = banco30.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco34 = new com.example.Banco();
        com.example.Banco banco35 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco35.adicionarConta(contaBancaria38);
        banco34.adicionarConta(contaBancaria38);
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco34.adicionarConta(contaBancaria43);
        com.example.Banco banco45 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco45.adicionarConta(contaBancaria48);
        banco45.listarContas();
        banco45.listarContas();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("", 10.0d);
        banco45.adicionarConta(contaBancaria54);
        banco34.adicionarConta(contaBancaria54);
        banco30.adicionarConta(contaBancaria54);
        banco0.adicionarConta(contaBancaria54);
        com.example.ContaBancaria contaBancaria61 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 100.0f);
        java.lang.String str62 = contaBancaria61.exibirDetalhes();
        boolean boolean64 = contaBancaria61.sacar(152.0d);
        banco0.adicionarConta(contaBancaria61);
        com.example.ContaBancaria contaBancaria67 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria70 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) (short) 0);
        banco0.adicionarConta(contaBancaria70);
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str62, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(contaBancaria67);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("hi!");
        boolean boolean10 = contaBancaria8.sacar((double) (-1.0f));
        contaBancaria8.depositar((double) (-1.0f));
        double double13 = contaBancaria8.consultarSaldo();
        java.lang.Class<?> wildcardClass14 = contaBancaria8.getClass();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria3.depositar(1.0d);
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("");
        org.junit.Assert.assertNotNull(contaBancaria10);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria39 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria41 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria43 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        banco0.listarContas();
        com.example.Banco banco45 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean50 = contaBancaria48.sacar((double) (-1L));
        banco45.adicionarConta(contaBancaria48);
        banco45.listarContas();
        banco45.listarContas();
        banco45.listarContas();
        com.example.Banco banco55 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria58 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco55.adicionarConta(contaBancaria58);
        banco55.listarContas();
        banco55.listarContas();
        com.example.ContaBancaria contaBancaria64 = new com.example.ContaBancaria("", 10.0d);
        banco55.adicionarConta(contaBancaria64);
        com.example.ContaBancaria contaBancaria68 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria68.depositar((double) (byte) -1);
        banco55.adicionarConta(contaBancaria68);
        com.example.ContaBancaria contaBancaria73 = banco55.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria75 = banco55.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria78 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str79 = contaBancaria78.exibirDetalhes();
        banco55.adicionarConta(contaBancaria78);
        java.lang.String str81 = contaBancaria78.exibirDetalhes();
        double double82 = contaBancaria78.consultarSaldo();
        boolean boolean84 = contaBancaria78.sacar((double) (short) 10);
        banco45.adicionarConta(contaBancaria78);
        java.lang.String str86 = contaBancaria78.exibirDetalhes();
        banco0.adicionarConta(contaBancaria78);
        com.example.ContaBancaria contaBancaria90 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0", (double) (byte) 0);
        banco0.adicionarConta(contaBancaria90);
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertNull(contaBancaria41);
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(contaBancaria73);
        org.junit.Assert.assertNull(contaBancaria75);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str79, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str81, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str86, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria11.depositar((double) (byte) -1);
        double double14 = contaBancaria11.consultarSaldo();
        java.lang.String str15 = contaBancaria11.exibirDetalhes();
        banco0.adicionarConta(contaBancaria11);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0, Saldo: R$ -1.0", (double) '#');
        banco0.adicionarConta(contaBancaria20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double9 = contaBancaria8.consultarSaldo();
        contaBancaria8.depositar((double) 10L);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria14 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria17 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertNull(contaBancaria17);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0", (double) ' ');
        boolean boolean4 = contaBancaria2.sacar(0.0d);
        contaBancaria2.depositar((double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        banco10.listarContas();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("", 10.0d);
        banco10.adicionarConta(contaBancaria19);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria23.depositar((double) (byte) -1);
        banco10.adicionarConta(contaBancaria23);
        boolean boolean28 = contaBancaria23.sacar((double) (-1.0f));
        java.lang.String str29 = contaBancaria23.exibirDetalhes();
        double double30 = contaBancaria23.consultarSaldo();
        banco0.adicionarConta(contaBancaria23);
        com.example.Banco banco32 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean37 = contaBancaria35.sacar((double) (-1L));
        banco32.adicionarConta(contaBancaria35);
        com.example.ContaBancaria contaBancaria40 = banco32.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria43.depositar((double) (byte) -1);
        double double46 = contaBancaria43.consultarSaldo();
        java.lang.String str47 = contaBancaria43.exibirDetalhes();
        banco32.adicionarConta(contaBancaria43);
        banco0.adicionarConta(contaBancaria43);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria51 = null;
        banco0.adicionarConta(contaBancaria51);
        com.example.ContaBancaria contaBancaria54 = banco0.buscarContaPorTitular("Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(contaBancaria40);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 52.0d + "'", double46 == 52.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria54);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.Banco banco8 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco8.adicionarConta(contaBancaria11);
        banco8.listarContas();
        banco8.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("", 10.0d);
        banco8.adicionarConta(contaBancaria17);
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria21.depositar((double) (byte) -1);
        banco8.adicionarConta(contaBancaria21);
        boolean boolean26 = contaBancaria21.sacar((double) (-1.0f));
        java.lang.String str27 = contaBancaria21.exibirDetalhes();
        banco0.adicionarConta(contaBancaria21);
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria31.depositar((double) (byte) -1);
        double double34 = contaBancaria31.consultarSaldo();
        banco0.adicionarConta(contaBancaria31);
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str27, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 52.0d + "'", double34 == 52.0d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        boolean boolean25 = contaBancaria20.sacar((double) (-1.0f));
        java.lang.String str26 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria20);
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco33 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco33.adicionarConta(contaBancaria36);
        banco0.adicionarConta(contaBancaria36);
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str24 = contaBancaria23.exibirDetalhes();
        banco0.adicionarConta(contaBancaria23);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria28 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNull(contaBancaria28);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        boolean boolean18 = contaBancaria13.sacar((double) (-1.0f));
        java.lang.String str19 = contaBancaria13.exibirDetalhes();
        contaBancaria13.depositar((double) (-1.0f));
        double double22 = contaBancaria13.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean4 = contaBancaria2.sacar((double) '#');
        boolean boolean6 = contaBancaria2.sacar((double) 100);
        java.lang.Class<?> wildcardClass7 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria11.depositar((double) (byte) -1);
        double double14 = contaBancaria11.consultarSaldo();
        java.lang.String str15 = contaBancaria11.exibirDetalhes();
        banco0.adicionarConta(contaBancaria11);
        com.example.ContaBancaria contaBancaria17 = null;
        banco0.adicionarConta(contaBancaria17);
        banco0.listarContas();
        java.lang.Class<?> wildcardClass20 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco4 = new com.example.Banco();
        com.example.Banco banco5 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco5.adicionarConta(contaBancaria8);
        banco4.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco4.adicionarConta(contaBancaria13);
        com.example.Banco banco15 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco15.adicionarConta(contaBancaria18);
        banco15.listarContas();
        banco15.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("", 10.0d);
        banco15.adicionarConta(contaBancaria24);
        banco4.adicionarConta(contaBancaria24);
        banco0.adicionarConta(contaBancaria24);
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("hi!", 0.0d);
        banco0.adicionarConta(contaBancaria30);
        com.example.ContaBancaria contaBancaria33 = banco0.buscarContaPorTitular("hi!");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria37 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 107.0", (double) 100.0f);
        banco0.adicionarConta(contaBancaria37);
        boolean boolean40 = contaBancaria37.sacar((double) (byte) -1);
        boolean boolean42 = contaBancaria37.sacar(84.0d);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNotNull(contaBancaria33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean14 = contaBancaria12.sacar((double) (-1L));
        contaBancaria12.depositar((-1.0d));
        banco0.adicionarConta(contaBancaria12);
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria21 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria24.depositar((double) (byte) -1);
        double double27 = contaBancaria24.consultarSaldo();
        java.lang.String str28 = contaBancaria24.exibirDetalhes();
        double double29 = contaBancaria24.consultarSaldo();
        banco0.adicionarConta(contaBancaria24);
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double34 = contaBancaria33.consultarSaldo();
        banco0.adicionarConta(contaBancaria33);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertNull(contaBancaria21);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str28, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 52.0d + "'", double29 == 52.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 10.0d);
        contaBancaria2.depositar((double) (byte) 1);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) '4');
        contaBancaria2.depositar((double) (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: , Saldo: R$ 11.0" + "'", str5, "Titular: , Saldo: R$ 11.0");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        banco0.adicionarConta(contaBancaria16);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria21 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria23 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 11.0");
        com.example.Banco banco24 = new com.example.Banco();
        banco24.listarContas();
        com.example.Banco banco26 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco26.adicionarConta(contaBancaria29);
        banco26.listarContas();
        com.example.ContaBancaria contaBancaria34 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco26.adicionarConta(contaBancaria34);
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean40 = contaBancaria38.sacar((double) (-1L));
        contaBancaria38.depositar((-1.0d));
        banco26.adicionarConta(contaBancaria38);
        banco24.adicionarConta(contaBancaria38);
        contaBancaria38.depositar((double) 0.0f);
        banco0.adicionarConta(contaBancaria38);
        org.junit.Assert.assertNull(contaBancaria21);
        org.junit.Assert.assertNull(contaBancaria23);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0", (double) 'a');
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 10.0d);
        boolean boolean18 = contaBancaria16.sacar(0.0d);
        banco0.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", 0.0d);
        boolean boolean24 = contaBancaria22.sacar((double) 100L);
        contaBancaria22.depositar(182.0d);
        banco0.adicionarConta(contaBancaria22);
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.Banco banco2 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco2.adicionarConta(contaBancaria5);
        banco1.adicionarConta(contaBancaria5);
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria10);
        com.example.Banco banco12 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria15 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco12.adicionarConta(contaBancaria15);
        banco12.listarContas();
        banco12.listarContas();
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("", 10.0d);
        banco12.adicionarConta(contaBancaria21);
        banco1.adicionarConta(contaBancaria21);
        boolean boolean25 = contaBancaria21.sacar(0.0d);
        double double26 = contaBancaria21.consultarSaldo();
        banco0.adicionarConta(contaBancaria21);
        java.lang.Class<?> wildcardClass28 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        banco0.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria22 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 21.0");
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 21.0", (double) (-1L));
        banco0.adicionarConta(contaBancaria25);
        org.junit.Assert.assertNotNull(contaBancaria20);
        org.junit.Assert.assertNull(contaBancaria22);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.Banco banco11 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean16 = contaBancaria14.sacar((double) (-1L));
        banco11.adicionarConta(contaBancaria14);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str21 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar(0.0d);
        banco11.adicionarConta(contaBancaria20);
        contaBancaria20.depositar((double) (-1));
        contaBancaria20.depositar((double) ' ');
        banco0.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria31 = banco0.buscarContaPorTitular("");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str21, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria31);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        banco10.listarContas();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("", 10.0d);
        banco10.adicionarConta(contaBancaria19);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria23.depositar((double) (byte) -1);
        banco10.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria28 = banco10.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str29 = contaBancaria28.exibirDetalhes();
        boolean boolean31 = contaBancaria28.sacar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria28);
        java.lang.Class<?> wildcardClass33 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        boolean boolean25 = contaBancaria20.sacar((double) (-1.0f));
        java.lang.String str26 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria20);
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco33 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco33.adicionarConta(contaBancaria36);
        banco0.adicionarConta(contaBancaria36);
        java.lang.Class<?> wildcardClass39 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.Banco banco11 = new com.example.Banco();
        com.example.Banco banco12 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria15 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco12.adicionarConta(contaBancaria15);
        banco11.adicionarConta(contaBancaria15);
        com.example.ContaBancaria contaBancaria19 = banco11.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco11.listarContas();
        banco11.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria24.depositar((double) (byte) -1);
        banco11.adicionarConta(contaBancaria24);
        contaBancaria24.depositar((double) 1.0f);
        banco0.adicionarConta(contaBancaria24);
        com.example.ContaBancaria contaBancaria32 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 62.0");
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertNull(contaBancaria32);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0", 0.0d);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria5 = banco0.buscarContaPorTitular("");
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria5);
        org.junit.Assert.assertNull(contaBancaria9);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 214.0", 152.0d);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 84.0", 97.0d);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 10.0", 0.0d);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        boolean boolean8 = contaBancaria2.sacar((double) 10L);
        java.lang.String str9 = contaBancaria2.exibirDetalhes();
        java.lang.String str10 = contaBancaria2.exibirDetalhes();
        boolean boolean12 = contaBancaria2.sacar(11.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Titular: hi!, Saldo: R$ 42.0" + "'", str9, "Titular: hi!, Saldo: R$ 42.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 42.0" + "'", str10, "Titular: hi!, Saldo: R$ 42.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        boolean boolean18 = contaBancaria13.sacar((double) (-1.0f));
        java.lang.String str19 = contaBancaria13.exibirDetalhes();
        contaBancaria13.depositar((double) (-1.0f));
        java.lang.String str22 = contaBancaria13.exibirDetalhes();
        java.lang.String str23 = contaBancaria13.exibirDetalhes();
        java.lang.String str24 = contaBancaria13.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str22, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str23, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str24, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0", (double) 1L);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco9 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco9.adicionarConta(contaBancaria12);
        banco9.listarContas();
        banco9.listarContas();
        com.example.Banco banco16 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco16.adicionarConta(contaBancaria19);
        banco16.listarContas();
        banco16.listarContas();
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("", 10.0d);
        banco16.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria29.depositar((double) (byte) -1);
        banco16.adicionarConta(contaBancaria29);
        com.example.ContaBancaria contaBancaria34 = banco16.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str35 = contaBancaria34.exibirDetalhes();
        banco9.adicionarConta(contaBancaria34);
        com.example.Banco banco37 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco37.adicionarConta(contaBancaria40);
        banco37.listarContas();
        com.example.ContaBancaria contaBancaria45 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco37.adicionarConta(contaBancaria45);
        banco37.listarContas();
        com.example.ContaBancaria contaBancaria50 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco37.adicionarConta(contaBancaria50);
        boolean boolean53 = contaBancaria50.sacar((-1.0d));
        banco9.adicionarConta(contaBancaria50);
        banco0.adicionarConta(contaBancaria50);
        com.example.ContaBancaria contaBancaria57 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 10.0");
        org.junit.Assert.assertNotNull(contaBancaria34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str35, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(contaBancaria57);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.Banco banco30 = new com.example.Banco();
        banco30.listarContas();
        com.example.ContaBancaria contaBancaria33 = banco30.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco34 = new com.example.Banco();
        com.example.Banco banco35 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco35.adicionarConta(contaBancaria38);
        banco34.adicionarConta(contaBancaria38);
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco34.adicionarConta(contaBancaria43);
        com.example.Banco banco45 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco45.adicionarConta(contaBancaria48);
        banco45.listarContas();
        banco45.listarContas();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("", 10.0d);
        banco45.adicionarConta(contaBancaria54);
        banco34.adicionarConta(contaBancaria54);
        banco30.adicionarConta(contaBancaria54);
        banco0.adicionarConta(contaBancaria54);
        java.lang.String str59 = contaBancaria54.exibirDetalhes();
        contaBancaria54.depositar(117.0d);
        boolean boolean63 = contaBancaria54.sacar((double) (short) 100);
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str59, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("", (double) (byte) 0);
        banco0.adicionarConta(contaBancaria40);
        com.example.ContaBancaria contaBancaria43 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0");
        com.example.ContaBancaria contaBancaria45 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0");
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertNull(contaBancaria45);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (-1L));
        double double5 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria39 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria41 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria43 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria46 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double47 = contaBancaria46.consultarSaldo();
        banco0.adicionarConta(contaBancaria46);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria51 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass52 = contaBancaria51.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertNull(contaBancaria41);
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertNull(contaBancaria51);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0", (double) 'a');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        double double4 = contaBancaria2.consultarSaldo();
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0" + "'", str6, "Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean4 = contaBancaria2.sacar((double) '#');
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass6 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str5, "Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        double double4 = contaBancaria2.consultarSaldo();
        boolean boolean6 = contaBancaria2.sacar(1.0d);
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) (byte) 10);
        boolean boolean11 = contaBancaria2.sacar(0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str3, "Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str7, "Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria3.depositar(1.0d);
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean14 = contaBancaria12.sacar((double) (-1L));
        contaBancaria12.depositar((-1.0d));
        banco0.adicionarConta(contaBancaria12);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (double) (byte) -1);
        boolean boolean24 = contaBancaria22.sacar(32.0d);
        banco0.adicionarConta(contaBancaria22);
        com.example.ContaBancaria contaBancaria27 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 17.0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(contaBancaria27);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str19 = contaBancaria18.exibirDetalhes();
        boolean boolean21 = contaBancaria18.sacar((double) (byte) -1);
        double double22 = contaBancaria18.consultarSaldo();
        boolean boolean24 = contaBancaria18.sacar((double) 10L);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 20.0", (double) (byte) 1);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("hi!");
        contaBancaria8.depositar((double) 100);
        java.lang.String str11 = contaBancaria8.exibirDetalhes();
        java.lang.String str12 = contaBancaria8.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Titular: hi!, Saldo: R$ 197.0" + "'", str11, "Titular: hi!, Saldo: R$ 197.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Titular: hi!, Saldo: R$ 197.0" + "'", str12, "Titular: hi!, Saldo: R$ 197.0");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.Banco banco20 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco20.adicionarConta(contaBancaria23);
        banco20.listarContas();
        com.example.ContaBancaria contaBancaria28 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco20.adicionarConta(contaBancaria28);
        contaBancaria28.depositar((-1.0d));
        banco0.adicionarConta(contaBancaria28);
        java.lang.Class<?> wildcardClass33 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria19);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        double double4 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str3, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0", 193.0d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str24 = contaBancaria23.exibirDetalhes();
        banco0.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria27 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        com.example.Banco banco28 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean33 = contaBancaria31.sacar((double) (-1L));
        banco28.adicionarConta(contaBancaria31);
        com.example.ContaBancaria contaBancaria36 = banco28.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria39 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria39.depositar((double) (byte) -1);
        double double42 = contaBancaria39.consultarSaldo();
        java.lang.String str43 = contaBancaria39.exibirDetalhes();
        banco28.adicionarConta(contaBancaria39);
        com.example.Banco banco45 = new com.example.Banco();
        banco45.listarContas();
        banco45.listarContas();
        com.example.ContaBancaria contaBancaria50 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double51 = contaBancaria50.consultarSaldo();
        banco45.adicionarConta(contaBancaria50);
        banco28.adicionarConta(contaBancaria50);
        java.lang.String str54 = contaBancaria50.exibirDetalhes();
        java.lang.String str55 = contaBancaria50.exibirDetalhes();
        banco0.adicionarConta(contaBancaria50);
        com.example.Banco banco57 = new com.example.Banco();
        com.example.Banco banco58 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria61 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco58.adicionarConta(contaBancaria61);
        banco57.adicionarConta(contaBancaria61);
        com.example.ContaBancaria contaBancaria66 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco57.adicionarConta(contaBancaria66);
        com.example.Banco banco68 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria71 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco68.adicionarConta(contaBancaria71);
        banco68.listarContas();
        banco68.listarContas();
        com.example.ContaBancaria contaBancaria77 = new com.example.ContaBancaria("", 10.0d);
        banco68.adicionarConta(contaBancaria77);
        banco57.adicionarConta(contaBancaria77);
        banco0.adicionarConta(contaBancaria77);
        java.lang.Class<?> wildcardClass81 = contaBancaria77.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(contaBancaria27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(contaBancaria36);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 52.0d + "'", double42 == 52.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str43, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str54, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str55, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 0.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar(0.0d);
        contaBancaria2.depositar((double) 10);
        java.lang.Class<?> wildcardClass8 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str3, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar((double) 100L);
        boolean boolean7 = contaBancaria2.sacar(182.0d);
        contaBancaria2.depositar(88.0d);
        java.lang.Class<?> wildcardClass10 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 100.0f);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar(152.0d);
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass8 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str6, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str7, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0", 0.0d);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.Banco banco11 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco11.adicionarConta(contaBancaria14);
        banco11.listarContas();
        banco11.listarContas();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("", 10.0d);
        banco11.adicionarConta(contaBancaria20);
        banco0.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria24 = banco0.buscarContaPorTitular("");
        boolean boolean26 = contaBancaria24.sacar((double) 10.0f);
        contaBancaria24.depositar(182.0d);
        org.junit.Assert.assertNotNull(contaBancaria24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("", (double) ' ');
        contaBancaria14.depositar((double) 100);
        contaBancaria14.depositar((double) 'a');
        contaBancaria14.depositar(99.0d);
        banco0.adicionarConta(contaBancaria14);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria11);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 10.0", 0.0d);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) (-1L));
        contaBancaria2.depositar(88.0d);
        boolean boolean6 = contaBancaria2.sacar(84.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        java.lang.String str15 = contaBancaria13.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str15, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(0.0d);
        contaBancaria2.depositar((double) 0L);
        boolean boolean9 = contaBancaria2.sacar((double) 100L);
        contaBancaria2.depositar((double) (-1L));
        boolean boolean13 = contaBancaria2.sacar(53.0d);
        java.lang.Class<?> wildcardClass14 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 100.0", 99.0d);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0", (double) 10);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 20.0", (double) (short) 1);
        banco0.adicionarConta(contaBancaria13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 0.0d);
        contaBancaria2.depositar(182.0d);
        double double5 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 182.0d + "'", double5 == 182.0d);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 17.0", 0.0d);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        com.example.ContaBancaria contaBancaria37 = null;
        banco0.adicionarConta(contaBancaria37);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria3.depositar(1.0d);
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 197.0");
        org.junit.Assert.assertNull(contaBancaria8);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0", 32.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0, Saldo: R$ 32.0" + "'", str3, "Titular: Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0, Saldo: R$ 32.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0, Saldo: R$ 32.0" + "'", str4, "Titular: Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0, Saldo: R$ 32.0");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("");
        com.example.Banco banco9 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco9.adicionarConta(contaBancaria12);
        banco9.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco9.adicionarConta(contaBancaria17);
        banco9.listarContas();
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco9.adicionarConta(contaBancaria22);
        double double24 = contaBancaria22.consultarSaldo();
        double double25 = contaBancaria22.consultarSaldo();
        java.lang.String str26 = contaBancaria22.exibirDetalhes();
        boolean boolean28 = contaBancaria22.sacar((double) 0.0f);
        contaBancaria22.depositar((double) '#');
        contaBancaria22.depositar((double) '4');
        banco0.adicionarConta(contaBancaria22);
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str26, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) (short) 100);
        contaBancaria2.depositar((double) ' ');
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", 100.0d);
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0" + "'", str6, "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria5 = banco0.buscarContaPorTitular("");
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria5);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        banco0.adicionarConta(contaBancaria16);
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("Titular: , Saldo: R$ 11.0", (double) 1L);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria16 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 197.0");
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 9.0");
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
        org.junit.Assert.assertNull(contaBancaria16);
        org.junit.Assert.assertNull(contaBancaria18);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        boolean boolean18 = contaBancaria13.sacar((double) (-1.0f));
        java.lang.String str19 = contaBancaria13.exibirDetalhes();
        java.lang.String str20 = contaBancaria13.exibirDetalhes();
        double double21 = contaBancaria13.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str20, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        banco10.listarContas();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("", 10.0d);
        banco10.adicionarConta(contaBancaria19);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria23.depositar((double) (byte) -1);
        banco10.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria28 = banco10.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str29 = contaBancaria28.exibirDetalhes();
        boolean boolean31 = contaBancaria28.sacar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria28);
        com.example.Banco banco33 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco33.adicionarConta(contaBancaria36);
        banco33.listarContas();
        banco33.listarContas();
        com.example.ContaBancaria contaBancaria42 = new com.example.ContaBancaria("", 10.0d);
        banco33.adicionarConta(contaBancaria42);
        com.example.ContaBancaria contaBancaria46 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria46.depositar((double) (byte) -1);
        banco33.adicionarConta(contaBancaria46);
        com.example.ContaBancaria contaBancaria51 = banco33.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria53 = banco33.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria56 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str57 = contaBancaria56.exibirDetalhes();
        banco33.adicionarConta(contaBancaria56);
        contaBancaria56.depositar((double) '4');
        banco0.adicionarConta(contaBancaria56);
        com.example.ContaBancaria contaBancaria63 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 84.0");
        com.example.ContaBancaria contaBancaria65 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(contaBancaria51);
        org.junit.Assert.assertNull(contaBancaria53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str57, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNull(contaBancaria63);
        org.junit.Assert.assertNull(contaBancaria65);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        banco0.adicionarConta(contaBancaria4);
        com.example.Banco banco6 = new com.example.Banco();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco6.adicionarConta(contaBancaria10);
        com.example.ContaBancaria contaBancaria15 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco6.adicionarConta(contaBancaria15);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("", 10.0d);
        banco17.adicionarConta(contaBancaria26);
        banco6.adicionarConta(contaBancaria26);
        boolean boolean30 = contaBancaria26.sacar(0.0d);
        double double31 = contaBancaria26.consultarSaldo();
        boolean boolean33 = contaBancaria26.sacar((double) 10.0f);
        java.lang.String str34 = contaBancaria26.exibirDetalhes();
        banco0.adicionarConta(contaBancaria26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str34, "Titular: , Saldo: R$ 0.0");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 0.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar(0.0d);
        boolean boolean7 = contaBancaria2.sacar((double) (-1));
        java.lang.String str8 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str3, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str8, "Titular: , Saldo: R$ 0.0");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 97.0", (double) (short) 100);
        banco0.adicionarConta(contaBancaria21);
        com.example.Banco banco23 = new com.example.Banco();
        banco23.listarContas();
        com.example.ContaBancaria contaBancaria26 = banco23.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco27 = new com.example.Banco();
        com.example.Banco banco28 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco28.adicionarConta(contaBancaria31);
        banco27.adicionarConta(contaBancaria31);
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco27.adicionarConta(contaBancaria36);
        com.example.Banco banco38 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco38.adicionarConta(contaBancaria41);
        banco38.listarContas();
        banco38.listarContas();
        com.example.ContaBancaria contaBancaria47 = new com.example.ContaBancaria("", 10.0d);
        banco38.adicionarConta(contaBancaria47);
        banco27.adicionarConta(contaBancaria47);
        banco23.adicionarConta(contaBancaria47);
        com.example.ContaBancaria contaBancaria52 = banco23.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria55 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean57 = contaBancaria55.sacar((double) (-1L));
        contaBancaria55.depositar((-1.0d));
        java.lang.String str60 = contaBancaria55.exibirDetalhes();
        double double61 = contaBancaria55.consultarSaldo();
        boolean boolean63 = contaBancaria55.sacar((double) (short) -1);
        banco23.adicionarConta(contaBancaria55);
        boolean boolean66 = contaBancaria55.sacar(35.0d);
        banco0.adicionarConta(contaBancaria55);
        java.lang.Class<?> wildcardClass68 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria26);
        org.junit.Assert.assertNull(contaBancaria52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str60, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0, Saldo: R$ 32.0", 88.0d);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 1.0", (double) 1);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", 0.0d);
        boolean boolean4 = contaBancaria2.sacar((double) (byte) 100);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.Class<?> wildcardClass6 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double3 = contaBancaria2.consultarSaldo();
        boolean boolean5 = contaBancaria2.sacar(53.0d);
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 47.0" + "'", str6, "Titular: hi!, Saldo: R$ 47.0");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 96.0");
        com.example.Banco banco11 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean16 = contaBancaria14.sacar((double) (-1L));
        banco11.adicionarConta(contaBancaria14);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str21 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar(0.0d);
        banco11.adicionarConta(contaBancaria20);
        contaBancaria20.depositar((double) (-1));
        contaBancaria20.depositar((double) ' ');
        contaBancaria20.depositar((double) 1);
        contaBancaria20.depositar(97.0d);
        double double33 = contaBancaria20.consultarSaldo();
        banco0.adicionarConta(contaBancaria20);
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str21, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 182.0d + "'", double33 == 182.0d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        double double3 = contaBancaria2.consultarSaldo();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        boolean boolean8 = contaBancaria2.sacar(87.0d);
        contaBancaria2.depositar(45.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str4, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str5, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double9 = contaBancaria8.consultarSaldo();
        contaBancaria8.depositar((double) 10L);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria14 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria17 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0");
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 21.0", 100.0d);
        banco0.adicionarConta(contaBancaria22);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertNull(contaBancaria17);
        org.junit.Assert.assertNull(contaBancaria19);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str24 = contaBancaria23.exibirDetalhes();
        banco0.adicionarConta(contaBancaria23);
        java.lang.String str26 = contaBancaria23.exibirDetalhes();
        double double27 = contaBancaria23.consultarSaldo();
        boolean boolean29 = contaBancaria23.sacar((double) (short) 10);
        boolean boolean31 = contaBancaria23.sacar((double) 10.0f);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str26, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria20);
        com.example.Banco banco22 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean27 = contaBancaria25.sacar((double) (-1L));
        banco22.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria30 = banco22.buscarContaPorTitular("");
        double double31 = contaBancaria30.consultarSaldo();
        banco0.adicionarConta(contaBancaria30);
        com.example.ContaBancaria contaBancaria34 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria37 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        banco0.adicionarConta(contaBancaria37);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(contaBancaria30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(contaBancaria34);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ -1.0", (double) 100);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 100.0", (double) 'a');
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria16 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("", 10.0d);
        banco17.adicionarConta(contaBancaria26);
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria30.depositar((double) (byte) -1);
        banco17.adicionarConta(contaBancaria30);
        com.example.ContaBancaria contaBancaria35 = banco17.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str36 = contaBancaria35.exibirDetalhes();
        banco0.adicionarConta(contaBancaria35);
        com.example.ContaBancaria contaBancaria39 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria41 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertNull(contaBancaria16);
        org.junit.Assert.assertNotNull(contaBancaria35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str36, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria39);
        org.junit.Assert.assertNull(contaBancaria41);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 42.0", 107.0d);
        boolean boolean4 = contaBancaria2.sacar((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean14 = contaBancaria12.sacar((double) (-1L));
        contaBancaria12.depositar((-1.0d));
        banco0.adicionarConta(contaBancaria12);
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria21 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria23 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 10.0");
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertNull(contaBancaria21);
        org.junit.Assert.assertNull(contaBancaria23);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 21.0", (double) (byte) 10);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", (double) (short) 1);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass4 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 1.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 1.0");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0", (double) (short) 10);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double3 = contaBancaria2.consultarSaldo();
        boolean boolean5 = contaBancaria2.sacar(53.0d);
        boolean boolean7 = contaBancaria2.sacar(84.0d);
        double double8 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 47.0d + "'", double8 == 47.0d);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str19 = contaBancaria18.exibirDetalhes();
        boolean boolean21 = contaBancaria18.sacar((double) (byte) -1);
        boolean boolean23 = contaBancaria18.sacar((double) 'a');
        double double24 = contaBancaria18.consultarSaldo();
        java.lang.Class<?> wildcardClass25 = contaBancaria18.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        contaBancaria2.depositar((double) (-1.0f));
        boolean boolean6 = contaBancaria2.sacar((double) 1.0f);
        boolean boolean8 = contaBancaria2.sacar((double) 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco4 = new com.example.Banco();
        com.example.Banco banco5 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco5.adicionarConta(contaBancaria8);
        banco4.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco4.adicionarConta(contaBancaria13);
        com.example.Banco banco15 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco15.adicionarConta(contaBancaria18);
        banco15.listarContas();
        banco15.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("", 10.0d);
        banco15.adicionarConta(contaBancaria24);
        banco4.adicionarConta(contaBancaria24);
        banco0.adicionarConta(contaBancaria24);
        com.example.ContaBancaria contaBancaria29 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean34 = contaBancaria32.sacar((double) (-1L));
        contaBancaria32.depositar((-1.0d));
        java.lang.String str37 = contaBancaria32.exibirDetalhes();
        double double38 = contaBancaria32.consultarSaldo();
        boolean boolean40 = contaBancaria32.sacar((double) (short) -1);
        banco0.adicionarConta(contaBancaria32);
        boolean boolean43 = contaBancaria32.sacar(35.0d);
        boolean boolean45 = contaBancaria32.sacar(187.0d);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str37, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco13 = new com.example.Banco();
        com.example.Banco banco14 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco14.adicionarConta(contaBancaria17);
        banco13.adicionarConta(contaBancaria17);
        banco13.listarContas();
        banco13.listarContas();
        com.example.Banco banco22 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco22.adicionarConta(contaBancaria25);
        banco22.listarContas();
        banco22.listarContas();
        com.example.Banco banco29 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco29.adicionarConta(contaBancaria32);
        banco29.listarContas();
        banco29.listarContas();
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("", 10.0d);
        banco29.adicionarConta(contaBancaria38);
        com.example.ContaBancaria contaBancaria42 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria42.depositar((double) (byte) -1);
        banco29.adicionarConta(contaBancaria42);
        com.example.ContaBancaria contaBancaria47 = banco29.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str48 = contaBancaria47.exibirDetalhes();
        banco22.adicionarConta(contaBancaria47);
        com.example.Banco banco50 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria53 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco50.adicionarConta(contaBancaria53);
        banco50.listarContas();
        com.example.ContaBancaria contaBancaria58 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco50.adicionarConta(contaBancaria58);
        banco50.listarContas();
        com.example.ContaBancaria contaBancaria63 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco50.adicionarConta(contaBancaria63);
        boolean boolean66 = contaBancaria63.sacar((-1.0d));
        banco22.adicionarConta(contaBancaria63);
        banco13.adicionarConta(contaBancaria63);
        boolean boolean70 = contaBancaria63.sacar((double) (short) 100);
        java.lang.String str71 = contaBancaria63.exibirDetalhes();
        banco0.adicionarConta(contaBancaria63);
        double double73 = contaBancaria63.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str48, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str71, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str10 = contaBancaria9.exibirDetalhes();
        contaBancaria9.depositar(0.0d);
        banco0.adicionarConta(contaBancaria9);
        contaBancaria9.depositar((double) (-1));
        contaBancaria9.depositar((double) ' ');
        contaBancaria9.depositar((double) 1);
        boolean boolean21 = contaBancaria9.sacar((double) 1.0f);
        double double22 = contaBancaria9.consultarSaldo();
        double double23 = contaBancaria9.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 84.0d + "'", double22 == 84.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 84.0d + "'", double23 == 84.0d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 45.0", 0.0d);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 20.0", (double) 1);
        boolean boolean4 = contaBancaria2.sacar((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 0.0", (double) (byte) -1);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        banco0.adicionarConta(contaBancaria16);
        com.example.Banco banco19 = new com.example.Banco();
        com.example.Banco banco20 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco20.adicionarConta(contaBancaria23);
        banco19.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria27 = banco19.buscarContaPorTitular("hi!");
        double double28 = contaBancaria27.consultarSaldo();
        banco0.adicionarConta(contaBancaria27);
        org.junit.Assert.assertNotNull(contaBancaria27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.Banco banco11 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco11.adicionarConta(contaBancaria14);
        banco11.listarContas();
        banco11.listarContas();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("", 10.0d);
        banco11.adicionarConta(contaBancaria20);
        banco0.adicionarConta(contaBancaria20);
        com.example.Banco banco23 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco23.adicionarConta(contaBancaria26);
        banco23.listarContas();
        banco23.listarContas();
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("", 10.0d);
        banco23.adicionarConta(contaBancaria32);
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria36.depositar((double) (byte) -1);
        banco23.adicionarConta(contaBancaria36);
        com.example.ContaBancaria contaBancaria41 = banco23.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria44 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean46 = contaBancaria44.sacar((double) 100);
        double double47 = contaBancaria44.consultarSaldo();
        banco23.adicionarConta(contaBancaria44);
        banco0.adicionarConta(contaBancaria44);
        com.example.ContaBancaria contaBancaria51 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria53 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria55 = banco0.buscarContaPorTitular("Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 10.0");
        org.junit.Assert.assertNotNull(contaBancaria41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(contaBancaria51);
        org.junit.Assert.assertNull(contaBancaria53);
        org.junit.Assert.assertNull(contaBancaria55);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        double double3 = contaBancaria2.consultarSaldo();
        boolean boolean5 = contaBancaria2.sacar(11.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0", 32.0d);
        banco0.adicionarConta(contaBancaria11);
        boolean boolean14 = contaBancaria11.sacar(11.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        banco0.adicionarConta(contaBancaria16);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria21 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria23 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 11.0");
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria21);
        org.junit.Assert.assertNull(contaBancaria23);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco4 = new com.example.Banco();
        com.example.Banco banco5 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco5.adicionarConta(contaBancaria8);
        banco4.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco4.adicionarConta(contaBancaria13);
        com.example.Banco banco15 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco15.adicionarConta(contaBancaria18);
        banco15.listarContas();
        banco15.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("", 10.0d);
        banco15.adicionarConta(contaBancaria24);
        banco4.adicionarConta(contaBancaria24);
        banco0.adicionarConta(contaBancaria24);
        com.example.ContaBancaria contaBancaria29 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.Banco banco30 = new com.example.Banco();
        com.example.Banco banco31 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria34 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco31.adicionarConta(contaBancaria34);
        banco30.adicionarConta(contaBancaria34);
        com.example.ContaBancaria contaBancaria38 = banco30.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco30.listarContas();
        com.example.Banco banco40 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco40.adicionarConta(contaBancaria43);
        banco40.listarContas();
        banco40.listarContas();
        com.example.ContaBancaria contaBancaria49 = new com.example.ContaBancaria("", 10.0d);
        banco40.adicionarConta(contaBancaria49);
        com.example.ContaBancaria contaBancaria53 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria53.depositar((double) (byte) -1);
        banco40.adicionarConta(contaBancaria53);
        boolean boolean58 = contaBancaria53.sacar((double) (-1.0f));
        java.lang.String str59 = contaBancaria53.exibirDetalhes();
        double double60 = contaBancaria53.consultarSaldo();
        banco30.adicionarConta(contaBancaria53);
        double double62 = contaBancaria53.consultarSaldo();
        java.lang.String str63 = contaBancaria53.exibirDetalhes();
        banco0.adicionarConta(contaBancaria53);
        banco0.listarContas();
        banco0.listarContas();
        java.lang.Class<?> wildcardClass67 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria29);
        org.junit.Assert.assertNotNull(contaBancaria38);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str59, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 52.0d + "'", double60 == 52.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 52.0d + "'", double62 == 52.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str63, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("");
        boolean boolean12 = contaBancaria10.sacar((double) (-1));
        java.lang.String str13 = contaBancaria10.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str13, "Titular: hi!, Saldo: R$ 97.0");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertNull(contaBancaria12);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        banco10.listarContas();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("", 10.0d);
        banco10.adicionarConta(contaBancaria19);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria23.depositar((double) (byte) -1);
        banco10.adicionarConta(contaBancaria23);
        boolean boolean28 = contaBancaria23.sacar((double) (-1.0f));
        java.lang.String str29 = contaBancaria23.exibirDetalhes();
        double double30 = contaBancaria23.consultarSaldo();
        banco0.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria34 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria34.depositar((double) (-1));
        boolean boolean38 = contaBancaria34.sacar((double) (-1.0f));
        java.lang.String str39 = contaBancaria34.exibirDetalhes();
        boolean boolean41 = contaBancaria34.sacar(9.0d);
        banco0.adicionarConta(contaBancaria34);
        com.example.ContaBancaria contaBancaria45 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        contaBancaria45.depositar((double) 10L);
        banco0.adicionarConta(contaBancaria45);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str39, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.Banco banco28 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco28.adicionarConta(contaBancaria31);
        banco28.listarContas();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco28.adicionarConta(contaBancaria36);
        banco28.listarContas();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco28.adicionarConta(contaBancaria41);
        boolean boolean44 = contaBancaria41.sacar((-1.0d));
        banco0.adicionarConta(contaBancaria41);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria48 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 107.0");
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria52 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 21.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(contaBancaria48);
        org.junit.Assert.assertNull(contaBancaria52);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("");
        boolean boolean12 = contaBancaria10.sacar((double) (-1));
        double double13 = contaBancaria10.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("", (double) (byte) 0);
        banco0.adicionarConta(contaBancaria40);
        com.example.ContaBancaria contaBancaria43 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 110.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria46 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 214.0");
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertNull(contaBancaria46);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 1.0", 0.0d);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        boolean boolean25 = contaBancaria20.sacar((double) (-1.0f));
        java.lang.String str26 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria31 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria31);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        double double3 = contaBancaria2.consultarSaldo();
        boolean boolean5 = contaBancaria2.sacar((double) ' ');
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) (-1.0f));
        double double9 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 20.0" + "'", str6, "Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        banco0.adicionarConta(contaBancaria16);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria21 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
        com.example.Banco banco22 = new com.example.Banco();
        com.example.Banco banco23 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco23.adicionarConta(contaBancaria26);
        banco22.adicionarConta(contaBancaria26);
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco22.adicionarConta(contaBancaria31);
        com.example.Banco banco33 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco33.adicionarConta(contaBancaria36);
        banco33.listarContas();
        banco33.listarContas();
        com.example.ContaBancaria contaBancaria42 = new com.example.ContaBancaria("", 10.0d);
        banco33.adicionarConta(contaBancaria42);
        banco22.adicionarConta(contaBancaria42);
        double double45 = contaBancaria42.consultarSaldo();
        contaBancaria42.depositar(152.0d);
        boolean boolean49 = contaBancaria42.sacar((double) ' ');
        banco0.adicionarConta(contaBancaria42);
        org.junit.Assert.assertNull(contaBancaria21);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        banco0.adicionarConta(contaBancaria16);
        com.example.Banco banco19 = new com.example.Banco();
        com.example.Banco banco20 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco20.adicionarConta(contaBancaria23);
        banco19.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria27 = banco19.buscarContaPorTitular("hi!");
        boolean boolean29 = contaBancaria27.sacar((double) (-1.0f));
        contaBancaria27.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria27);
        com.example.ContaBancaria contaBancaria34 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        java.lang.Class<?> wildcardClass35 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(contaBancaria34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        banco0.listarContas();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        banco10.listarContas();
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("", 10.0d);
        banco17.adicionarConta(contaBancaria26);
        banco10.adicionarConta(contaBancaria26);
        boolean boolean30 = contaBancaria26.sacar((double) 10.0f);
        java.lang.String str31 = contaBancaria26.exibirDetalhes();
        double double32 = contaBancaria26.consultarSaldo();
        banco0.adicionarConta(contaBancaria26);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria36 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str31, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria36);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) (short) 0);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 97.0", (double) 0.0f);
        contaBancaria2.depositar(52.0d);
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 10.0", 99.0d);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        boolean boolean12 = contaBancaria9.sacar((double) (byte) 10);
        java.lang.String str13 = contaBancaria9.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Titular: hi!, Saldo: R$ 87.0" + "'", str13, "Titular: hi!, Saldo: R$ 87.0");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.Banco banco30 = new com.example.Banco();
        banco30.listarContas();
        com.example.ContaBancaria contaBancaria33 = banco30.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco34 = new com.example.Banco();
        com.example.Banco banco35 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco35.adicionarConta(contaBancaria38);
        banco34.adicionarConta(contaBancaria38);
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco34.adicionarConta(contaBancaria43);
        com.example.Banco banco45 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco45.adicionarConta(contaBancaria48);
        banco45.listarContas();
        banco45.listarContas();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("", 10.0d);
        banco45.adicionarConta(contaBancaria54);
        banco34.adicionarConta(contaBancaria54);
        banco30.adicionarConta(contaBancaria54);
        banco0.adicionarConta(contaBancaria54);
        com.example.ContaBancaria contaBancaria61 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 100.0f);
        java.lang.String str62 = contaBancaria61.exibirDetalhes();
        boolean boolean64 = contaBancaria61.sacar(152.0d);
        banco0.adicionarConta(contaBancaria61);
        com.example.Banco banco66 = new com.example.Banco();
        com.example.Banco banco67 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria70 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco67.adicionarConta(contaBancaria70);
        banco66.adicionarConta(contaBancaria70);
        com.example.ContaBancaria contaBancaria74 = banco66.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco66.listarContas();
        banco66.listarContas();
        com.example.ContaBancaria contaBancaria79 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria79.depositar((double) (byte) -1);
        banco66.adicionarConta(contaBancaria79);
        contaBancaria79.depositar((double) 1.0f);
        banco0.adicionarConta(contaBancaria79);
        com.example.ContaBancaria contaBancaria87 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0");
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str62, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(contaBancaria74);
        org.junit.Assert.assertNull(contaBancaria87);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str19 = contaBancaria18.exibirDetalhes();
        boolean boolean21 = contaBancaria18.sacar((double) (byte) -1);
        double double22 = contaBancaria18.consultarSaldo();
        contaBancaria18.depositar((double) ' ');
        java.lang.String str25 = contaBancaria18.exibirDetalhes();
        double double26 = contaBancaria18.consultarSaldo();
        double double27 = contaBancaria18.consultarSaldo();
        java.lang.Class<?> wildcardClass28 = contaBancaria18.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Titular: hi!, Saldo: R$ 84.0" + "'", str25, "Titular: hi!, Saldo: R$ 84.0");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 84.0d + "'", double26 == 84.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 84.0d + "'", double27 == 84.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", 97.0d);
        contaBancaria2.depositar(0.0d);
        boolean boolean6 = contaBancaria2.sacar(193.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.Banco banco9 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco9.adicionarConta(contaBancaria12);
        banco9.listarContas();
        banco9.listarContas();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("", 10.0d);
        banco9.adicionarConta(contaBancaria18);
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria22.depositar((double) (byte) -1);
        banco9.adicionarConta(contaBancaria22);
        boolean boolean27 = contaBancaria22.sacar((double) (-1.0f));
        java.lang.String str28 = contaBancaria22.exibirDetalhes();
        boolean boolean30 = contaBancaria22.sacar((double) '4');
        java.lang.String str31 = contaBancaria22.exibirDetalhes();
        banco0.adicionarConta(contaBancaria22);
        java.lang.Class<?> wildcardClass33 = contaBancaria22.getClass();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str28, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: hi!, Saldo: R$ 0.0" + "'", str31, "Titular: hi!, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean23 = contaBancaria21.sacar((double) 100);
        double double24 = contaBancaria21.consultarSaldo();
        banco0.adicionarConta(contaBancaria21);
        com.example.ContaBancaria contaBancaria26 = null;
        banco0.adicionarConta(contaBancaria26);
        com.example.Banco banco28 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco28.adicionarConta(contaBancaria31);
        banco28.listarContas();
        banco28.listarContas();
        com.example.ContaBancaria contaBancaria37 = new com.example.ContaBancaria("", 10.0d);
        banco28.adicionarConta(contaBancaria37);
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria41.depositar((double) (byte) -1);
        banco28.adicionarConta(contaBancaria41);
        boolean boolean46 = contaBancaria41.sacar((double) (-1.0f));
        java.lang.String str47 = contaBancaria41.exibirDetalhes();
        double double48 = contaBancaria41.consultarSaldo();
        banco0.adicionarConta(contaBancaria41);
        com.example.ContaBancaria contaBancaria51 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 52.0d + "'", double48 == 52.0d);
        org.junit.Assert.assertNull(contaBancaria51);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        banco0.listarContas();
        com.example.Banco banco12 = new com.example.Banco();
        banco12.listarContas();
        banco12.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double18 = contaBancaria17.consultarSaldo();
        banco12.adicionarConta(contaBancaria17);
        com.example.Banco banco20 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco20.adicionarConta(contaBancaria23);
        banco20.listarContas();
        banco20.listarContas();
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("", 10.0d);
        banco20.adicionarConta(contaBancaria29);
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria33.depositar((double) (byte) -1);
        banco20.adicionarConta(contaBancaria33);
        com.example.Banco banco37 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco37.adicionarConta(contaBancaria40);
        banco37.listarContas();
        banco37.listarContas();
        com.example.Banco banco44 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria47 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco44.adicionarConta(contaBancaria47);
        banco44.listarContas();
        banco44.listarContas();
        com.example.ContaBancaria contaBancaria53 = new com.example.ContaBancaria("", 10.0d);
        banco44.adicionarConta(contaBancaria53);
        banco37.adicionarConta(contaBancaria53);
        banco20.adicionarConta(contaBancaria53);
        banco12.adicionarConta(contaBancaria53);
        com.example.ContaBancaria contaBancaria59 = banco12.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria62 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str63 = contaBancaria62.exibirDetalhes();
        double double64 = contaBancaria62.consultarSaldo();
        contaBancaria62.depositar(104.0d);
        banco12.adicionarConta(contaBancaria62);
        banco0.adicionarConta(contaBancaria62);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria59);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str63, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 52.0d + "'", double64 == 52.0d);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double9 = contaBancaria8.consultarSaldo();
        contaBancaria8.depositar((double) 10L);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria14 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.Banco banco15 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco15.adicionarConta(contaBancaria18);
        banco15.listarContas();
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco15.adicionarConta(contaBancaria23);
        banco15.listarContas();
        com.example.ContaBancaria contaBancaria28 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco15.adicionarConta(contaBancaria28);
        boolean boolean31 = contaBancaria28.sacar((-1.0d));
        double double32 = contaBancaria28.consultarSaldo();
        banco0.adicionarConta(contaBancaria28);
        com.example.ContaBancaria contaBancaria35 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 42.0");
        java.lang.Class<?> wildcardClass36 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNull(contaBancaria35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 100.0", 87.0d);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 87.0d + "'", double3 == 87.0d);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.Banco banco11 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco11.adicionarConta(contaBancaria14);
        banco11.listarContas();
        banco11.listarContas();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("", 10.0d);
        banco11.adicionarConta(contaBancaria20);
        banco0.adicionarConta(contaBancaria20);
        double double23 = contaBancaria20.consultarSaldo();
        contaBancaria20.depositar(152.0d);
        boolean boolean27 = contaBancaria20.sacar((double) ' ');
        boolean boolean29 = contaBancaria20.sacar((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.Banco banco30 = new com.example.Banco();
        banco30.listarContas();
        com.example.ContaBancaria contaBancaria33 = banco30.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco34 = new com.example.Banco();
        com.example.Banco banco35 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco35.adicionarConta(contaBancaria38);
        banco34.adicionarConta(contaBancaria38);
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco34.adicionarConta(contaBancaria43);
        com.example.Banco banco45 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco45.adicionarConta(contaBancaria48);
        banco45.listarContas();
        banco45.listarContas();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("", 10.0d);
        banco45.adicionarConta(contaBancaria54);
        banco34.adicionarConta(contaBancaria54);
        banco30.adicionarConta(contaBancaria54);
        banco0.adicionarConta(contaBancaria54);
        contaBancaria54.depositar(152.0d);
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 107.0", 96.0d);
        contaBancaria2.depositar((double) (byte) 1);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.Banco banco28 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco28.adicionarConta(contaBancaria31);
        banco28.listarContas();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco28.adicionarConta(contaBancaria36);
        banco28.listarContas();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco28.adicionarConta(contaBancaria41);
        boolean boolean44 = contaBancaria41.sacar((-1.0d));
        banco0.adicionarConta(contaBancaria41);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria48 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 84.0");
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(contaBancaria48);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria11.depositar((double) (byte) -1);
        double double14 = contaBancaria11.consultarSaldo();
        java.lang.String str15 = contaBancaria11.exibirDetalhes();
        banco0.adicionarConta(contaBancaria11);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str23 = contaBancaria22.exibirDetalhes();
        banco0.adicionarConta(contaBancaria22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str23, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria6 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str10 = contaBancaria9.exibirDetalhes();
        boolean boolean12 = contaBancaria9.sacar((double) 100L);
        java.lang.String str13 = contaBancaria9.exibirDetalhes();
        banco0.adicionarConta(contaBancaria9);
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str10, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str13, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double13 = contaBancaria12.consultarSaldo();
        boolean boolean15 = contaBancaria12.sacar(53.0d);
        boolean boolean17 = contaBancaria12.sacar(84.0d);
        banco0.adicionarConta(contaBancaria12);
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria22 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 11.0");
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertNull(contaBancaria22);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        com.example.Banco banco11 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria14.depositar(1.0d);
        banco11.adicionarConta(contaBancaria14);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco11.adicionarConta(contaBancaria20);
        banco0.adicionarConta(contaBancaria20);
        contaBancaria20.depositar((double) 0);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.Banco banco28 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco28.adicionarConta(contaBancaria31);
        banco28.listarContas();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco28.adicionarConta(contaBancaria36);
        banco28.listarContas();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco28.adicionarConta(contaBancaria41);
        boolean boolean44 = contaBancaria41.sacar((-1.0d));
        banco0.adicionarConta(contaBancaria41);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria49 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria49.depositar((double) (byte) -1);
        double double52 = contaBancaria49.consultarSaldo();
        java.lang.String str53 = contaBancaria49.exibirDetalhes();
        java.lang.String str54 = contaBancaria49.exibirDetalhes();
        boolean boolean56 = contaBancaria49.sacar((double) ' ');
        banco0.adicionarConta(contaBancaria49);
        com.example.ContaBancaria contaBancaria59 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria61 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 45.0");
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str53, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str54, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(contaBancaria59);
        org.junit.Assert.assertNull(contaBancaria61);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double6 = contaBancaria5.consultarSaldo();
        banco0.adicionarConta(contaBancaria5);
        com.example.Banco banco8 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco8.adicionarConta(contaBancaria11);
        banco8.listarContas();
        banco8.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("", 10.0d);
        banco8.adicionarConta(contaBancaria17);
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria21.depositar((double) (byte) -1);
        banco8.adicionarConta(contaBancaria21);
        com.example.Banco banco25 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria28 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco25.adicionarConta(contaBancaria28);
        banco25.listarContas();
        banco25.listarContas();
        com.example.Banco banco32 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco32.adicionarConta(contaBancaria35);
        banco32.listarContas();
        banco32.listarContas();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("", 10.0d);
        banco32.adicionarConta(contaBancaria41);
        banco25.adicionarConta(contaBancaria41);
        banco8.adicionarConta(contaBancaria41);
        banco0.adicionarConta(contaBancaria41);
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria48.depositar((double) (-1));
        contaBancaria48.depositar(10.0d);
        double double53 = contaBancaria48.consultarSaldo();
        banco0.adicionarConta(contaBancaria48);
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 107.0d + "'", double53 == 107.0d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco4 = new com.example.Banco();
        com.example.Banco banco5 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco5.adicionarConta(contaBancaria8);
        banco4.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco4.adicionarConta(contaBancaria13);
        com.example.Banco banco15 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco15.adicionarConta(contaBancaria18);
        banco15.listarContas();
        banco15.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("", 10.0d);
        banco15.adicionarConta(contaBancaria24);
        banco4.adicionarConta(contaBancaria24);
        banco0.adicionarConta(contaBancaria24);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria31 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 17.0");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria31);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 10.0d);
        boolean boolean18 = contaBancaria16.sacar(0.0d);
        banco0.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", 0.0d);
        boolean boolean24 = contaBancaria22.sacar((double) 100L);
        contaBancaria22.depositar(182.0d);
        banco0.adicionarConta(contaBancaria22);
        com.example.ContaBancaria contaBancaria29 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 53.0");
        com.example.ContaBancaria contaBancaria31 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria31);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("hi!");
        contaBancaria8.depositar((double) 100);
        boolean boolean12 = contaBancaria8.sacar(32.0d);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double13 = contaBancaria12.consultarSaldo();
        boolean boolean15 = contaBancaria12.sacar(53.0d);
        boolean boolean17 = contaBancaria12.sacar(84.0d);
        banco0.adicionarConta(contaBancaria12);
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 10.0");
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(contaBancaria20);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double3 = contaBancaria2.consultarSaldo();
        boolean boolean5 = contaBancaria2.sacar((-1.0d));
        contaBancaria2.depositar((double) (byte) 10);
        double double8 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.Banco banco11 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco11.adicionarConta(contaBancaria14);
        banco11.listarContas();
        banco11.listarContas();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("", 10.0d);
        banco11.adicionarConta(contaBancaria20);
        banco0.adicionarConta(contaBancaria20);
        java.lang.Class<?> wildcardClass23 = banco0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) ' ');
        double double10 = contaBancaria2.consultarSaldo();
        boolean boolean12 = contaBancaria2.sacar((double) 1.0f);
        boolean boolean14 = contaBancaria2.sacar(182.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 100);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria2.depositar(1.0d);
        boolean boolean6 = contaBancaria2.sacar(53.0d);
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str7, "Titular: , Saldo: R$ 0.0");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 32.0d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria15 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (double) (short) 10);
        banco0.adicionarConta(contaBancaria15);
        double double17 = contaBancaria15.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("", (double) (byte) 0);
        banco0.adicionarConta(contaBancaria40);
        com.example.ContaBancaria contaBancaria43 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 110.0");
        banco0.listarContas();
        com.example.Banco banco45 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco45.adicionarConta(contaBancaria48);
        banco45.listarContas();
        banco45.listarContas();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("", 10.0d);
        banco45.adicionarConta(contaBancaria54);
        com.example.ContaBancaria contaBancaria58 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria58.depositar((double) (byte) -1);
        banco45.adicionarConta(contaBancaria58);
        com.example.ContaBancaria contaBancaria63 = banco45.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        banco45.listarContas();
        com.example.ContaBancaria contaBancaria66 = banco45.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        boolean boolean68 = contaBancaria66.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria66);
        com.example.Banco banco70 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria73 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco70.adicionarConta(contaBancaria73);
        banco70.listarContas();
        com.example.ContaBancaria contaBancaria78 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco70.adicionarConta(contaBancaria78);
        contaBancaria78.depositar((-1.0d));
        banco0.adicionarConta(contaBancaria78);
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertNull(contaBancaria63);
        org.junit.Assert.assertNotNull(contaBancaria66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco4 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria7 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco4.adicionarConta(contaBancaria7);
        banco4.listarContas();
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco4.adicionarConta(contaBancaria12);
        banco4.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco4.adicionarConta(contaBancaria17);
        boolean boolean20 = contaBancaria17.sacar((-1.0d));
        boolean boolean22 = contaBancaria17.sacar((double) 1.0f);
        banco0.adicionarConta(contaBancaria17);
        com.example.ContaBancaria contaBancaria25 = banco0.buscarContaPorTitular("");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(contaBancaria25);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        double double19 = contaBancaria18.consultarSaldo();
        java.lang.String str20 = contaBancaria18.exibirDetalhes();
        contaBancaria18.depositar(0.0d);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str20, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        banco0.adicionarConta(contaBancaria16);
        com.example.Banco banco19 = new com.example.Banco();
        com.example.Banco banco20 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco20.adicionarConta(contaBancaria23);
        banco19.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria27 = banco19.buscarContaPorTitular("hi!");
        boolean boolean29 = contaBancaria27.sacar((double) (-1.0f));
        contaBancaria27.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria27);
        com.example.ContaBancaria contaBancaria34 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria36 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertNotNull(contaBancaria27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(contaBancaria34);
        org.junit.Assert.assertNull(contaBancaria36);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        boolean boolean6 = contaBancaria2.sacar((double) (byte) -1);
        boolean boolean8 = contaBancaria2.sacar((double) 0L);
        java.lang.Class<?> wildcardClass9 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        com.example.Banco banco12 = new com.example.Banco();
        banco12.listarContas();
        com.example.ContaBancaria contaBancaria15 = banco12.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco16 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco16.adicionarConta(contaBancaria19);
        banco16.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco16.adicionarConta(contaBancaria24);
        banco16.listarContas();
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco16.adicionarConta(contaBancaria29);
        boolean boolean32 = contaBancaria29.sacar((-1.0d));
        boolean boolean34 = contaBancaria29.sacar((double) 1.0f);
        banco12.adicionarConta(contaBancaria29);
        boolean boolean37 = contaBancaria29.sacar((double) 1.0f);
        banco0.adicionarConta(contaBancaria29);
        contaBancaria29.depositar(87.0d);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria11);
        org.junit.Assert.assertNull(contaBancaria15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str24 = contaBancaria23.exibirDetalhes();
        banco0.adicionarConta(contaBancaria23);
        java.lang.String str26 = contaBancaria23.exibirDetalhes();
        contaBancaria23.depositar((double) (byte) 0);
        double double29 = contaBancaria23.consultarSaldo();
        double double30 = contaBancaria23.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str26, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0", 35.0d);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        double double16 = contaBancaria13.consultarSaldo();
        java.lang.String str17 = contaBancaria13.exibirDetalhes();
        java.lang.String str18 = contaBancaria13.exibirDetalhes();
        boolean boolean20 = contaBancaria13.sacar((double) ' ');
        boolean boolean22 = contaBancaria13.sacar((double) (short) -1);
        banco0.adicionarConta(contaBancaria13);
        java.lang.Class<?> wildcardClass24 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str17, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str18, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco4 = new com.example.Banco();
        com.example.Banco banco5 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco5.adicionarConta(contaBancaria8);
        banco4.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco4.adicionarConta(contaBancaria13);
        com.example.Banco banco15 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco15.adicionarConta(contaBancaria18);
        banco15.listarContas();
        banco15.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("", 10.0d);
        banco15.adicionarConta(contaBancaria24);
        banco4.adicionarConta(contaBancaria24);
        banco0.adicionarConta(contaBancaria24);
        boolean boolean29 = contaBancaria24.sacar((double) '#');
        java.lang.String str30 = contaBancaria24.exibirDetalhes();
        java.lang.String str31 = contaBancaria24.exibirDetalhes();
        java.lang.String str32 = contaBancaria24.exibirDetalhes();
        double double33 = contaBancaria24.consultarSaldo();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str30, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str31, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str32, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco4 = new com.example.Banco();
        com.example.Banco banco5 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco5.adicionarConta(contaBancaria8);
        banco4.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco4.adicionarConta(contaBancaria13);
        com.example.Banco banco15 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco15.adicionarConta(contaBancaria18);
        banco15.listarContas();
        banco15.listarContas();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("", 10.0d);
        banco15.adicionarConta(contaBancaria24);
        banco4.adicionarConta(contaBancaria24);
        banco0.adicionarConta(contaBancaria24);
        boolean boolean29 = contaBancaria24.sacar((double) '#');
        double double30 = contaBancaria24.consultarSaldo();
        double double31 = contaBancaria24.consultarSaldo();
        boolean boolean33 = contaBancaria24.sacar(88.0d);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.Banco banco11 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean16 = contaBancaria14.sacar((double) (-1L));
        banco11.adicionarConta(contaBancaria14);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str21 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar(0.0d);
        banco11.adicionarConta(contaBancaria20);
        contaBancaria20.depositar((double) (-1));
        contaBancaria20.depositar((double) ' ');
        banco0.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria31 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str21, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria31);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("hi!");
        boolean boolean10 = contaBancaria8.sacar((double) (-1.0f));
        contaBancaria8.depositar((double) (-1.0f));
        contaBancaria8.depositar(0.0d);
        java.lang.String str15 = contaBancaria8.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str15, "Titular: hi!, Saldo: R$ 97.0");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        boolean boolean18 = contaBancaria13.sacar((double) (-1.0f));
        contaBancaria13.depositar((double) 1L);
        double double21 = contaBancaria13.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 53.0d + "'", double21 == 53.0d);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        banco0.adicionarConta(contaBancaria16);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria21 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria23 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria21);
        org.junit.Assert.assertNull(contaBancaria23);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 0.0, Saldo: R$ 100.0", (double) 10L);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0, Saldo: R$ 1.0", 182.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(84.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0, Saldo: R$ 1.0, Saldo: R$ 182.0" + "'", str3, "Titular: Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0, Saldo: R$ 1.0, Saldo: R$ 182.0");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria16 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertNull(contaBancaria16);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0", (double) 'a');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(9.0d);
        double double6 = contaBancaria2.consultarSaldo();
        double double7 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 106.0d + "'", double6 == 106.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 106.0d + "'", double7 == 106.0d);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str19 = contaBancaria18.exibirDetalhes();
        boolean boolean21 = contaBancaria18.sacar((double) (byte) -1);
        double double22 = contaBancaria18.consultarSaldo();
        contaBancaria18.depositar((double) ' ');
        java.lang.String str25 = contaBancaria18.exibirDetalhes();
        double double26 = contaBancaria18.consultarSaldo();
        contaBancaria18.depositar(99.0d);
        java.lang.Class<?> wildcardClass29 = contaBancaria18.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Titular: hi!, Saldo: R$ 84.0" + "'", str25, "Titular: hi!, Saldo: R$ 84.0");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 84.0d + "'", double26 == 84.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 0.0", (double) 100L);
        double double3 = contaBancaria2.consultarSaldo();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 0.0, Saldo: R$ 100.0" + "'", str4, "Titular: Titular: hi!, Saldo: R$ 0.0, Saldo: R$ 100.0");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 10.0d);
        boolean boolean18 = contaBancaria16.sacar(0.0d);
        banco0.adicionarConta(contaBancaria16);
        double double20 = contaBancaria16.consultarSaldo();
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 100L);
        double double3 = contaBancaria2.consultarSaldo();
        double double4 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.Banco banco28 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco28.adicionarConta(contaBancaria31);
        banco28.listarContas();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco28.adicionarConta(contaBancaria36);
        banco28.listarContas();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco28.adicionarConta(contaBancaria41);
        boolean boolean44 = contaBancaria41.sacar((-1.0d));
        banco0.adicionarConta(contaBancaria41);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria49 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0, Saldo: R$ 10.0");
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(contaBancaria49);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 100.0, Saldo: R$ 0.0", (double) 10.0f);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria6 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = contaBancaria6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria6);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 11.0", (double) 0L);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 10.0f);
        java.lang.String str12 = contaBancaria11.exibirDetalhes();
        banco0.adicionarConta(contaBancaria11);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0", 9.0d);
        boolean boolean19 = contaBancaria17.sacar(53.0d);
        banco0.adicionarConta(contaBancaria17);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0" + "'", str12, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0", (double) 'a');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(9.0d);
        double double6 = contaBancaria2.consultarSaldo();
        boolean boolean8 = contaBancaria2.sacar((double) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 106.0d + "'", double6 == 106.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        banco0.adicionarConta(contaBancaria16);
        boolean boolean20 = contaBancaria16.sacar((double) 10.0f);
        java.lang.String str21 = contaBancaria16.exibirDetalhes();
        contaBancaria16.depositar(32.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str21, "Titular: , Saldo: R$ 0.0");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0", (double) (byte) -1);
        contaBancaria2.depositar(117.0d);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria8);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 100.0f);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) (-1));
        contaBancaria2.depositar((double) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 162.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) (short) 100);
        double double6 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 262.0d + "'", double6 == 262.0d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        boolean boolean25 = contaBancaria20.sacar((double) (-1.0f));
        java.lang.String str26 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria20);
        banco0.listarContas();
        com.example.Banco banco31 = new com.example.Banco();
        banco31.listarContas();
        com.example.ContaBancaria contaBancaria34 = banco31.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria36 = banco31.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria38 = banco31.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 100.0", (double) 0L);
        banco31.adicionarConta(contaBancaria41);
        double double43 = contaBancaria41.consultarSaldo();
        banco0.adicionarConta(contaBancaria41);
        java.lang.String str45 = contaBancaria41.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria34);
        org.junit.Assert.assertNull(contaBancaria36);
        org.junit.Assert.assertNull(contaBancaria38);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 100.0, Saldo: R$ 0.0" + "'", str45, "Titular: Titular: hi!, Saldo: R$ 100.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str15 = contaBancaria14.exibirDetalhes();
        boolean boolean17 = contaBancaria14.sacar((double) 100L);
        java.lang.String str18 = contaBancaria14.exibirDetalhes();
        banco0.adicionarConta(contaBancaria14);
        java.lang.Class<?> wildcardClass20 = contaBancaria14.getClass();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str15, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str18, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str10 = contaBancaria9.exibirDetalhes();
        contaBancaria9.depositar(0.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria15 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.Class<?> wildcardClass16 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean4 = contaBancaria2.sacar((double) '#');
        boolean boolean6 = contaBancaria2.sacar((double) (byte) 0);
        double double7 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str19 = contaBancaria18.exibirDetalhes();
        contaBancaria18.depositar((double) (-1.0f));
        java.lang.String str22 = contaBancaria18.exibirDetalhes();
        boolean boolean24 = contaBancaria18.sacar((double) (short) 1);
        java.lang.String str25 = contaBancaria18.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str22, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Titular: hi!, Saldo: R$ 51.0" + "'", str25, "Titular: hi!, Saldo: R$ 51.0");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.Banco banco11 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco11.adicionarConta(contaBancaria14);
        banco11.listarContas();
        banco11.listarContas();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("", 10.0d);
        banco11.adicionarConta(contaBancaria20);
        banco0.adicionarConta(contaBancaria20);
        com.example.Banco banco23 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco23.adicionarConta(contaBancaria26);
        banco23.listarContas();
        banco23.listarContas();
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("", 10.0d);
        banco23.adicionarConta(contaBancaria32);
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria36.depositar((double) (byte) -1);
        banco23.adicionarConta(contaBancaria36);
        com.example.ContaBancaria contaBancaria41 = banco23.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria44 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean46 = contaBancaria44.sacar((double) 100);
        double double47 = contaBancaria44.consultarSaldo();
        banco23.adicionarConta(contaBancaria44);
        banco0.adicionarConta(contaBancaria44);
        java.lang.String str50 = contaBancaria44.exibirDetalhes();
        contaBancaria44.depositar((double) ' ');
        contaBancaria44.depositar(0.0d);
        double double55 = contaBancaria44.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str50, "Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 31.0d + "'", double55 == 31.0d);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 21.0", 99.0d);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 99.0d + "'", double3 == 99.0d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        banco0.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria22 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 21.0");
        com.example.ContaBancaria contaBancaria24 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 1.0");
        org.junit.Assert.assertNotNull(contaBancaria20);
        org.junit.Assert.assertNull(contaBancaria22);
        org.junit.Assert.assertNull(contaBancaria24);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        double double15 = contaBancaria13.consultarSaldo();
        java.lang.String str16 = contaBancaria13.exibirDetalhes();
        boolean boolean18 = contaBancaria13.sacar(100.0d);
        contaBancaria13.depositar(184.0d);
        java.lang.String str21 = contaBancaria13.exibirDetalhes();
        boolean boolean23 = contaBancaria13.sacar(150.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str16, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Titular: hi!, Saldo: R$ 194.0" + "'", str21, "Titular: hi!, Saldo: R$ 194.0");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 96.0", 9.0d);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3 == 9.0d);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 1.0", 262.0d);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria39 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria41 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria43 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria46 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double47 = contaBancaria46.consultarSaldo();
        banco0.adicionarConta(contaBancaria46);
        com.example.ContaBancaria contaBancaria50 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 1.0");
        com.example.ContaBancaria contaBancaria52 = banco0.buscarContaPorTitular("");
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertNull(contaBancaria41);
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertNull(contaBancaria50);
        org.junit.Assert.assertNotNull(contaBancaria52);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (short) -1);
        boolean boolean6 = contaBancaria2.sacar((double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str24 = contaBancaria23.exibirDetalhes();
        banco0.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria27 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        com.example.Banco banco28 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean33 = contaBancaria31.sacar((double) (-1L));
        banco28.adicionarConta(contaBancaria31);
        com.example.ContaBancaria contaBancaria36 = banco28.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria39 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria39.depositar((double) (byte) -1);
        double double42 = contaBancaria39.consultarSaldo();
        java.lang.String str43 = contaBancaria39.exibirDetalhes();
        banco28.adicionarConta(contaBancaria39);
        com.example.Banco banco45 = new com.example.Banco();
        banco45.listarContas();
        banco45.listarContas();
        com.example.ContaBancaria contaBancaria50 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double51 = contaBancaria50.consultarSaldo();
        banco45.adicionarConta(contaBancaria50);
        banco28.adicionarConta(contaBancaria50);
        java.lang.String str54 = contaBancaria50.exibirDetalhes();
        java.lang.String str55 = contaBancaria50.exibirDetalhes();
        banco0.adicionarConta(contaBancaria50);
        java.lang.Class<?> wildcardClass57 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(contaBancaria27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(contaBancaria36);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 52.0d + "'", double42 == 52.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str43, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str54, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str55, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        boolean boolean16 = contaBancaria13.sacar((-1.0d));
        boolean boolean18 = contaBancaria13.sacar((double) 1.0f);
        java.lang.String str19 = contaBancaria13.exibirDetalhes();
        contaBancaria13.depositar((double) 100L);
        boolean boolean23 = contaBancaria13.sacar((double) (byte) 0);
        java.lang.Class<?> wildcardClass24 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 9.0" + "'", str19, "Titular: hi!, Saldo: R$ 9.0");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        banco10.listarContas();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("", 10.0d);
        banco10.adicionarConta(contaBancaria19);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria23.depositar((double) (byte) -1);
        banco10.adicionarConta(contaBancaria23);
        boolean boolean28 = contaBancaria23.sacar((double) (-1.0f));
        java.lang.String str29 = contaBancaria23.exibirDetalhes();
        double double30 = contaBancaria23.consultarSaldo();
        banco0.adicionarConta(contaBancaria23);
        double double32 = contaBancaria23.consultarSaldo();
        java.lang.String str33 = contaBancaria23.exibirDetalhes();
        contaBancaria23.depositar((double) '4');
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 52.0d + "'", double32 == 52.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str33, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.Banco banco11 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco11.adicionarConta(contaBancaria14);
        banco11.listarContas();
        banco11.listarContas();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("", 10.0d);
        banco11.adicionarConta(contaBancaria20);
        banco0.adicionarConta(contaBancaria20);
        com.example.Banco banco23 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco23.adicionarConta(contaBancaria26);
        banco23.listarContas();
        banco23.listarContas();
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("", 10.0d);
        banco23.adicionarConta(contaBancaria32);
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria36.depositar((double) (byte) -1);
        banco23.adicionarConta(contaBancaria36);
        com.example.ContaBancaria contaBancaria41 = banco23.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria44 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean46 = contaBancaria44.sacar((double) 100);
        double double47 = contaBancaria44.consultarSaldo();
        banco23.adicionarConta(contaBancaria44);
        banco0.adicionarConta(contaBancaria44);
        com.example.ContaBancaria contaBancaria51 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria53 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 11.0");
        org.junit.Assert.assertNotNull(contaBancaria41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(contaBancaria51);
        org.junit.Assert.assertNull(contaBancaria53);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", 0.0d);
        double double3 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) 10.0f);
        boolean boolean7 = contaBancaria2.sacar(99.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("", (double) '#');
        banco0.adicionarConta(contaBancaria22);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria26 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0");
        org.junit.Assert.assertNull(contaBancaria19);
        org.junit.Assert.assertNull(contaBancaria26);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria13 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria15 = banco0.buscarContaPorTitular("Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0");
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria9);
        org.junit.Assert.assertNotNull(contaBancaria11);
        org.junit.Assert.assertNull(contaBancaria13);
        org.junit.Assert.assertNull(contaBancaria15);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.Banco banco2 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco2.adicionarConta(contaBancaria5);
        banco1.adicionarConta(contaBancaria5);
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria10);
        com.example.Banco banco12 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria15 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco12.adicionarConta(contaBancaria15);
        banco12.listarContas();
        banco12.listarContas();
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("", 10.0d);
        banco12.adicionarConta(contaBancaria21);
        banco1.adicionarConta(contaBancaria21);
        boolean boolean25 = contaBancaria21.sacar(0.0d);
        double double26 = contaBancaria21.consultarSaldo();
        banco0.adicionarConta(contaBancaria21);
        banco0.listarContas();
        java.lang.Class<?> wildcardClass29 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (-1L));
        contaBancaria2.depositar((-1.0d));
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        double double8 = contaBancaria2.consultarSaldo();
        boolean boolean10 = contaBancaria2.sacar((double) (short) -1);
        boolean boolean12 = contaBancaria2.sacar((double) (-1.0f));
        double double13 = contaBancaria2.consultarSaldo();
        double double14 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str7, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco9 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco9.adicionarConta(contaBancaria12);
        banco9.listarContas();
        banco9.listarContas();
        com.example.Banco banco16 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco16.adicionarConta(contaBancaria19);
        banco16.listarContas();
        banco16.listarContas();
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("", 10.0d);
        banco16.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria29.depositar((double) (byte) -1);
        banco16.adicionarConta(contaBancaria29);
        com.example.ContaBancaria contaBancaria34 = banco16.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str35 = contaBancaria34.exibirDetalhes();
        banco9.adicionarConta(contaBancaria34);
        com.example.Banco banco37 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco37.adicionarConta(contaBancaria40);
        banco37.listarContas();
        com.example.ContaBancaria contaBancaria45 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco37.adicionarConta(contaBancaria45);
        banco37.listarContas();
        com.example.ContaBancaria contaBancaria50 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco37.adicionarConta(contaBancaria50);
        boolean boolean53 = contaBancaria50.sacar((-1.0d));
        banco9.adicionarConta(contaBancaria50);
        banco0.adicionarConta(contaBancaria50);
        boolean boolean57 = contaBancaria50.sacar((double) (short) 100);
        java.lang.String str58 = contaBancaria50.exibirDetalhes();
        boolean boolean60 = contaBancaria50.sacar((double) (byte) 1);
        org.junit.Assert.assertNotNull(contaBancaria34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str35, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str58, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.Banco banco8 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco8.adicionarConta(contaBancaria11);
        banco8.listarContas();
        banco8.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("", 10.0d);
        banco8.adicionarConta(contaBancaria17);
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria21.depositar((double) (byte) -1);
        banco8.adicionarConta(contaBancaria21);
        boolean boolean26 = contaBancaria21.sacar((double) (-1.0f));
        java.lang.String str27 = contaBancaria21.exibirDetalhes();
        banco0.adicionarConta(contaBancaria21);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) (byte) 100);
        java.lang.String str33 = contaBancaria32.exibirDetalhes();
        banco0.adicionarConta(contaBancaria32);
        com.example.ContaBancaria contaBancaria36 = banco0.buscarContaPorTitular("");
        java.lang.String str37 = contaBancaria36.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str27, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 100.0" + "'", str33, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNotNull(contaBancaria36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str37, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) ' ');
        java.lang.String str10 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) 'a');
        java.lang.String str13 = contaBancaria2.exibirDetalhes();
        boolean boolean15 = contaBancaria2.sacar((-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 20.0" + "'", str10, "Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Titular: hi!, Saldo: R$ 117.0" + "'", str13, "Titular: hi!, Saldo: R$ 117.0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double3 = contaBancaria2.consultarSaldo();
        boolean boolean5 = contaBancaria2.sacar((double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 53.0", 47.0d);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 9.0", 31.0d);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        double double4 = contaBancaria2.consultarSaldo();
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        double double15 = contaBancaria13.consultarSaldo();
        double double16 = contaBancaria13.consultarSaldo();
        java.lang.String str17 = contaBancaria13.exibirDetalhes();
        boolean boolean19 = contaBancaria13.sacar((double) 0.0f);
        contaBancaria13.depositar((double) '#');
        contaBancaria13.depositar((double) '4');
        boolean boolean25 = contaBancaria13.sacar((double) '#');
        boolean boolean27 = contaBancaria13.sacar(104.0d);
        java.lang.Class<?> wildcardClass28 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str17, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean23 = contaBancaria21.sacar((double) 100);
        double double24 = contaBancaria21.consultarSaldo();
        banco0.adicionarConta(contaBancaria21);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria28 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 1.0");
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNull(contaBancaria28);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        boolean boolean16 = contaBancaria13.sacar((-1.0d));
        double double17 = contaBancaria13.consultarSaldo();
        boolean boolean19 = contaBancaria13.sacar((double) 1.0f);
        boolean boolean21 = contaBancaria13.sacar((double) 'a');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) 100L);
        banco0.adicionarConta(contaBancaria12);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria16 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria16);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("");
        boolean boolean12 = contaBancaria10.sacar(107.0d);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 53.0", (double) 1.0f);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco4 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria7 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco4.adicionarConta(contaBancaria7);
        banco4.listarContas();
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco4.adicionarConta(contaBancaria12);
        banco4.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco4.adicionarConta(contaBancaria17);
        boolean boolean20 = contaBancaria17.sacar((-1.0d));
        boolean boolean22 = contaBancaria17.sacar((double) 1.0f);
        banco0.adicionarConta(contaBancaria17);
        double double24 = contaBancaria17.consultarSaldo();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 9.0d + "'", double24 == 9.0d);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        java.lang.String str17 = contaBancaria13.exibirDetalhes();
        boolean boolean19 = contaBancaria13.sacar(0.0d);
        double double20 = contaBancaria13.consultarSaldo();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str17, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0, Saldo: R$ 1.0, Saldo: R$ 182.0", 32.0d);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0", (double) (short) -1);
        boolean boolean4 = contaBancaria2.sacar(47.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 97.0", (double) ' ');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 32.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 32.0");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("hi!");
        contaBancaria8.depositar((double) 100);
        double double11 = contaBancaria8.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 197.0d + "'", double11 == 197.0d);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (double) (short) 10);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        double double4 = contaBancaria2.consultarSaldo();
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 10.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double6 = contaBancaria5.consultarSaldo();
        banco0.adicionarConta(contaBancaria5);
        com.example.Banco banco8 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco8.adicionarConta(contaBancaria11);
        banco8.listarContas();
        banco8.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("", 10.0d);
        banco8.adicionarConta(contaBancaria17);
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria21.depositar((double) (byte) -1);
        banco8.adicionarConta(contaBancaria21);
        com.example.Banco banco25 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria28 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco25.adicionarConta(contaBancaria28);
        banco25.listarContas();
        banco25.listarContas();
        com.example.Banco banco32 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco32.adicionarConta(contaBancaria35);
        banco32.listarContas();
        banco32.listarContas();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("", 10.0d);
        banco32.adicionarConta(contaBancaria41);
        banco25.adicionarConta(contaBancaria41);
        banco8.adicionarConta(contaBancaria41);
        banco0.adicionarConta(contaBancaria41);
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria48.depositar((double) (-1));
        contaBancaria48.depositar(10.0d);
        double double53 = contaBancaria48.consultarSaldo();
        banco0.adicionarConta(contaBancaria48);
        java.lang.String str55 = contaBancaria48.exibirDetalhes();
        double double56 = contaBancaria48.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 107.0d + "'", double53 == 107.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Titular: hi!, Saldo: R$ 107.0" + "'", str55, "Titular: hi!, Saldo: R$ 107.0");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 107.0d + "'", double56 == 107.0d);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean23 = contaBancaria21.sacar((double) 100);
        double double24 = contaBancaria21.consultarSaldo();
        banco0.adicionarConta(contaBancaria21);
        com.example.ContaBancaria contaBancaria26 = null;
        banco0.adicionarConta(contaBancaria26);
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double31 = contaBancaria30.consultarSaldo();
        banco0.adicionarConta(contaBancaria30);
        boolean boolean34 = contaBancaria30.sacar((double) 0);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean14 = contaBancaria12.sacar((double) (-1L));
        contaBancaria12.depositar((-1.0d));
        banco0.adicionarConta(contaBancaria12);
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria21 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("", (double) (-1L));
        contaBancaria24.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria24);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertNull(contaBancaria21);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 9.0");
        com.example.Banco banco13 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean18 = contaBancaria16.sacar((double) (-1L));
        banco13.adicionarConta(contaBancaria16);
        banco13.listarContas();
        com.example.Banco banco21 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco21.adicionarConta(contaBancaria24);
        banco21.listarContas();
        banco21.listarContas();
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("", 10.0d);
        banco21.adicionarConta(contaBancaria30);
        com.example.ContaBancaria contaBancaria34 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria34.depositar((double) (byte) -1);
        banco21.adicionarConta(contaBancaria34);
        com.example.ContaBancaria contaBancaria39 = banco21.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria42 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean44 = contaBancaria42.sacar((double) 100);
        double double45 = contaBancaria42.consultarSaldo();
        banco21.adicionarConta(contaBancaria42);
        boolean boolean48 = contaBancaria42.sacar((double) (byte) 1);
        banco13.adicionarConta(contaBancaria42);
        banco0.adicionarConta(contaBancaria42);
        com.example.Banco banco51 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco51.adicionarConta(contaBancaria54);
        banco51.listarContas();
        com.example.ContaBancaria contaBancaria59 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco51.adicionarConta(contaBancaria59);
        banco51.listarContas();
        com.example.ContaBancaria contaBancaria64 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco51.adicionarConta(contaBancaria64);
        double double66 = contaBancaria64.consultarSaldo();
        contaBancaria64.depositar((double) (short) 100);
        banco0.adicionarConta(contaBancaria64);
        java.lang.String str70 = contaBancaria64.exibirDetalhes();
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Titular: hi!, Saldo: R$ 110.0" + "'", str70, "Titular: hi!, Saldo: R$ 110.0");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0", 29.0d);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        boolean boolean25 = contaBancaria20.sacar((double) (-1.0f));
        java.lang.String str26 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria20);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria32 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
        banco0.listarContas();
        com.example.Banco banco34 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria37 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco34.adicionarConta(contaBancaria37);
        banco34.listarContas();
        banco34.listarContas();
        com.example.ContaBancaria contaBancaria42 = banco34.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria44 = banco34.buscarContaPorTitular("");
        banco34.listarContas();
        com.example.Banco banco46 = new com.example.Banco();
        banco46.listarContas();
        com.example.ContaBancaria contaBancaria49 = banco46.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco50 = new com.example.Banco();
        com.example.Banco banco51 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco51.adicionarConta(contaBancaria54);
        banco50.adicionarConta(contaBancaria54);
        com.example.ContaBancaria contaBancaria59 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco50.adicionarConta(contaBancaria59);
        com.example.Banco banco61 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria64 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco61.adicionarConta(contaBancaria64);
        banco61.listarContas();
        banco61.listarContas();
        com.example.ContaBancaria contaBancaria70 = new com.example.ContaBancaria("", 10.0d);
        banco61.adicionarConta(contaBancaria70);
        banco50.adicionarConta(contaBancaria70);
        banco46.adicionarConta(contaBancaria70);
        com.example.ContaBancaria contaBancaria76 = new com.example.ContaBancaria("hi!", 0.0d);
        banco46.adicionarConta(contaBancaria76);
        banco34.adicionarConta(contaBancaria76);
        banco0.adicionarConta(contaBancaria76);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria32);
        org.junit.Assert.assertNotNull(contaBancaria42);
        org.junit.Assert.assertNotNull(contaBancaria44);
        org.junit.Assert.assertNull(contaBancaria49);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", 0.0d);
        double double3 = contaBancaria2.consultarSaldo();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 0.0" + "'", str4, "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        banco10.listarContas();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("", 10.0d);
        banco10.adicionarConta(contaBancaria19);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria23.depositar((double) (byte) -1);
        banco10.adicionarConta(contaBancaria23);
        boolean boolean28 = contaBancaria23.sacar((double) (-1.0f));
        java.lang.String str29 = contaBancaria23.exibirDetalhes();
        double double30 = contaBancaria23.consultarSaldo();
        banco0.adicionarConta(contaBancaria23);
        java.lang.String str32 = contaBancaria23.exibirDetalhes();
        boolean boolean34 = contaBancaria23.sacar((double) 1L);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str32, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 52.0d);
        contaBancaria2.depositar((double) (short) 10);
        double double5 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 62.0d + "'", double5 == 62.0d);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0, Saldo: R$ -1.0", (double) 'a');
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 52.0d);
        contaBancaria2.depositar(107.0d);
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        banco10.listarContas();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("", 10.0d);
        banco10.adicionarConta(contaBancaria19);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria23.depositar((double) (byte) -1);
        banco10.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria28 = banco10.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria30 = banco10.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str34 = contaBancaria33.exibirDetalhes();
        banco10.adicionarConta(contaBancaria33);
        java.lang.String str36 = contaBancaria33.exibirDetalhes();
        double double37 = contaBancaria33.consultarSaldo();
        boolean boolean39 = contaBancaria33.sacar((double) (short) 10);
        banco0.adicionarConta(contaBancaria33);
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 10.0", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria43);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertNull(contaBancaria30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str34, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str36, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0", (double) (short) 0);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        boolean boolean18 = contaBancaria13.sacar((double) (-1.0f));
        boolean boolean20 = contaBancaria13.sacar((double) ' ');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.Banco banco2 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco2.adicionarConta(contaBancaria5);
        banco2.listarContas();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco2.adicionarConta(contaBancaria10);
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean16 = contaBancaria14.sacar((double) (-1L));
        contaBancaria14.depositar((-1.0d));
        banco2.adicionarConta(contaBancaria14);
        banco0.adicionarConta(contaBancaria14);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) ' ');
        banco0.adicionarConta(contaBancaria23);
        contaBancaria23.depositar(0.0d);
        boolean boolean28 = contaBancaria23.sacar((double) 'a');
        java.lang.String str29 = contaBancaria23.exibirDetalhes();
        java.lang.String str30 = contaBancaria23.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 32.0" + "'", str29, "Titular: hi!, Saldo: R$ 32.0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: hi!, Saldo: R$ 32.0" + "'", str30, "Titular: hi!, Saldo: R$ 32.0");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        com.example.ContaBancaria contaBancaria7 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double8 = contaBancaria7.consultarSaldo();
        contaBancaria7.depositar((double) (-1.0f));
        contaBancaria7.depositar((double) (-1L));
        banco0.adicionarConta(contaBancaria7);
        java.lang.Class<?> wildcardClass14 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        double double11 = contaBancaria9.consultarSaldo();
        double double12 = contaBancaria9.consultarSaldo();
        contaBancaria9.depositar((double) (-1));
        double double15 = contaBancaria9.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria17);
        contaBancaria17.depositar(0.0d);
        contaBancaria17.depositar((double) (byte) 1);
        boolean boolean24 = contaBancaria17.sacar((double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = contaBancaria29.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria29);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 10.0f);
        java.lang.String str12 = contaBancaria11.exibirDetalhes();
        banco0.adicionarConta(contaBancaria11);
        com.example.ContaBancaria contaBancaria15 = banco0.buscarContaPorTitular("");
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0");
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0" + "'", str12, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0");
        org.junit.Assert.assertNotNull(contaBancaria15);
        org.junit.Assert.assertNull(contaBancaria19);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        banco10.listarContas();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("", 10.0d);
        banco10.adicionarConta(contaBancaria19);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria23.depositar((double) (byte) -1);
        banco10.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria28 = banco10.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria30 = banco10.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str34 = contaBancaria33.exibirDetalhes();
        banco10.adicionarConta(contaBancaria33);
        java.lang.String str36 = contaBancaria33.exibirDetalhes();
        double double37 = contaBancaria33.consultarSaldo();
        boolean boolean39 = contaBancaria33.sacar((double) (short) 10);
        banco0.adicionarConta(contaBancaria33);
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 197.0", 104.0d);
        banco0.adicionarConta(contaBancaria43);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertNull(contaBancaria30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str34, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str36, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 42.0", (double) (short) 100);
        contaBancaria2.depositar(99.0d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 97.0", (double) (short) 10);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ 97.0");
        banco0.listarContas();
        java.lang.Class<?> wildcardClass10 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.Banco banco8 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco8.adicionarConta(contaBancaria11);
        banco8.listarContas();
        banco8.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("", 10.0d);
        banco8.adicionarConta(contaBancaria17);
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria21.depositar((double) (byte) -1);
        banco8.adicionarConta(contaBancaria21);
        boolean boolean26 = contaBancaria21.sacar((double) (-1.0f));
        java.lang.String str27 = contaBancaria21.exibirDetalhes();
        banco0.adicionarConta(contaBancaria21);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) (byte) 100);
        java.lang.String str33 = contaBancaria32.exibirDetalhes();
        banco0.adicionarConta(contaBancaria32);
        java.lang.Class<?> wildcardClass35 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str27, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 100.0" + "'", str33, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 214.0", 10.0d);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) '4');
        contaBancaria2.depositar(193.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("", 0.0d);
        java.lang.String str5 = contaBancaria4.exibirDetalhes();
        double double6 = contaBancaria4.consultarSaldo();
        banco0.adicionarConta(contaBancaria4);
        com.example.Banco banco8 = new com.example.Banco();
        banco8.listarContas();
        banco8.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double14 = contaBancaria13.consultarSaldo();
        banco8.adicionarConta(contaBancaria13);
        com.example.Banco banco16 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco16.adicionarConta(contaBancaria19);
        banco16.listarContas();
        banco16.listarContas();
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("", 10.0d);
        banco16.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria29.depositar((double) (byte) -1);
        banco16.adicionarConta(contaBancaria29);
        com.example.Banco banco33 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco33.adicionarConta(contaBancaria36);
        banco33.listarContas();
        banco33.listarContas();
        com.example.Banco banco40 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco40.adicionarConta(contaBancaria43);
        banco40.listarContas();
        banco40.listarContas();
        com.example.ContaBancaria contaBancaria49 = new com.example.ContaBancaria("", 10.0d);
        banco40.adicionarConta(contaBancaria49);
        banco33.adicionarConta(contaBancaria49);
        banco16.adicionarConta(contaBancaria49);
        banco8.adicionarConta(contaBancaria49);
        banco0.adicionarConta(contaBancaria49);
        double double55 = contaBancaria49.consultarSaldo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str5, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 10.0d);
        boolean boolean4 = contaBancaria2.sacar(0.0d);
        contaBancaria2.depositar((double) ' ');
        java.lang.Class<?> wildcardClass7 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 100.0", (double) (byte) -1);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0", (double) (short) 100);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        boolean boolean25 = contaBancaria20.sacar((double) (-1.0f));
        java.lang.String str26 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria20);
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (double) (byte) 1);
        contaBancaria2.depositar((double) 1L);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria11.depositar((double) (byte) -1);
        double double14 = contaBancaria11.consultarSaldo();
        java.lang.String str15 = contaBancaria11.exibirDetalhes();
        banco0.adicionarConta(contaBancaria11);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria19);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str10 = contaBancaria9.exibirDetalhes();
        contaBancaria9.depositar(0.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", (double) '#');
        banco0.adicionarConta(contaBancaria16);
        double double18 = contaBancaria16.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria39 = banco0.buscarContaPorTitular("hi!");
        java.lang.Class<?> wildcardClass40 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) '#');
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        banco10.listarContas();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("", 10.0d);
        banco10.adicionarConta(contaBancaria19);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria23.depositar((double) (byte) -1);
        banco10.adicionarConta(contaBancaria23);
        boolean boolean28 = contaBancaria23.sacar((double) (-1.0f));
        java.lang.String str29 = contaBancaria23.exibirDetalhes();
        double double30 = contaBancaria23.consultarSaldo();
        banco0.adicionarConta(contaBancaria23);
        boolean boolean33 = contaBancaria23.sacar((double) 10);
        boolean boolean35 = contaBancaria23.sacar((double) (-1));
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.Banco banco2 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco2.adicionarConta(contaBancaria5);
        banco2.listarContas();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco2.adicionarConta(contaBancaria10);
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean16 = contaBancaria14.sacar((double) (-1L));
        contaBancaria14.depositar((-1.0d));
        banco2.adicionarConta(contaBancaria14);
        banco0.adicionarConta(contaBancaria14);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) ' ');
        banco0.adicionarConta(contaBancaria23);
        contaBancaria23.depositar((double) (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        double double15 = contaBancaria13.consultarSaldo();
        java.lang.String str16 = contaBancaria13.exibirDetalhes();
        boolean boolean18 = contaBancaria13.sacar(100.0d);
        java.lang.String str19 = contaBancaria13.exibirDetalhes();
        java.lang.Class<?> wildcardClass20 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str16, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str19, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria13 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0");
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", 100.0d);
        java.lang.String str17 = contaBancaria16.exibirDetalhes();
        banco0.adicionarConta(contaBancaria16);
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria9);
        org.junit.Assert.assertNotNull(contaBancaria11);
        org.junit.Assert.assertNull(contaBancaria13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0" + "'", str17, "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0", 0.0d);
        contaBancaria2.depositar(193.0d);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 52.0d);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
        boolean boolean6 = contaBancaria2.sacar((double) (-1.0f));
        boolean boolean8 = contaBancaria2.sacar((double) (byte) 100);
        java.lang.Class<?> wildcardClass9 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        banco0.adicionarConta(contaBancaria9);
        java.lang.String str11 = contaBancaria9.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str11, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        java.lang.String str8 = contaBancaria2.exibirDetalhes();
        java.lang.String str9 = contaBancaria2.exibirDetalhes();
        java.lang.String str10 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str8, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str9, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria10);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 100.0f);
        java.lang.String str31 = contaBancaria30.exibirDetalhes();
        boolean boolean33 = contaBancaria30.sacar(152.0d);
        banco0.adicionarConta(contaBancaria30);
        boolean boolean36 = contaBancaria30.sacar(84.0d);
        double double37 = contaBancaria30.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str31, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 16.0d + "'", double37 == 16.0d);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria20);
        banco0.listarContas();
        banco0.listarContas();
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 10.0f);
        java.lang.String str12 = contaBancaria11.exibirDetalhes();
        banco0.adicionarConta(contaBancaria11);
        com.example.ContaBancaria contaBancaria15 = banco0.buscarContaPorTitular("");
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 11.0");
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0" + "'", str12, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0");
        org.junit.Assert.assertNotNull(contaBancaria15);
        org.junit.Assert.assertNull(contaBancaria19);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco10.listarContas();
        banco10.listarContas();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("", 10.0d);
        banco10.adicionarConta(contaBancaria19);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria23.depositar((double) (byte) -1);
        banco10.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria28 = banco10.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str29 = contaBancaria28.exibirDetalhes();
        boolean boolean31 = contaBancaria28.sacar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria28);
        com.example.Banco banco33 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco33.adicionarConta(contaBancaria36);
        banco33.listarContas();
        banco33.listarContas();
        com.example.ContaBancaria contaBancaria42 = new com.example.ContaBancaria("", 10.0d);
        banco33.adicionarConta(contaBancaria42);
        com.example.ContaBancaria contaBancaria46 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria46.depositar((double) (byte) -1);
        banco33.adicionarConta(contaBancaria46);
        com.example.ContaBancaria contaBancaria51 = banco33.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria53 = banco33.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria56 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str57 = contaBancaria56.exibirDetalhes();
        banco33.adicionarConta(contaBancaria56);
        contaBancaria56.depositar((double) '4');
        banco0.adicionarConta(contaBancaria56);
        com.example.ContaBancaria contaBancaria63 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 182.0");
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(contaBancaria51);
        org.junit.Assert.assertNull(contaBancaria53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str57, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNull(contaBancaria63);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str4, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        banco0.adicionarConta(contaBancaria16);
        com.example.Banco banco19 = new com.example.Banco();
        com.example.Banco banco20 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco20.adicionarConta(contaBancaria23);
        banco19.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria27 = banco19.buscarContaPorTitular("hi!");
        boolean boolean29 = contaBancaria27.sacar((double) (-1.0f));
        contaBancaria27.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria27);
        com.example.ContaBancaria contaBancaria34 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) (byte) 100);
        double double39 = contaBancaria38.consultarSaldo();
        double double40 = contaBancaria38.consultarSaldo();
        banco0.adicionarConta(contaBancaria38);
        java.lang.Class<?> wildcardClass42 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(contaBancaria34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str26 = contaBancaria25.exibirDetalhes();
        banco0.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0");
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria29);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        banco0.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("");
        com.example.Banco banco21 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean26 = contaBancaria24.sacar((double) (-1L));
        banco21.adicionarConta(contaBancaria24);
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str31 = contaBancaria30.exibirDetalhes();
        contaBancaria30.depositar(0.0d);
        banco21.adicionarConta(contaBancaria30);
        com.example.ContaBancaria contaBancaria36 = banco21.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str37 = contaBancaria36.exibirDetalhes();
        banco0.adicionarConta(contaBancaria36);
        org.junit.Assert.assertNotNull(contaBancaria20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str31, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str37, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        boolean boolean25 = contaBancaria20.sacar((double) (-1.0f));
        java.lang.String str26 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria20);
        banco0.listarContas();
        com.example.Banco banco31 = new com.example.Banco();
        banco31.listarContas();
        com.example.ContaBancaria contaBancaria34 = banco31.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria36 = banco31.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria38 = banco31.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 100.0", (double) 0L);
        banco31.adicionarConta(contaBancaria41);
        double double43 = contaBancaria41.consultarSaldo();
        banco0.adicionarConta(contaBancaria41);
        com.example.ContaBancaria contaBancaria47 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 21.0", (double) (byte) 100);
        java.lang.String str48 = contaBancaria47.exibirDetalhes();
        banco0.adicionarConta(contaBancaria47);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria34);
        org.junit.Assert.assertNull(contaBancaria36);
        org.junit.Assert.assertNull(contaBancaria38);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 21.0, Saldo: R$ 100.0" + "'", str48, "Titular: Titular: hi!, Saldo: R$ 21.0, Saldo: R$ 100.0");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("");
        banco0.listarContas();
        com.example.Banco banco12 = new com.example.Banco();
        banco12.listarContas();
        com.example.ContaBancaria contaBancaria15 = banco12.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco16 = new com.example.Banco();
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco16.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco16.adicionarConta(contaBancaria25);
        com.example.Banco banco27 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco27.adicionarConta(contaBancaria30);
        banco27.listarContas();
        banco27.listarContas();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("", 10.0d);
        banco27.adicionarConta(contaBancaria36);
        banco16.adicionarConta(contaBancaria36);
        banco12.adicionarConta(contaBancaria36);
        com.example.ContaBancaria contaBancaria42 = new com.example.ContaBancaria("hi!", 0.0d);
        banco12.adicionarConta(contaBancaria42);
        banco0.adicionarConta(contaBancaria42);
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria10);
        org.junit.Assert.assertNull(contaBancaria15);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) (byte) 100);
        boolean boolean4 = contaBancaria2.sacar((double) (byte) 1);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: , Saldo: R$ 99.0" + "'", str5, "Titular: , Saldo: R$ 99.0");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        boolean boolean25 = contaBancaria20.sacar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria20);
        java.lang.String str27 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar((double) 10L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str27, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double13 = contaBancaria12.consultarSaldo();
        boolean boolean15 = contaBancaria12.sacar(53.0d);
        boolean boolean17 = contaBancaria12.sacar(84.0d);
        banco0.adicionarConta(contaBancaria12);
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria22 = banco0.buscarContaPorTitular("");
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertNotNull(contaBancaria22);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str41 = contaBancaria40.exibirDetalhes();
        contaBancaria40.depositar(0.0d);
        contaBancaria40.depositar((double) 0L);
        java.lang.String str46 = contaBancaria40.exibirDetalhes();
        java.lang.String str47 = contaBancaria40.exibirDetalhes();
        java.lang.String str48 = contaBancaria40.exibirDetalhes();
        java.lang.String str49 = contaBancaria40.exibirDetalhes();
        banco0.adicionarConta(contaBancaria40);
        com.example.Banco banco51 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco51.adicionarConta(contaBancaria54);
        banco51.listarContas();
        banco51.listarContas();
        com.example.Banco banco58 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria61 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco58.adicionarConta(contaBancaria61);
        banco58.listarContas();
        banco58.listarContas();
        com.example.ContaBancaria contaBancaria67 = new com.example.ContaBancaria("", 10.0d);
        banco58.adicionarConta(contaBancaria67);
        com.example.ContaBancaria contaBancaria71 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria71.depositar((double) (byte) -1);
        banco58.adicionarConta(contaBancaria71);
        boolean boolean76 = contaBancaria71.sacar((double) (-1.0f));
        java.lang.String str77 = contaBancaria71.exibirDetalhes();
        contaBancaria71.depositar((double) (-1.0f));
        banco51.adicionarConta(contaBancaria71);
        banco0.adicionarConta(contaBancaria71);
        contaBancaria71.depositar(100.0d);
        double double84 = contaBancaria71.consultarSaldo();
        java.lang.String str85 = contaBancaria71.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str41, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str46, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str48, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str49, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str77, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 152.0d + "'", double84 == 152.0d);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Titular: hi!, Saldo: R$ 152.0" + "'", str85, "Titular: hi!, Saldo: R$ 152.0");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0");
        com.example.Banco banco19 = new com.example.Banco();
        banco19.listarContas();
        com.example.Banco banco21 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco21.adicionarConta(contaBancaria24);
        banco21.listarContas();
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco21.adicionarConta(contaBancaria29);
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean35 = contaBancaria33.sacar((double) (-1L));
        contaBancaria33.depositar((-1.0d));
        banco21.adicionarConta(contaBancaria33);
        banco19.adicionarConta(contaBancaria33);
        contaBancaria33.depositar((double) 0.0f);
        java.lang.String str42 = contaBancaria33.exibirDetalhes();
        banco0.adicionarConta(contaBancaria33);
        com.example.ContaBancaria contaBancaria46 = new com.example.ContaBancaria("hi!", (double) '4');
        banco0.adicionarConta(contaBancaria46);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str42, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 100.0", 32.0d);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 32.0", (double) 100.0f);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.Banco banco11 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco11.adicionarConta(contaBancaria14);
        banco11.listarContas();
        banco11.listarContas();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("", 10.0d);
        banco11.adicionarConta(contaBancaria20);
        banco0.adicionarConta(contaBancaria20);
        com.example.ContaBancaria contaBancaria24 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("", (double) (byte) 100);
        boolean boolean29 = contaBancaria27.sacar((double) (byte) 1);
        banco0.adicionarConta(contaBancaria27);
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("Titular: , Saldo: R$ 0.0", (double) (byte) 0);
        java.lang.String str34 = contaBancaria33.exibirDetalhes();
        banco0.adicionarConta(contaBancaria33);
        java.lang.String str36 = contaBancaria33.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0" + "'", str34, "Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0" + "'", str36, "Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0, Saldo: R$ 0.0", (double) 0.0f);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 107.0", (double) (short) 100);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco7 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco7.adicionarConta(contaBancaria10);
        banco7.listarContas();
        banco7.listarContas();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("", 10.0d);
        banco7.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria20.depositar((double) (byte) -1);
        banco7.adicionarConta(contaBancaria20);
        boolean boolean25 = contaBancaria20.sacar((double) (-1.0f));
        java.lang.String str26 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria20);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria32 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria35 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 110.0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria32);
        org.junit.Assert.assertNull(contaBancaria35);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 110.0", 162.0d);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(0.0d);
        contaBancaria2.depositar(53.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean14 = contaBancaria12.sacar((double) (-1L));
        contaBancaria12.depositar((-1.0d));
        banco0.adicionarConta(contaBancaria12);
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria21 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria23 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("Titular: Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0, Saldo: R$ 100.0", 62.0d);
        banco0.adicionarConta(contaBancaria26);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertNull(contaBancaria21);
        org.junit.Assert.assertNull(contaBancaria23);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.Banco banco2 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco2.adicionarConta(contaBancaria5);
        banco2.listarContas();
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco2.adicionarConta(contaBancaria10);
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean16 = contaBancaria14.sacar((double) (-1L));
        contaBancaria14.depositar((-1.0d));
        banco2.adicionarConta(contaBancaria14);
        banco0.adicionarConta(contaBancaria14);
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) ' ');
        banco0.adicionarConta(contaBancaria23);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria27 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(contaBancaria27);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean23 = contaBancaria21.sacar((double) 100);
        double double24 = contaBancaria21.consultarSaldo();
        banco0.adicionarConta(contaBancaria21);
        boolean boolean27 = contaBancaria21.sacar(88.0d);
        java.lang.String str28 = contaBancaria21.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str28, "Titular: hi!, Saldo: R$ -1.0");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 97.0", (double) 100.0f);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        double double4 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 100.0", (double) (short) -1);
        boolean boolean4 = contaBancaria2.sacar((double) 0L);
        double double5 = contaBancaria2.consultarSaldo();
        boolean boolean7 = contaBancaria2.sacar((double) 1L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria16 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ -1.0");
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("hi!", (double) '4');
        double double20 = contaBancaria19.consultarSaldo();
        java.lang.String str21 = contaBancaria19.exibirDetalhes();
        java.lang.String str22 = contaBancaria19.exibirDetalhes();
        java.lang.String str23 = contaBancaria19.exibirDetalhes();
        boolean boolean25 = contaBancaria19.sacar((double) 100);
        banco0.adicionarConta(contaBancaria19);
        com.example.ContaBancaria contaBancaria28 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 87.0");
        org.junit.Assert.assertNull(contaBancaria16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str21, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str22, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str23, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(contaBancaria28);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 9.0");
        com.example.Banco banco13 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean18 = contaBancaria16.sacar((double) (-1L));
        banco13.adicionarConta(contaBancaria16);
        banco13.listarContas();
        com.example.Banco banco21 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco21.adicionarConta(contaBancaria24);
        banco21.listarContas();
        banco21.listarContas();
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("", 10.0d);
        banco21.adicionarConta(contaBancaria30);
        com.example.ContaBancaria contaBancaria34 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria34.depositar((double) (byte) -1);
        banco21.adicionarConta(contaBancaria34);
        com.example.ContaBancaria contaBancaria39 = banco21.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria42 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean44 = contaBancaria42.sacar((double) 100);
        double double45 = contaBancaria42.consultarSaldo();
        banco21.adicionarConta(contaBancaria42);
        boolean boolean48 = contaBancaria42.sacar((double) (byte) 1);
        banco13.adicionarConta(contaBancaria42);
        banco0.adicionarConta(contaBancaria42);
        com.example.Banco banco51 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean56 = contaBancaria54.sacar((double) (-1L));
        banco51.adicionarConta(contaBancaria54);
        com.example.ContaBancaria contaBancaria59 = banco51.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria62 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria62.depositar((double) (byte) -1);
        double double65 = contaBancaria62.consultarSaldo();
        java.lang.String str66 = contaBancaria62.exibirDetalhes();
        banco51.adicionarConta(contaBancaria62);
        com.example.Banco banco68 = new com.example.Banco();
        banco68.listarContas();
        banco68.listarContas();
        com.example.ContaBancaria contaBancaria73 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double74 = contaBancaria73.consultarSaldo();
        banco68.adicionarConta(contaBancaria73);
        banco51.adicionarConta(contaBancaria73);
        java.lang.String str77 = contaBancaria73.exibirDetalhes();
        java.lang.String str78 = contaBancaria73.exibirDetalhes();
        contaBancaria73.depositar((double) 1.0f);
        java.lang.String str81 = contaBancaria73.exibirDetalhes();
        contaBancaria73.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria73);
        java.lang.String str85 = contaBancaria73.exibirDetalhes();
        java.lang.Class<?> wildcardClass86 = contaBancaria73.getClass();
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(contaBancaria59);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 52.0d + "'", double65 == 52.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str66, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str77, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str78, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0" + "'", str81, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0" + "'", str85, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria7 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 84.0");
        org.junit.Assert.assertNull(contaBancaria7);
        org.junit.Assert.assertNull(contaBancaria10);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        banco0.listarContas();
        com.example.Banco banco18 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco18.adicionarConta(contaBancaria21);
        banco18.listarContas();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco18.adicionarConta(contaBancaria26);
        banco18.listarContas();
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco18.adicionarConta(contaBancaria31);
        double double33 = contaBancaria31.consultarSaldo();
        double double34 = contaBancaria31.consultarSaldo();
        java.lang.String str35 = contaBancaria31.exibirDetalhes();
        boolean boolean37 = contaBancaria31.sacar((double) 0.0f);
        contaBancaria31.depositar((double) '#');
        double double40 = contaBancaria31.consultarSaldo();
        banco0.adicionarConta(contaBancaria31);
        com.example.ContaBancaria contaBancaria44 = new com.example.ContaBancaria("Titular: , Saldo: R$ 0.0", (double) (byte) 0);
        boolean boolean46 = contaBancaria44.sacar(52.0d);
        banco0.adicionarConta(contaBancaria44);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str35, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 45.0d + "'", double40 == 45.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        com.example.ContaBancaria contaBancaria7 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria7);
        com.example.Banco banco9 = new com.example.Banco();
        com.example.Banco banco10 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco10.adicionarConta(contaBancaria13);
        banco9.adicionarConta(contaBancaria13);
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco9.adicionarConta(contaBancaria18);
        com.example.Banco banco20 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco20.adicionarConta(contaBancaria23);
        banco20.listarContas();
        banco20.listarContas();
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("", 10.0d);
        banco20.adicionarConta(contaBancaria29);
        banco9.adicionarConta(contaBancaria29);
        double double32 = contaBancaria29.consultarSaldo();
        contaBancaria29.depositar(152.0d);
        banco0.adicionarConta(contaBancaria29);
        banco0.listarContas();
        com.example.Banco banco37 = new com.example.Banco();
        banco37.listarContas();
        com.example.ContaBancaria contaBancaria40 = banco37.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco37.listarContas();
        com.example.Banco banco42 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria45 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco42.adicionarConta(contaBancaria45);
        banco42.listarContas();
        banco42.listarContas();
        com.example.ContaBancaria contaBancaria51 = new com.example.ContaBancaria("", 10.0d);
        banco42.adicionarConta(contaBancaria51);
        com.example.Banco banco53 = new com.example.Banco();
        banco53.listarContas();
        com.example.ContaBancaria contaBancaria56 = banco53.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco57 = new com.example.Banco();
        com.example.Banco banco58 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria61 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco58.adicionarConta(contaBancaria61);
        banco57.adicionarConta(contaBancaria61);
        com.example.ContaBancaria contaBancaria66 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco57.adicionarConta(contaBancaria66);
        com.example.Banco banco68 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria71 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco68.adicionarConta(contaBancaria71);
        banco68.listarContas();
        banco68.listarContas();
        com.example.ContaBancaria contaBancaria77 = new com.example.ContaBancaria("", 10.0d);
        banco68.adicionarConta(contaBancaria77);
        banco57.adicionarConta(contaBancaria77);
        banco53.adicionarConta(contaBancaria77);
        com.example.ContaBancaria contaBancaria83 = new com.example.ContaBancaria("hi!", 0.0d);
        banco53.adicionarConta(contaBancaria83);
        contaBancaria83.depositar((double) (short) 100);
        banco42.adicionarConta(contaBancaria83);
        banco37.adicionarConta(contaBancaria83);
        contaBancaria83.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria83);
        double double92 = contaBancaria83.consultarSaldo();
        org.junit.Assert.assertNull(contaBancaria4);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNull(contaBancaria40);
        org.junit.Assert.assertNull(contaBancaria56);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 100.0d + "'", double92 == 100.0d);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0, Saldo: R$ 100.0", (double) 100L);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) (short) 0);
        contaBancaria2.depositar((double) (byte) 0);
        double double5 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 162.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) (short) 100);
        contaBancaria2.depositar(16.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        com.example.Banco banco17 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco17.adicionarConta(contaBancaria20);
        banco17.listarContas();
        banco17.listarContas();
        com.example.Banco banco24 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco24.adicionarConta(contaBancaria27);
        banco24.listarContas();
        banco24.listarContas();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("", 10.0d);
        banco24.adicionarConta(contaBancaria33);
        banco17.adicionarConta(contaBancaria33);
        banco0.adicionarConta(contaBancaria33);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria39 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria41 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria43 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        banco0.listarContas();
        com.example.Banco banco45 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean50 = contaBancaria48.sacar((double) (-1L));
        banco45.adicionarConta(contaBancaria48);
        banco45.listarContas();
        banco45.listarContas();
        banco45.listarContas();
        com.example.Banco banco55 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria58 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco55.adicionarConta(contaBancaria58);
        banco55.listarContas();
        banco55.listarContas();
        com.example.ContaBancaria contaBancaria64 = new com.example.ContaBancaria("", 10.0d);
        banco55.adicionarConta(contaBancaria64);
        com.example.ContaBancaria contaBancaria68 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria68.depositar((double) (byte) -1);
        banco55.adicionarConta(contaBancaria68);
        com.example.ContaBancaria contaBancaria73 = banco55.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria75 = banco55.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria78 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str79 = contaBancaria78.exibirDetalhes();
        banco55.adicionarConta(contaBancaria78);
        java.lang.String str81 = contaBancaria78.exibirDetalhes();
        double double82 = contaBancaria78.consultarSaldo();
        boolean boolean84 = contaBancaria78.sacar((double) (short) 10);
        banco45.adicionarConta(contaBancaria78);
        java.lang.String str86 = contaBancaria78.exibirDetalhes();
        banco0.adicionarConta(contaBancaria78);
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertNull(contaBancaria41);
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(contaBancaria73);
        org.junit.Assert.assertNull(contaBancaria75);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str79, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str81, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str86, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", 32.0d);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) (byte) 1);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: , Saldo: R$ 1.0" + "'", str3, "Titular: , Saldo: R$ 1.0");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double9 = contaBancaria8.consultarSaldo();
        contaBancaria8.depositar((double) 10L);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria14 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0, Saldo: R$ 1.0");
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 214.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.Banco banco12 = new com.example.Banco();
        banco12.listarContas();
        com.example.Banco banco14 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco14.adicionarConta(contaBancaria17);
        banco14.listarContas();
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco14.adicionarConta(contaBancaria22);
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean28 = contaBancaria26.sacar((double) (-1L));
        contaBancaria26.depositar((-1.0d));
        banco14.adicionarConta(contaBancaria26);
        banco12.adicionarConta(contaBancaria26);
        double double33 = contaBancaria26.consultarSaldo();
        banco0.adicionarConta(contaBancaria26);
        com.example.Banco banco35 = new com.example.Banco();
        banco35.listarContas();
        com.example.Banco banco37 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco37.adicionarConta(contaBancaria40);
        banco37.listarContas();
        com.example.ContaBancaria contaBancaria45 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco37.adicionarConta(contaBancaria45);
        com.example.ContaBancaria contaBancaria49 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean51 = contaBancaria49.sacar((double) (-1L));
        contaBancaria49.depositar((-1.0d));
        banco37.adicionarConta(contaBancaria49);
        banco35.adicionarConta(contaBancaria49);
        com.example.ContaBancaria contaBancaria58 = new com.example.ContaBancaria("hi!", (double) ' ');
        banco35.adicionarConta(contaBancaria58);
        double double60 = contaBancaria58.consultarSaldo();
        contaBancaria58.depositar((double) (byte) 10);
        banco0.adicionarConta(contaBancaria58);
        com.example.ContaBancaria contaBancaria65 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0");
        org.junit.Assert.assertNull(contaBancaria11);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 32.0d + "'", double60 == 32.0d);
        org.junit.Assert.assertNull(contaBancaria65);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        com.example.ContaBancaria contaBancaria7 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double8 = contaBancaria7.consultarSaldo();
        contaBancaria7.depositar((double) (-1.0f));
        contaBancaria7.depositar((double) (-1L));
        banco0.adicionarConta(contaBancaria7);
        com.example.ContaBancaria contaBancaria15 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertNull(contaBancaria4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNull(contaBancaria15);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria13.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria13);
        boolean boolean18 = contaBancaria13.sacar((double) (-1.0f));
        java.lang.String str19 = contaBancaria13.exibirDetalhes();
        java.lang.String str20 = contaBancaria13.exibirDetalhes();
        java.lang.Class<?> wildcardClass21 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str20, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco9 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco9.adicionarConta(contaBancaria12);
        banco9.listarContas();
        banco9.listarContas();
        com.example.Banco banco16 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco16.adicionarConta(contaBancaria19);
        banco16.listarContas();
        banco16.listarContas();
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("", 10.0d);
        banco16.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria29.depositar((double) (byte) -1);
        banco16.adicionarConta(contaBancaria29);
        com.example.ContaBancaria contaBancaria34 = banco16.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str35 = contaBancaria34.exibirDetalhes();
        banco9.adicionarConta(contaBancaria34);
        com.example.Banco banco37 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco37.adicionarConta(contaBancaria40);
        banco37.listarContas();
        com.example.ContaBancaria contaBancaria45 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco37.adicionarConta(contaBancaria45);
        banco37.listarContas();
        com.example.ContaBancaria contaBancaria50 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco37.adicionarConta(contaBancaria50);
        boolean boolean53 = contaBancaria50.sacar((-1.0d));
        banco9.adicionarConta(contaBancaria50);
        banco0.adicionarConta(contaBancaria50);
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str35, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 116.0", 100.0d);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.Banco banco8 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco8.adicionarConta(contaBancaria11);
        banco8.listarContas();
        banco8.listarContas();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("", 10.0d);
        banco8.adicionarConta(contaBancaria17);
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria21.depositar((double) (byte) -1);
        banco8.adicionarConta(contaBancaria21);
        boolean boolean26 = contaBancaria21.sacar((double) (-1.0f));
        java.lang.String str27 = contaBancaria21.exibirDetalhes();
        banco0.adicionarConta(contaBancaria21);
        java.lang.String str29 = contaBancaria21.exibirDetalhes();
        boolean boolean31 = contaBancaria21.sacar(106.0d);
        boolean boolean33 = contaBancaria21.sacar(29.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str27, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0", (double) (byte) 0);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 10.0", (double) (-1));
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ -1.0", (double) (short) 10);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        boolean boolean8 = contaBancaria4.sacar((double) (byte) 1);
        contaBancaria4.depositar(53.0d);
        double double11 = contaBancaria4.consultarSaldo();
        double double12 = contaBancaria4.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 149.0d + "'", double11 == 149.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 149.0d + "'", double12 == 149.0d);
    }
}

