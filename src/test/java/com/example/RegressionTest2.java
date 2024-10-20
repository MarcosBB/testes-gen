package com.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 0.0", 0.0d);
        double double3 = contaBancaria2.consultarSaldo();
        boolean boolean5 = contaBancaria2.sacar(20.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria35.depositar((double) (byte) -1);
        double double38 = contaBancaria35.consultarSaldo();
        contaBancaria35.depositar((double) 10L);
        banco0.adicionarConta(contaBancaria35);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria32);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 52.0d + "'", double38 == 52.0d);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", (double) (short) 1);
        double double3 = contaBancaria2.consultarSaldo();
        double double4 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        java.lang.Class<?> wildcardClass66 = contaBancaria61.getClass();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str62, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str5, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 0.0", 35.0d);
        contaBancaria2.depositar((double) (-1));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        com.example.ContaBancaria contaBancaria51 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 11.0");
        com.example.ContaBancaria contaBancaria53 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(contaBancaria49);
        org.junit.Assert.assertNull(contaBancaria51);
        org.junit.Assert.assertNull(contaBancaria53);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria22 = banco0.buscarContaPorTitular("");
        boolean boolean24 = contaBancaria22.sacar(88.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertNotNull(contaBancaria22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 10.0d);
        contaBancaria2.depositar((double) (byte) 1);
        boolean boolean6 = contaBancaria2.sacar((double) (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        contaBancaria48.depositar((double) 1.0f);
        boolean boolean58 = contaBancaria48.sacar(187.0d);
        java.lang.String str59 = contaBancaria48.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 107.0d + "'", double53 == 107.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Titular: hi!, Saldo: R$ 108.0" + "'", str59, "Titular: hi!, Saldo: R$ 108.0");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        contaBancaria28.depositar(9.0d);
        double double36 = contaBancaria28.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 19.0d + "'", double36 == 19.0d);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 47.0", 0.0d);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        com.example.ContaBancaria contaBancaria33 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria35 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria38.depositar((double) (byte) -1);
        double double41 = contaBancaria38.consultarSaldo();
        java.lang.String str42 = contaBancaria38.exibirDetalhes();
        java.lang.String str43 = contaBancaria38.exibirDetalhes();
        java.lang.String str44 = contaBancaria38.exibirDetalhes();
        contaBancaria38.depositar(1.0d);
        double double47 = contaBancaria38.consultarSaldo();
        banco0.adicionarConta(contaBancaria38);
        contaBancaria38.depositar(19.0d);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertNull(contaBancaria35);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 52.0d + "'", double41 == 52.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str42, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str43, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str44, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 53.0d + "'", double47 == 53.0d);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 197.0", 104.0d);
        boolean boolean4 = contaBancaria2.sacar((double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 19.0", 106.0d);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0", (double) 100L);
        contaBancaria2.depositar((double) 10.0f);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 1.0", 187.0d);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 182.0", 152.0d);
        boolean boolean4 = contaBancaria2.sacar((double) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (-1L));
        contaBancaria2.depositar((-1.0d));
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        double double8 = contaBancaria2.consultarSaldo();
        boolean boolean10 = contaBancaria2.sacar((double) (short) -1);
        java.lang.String str11 = contaBancaria2.exibirDetalhes();
        java.lang.String str12 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str7, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str11, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str12, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        com.example.ContaBancaria contaBancaria28 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0, Saldo: R$ 10.0", (double) 'a');
        banco0.adicionarConta(contaBancaria28);
        double double30 = contaBancaria28.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 97.0d + "'", double30 == 97.0d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        contaBancaria9.depositar((double) 1);
        boolean boolean25 = contaBancaria9.sacar((double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 10.0", (double) 10.0f);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("");
        java.lang.String str12 = contaBancaria11.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria9);
        org.junit.Assert.assertNotNull(contaBancaria11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str12, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 10.0", (double) (short) -1);
        boolean boolean4 = contaBancaria2.sacar(100.0d);
        boolean boolean6 = contaBancaria2.sacar(193.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria22 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria24 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 53.0");
        org.junit.Assert.assertNull(contaBancaria19);
        org.junit.Assert.assertNull(contaBancaria22);
        org.junit.Assert.assertNull(contaBancaria24);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        java.lang.String str17 = contaBancaria13.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str16, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str17, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        com.example.ContaBancaria contaBancaria21 = banco0.buscarContaPorTitular("hi!");
        com.example.Banco banco22 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco22.adicionarConta(contaBancaria25);
        banco22.listarContas();
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco22.adicionarConta(contaBancaria30);
        banco22.listarContas();
        com.example.Banco banco33 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean38 = contaBancaria36.sacar((double) (-1L));
        banco33.adicionarConta(contaBancaria36);
        com.example.ContaBancaria contaBancaria42 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str43 = contaBancaria42.exibirDetalhes();
        contaBancaria42.depositar(0.0d);
        banco33.adicionarConta(contaBancaria42);
        contaBancaria42.depositar((double) (-1));
        contaBancaria42.depositar((double) ' ');
        banco22.adicionarConta(contaBancaria42);
        java.lang.String str52 = contaBancaria42.exibirDetalhes();
        java.lang.String str53 = contaBancaria42.exibirDetalhes();
        banco0.adicionarConta(contaBancaria42);
        org.junit.Assert.assertNull(contaBancaria19);
        org.junit.Assert.assertNotNull(contaBancaria21);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str43, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Titular: hi!, Saldo: R$ 84.0" + "'", str52, "Titular: hi!, Saldo: R$ 84.0");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Titular: hi!, Saldo: R$ 84.0" + "'", str53, "Titular: hi!, Saldo: R$ 84.0");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 1.0", 87.0d);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 87.0d + "'", double3 == 87.0d);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        double double22 = contaBancaria18.consultarSaldo();
        boolean boolean24 = contaBancaria18.sacar(197.0d);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) (byte) 0);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) (byte) 100);
        boolean boolean4 = contaBancaria2.sacar((double) (byte) 1);
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) ' ');
        java.lang.String str10 = contaBancaria2.exibirDetalhes();
        java.lang.String str11 = contaBancaria2.exibirDetalhes();
        boolean boolean13 = contaBancaria2.sacar((double) 100);
        boolean boolean15 = contaBancaria2.sacar((double) (byte) -1);
        boolean boolean17 = contaBancaria2.sacar(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 20.0" + "'", str10, "Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Titular: hi!, Saldo: R$ 20.0" + "'", str11, "Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria13 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria15 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
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
        contaBancaria29.depositar((double) 1.0f);
        banco0.adicionarConta(contaBancaria29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria9);
        org.junit.Assert.assertNotNull(contaBancaria11);
        org.junit.Assert.assertNull(contaBancaria13);
        org.junit.Assert.assertNull(contaBancaria15);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        com.example.ContaBancaria contaBancaria43 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria45 = banco0.buscarContaPorTitular("Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 10.0");
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertNull(contaBancaria41);
        org.junit.Assert.assertNotNull(contaBancaria43);
        org.junit.Assert.assertNull(contaBancaria45);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        java.lang.String str33 = contaBancaria32.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(contaBancaria32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str33, "Titular: hi!, Saldo: R$ 97.0");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0", (double) (byte) -1);
        contaBancaria2.depositar(29.0d);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 97.0", (double) 100.0f);
        contaBancaria2.depositar((double) 10.0f);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 110.0" + "'", str5, "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 110.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 110.0" + "'", str6, "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 110.0");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 21.0", (double) (short) 10);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        contaBancaria18.depositar((double) (short) 0);
        boolean boolean28 = contaBancaria18.sacar(88.0d);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        boolean boolean4 = contaBancaria2.sacar((double) (short) 1);
        double double5 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 51.0d + "'", double5 == 51.0d);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) (byte) -1);
        boolean boolean4 = contaBancaria2.sacar((double) 10L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str10 = contaBancaria9.exibirDetalhes();
        contaBancaria9.depositar(0.0d);
        banco0.adicionarConta(contaBancaria9);
        java.lang.String str14 = contaBancaria9.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str14, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria22 = banco0.buscarContaPorTitular("");
        com.example.Banco banco23 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco23.adicionarConta(contaBancaria26);
        banco23.listarContas();
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double32 = contaBancaria31.consultarSaldo();
        contaBancaria31.depositar((double) 10L);
        banco23.adicionarConta(contaBancaria31);
        com.example.ContaBancaria contaBancaria37 = banco23.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria39 = banco23.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria42 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0", (double) 100.0f);
        banco23.adicionarConta(contaBancaria42);
        banco0.adicionarConta(contaBancaria42);
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertNotNull(contaBancaria22);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria37);
        org.junit.Assert.assertNull(contaBancaria39);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        java.lang.String str33 = contaBancaria24.exibirDetalhes();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str30, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str31, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str32, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str33, "Titular: , Saldo: R$ 10.0");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("hi!", (double) '4');
        boolean boolean34 = contaBancaria32.sacar((double) (short) 1);
        contaBancaria32.depositar((double) (short) 0);
        banco0.adicionarConta(contaBancaria32);
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 10.0d);
        boolean boolean23 = contaBancaria21.sacar(0.0d);
        banco0.adicionarConta(contaBancaria21);
        com.example.ContaBancaria contaBancaria26 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 0.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 19.0", (double) 100);
        double double30 = contaBancaria29.consultarSaldo();
        java.lang.String str31 = contaBancaria29.exibirDetalhes();
        contaBancaria29.depositar(29.0d);
        banco0.adicionarConta(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria16);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(contaBancaria26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 19.0, Saldo: R$ 100.0" + "'", str31, "Titular: Titular: hi!, Saldo: R$ 19.0, Saldo: R$ 100.0");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 117.0d);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        boolean boolean23 = contaBancaria13.sacar((double) (-1));
        java.lang.String str24 = contaBancaria13.exibirDetalhes();
        double double25 = contaBancaria13.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str24, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        com.example.ContaBancaria contaBancaria27 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 99.0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(contaBancaria27);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 162.0d);
        boolean boolean4 = contaBancaria2.sacar(20.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) (byte) 0);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str3, "Titular: , Saldo: R$ 0.0");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0", 152.0d);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        com.example.ContaBancaria contaBancaria45 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 9.0", (double) 10L);
        double double46 = contaBancaria45.consultarSaldo();
        banco0.adicionarConta(contaBancaria45);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str39, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria29);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 100.0", 29.0d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 47.0", (double) 10.0f);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        java.lang.String str22 = contaBancaria13.exibirDetalhes();
        boolean boolean24 = contaBancaria13.sacar((double) 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str17, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Titular: hi!, Saldo: R$ 45.0" + "'", str22, "Titular: hi!, Saldo: R$ 45.0");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        com.example.Banco banco52 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria55 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco52.adicionarConta(contaBancaria55);
        banco51.adicionarConta(contaBancaria55);
        com.example.ContaBancaria contaBancaria60 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco51.adicionarConta(contaBancaria60);
        java.lang.String str62 = contaBancaria60.exibirDetalhes();
        boolean boolean64 = contaBancaria60.sacar((double) 0.0f);
        double double65 = contaBancaria60.consultarSaldo();
        banco0.adicionarConta(contaBancaria60);
        contaBancaria60.depositar((double) (short) 1);
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str62, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 97.0d + "'", double65 == 97.0d);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria15 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean17 = contaBancaria15.sacar((double) (-1L));
        contaBancaria15.depositar((-1.0d));
        java.lang.String str20 = contaBancaria15.exibirDetalhes();
        double double21 = contaBancaria15.consultarSaldo();
        banco0.adicionarConta(contaBancaria15);
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria25.depositar((double) (-1));
        boolean boolean29 = contaBancaria25.sacar((double) (-1.0f));
        java.lang.String str30 = contaBancaria25.exibirDetalhes();
        contaBancaria25.depositar(53.0d);
        double double33 = contaBancaria25.consultarSaldo();
        banco0.adicionarConta(contaBancaria25);
        java.lang.String str35 = contaBancaria25.exibirDetalhes();
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str20, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str30, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 150.0d + "'", double33 == 150.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Titular: hi!, Saldo: R$ 150.0" + "'", str35, "Titular: hi!, Saldo: R$ 150.0");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 10.0", 262.0d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar((double) 100L);
        boolean boolean7 = contaBancaria2.sacar(182.0d);
        double double8 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        java.lang.Class<?> wildcardClass26 = contaBancaria20.getClass();
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        java.lang.Class<?> wildcardClass20 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str17, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        com.example.ContaBancaria contaBancaria47 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria50 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str51 = contaBancaria50.exibirDetalhes();
        double double52 = contaBancaria50.consultarSaldo();
        contaBancaria50.depositar(104.0d);
        banco0.adicionarConta(contaBancaria50);
        com.example.ContaBancaria contaBancaria58 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 20.0", (double) (byte) 1);
        boolean boolean60 = contaBancaria58.sacar(47.0d);
        banco0.adicionarConta(contaBancaria58);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str51, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        java.lang.Class<?> wildcardClass71 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertNull(contaBancaria47);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 62.0", 0.0d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria3.depositar(1.0d);
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 116.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 182.0");
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria5 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria7 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 100.0", (double) 0L);
        banco0.adicionarConta(contaBancaria10);
        contaBancaria10.depositar((-1.0d));
        contaBancaria10.depositar(106.0d);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria5);
        org.junit.Assert.assertNull(contaBancaria7);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        contaBancaria28.depositar(9.0d);
        java.lang.String str36 = contaBancaria28.exibirDetalhes();
        contaBancaria28.depositar((double) 100.0f);
        java.lang.Class<?> wildcardClass39 = contaBancaria28.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Titular: hi!, Saldo: R$ 19.0" + "'", str36, "Titular: hi!, Saldo: R$ 19.0");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        com.example.Banco banco19 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco19.adicionarConta(contaBancaria22);
        banco19.listarContas();
        com.example.ContaBancaria contaBancaria27 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco19.adicionarConta(contaBancaria27);
        banco19.listarContas();
        com.example.Banco banco30 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean35 = contaBancaria33.sacar((double) (-1L));
        banco30.adicionarConta(contaBancaria33);
        com.example.ContaBancaria contaBancaria39 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str40 = contaBancaria39.exibirDetalhes();
        contaBancaria39.depositar(0.0d);
        banco30.adicionarConta(contaBancaria39);
        contaBancaria39.depositar((double) (-1));
        contaBancaria39.depositar((double) ' ');
        banco19.adicionarConta(contaBancaria39);
        double double49 = contaBancaria39.consultarSaldo();
        boolean boolean51 = contaBancaria39.sacar((double) (byte) 0);
        banco0.adicionarConta(contaBancaria39);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str40, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 84.0d + "'", double49 == 84.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        com.example.ContaBancaria contaBancaria47 = new com.example.ContaBancaria("", 0.0d);
        boolean boolean49 = contaBancaria47.sacar(100.0d);
        banco0.adicionarConta(contaBancaria47);
        java.lang.Class<?> wildcardClass51 = contaBancaria47.getClass();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria10);
        org.junit.Assert.assertNull(contaBancaria15);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        double double21 = contaBancaria17.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        double double3 = contaBancaria2.consultarSaldo();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str4, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) (byte) 10);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        boolean boolean52 = contaBancaria40.sacar(9.0d);
        java.lang.Class<?> wildcardClass53 = contaBancaria40.getClass();
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str41, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str46, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str48, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str49, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        boolean boolean8 = contaBancaria4.sacar((double) (byte) 1);
        contaBancaria4.depositar(53.0d);
        boolean boolean12 = contaBancaria4.sacar(45.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        boolean boolean23 = contaBancaria9.sacar(87.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0", (double) ' ');
        contaBancaria2.depositar((double) 1L);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        com.example.Banco banco12 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria15 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco12.adicionarConta(contaBancaria15);
        banco12.listarContas();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco12.adicionarConta(contaBancaria20);
        banco12.listarContas();
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco12.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco12.adicionarConta(contaBancaria29);
        contaBancaria29.depositar(0.0d);
        banco0.adicionarConta(contaBancaria29);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria37 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0", 35.0d);
        banco0.adicionarConta(contaBancaria37);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria11);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        boolean boolean23 = contaBancaria21.sacar(262.0d);
        org.junit.Assert.assertNull(contaBancaria18);
        org.junit.Assert.assertNotNull(contaBancaria21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) 10L);
        java.lang.String str8 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Titular: hi!, Saldo: R$ 62.0" + "'", str8, "Titular: hi!, Saldo: R$ 62.0");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double3 = contaBancaria2.consultarSaldo();
        java.lang.Class<?> wildcardClass4 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria6 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 9.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria6);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        boolean boolean29 = contaBancaria23.sacar((double) (byte) 10);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ 97.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria11);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 19.0");
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 20.0", (double) (byte) -1);
        banco0.adicionarConta(contaBancaria23);
        com.example.ContaBancaria contaBancaria26 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria28 = banco0.buscarContaPorTitular("");
        org.junit.Assert.assertNull(contaBancaria16);
        org.junit.Assert.assertNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertNull(contaBancaria26);
        org.junit.Assert.assertNotNull(contaBancaria28);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        double double19 = contaBancaria13.consultarSaldo();
        java.lang.Class<?> wildcardClass20 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 9.0d + "'", double19 == 9.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (short) -1);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str5, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ -1.0");
        com.example.ContaBancaria contaBancaria13 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.Banco banco14 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria17.depositar(1.0d);
        banco14.adicionarConta(contaBancaria17);
        banco14.listarContas();
        banco14.listarContas();
        com.example.Banco banco23 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco23.adicionarConta(contaBancaria26);
        banco23.listarContas();
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco23.adicionarConta(contaBancaria31);
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
        java.lang.String str52 = contaBancaria51.exibirDetalhes();
        boolean boolean54 = contaBancaria51.sacar((double) (byte) -1);
        banco23.adicionarConta(contaBancaria51);
        double double56 = contaBancaria51.consultarSaldo();
        double double57 = contaBancaria51.consultarSaldo();
        banco14.adicionarConta(contaBancaria51);
        banco0.adicionarConta(contaBancaria51);
        java.lang.String str60 = contaBancaria51.exibirDetalhes();
        org.junit.Assert.assertNull(contaBancaria11);
        org.junit.Assert.assertNotNull(contaBancaria13);
        org.junit.Assert.assertNotNull(contaBancaria51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str52, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 52.0d + "'", double56 == 52.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 52.0d + "'", double57 == 52.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str60, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double9 = contaBancaria8.consultarSaldo();
        contaBancaria8.depositar((double) 10L);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria14 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria16 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertNull(contaBancaria16);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", 0.0d);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        com.example.ContaBancaria contaBancaria54 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria56 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria58 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 197.0");
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(contaBancaria40);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 52.0d + "'", double46 == 52.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria54);
        org.junit.Assert.assertNotNull(contaBancaria56);
        org.junit.Assert.assertNull(contaBancaria58);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 10.0", 147.0d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        com.example.ContaBancaria contaBancaria22 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria24 = banco0.buscarContaPorTitular("Titular: Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNull(contaBancaria22);
        org.junit.Assert.assertNull(contaBancaria24);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (double) (short) 10);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) 1.0f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 10.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 10.0");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        com.example.ContaBancaria contaBancaria31 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 182.0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str21, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria31);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 87.0", (double) 10L);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 87.0, Saldo: R$ 10.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 87.0, Saldo: R$ 10.0");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        com.example.Banco banco32 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco32.adicionarConta(contaBancaria35);
        banco32.listarContas();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco32.adicionarConta(contaBancaria40);
        com.example.Banco banco42 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria45 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco42.adicionarConta(contaBancaria45);
        banco42.listarContas();
        banco42.listarContas();
        com.example.ContaBancaria contaBancaria51 = new com.example.ContaBancaria("", 10.0d);
        banco42.adicionarConta(contaBancaria51);
        com.example.ContaBancaria contaBancaria55 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria55.depositar((double) (byte) -1);
        banco42.adicionarConta(contaBancaria55);
        com.example.ContaBancaria contaBancaria60 = banco42.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str61 = contaBancaria60.exibirDetalhes();
        boolean boolean63 = contaBancaria60.sacar((double) (byte) -1);
        banco32.adicionarConta(contaBancaria60);
        banco0.adicionarConta(contaBancaria60);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria68 = banco0.buscarContaPorTitular("Titular: Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0, Saldo: R$ 1.0, Saldo: R$ 182.0");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNotNull(contaBancaria60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str61, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(contaBancaria68);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        com.example.ContaBancaria contaBancaria7 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria7);
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 0.0", (double) 100L);
        double double12 = contaBancaria11.consultarSaldo();
        java.lang.String str13 = contaBancaria11.exibirDetalhes();
        banco0.adicionarConta(contaBancaria11);
        boolean boolean16 = contaBancaria11.sacar(106.0d);
        org.junit.Assert.assertNull(contaBancaria4);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 0.0, Saldo: R$ 100.0" + "'", str13, "Titular: Titular: hi!, Saldo: R$ 0.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) 10.0f);
        contaBancaria2.depositar((double) 10);
        java.lang.String str8 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str3, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Titular: hi!, Saldo: R$ 30.0" + "'", str8, "Titular: hi!, Saldo: R$ 30.0");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 0.0", 162.0d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double20 = contaBancaria19.consultarSaldo();
        banco0.adicionarConta(contaBancaria19);
        double double22 = contaBancaria19.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", 0.0d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        boolean boolean6 = contaBancaria2.sacar((double) (byte) -1);
        double double7 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        com.example.Banco banco51 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco51.adicionarConta(contaBancaria54);
        banco51.listarContas();
        banco51.listarContas();
        com.example.ContaBancaria contaBancaria60 = new com.example.ContaBancaria("", 10.0d);
        banco51.adicionarConta(contaBancaria60);
        com.example.ContaBancaria contaBancaria64 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria64.depositar((double) (byte) -1);
        banco51.adicionarConta(contaBancaria64);
        banco51.listarContas();
        com.example.ContaBancaria contaBancaria71 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco51.adicionarConta(contaBancaria71);
        com.example.Banco banco73 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria76 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean78 = contaBancaria76.sacar((double) (-1L));
        banco73.adicionarConta(contaBancaria76);
        com.example.ContaBancaria contaBancaria81 = banco73.buscarContaPorTitular("");
        double double82 = contaBancaria81.consultarSaldo();
        banco51.adicionarConta(contaBancaria81);
        banco0.adicionarConta(contaBancaria81);
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertNull(contaBancaria41);
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertNull(contaBancaria50);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(contaBancaria81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 10.0d + "'", double82 == 10.0d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        com.example.Banco banco27 = new com.example.Banco();
        com.example.Banco banco28 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco28.adicionarConta(contaBancaria31);
        banco27.adicionarConta(contaBancaria31);
        com.example.ContaBancaria contaBancaria35 = banco27.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        boolean boolean37 = contaBancaria35.sacar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria35);
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(contaBancaria26);
        org.junit.Assert.assertNotNull(contaBancaria35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean35 = contaBancaria33.sacar((double) 100);
        double double36 = contaBancaria33.consultarSaldo();
        boolean boolean38 = contaBancaria33.sacar((double) ' ');
        contaBancaria33.depositar(182.0d);
        banco0.adicionarConta(contaBancaria33);
        com.example.ContaBancaria contaBancaria44 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0, Saldo: R$ -1.0", (double) '#');
        banco0.adicionarConta(contaBancaria44);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(contaBancaria26);
        org.junit.Assert.assertNull(contaBancaria28);
        org.junit.Assert.assertNull(contaBancaria30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        boolean boolean19 = contaBancaria13.sacar(53.0d);
        contaBancaria13.depositar((double) 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str17, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 32.0", (double) 1L);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        java.lang.String str21 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar(106.0d);
        org.junit.Assert.assertNotNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str21, "Titular: hi!, Saldo: R$ 97.0");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        double double66 = contaBancaria54.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str55, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str62, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 52.0d + "'", double66 == 52.0d);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        boolean boolean83 = contaBancaria71.sacar(100.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str41, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str46, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str48, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str49, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str77, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 52.0", (double) (short) 10);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 62.0", 97.0d);
        banco0.adicionarConta(contaBancaria11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria2.depositar(1.0d);
        contaBancaria2.depositar(0.0d);
        java.lang.Class<?> wildcardClass7 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        boolean boolean27 = contaBancaria13.sacar(35.0d);
        boolean boolean29 = contaBancaria13.sacar((double) 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str17, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        contaBancaria13.depositar(162.0d);
        boolean boolean19 = contaBancaria13.sacar((double) 0.0f);
        double double20 = contaBancaria13.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 172.0d + "'", double20 == 172.0d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0", 107.0d);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0", 9.0d);
        boolean boolean4 = contaBancaria2.sacar((double) 100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        com.example.ContaBancaria contaBancaria32 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0");
        com.example.ContaBancaria contaBancaria34 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ 97.0");
        org.junit.Assert.assertNotNull(contaBancaria24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(contaBancaria32);
        org.junit.Assert.assertNull(contaBancaria34);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 10.0d);
        contaBancaria2.depositar((double) (byte) 1);
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        java.lang.String str30 = contaBancaria20.exibirDetalhes();
        java.lang.String str31 = contaBancaria20.exibirDetalhes();
        contaBancaria20.depositar((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str21, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: hi!, Saldo: R$ 84.0" + "'", str30, "Titular: hi!, Saldo: R$ 84.0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: hi!, Saldo: R$ 84.0" + "'", str31, "Titular: hi!, Saldo: R$ 84.0");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria3.depositar(1.0d);
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 116.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("");
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria10);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0", 32.0d);
        banco0.adicionarConta(contaBancaria11);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria15 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 11.0");
        com.example.ContaBancaria contaBancaria17 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 30.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria15);
        org.junit.Assert.assertNull(contaBancaria17);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        double double3 = contaBancaria2.consultarSaldo();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        double double7 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str4, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 97.0", (double) 100.0f);
        contaBancaria2.depositar((double) 10.0f);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 110.0" + "'", str5, "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 110.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 110.0" + "'", str6, "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 110.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 110.0" + "'", str7, "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 110.0");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        banco0.listarContas();
        banco0.listarContas();
        java.lang.Class<?> wildcardClass34 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", (double) 0L);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        boolean boolean27 = contaBancaria21.sacar((double) (byte) 1);
        boolean boolean29 = contaBancaria21.sacar((double) (byte) -1);
        java.lang.String str30 = contaBancaria21.exibirDetalhes();
        double double31 = contaBancaria21.consultarSaldo();
        boolean boolean33 = contaBancaria21.sacar((double) (-1.0f));
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str30, "Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        java.lang.String str68 = contaBancaria55.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria26);
        org.junit.Assert.assertNull(contaBancaria52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str60, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str68, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 1.0", 84.0d);
        banco0.adicionarConta(contaBancaria22);
        org.junit.Assert.assertNull(contaBancaria19);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        com.example.Banco banco46 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria49 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco46.adicionarConta(contaBancaria49);
        banco46.listarContas();
        banco46.listarContas();
        com.example.ContaBancaria contaBancaria55 = new com.example.ContaBancaria("", 10.0d);
        banco46.adicionarConta(contaBancaria55);
        com.example.ContaBancaria contaBancaria59 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria59.depositar((double) (byte) -1);
        banco46.adicionarConta(contaBancaria59);
        com.example.ContaBancaria contaBancaria64 = banco46.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria66 = banco46.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria69 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str70 = contaBancaria69.exibirDetalhes();
        banco46.adicionarConta(contaBancaria69);
        java.lang.String str72 = contaBancaria69.exibirDetalhes();
        contaBancaria69.depositar((double) (byte) 0);
        boolean boolean76 = contaBancaria69.sacar((double) 'a');
        banco0.adicionarConta(contaBancaria69);
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(contaBancaria64);
        org.junit.Assert.assertNull(contaBancaria66);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str70, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str72, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 100L);
        double double3 = contaBancaria2.consultarSaldo();
        double double4 = contaBancaria2.consultarSaldo();
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.Class<?> wildcardClass6 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str62, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(contaBancaria74);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        com.example.ContaBancaria contaBancaria71 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 194.0");
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertNull(contaBancaria71);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        double double33 = contaBancaria28.consultarSaldo();
        double double34 = contaBancaria28.consultarSaldo();
        java.lang.String str35 = contaBancaria28.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 52.0d + "'", double33 == 52.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 52.0d + "'", double34 == 52.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str35, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean4 = contaBancaria2.sacar((double) 100);
        boolean boolean6 = contaBancaria2.sacar((double) 'a');
        contaBancaria2.depositar((double) (short) 100);
        contaBancaria2.depositar(187.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 32.0");
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        double double27 = contaBancaria22.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str26, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria5 = banco0.buscarContaPorTitular("");
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco8 = new com.example.Banco();
        banco8.listarContas();
        com.example.ContaBancaria contaBancaria11 = banco8.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco12 = new com.example.Banco();
        com.example.Banco banco13 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco13.adicionarConta(contaBancaria16);
        banco12.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco12.adicionarConta(contaBancaria21);
        com.example.Banco banco23 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco23.adicionarConta(contaBancaria26);
        banco23.listarContas();
        banco23.listarContas();
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("", 10.0d);
        banco23.adicionarConta(contaBancaria32);
        banco12.adicionarConta(contaBancaria32);
        banco8.adicionarConta(contaBancaria32);
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", 0.0d);
        banco8.adicionarConta(contaBancaria38);
        com.example.Banco banco40 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco40.adicionarConta(contaBancaria43);
        banco40.listarContas();
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco40.adicionarConta(contaBancaria48);
        com.example.Banco banco50 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria53 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco50.adicionarConta(contaBancaria53);
        banco50.listarContas();
        banco50.listarContas();
        com.example.ContaBancaria contaBancaria59 = new com.example.ContaBancaria("", 10.0d);
        banco50.adicionarConta(contaBancaria59);
        com.example.ContaBancaria contaBancaria63 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria63.depositar((double) (byte) -1);
        banco50.adicionarConta(contaBancaria63);
        com.example.ContaBancaria contaBancaria68 = banco50.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str69 = contaBancaria68.exibirDetalhes();
        boolean boolean71 = contaBancaria68.sacar((double) (byte) -1);
        banco40.adicionarConta(contaBancaria68);
        banco8.adicionarConta(contaBancaria68);
        contaBancaria68.depositar(0.0d);
        contaBancaria68.depositar(10.0d);
        banco0.adicionarConta(contaBancaria68);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria81 = banco0.buscarContaPorTitular("");
        java.lang.Class<?> wildcardClass82 = contaBancaria81.getClass();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria5);
        org.junit.Assert.assertNull(contaBancaria11);
        org.junit.Assert.assertNotNull(contaBancaria68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str69, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(contaBancaria81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 110.0", (double) (short) -1);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        boolean boolean8 = contaBancaria4.sacar((double) (byte) 1);
        contaBancaria4.depositar((double) 1.0f);
        contaBancaria4.depositar(96.0d);
        contaBancaria4.depositar((double) 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        java.lang.String str50 = contaBancaria43.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(contaBancaria40);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 52.0d + "'", double46 == 52.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str50, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        boolean boolean43 = contaBancaria32.sacar((double) (byte) 1);
        boolean boolean45 = contaBancaria32.sacar((double) 100.0f);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str37, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        com.example.Banco banco62 = new com.example.Banco();
        com.example.Banco banco63 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria66 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco63.adicionarConta(contaBancaria66);
        banco62.adicionarConta(contaBancaria66);
        boolean boolean70 = contaBancaria66.sacar((double) (byte) 1);
        banco0.adicionarConta(contaBancaria66);
        contaBancaria66.depositar(0.0d);
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(contaBancaria51);
        org.junit.Assert.assertNull(contaBancaria53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str57, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        banco0.adicionarConta(contaBancaria58);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(contaBancaria30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(contaBancaria34);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 32.0d + "'", double60 == 32.0d);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", (double) 0L);
        contaBancaria2.depositar((double) (short) 10);
        boolean boolean6 = contaBancaria2.sacar(96.0d);
        contaBancaria2.depositar((double) (byte) -1);
        boolean boolean10 = contaBancaria2.sacar(152.0d);
        java.lang.Class<?> wildcardClass11 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0", 0.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0, Saldo: R$ 0.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0, Saldo: R$ 0.0");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        java.lang.Class<?> wildcardClass45 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria34);
        org.junit.Assert.assertNull(contaBancaria36);
        org.junit.Assert.assertNull(contaBancaria38);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria40 = banco0.buscarContaPorTitular("");
        java.lang.Class<?> wildcardClass41 = contaBancaria40.getClass();
        org.junit.Assert.assertNotNull(contaBancaria40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 62.0");
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 84.0", (double) 'a');
        java.lang.String str17 = contaBancaria16.exibirDetalhes();
        double double18 = contaBancaria16.consultarSaldo();
        banco0.adicionarConta(contaBancaria16);
        java.lang.Class<?> wildcardClass20 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
        org.junit.Assert.assertNull(contaBancaria13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ 97.0" + "'", str17, "Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        contaBancaria49.depositar(19.0d);
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str53, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str54, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0", 9.0d);
        banco0.adicionarConta(contaBancaria21);
        java.lang.String str23 = contaBancaria21.exibirDetalhes();
        java.lang.String str24 = contaBancaria21.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 9.0" + "'", str23, "Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 9.0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 9.0" + "'", str24, "Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 9.0");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("hi!", 152.0d);
        banco0.adicionarConta(contaBancaria32);
        double double34 = contaBancaria32.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 152.0d + "'", double34 == 152.0d);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", 0.0d);
        boolean boolean4 = contaBancaria2.sacar((double) (byte) 100);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        boolean boolean7 = contaBancaria2.sacar((double) (short) 100);
        java.lang.String str8 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass9 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ 0.0" + "'", str5, "Titular: hi!, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Titular: hi!, Saldo: R$ 0.0" + "'", str8, "Titular: hi!, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        contaBancaria28.depositar(9.0d);
        java.lang.String str36 = contaBancaria28.exibirDetalhes();
        contaBancaria28.depositar((double) 100.0f);
        contaBancaria28.depositar((double) 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Titular: hi!, Saldo: R$ 19.0" + "'", str36, "Titular: hi!, Saldo: R$ 19.0");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        contaBancaria23.depositar((double) ' ');
        double double28 = contaBancaria23.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 32.0d + "'", double28 == 32.0d);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 100.0", (double) 0);
        boolean boolean11 = contaBancaria9.sacar(88.0d);
        banco0.adicionarConta(contaBancaria9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        boolean boolean8 = contaBancaria2.sacar((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria48 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 11.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria48);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 19.0");
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 20.0", (double) (byte) -1);
        banco0.adicionarConta(contaBancaria23);
        contaBancaria23.depositar(32.0d);
        org.junit.Assert.assertNull(contaBancaria16);
        org.junit.Assert.assertNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 97.0", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria30);
        com.example.ContaBancaria contaBancaria33 = banco0.buscarContaPorTitular("Titular: Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0, Saldo: R$ 1.0, Saldo: R$ 182.0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNull(contaBancaria33);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        com.example.ContaBancaria contaBancaria35 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 45.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNull(contaBancaria35);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 96.0d);
        contaBancaria2.depositar(149.0d);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        boolean boolean31 = contaBancaria23.sacar(150.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 32.0" + "'", str29, "Titular: hi!, Saldo: R$ 32.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", (double) 0L);
        contaBancaria2.depositar((double) (short) 10);
        boolean boolean6 = contaBancaria2.sacar(96.0d);
        contaBancaria2.depositar((double) (byte) -1);
        double double9 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria16);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", 1.0d);
        contaBancaria2.depositar(87.0d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        double double31 = contaBancaria24.consultarSaldo();
        double double32 = contaBancaria24.consultarSaldo();
        double double33 = contaBancaria24.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 53.0d + "'", double31 == 53.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 53.0d + "'", double32 == 53.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 53.0d + "'", double33 == 53.0d);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria11);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        contaBancaria22.depositar(45.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        java.lang.String str28 = contaBancaria23.exibirDetalhes();
        boolean boolean30 = contaBancaria23.sacar(47.0d);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 52.0" + "'", str28, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria35.depositar((double) (-1));
        contaBancaria35.depositar(10.0d);
        banco0.adicionarConta(contaBancaria35);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(contaBancaria30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria8);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        com.example.ContaBancaria contaBancaria51 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 52.0d + "'", double48 == 52.0d);
        org.junit.Assert.assertNull(contaBancaria51);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        java.lang.String str8 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(1.0d);
        double double11 = contaBancaria2.consultarSaldo();
        boolean boolean13 = contaBancaria2.sacar(104.0d);
        java.lang.String str14 = contaBancaria2.exibirDetalhes();
        java.lang.String str15 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str8, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 53.0d + "'", double11 == 53.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Titular: hi!, Saldo: R$ 53.0" + "'", str14, "Titular: hi!, Saldo: R$ 53.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 53.0" + "'", str15, "Titular: hi!, Saldo: R$ 53.0");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        boolean boolean40 = contaBancaria36.sacar(62.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        java.lang.Class<?> wildcardClass30 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (double) (byte) -1);
        contaBancaria2.depositar(88.0d);
        double double5 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 87.0d + "'", double5 == 87.0d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        boolean boolean25 = contaBancaria17.sacar((double) 1.0f);
        double double26 = contaBancaria17.consultarSaldo();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.0d + "'", double26 == 8.0d);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        com.example.ContaBancaria contaBancaria62 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertNull(contaBancaria60);
        org.junit.Assert.assertNull(contaBancaria62);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 84.0", 8.0d);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        double double11 = contaBancaria9.consultarSaldo();
        double double12 = contaBancaria9.consultarSaldo();
        double double13 = contaBancaria9.consultarSaldo();
        java.lang.Class<?> wildcardClass14 = contaBancaria9.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        com.example.Banco banco47 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria50 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria50.depositar(1.0d);
        banco47.adicionarConta(contaBancaria50);
        banco0.adicionarConta(contaBancaria50);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(contaBancaria30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 52.0d + "'", double38 == 52.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str39, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str40, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Titular: hi!, Saldo: R$ 21.0" + "'", str45, "Titular: hi!, Saldo: R$ 21.0");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        com.example.ContaBancaria contaBancaria45 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria47 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 17.0");
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertNotNull(contaBancaria45);
        org.junit.Assert.assertNull(contaBancaria47);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 1.0", (double) 'a');
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        com.example.Banco banco12 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria15 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco12.adicionarConta(contaBancaria15);
        banco12.listarContas();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco12.adicionarConta(contaBancaria20);
        banco12.listarContas();
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco12.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco12.adicionarConta(contaBancaria29);
        contaBancaria29.depositar(0.0d);
        banco0.adicionarConta(contaBancaria29);
        java.lang.String str34 = contaBancaria29.exibirDetalhes();
        boolean boolean36 = contaBancaria29.sacar(104.0d);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria11);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str34, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        double double19 = contaBancaria13.consultarSaldo();
        contaBancaria13.depositar(0.0d);
        double double22 = contaBancaria13.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 9.0d + "'", double19 == 9.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 9.0d + "'", double22 == 9.0d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria12);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        boolean boolean20 = contaBancaria16.sacar((-1.0d));
        contaBancaria16.depositar(104.0d);
        boolean boolean24 = contaBancaria16.sacar(0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        com.example.Banco banco30 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco30.adicionarConta(contaBancaria33);
        banco30.listarContas();
        banco30.listarContas();
        com.example.ContaBancaria contaBancaria39 = new com.example.ContaBancaria("", 10.0d);
        banco30.adicionarConta(contaBancaria39);
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria43.depositar((double) (byte) -1);
        banco30.adicionarConta(contaBancaria43);
        com.example.ContaBancaria contaBancaria48 = banco30.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        double double49 = contaBancaria48.consultarSaldo();
        banco0.adicionarConta(contaBancaria48);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 52.0d + "'", double49 == 52.0d);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 0.0", 152.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 0.0, Saldo: R$ 152.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 0.0, Saldo: R$ 152.0");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria35);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 194.0", (double) (-1.0f));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) (byte) -1);
        contaBancaria2.depositar(197.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0", 32.0d);
        banco0.adicionarConta(contaBancaria11);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria15 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 11.0");
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria15);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        banco0.adicionarConta(contaBancaria4);
        java.lang.String str6 = contaBancaria4.exibirDetalhes();
        boolean boolean8 = contaBancaria4.sacar((double) 10.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str6, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        java.lang.String str22 = contaBancaria18.exibirDetalhes();
        double double23 = contaBancaria18.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str22, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 1.0");
        org.junit.Assert.assertNull(contaBancaria8);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        java.lang.Class<?> wildcardClass25 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        com.example.Banco banco49 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria52 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco49.adicionarConta(contaBancaria52);
        banco49.listarContas();
        com.example.ContaBancaria contaBancaria57 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco49.adicionarConta(contaBancaria57);
        banco49.listarContas();
        com.example.ContaBancaria contaBancaria62 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco49.adicionarConta(contaBancaria62);
        double double64 = contaBancaria62.consultarSaldo();
        double double65 = contaBancaria62.consultarSaldo();
        java.lang.String str66 = contaBancaria62.exibirDetalhes();
        boolean boolean68 = contaBancaria62.sacar((double) (short) 10);
        banco0.adicionarConta(contaBancaria62);
        com.example.ContaBancaria contaBancaria71 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(contaBancaria48);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str66, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(contaBancaria71);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        com.example.ContaBancaria contaBancaria41 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0");
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(contaBancaria41);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        contaBancaria13.depositar((double) (short) 100);
        java.lang.String str18 = contaBancaria13.exibirDetalhes();
        double double19 = contaBancaria13.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Titular: hi!, Saldo: R$ 110.0" + "'", str18, "Titular: hi!, Saldo: R$ 110.0");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 110.0d + "'", double19 == 110.0d);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        double double7 = contaBancaria2.consultarSaldo();
        double double8 = contaBancaria2.consultarSaldo();
        java.lang.String str9 = contaBancaria2.exibirDetalhes();
        boolean boolean11 = contaBancaria2.sacar((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str9, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0, Saldo: R$ 32.0", 184.0d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 11.0", 88.0d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        contaBancaria21.depositar(152.0d);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        double double26 = contaBancaria21.consultarSaldo();
        contaBancaria21.depositar(100.0d);
        boolean boolean30 = contaBancaria21.sacar(182.0d);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        com.example.ContaBancaria contaBancaria51 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) (byte) 100);
        double double52 = contaBancaria51.consultarSaldo();
        double double53 = contaBancaria51.consultarSaldo();
        banco0.adicionarConta(contaBancaria51);
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertNull(contaBancaria41);
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria5 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria7 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
        com.example.ContaBancaria contaBancaria9 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 116.0");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria5);
        org.junit.Assert.assertNull(contaBancaria7);
        org.junit.Assert.assertNull(contaBancaria9);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        com.example.ContaBancaria contaBancaria33 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        com.example.Banco banco34 = new com.example.Banco();
        banco34.listarContas();
        com.example.ContaBancaria contaBancaria37 = banco34.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco38 = new com.example.Banco();
        com.example.Banco banco39 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria42 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco39.adicionarConta(contaBancaria42);
        banco38.adicionarConta(contaBancaria42);
        com.example.ContaBancaria contaBancaria47 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco38.adicionarConta(contaBancaria47);
        com.example.Banco banco49 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria52 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco49.adicionarConta(contaBancaria52);
        banco49.listarContas();
        banco49.listarContas();
        com.example.ContaBancaria contaBancaria58 = new com.example.ContaBancaria("", 10.0d);
        banco49.adicionarConta(contaBancaria58);
        banco38.adicionarConta(contaBancaria58);
        banco34.adicionarConta(contaBancaria58);
        com.example.ContaBancaria contaBancaria64 = new com.example.ContaBancaria("hi!", 0.0d);
        banco34.adicionarConta(contaBancaria64);
        com.example.ContaBancaria contaBancaria67 = banco34.buscarContaPorTitular("hi!");
        banco34.listarContas();
        com.example.ContaBancaria contaBancaria71 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 107.0", (double) 100.0f);
        banco34.adicionarConta(contaBancaria71);
        com.example.ContaBancaria contaBancaria74 = banco34.buscarContaPorTitular("Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria77 = new com.example.ContaBancaria("Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0", 10.0d);
        banco34.adicionarConta(contaBancaria77);
        banco0.adicionarConta(contaBancaria77);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertNull(contaBancaria37);
        org.junit.Assert.assertNotNull(contaBancaria67);
        org.junit.Assert.assertNull(contaBancaria74);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0", (double) (byte) 1);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) (byte) 10);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        com.example.ContaBancaria contaBancaria37 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria37.depositar((double) (-1));
        boolean boolean41 = contaBancaria37.sacar((double) (-1.0f));
        java.lang.String str42 = contaBancaria37.exibirDetalhes();
        banco0.adicionarConta(contaBancaria37);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(contaBancaria30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(contaBancaria34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str42, "Titular: hi!, Saldo: R$ 97.0");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 32.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
        org.junit.Assert.assertNull(contaBancaria12);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria15 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria17 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertNull(contaBancaria15);
        org.junit.Assert.assertNull(contaBancaria17);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        boolean boolean31 = contaBancaria24.sacar(62.0d);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(0.0d);
        double double6 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar(187.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        double double26 = contaBancaria21.consultarSaldo();
        java.lang.String str27 = contaBancaria21.exibirDetalhes();
        java.lang.Class<?> wildcardClass28 = contaBancaria21.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str27, "Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        java.lang.Class<?> wildcardClass17 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        com.example.ContaBancaria contaBancaria52 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str41, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str46, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str48, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str49, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria52);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        com.example.ContaBancaria contaBancaria29 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria29);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str10 = contaBancaria9.exibirDetalhes();
        contaBancaria9.depositar(0.0d);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria15 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
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
        com.example.ContaBancaria contaBancaria37 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean39 = contaBancaria37.sacar((double) 100);
        double double40 = contaBancaria37.consultarSaldo();
        banco16.adicionarConta(contaBancaria37);
        boolean boolean43 = contaBancaria37.sacar((double) (byte) 1);
        boolean boolean45 = contaBancaria37.sacar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria37);
        double double47 = contaBancaria37.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria15);
        org.junit.Assert.assertNotNull(contaBancaria34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        com.example.ContaBancaria contaBancaria21 = banco0.buscarContaPorTitular("hi!");
        contaBancaria21.depositar((double) 100L);
        contaBancaria21.depositar(53.0d);
        org.junit.Assert.assertNull(contaBancaria19);
        org.junit.Assert.assertNotNull(contaBancaria21);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria21);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        banco0.adicionarConta(contaBancaria4);
        com.example.Banco banco6 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco6.adicionarConta(contaBancaria9);
        banco6.listarContas();
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco6.adicionarConta(contaBancaria14);
        contaBancaria14.depositar((-1.0d));
        boolean boolean19 = contaBancaria14.sacar(100.0d);
        double double20 = contaBancaria14.consultarSaldo();
        boolean boolean22 = contaBancaria14.sacar(0.0d);
        banco0.adicionarConta(contaBancaria14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", (double) (short) 1);
        contaBancaria32.depositar((double) 0);
        banco0.adicionarConta(contaBancaria32);
        org.junit.Assert.assertNull(contaBancaria3);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 32.0", (double) (short) 1);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0", 104.0d);
        banco0.adicionarConta(contaBancaria11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria8);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        com.example.ContaBancaria contaBancaria55 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 53.0");
        com.example.ContaBancaria contaBancaria57 = banco0.buscarContaPorTitular("");
        boolean boolean59 = contaBancaria57.sacar(88.0d);
        org.junit.Assert.assertNotNull(contaBancaria41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(contaBancaria51);
        org.junit.Assert.assertNull(contaBancaria53);
        org.junit.Assert.assertNull(contaBancaria55);
        org.junit.Assert.assertNotNull(contaBancaria57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        com.example.Banco banco12 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria15 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco12.adicionarConta(contaBancaria15);
        banco12.listarContas();
        com.example.ContaBancaria contaBancaria20 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco12.adicionarConta(contaBancaria20);
        banco12.listarContas();
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco12.adicionarConta(contaBancaria25);
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco12.adicionarConta(contaBancaria29);
        contaBancaria29.depositar(0.0d);
        banco0.adicionarConta(contaBancaria29);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria36 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 110.0");
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria11);
        org.junit.Assert.assertNull(contaBancaria36);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0");
        com.example.ContaBancaria contaBancaria22 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        contaBancaria25.depositar((double) 10L);
        contaBancaria25.depositar(96.0d);
        banco0.adicionarConta(contaBancaria25);
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertNotNull(contaBancaria22);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        com.example.Banco banco35 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean40 = contaBancaria38.sacar((double) (-1L));
        banco35.adicionarConta(contaBancaria38);
        com.example.ContaBancaria contaBancaria44 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str45 = contaBancaria44.exibirDetalhes();
        contaBancaria44.depositar(0.0d);
        banco35.adicionarConta(contaBancaria44);
        com.example.ContaBancaria contaBancaria50 = banco35.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.Banco banco51 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco51.adicionarConta(contaBancaria54);
        banco51.listarContas();
        banco51.listarContas();
        com.example.ContaBancaria contaBancaria60 = new com.example.ContaBancaria("", 10.0d);
        banco51.adicionarConta(contaBancaria60);
        com.example.ContaBancaria contaBancaria64 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria64.depositar((double) (byte) -1);
        banco51.adicionarConta(contaBancaria64);
        com.example.ContaBancaria contaBancaria69 = banco51.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria72 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean74 = contaBancaria72.sacar((double) 100);
        double double75 = contaBancaria72.consultarSaldo();
        banco51.adicionarConta(contaBancaria72);
        boolean boolean78 = contaBancaria72.sacar((double) (byte) 1);
        boolean boolean80 = contaBancaria72.sacar((double) (byte) -1);
        banco35.adicionarConta(contaBancaria72);
        banco0.adicionarConta(contaBancaria72);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str28, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str45, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria50);
        org.junit.Assert.assertNotNull(contaBancaria69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0, Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar((double) 1);
        boolean boolean7 = contaBancaria2.sacar((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str3, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 1.0", 35.0d);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (-1L));
        contaBancaria2.depositar((-1.0d));
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        double double8 = contaBancaria2.consultarSaldo();
        boolean boolean10 = contaBancaria2.sacar((double) 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str7, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        com.example.ContaBancaria contaBancaria32 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 182.0", 152.0d);
        double double36 = contaBancaria35.consultarSaldo();
        banco0.adicionarConta(contaBancaria35);
        org.junit.Assert.assertNotNull(contaBancaria24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(contaBancaria32);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 152.0d + "'", double36 == 152.0d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        contaBancaria12.depositar(100.0d);
        double double21 = contaBancaria12.consultarSaldo();
        java.lang.String str22 = contaBancaria12.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 147.0d + "'", double21 == 147.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Titular: hi!, Saldo: R$ 147.0" + "'", str22, "Titular: hi!, Saldo: R$ 147.0");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        com.example.ContaBancaria contaBancaria34 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 30.0");
        org.junit.Assert.assertNull(contaBancaria19);
        org.junit.Assert.assertNull(contaBancaria34);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 10.0", 32.0d);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (byte) 0);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        double double6 = contaBancaria2.consultarSaldo();
        boolean boolean8 = contaBancaria2.sacar(162.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str5, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria6 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria6);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        banco0.listarContas();
        banco0.listarContas();
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
        boolean boolean45 = contaBancaria41.sacar((-1.0d));
        boolean boolean47 = contaBancaria41.sacar((double) (byte) 10);
        java.lang.String str48 = contaBancaria41.exibirDetalhes();
        banco0.adicionarConta(contaBancaria41);
        com.example.ContaBancaria contaBancaria51 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 194.0");
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str48, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertNull(contaBancaria51);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        com.example.ContaBancaria contaBancaria51 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str52 = contaBancaria51.exibirDetalhes();
        boolean boolean54 = contaBancaria51.sacar((double) 1);
        banco0.adicionarConta(contaBancaria51);
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertNull(contaBancaria41);
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str52, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 9.0");
        org.junit.Assert.assertNull(contaBancaria8);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        com.example.Banco banco18 = new com.example.Banco();
        banco18.listarContas();
        banco18.listarContas();
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double24 = contaBancaria23.consultarSaldo();
        banco18.adicionarConta(contaBancaria23);
        com.example.Banco banco26 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco26.adicionarConta(contaBancaria29);
        banco26.listarContas();
        banco26.listarContas();
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("", 10.0d);
        banco26.adicionarConta(contaBancaria35);
        com.example.ContaBancaria contaBancaria39 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria39.depositar((double) (byte) -1);
        banco26.adicionarConta(contaBancaria39);
        com.example.Banco banco43 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria46 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco43.adicionarConta(contaBancaria46);
        banco43.listarContas();
        banco43.listarContas();
        com.example.Banco banco50 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria53 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco50.adicionarConta(contaBancaria53);
        banco50.listarContas();
        banco50.listarContas();
        com.example.ContaBancaria contaBancaria59 = new com.example.ContaBancaria("", 10.0d);
        banco50.adicionarConta(contaBancaria59);
        banco43.adicionarConta(contaBancaria59);
        banco26.adicionarConta(contaBancaria59);
        banco18.adicionarConta(contaBancaria59);
        com.example.ContaBancaria contaBancaria66 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria66.depositar((double) (-1));
        contaBancaria66.depositar(10.0d);
        double double71 = contaBancaria66.consultarSaldo();
        banco18.adicionarConta(contaBancaria66);
        java.lang.String str73 = contaBancaria66.exibirDetalhes();
        boolean boolean75 = contaBancaria66.sacar((double) 'a');
        banco0.adicionarConta(contaBancaria66);
        double double77 = contaBancaria66.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertNull(contaBancaria17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 107.0d + "'", double71 == 107.0d);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Titular: hi!, Saldo: R$ 107.0" + "'", str73, "Titular: hi!, Saldo: R$ 107.0");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        double double24 = contaBancaria13.consultarSaldo();
        contaBancaria13.depositar(117.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str17, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str18, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        contaBancaria2.depositar((double) 10L);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        double double6 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ 20.0" + "'", str5, "Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        com.example.ContaBancaria contaBancaria67 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria69 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 47.0");
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str62, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(contaBancaria67);
        org.junit.Assert.assertNull(contaBancaria69);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 116.0", 52.0d);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        com.example.ContaBancaria contaBancaria7 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria7);
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria4);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria5 = banco0.buscarContaPorTitular("");
        banco0.listarContas();
        banco0.listarContas();
        com.example.Banco banco8 = new com.example.Banco();
        banco8.listarContas();
        com.example.ContaBancaria contaBancaria11 = banco8.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco12 = new com.example.Banco();
        com.example.Banco banco13 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria16 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco13.adicionarConta(contaBancaria16);
        banco12.adicionarConta(contaBancaria16);
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco12.adicionarConta(contaBancaria21);
        com.example.Banco banco23 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco23.adicionarConta(contaBancaria26);
        banco23.listarContas();
        banco23.listarContas();
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("", 10.0d);
        banco23.adicionarConta(contaBancaria32);
        banco12.adicionarConta(contaBancaria32);
        banco8.adicionarConta(contaBancaria32);
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", 0.0d);
        banco8.adicionarConta(contaBancaria38);
        com.example.Banco banco40 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco40.adicionarConta(contaBancaria43);
        banco40.listarContas();
        com.example.ContaBancaria contaBancaria48 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco40.adicionarConta(contaBancaria48);
        com.example.Banco banco50 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria53 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco50.adicionarConta(contaBancaria53);
        banco50.listarContas();
        banco50.listarContas();
        com.example.ContaBancaria contaBancaria59 = new com.example.ContaBancaria("", 10.0d);
        banco50.adicionarConta(contaBancaria59);
        com.example.ContaBancaria contaBancaria63 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria63.depositar((double) (byte) -1);
        banco50.adicionarConta(contaBancaria63);
        com.example.ContaBancaria contaBancaria68 = banco50.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str69 = contaBancaria68.exibirDetalhes();
        boolean boolean71 = contaBancaria68.sacar((double) (byte) -1);
        banco40.adicionarConta(contaBancaria68);
        banco8.adicionarConta(contaBancaria68);
        contaBancaria68.depositar(0.0d);
        contaBancaria68.depositar(10.0d);
        banco0.adicionarConta(contaBancaria68);
        java.lang.String str79 = contaBancaria68.exibirDetalhes();
        boolean boolean81 = contaBancaria68.sacar(32.0d);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria5);
        org.junit.Assert.assertNull(contaBancaria11);
        org.junit.Assert.assertNotNull(contaBancaria68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str69, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Titular: hi!, Saldo: R$ 62.0" + "'", str79, "Titular: hi!, Saldo: R$ 62.0");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", 51.0d);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        java.lang.String str26 = contaBancaria21.exibirDetalhes();
        contaBancaria21.depositar(45.0d);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str26, "Titular: hi!, Saldo: R$ -1.0");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 1.0", 107.0d);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 214.0", 45.0d);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 45.0d + "'", double3 == 45.0d);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str37, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 11.0", 184.0d);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        boolean boolean23 = contaBancaria13.sacar((double) (-1));
        java.lang.String str24 = contaBancaria13.exibirDetalhes();
        boolean boolean26 = contaBancaria13.sacar(19.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str24, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        com.example.ContaBancaria contaBancaria31 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        com.example.ContaBancaria contaBancaria33 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 87.0, Saldo: R$ 10.0");
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str21, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria31);
        org.junit.Assert.assertNull(contaBancaria33);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(0.0d);
        contaBancaria2.depositar((double) 0L);
        boolean boolean9 = contaBancaria2.sacar((double) 100L);
        contaBancaria2.depositar((double) (-1L));
        contaBancaria2.depositar(100.0d);
        java.lang.String str14 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Titular: hi!, Saldo: R$ 152.0" + "'", str14, "Titular: hi!, Saldo: R$ 152.0");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0", (double) 1.0f);
        boolean boolean4 = contaBancaria2.sacar(184.0d);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass6 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0, Saldo: R$ 1.0" + "'", str5, "Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0, Saldo: R$ 1.0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("", 0.0d);
        java.lang.String str5 = contaBancaria4.exibirDetalhes();
        double double6 = contaBancaria4.consultarSaldo();
        banco0.adicionarConta(contaBancaria4);
        boolean boolean9 = contaBancaria4.sacar((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str5, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) 10.0f);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (-1L));
        contaBancaria2.depositar((-1.0d));
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        double double8 = contaBancaria2.consultarSaldo();
        boolean boolean10 = contaBancaria2.sacar((double) (short) -1);
        contaBancaria2.depositar(31.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str7, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        java.lang.String str22 = contaBancaria13.exibirDetalhes();
        boolean boolean24 = contaBancaria13.sacar(193.0d);
        boolean boolean26 = contaBancaria13.sacar((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str17, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Titular: hi!, Saldo: R$ 45.0" + "'", str22, "Titular: hi!, Saldo: R$ 45.0");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        contaBancaria3.depositar((double) 100);
        contaBancaria3.depositar((double) '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria15 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean17 = contaBancaria15.sacar((double) (-1L));
        contaBancaria15.depositar((-1.0d));
        java.lang.String str20 = contaBancaria15.exibirDetalhes();
        double double21 = contaBancaria15.consultarSaldo();
        banco0.adicionarConta(contaBancaria15);
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria25.depositar((double) (-1));
        boolean boolean29 = contaBancaria25.sacar((double) (-1.0f));
        java.lang.String str30 = contaBancaria25.exibirDetalhes();
        contaBancaria25.depositar(53.0d);
        double double33 = contaBancaria25.consultarSaldo();
        banco0.adicionarConta(contaBancaria25);
        double double35 = contaBancaria25.consultarSaldo();
        double double36 = contaBancaria25.consultarSaldo();
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str20, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str30, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 150.0d + "'", double33 == 150.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 150.0d + "'", double35 == 150.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 150.0d + "'", double36 == 150.0d);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 0.0", (double) 100L);
        double double3 = contaBancaria2.consultarSaldo();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 0.0, Saldo: R$ 100.0" + "'", str4, "Titular: Titular: hi!, Saldo: R$ 0.0, Saldo: R$ 100.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 0.0, Saldo: R$ 100.0" + "'", str5, "Titular: Titular: hi!, Saldo: R$ 0.0, Saldo: R$ 100.0");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.Banco banco9 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria12 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean14 = contaBancaria12.sacar((double) (-1L));
        banco9.adicionarConta(contaBancaria12);
        com.example.ContaBancaria contaBancaria18 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str19 = contaBancaria18.exibirDetalhes();
        contaBancaria18.depositar(0.0d);
        banco9.adicionarConta(contaBancaria18);
        contaBancaria18.depositar((double) (-1));
        contaBancaria18.depositar((double) ' ');
        contaBancaria18.depositar((double) 1);
        contaBancaria18.depositar(97.0d);
        double double31 = contaBancaria18.consultarSaldo();
        banco0.adicionarConta(contaBancaria18);
        com.example.Banco banco33 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco33.adicionarConta(contaBancaria36);
        banco33.listarContas();
        com.example.ContaBancaria contaBancaria41 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco33.adicionarConta(contaBancaria41);
        banco33.listarContas();
        com.example.ContaBancaria contaBancaria46 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco33.adicionarConta(contaBancaria46);
        boolean boolean49 = contaBancaria46.sacar((-1.0d));
        boolean boolean51 = contaBancaria46.sacar((double) 1.0f);
        double double52 = contaBancaria46.consultarSaldo();
        banco0.adicionarConta(contaBancaria46);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 182.0d + "'", double31 == 182.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 9.0d + "'", double52 == 9.0d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0", 10.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 10.0" + "'", str3, "Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 10.0" + "'", str4, "Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 10.0");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0", (double) (short) 1);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", 100.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar(20.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0", (double) (byte) -1);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0, Saldo: R$ -1.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0, Saldo: R$ -1.0");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) ' ');
        contaBancaria2.depositar((double) 100);
        contaBancaria2.depositar((double) 'a');
        contaBancaria2.depositar((double) 0);
        java.lang.String str9 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Titular: , Saldo: R$ 229.0" + "'", str9, "Titular: , Saldo: R$ 229.0");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 20.0", (double) ' ');
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        boolean boolean22 = contaBancaria13.sacar((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str20, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 1.0");
        org.junit.Assert.assertNull(contaBancaria18);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        boolean boolean87 = contaBancaria79.sacar(0.0d);
        contaBancaria79.depositar((double) (byte) 100);
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str62, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(contaBancaria74);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria3.depositar(1.0d);
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean11 = contaBancaria9.sacar((double) (-1L));
        contaBancaria9.depositar((-1.0d));
        java.lang.String str14 = contaBancaria9.exibirDetalhes();
        double double15 = contaBancaria9.consultarSaldo();
        boolean boolean17 = contaBancaria9.sacar((double) (short) -1);
        banco0.adicionarConta(contaBancaria9);
        double double19 = contaBancaria9.consultarSaldo();
        java.lang.String str20 = contaBancaria9.exibirDetalhes();
        contaBancaria9.depositar((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str14, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str20, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) (byte) 0);
        boolean boolean4 = contaBancaria2.sacar(88.0d);
        double double5 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        boolean boolean27 = contaBancaria23.sacar((double) (short) 100);
        boolean boolean29 = contaBancaria23.sacar(110.0d);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        com.example.ContaBancaria contaBancaria16 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertNull(contaBancaria16);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar((double) 100L);
        boolean boolean7 = contaBancaria2.sacar(182.0d);
        java.lang.String str8 = contaBancaria2.exibirDetalhes();
        java.lang.String str9 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str8, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str9, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0", (double) 'a');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(9.0d);
        java.lang.Class<?> wildcardClass6 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("");
        java.lang.String str11 = contaBancaria10.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str11, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 19.0, Saldo: R$ 100.0", (double) 1.0f);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        com.example.ContaBancaria contaBancaria54 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0, Saldo: R$ 10.0");
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
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) (byte) -1);
        boolean boolean11 = contaBancaria2.sacar(107.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        boolean boolean28 = contaBancaria24.sacar((double) 'a');
        contaBancaria24.depositar(187.0d);
        org.junit.Assert.assertNotNull(contaBancaria24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) ' ');
        boolean boolean11 = contaBancaria2.sacar((double) (-1));
        contaBancaria2.depositar(35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        com.example.ContaBancaria contaBancaria25 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        contaBancaria25.depositar((double) (-1.0f));
        boolean boolean29 = contaBancaria25.sacar((double) 1.0f);
        banco0.adicionarConta(contaBancaria25);
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        com.example.ContaBancaria contaBancaria32 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 107.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria35 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 117.0");
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(contaBancaria32);
        org.junit.Assert.assertNull(contaBancaria35);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        com.example.ContaBancaria contaBancaria40 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 19.0");
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria11);
        org.junit.Assert.assertNull(contaBancaria15);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(contaBancaria40);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(0.0d);
        double double6 = contaBancaria2.consultarSaldo();
        double double7 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar(162.0d);
        java.lang.String str10 = contaBancaria2.exibirDetalhes();
        java.lang.String str11 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 214.0" + "'", str10, "Titular: hi!, Saldo: R$ 214.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Titular: hi!, Saldo: R$ 214.0" + "'", str11, "Titular: hi!, Saldo: R$ 214.0");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        contaBancaria18.depositar(150.0d);
        java.lang.Class<?> wildcardClass27 = contaBancaria18.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str22, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
        contaBancaria2.depositar(10.0d);
        double double7 = contaBancaria2.consultarSaldo();
        double double8 = contaBancaria2.consultarSaldo();
        java.lang.String str9 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(29.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 107.0d + "'", double7 == 107.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 107.0d + "'", double8 == 107.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Titular: hi!, Saldo: R$ 107.0" + "'", str9, "Titular: hi!, Saldo: R$ 107.0");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 9.0", 10.0d);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        java.lang.String str28 = contaBancaria18.exibirDetalhes();
        java.lang.String str29 = contaBancaria18.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Titular: hi!, Saldo: R$ 84.0" + "'", str25, "Titular: hi!, Saldo: R$ 84.0");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 84.0d + "'", double26 == 84.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 84.0d + "'", double27 == 84.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Titular: hi!, Saldo: R$ 84.0" + "'", str28, "Titular: hi!, Saldo: R$ 84.0");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 84.0" + "'", str29, "Titular: hi!, Saldo: R$ 84.0");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ -1.0");
        com.example.ContaBancaria contaBancaria13 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria11);
        org.junit.Assert.assertNotNull(contaBancaria13);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0", (double) 1.0f);
        contaBancaria2.depositar((double) (byte) -1);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        com.example.ContaBancaria contaBancaria42 = new com.example.ContaBancaria("hi!", (double) '4');
        double double43 = contaBancaria42.consultarSaldo();
        java.lang.String str44 = contaBancaria42.exibirDetalhes();
        java.lang.String str45 = contaBancaria42.exibirDetalhes();
        java.lang.String str46 = contaBancaria42.exibirDetalhes();
        banco0.adicionarConta(contaBancaria42);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str32, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria38);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 52.0d + "'", double43 == 52.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str44, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str45, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str46, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) (byte) 10);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        double double4 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str3, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(contaBancaria51);
        org.junit.Assert.assertNull(contaBancaria53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str57, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 47.0", 45.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 47.0, Saldo: R$ 45.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 47.0, Saldo: R$ 45.0");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 162.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0" + "'", str4, "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0" + "'", str5, "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        java.lang.Class<?> wildcardClass24 = contaBancaria21.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0" + "'", str23, "Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria14 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria16 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 117.0");
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertNull(contaBancaria16);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        boolean boolean21 = contaBancaria13.sacar(0.0d);
        double double22 = contaBancaria13.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str17, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        banco0.listarContas();
        banco0.listarContas();
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
        boolean boolean45 = contaBancaria41.sacar((-1.0d));
        boolean boolean47 = contaBancaria41.sacar((double) (byte) 10);
        java.lang.String str48 = contaBancaria41.exibirDetalhes();
        banco0.adicionarConta(contaBancaria41);
        java.lang.String str50 = contaBancaria41.exibirDetalhes();
        java.lang.String str51 = contaBancaria41.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str48, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str50, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str51, "Titular: , Saldo: R$ 0.0");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0", (double) (-1.0f));
        boolean boolean4 = contaBancaria2.sacar((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar((double) 100L);
        boolean boolean7 = contaBancaria2.sacar(182.0d);
        contaBancaria2.depositar(88.0d);
        contaBancaria2.depositar(8.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        double double7 = contaBancaria4.consultarSaldo();
        java.lang.String str8 = contaBancaria4.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str8, "Titular: hi!, Saldo: R$ 97.0");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 47.0, Saldo: R$ 45.0", (double) (byte) 1);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 100.0, Saldo: R$ 0.0", 193.0d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        double double11 = contaBancaria9.consultarSaldo();
        boolean boolean13 = contaBancaria9.sacar((double) 'a');
        java.lang.Class<?> wildcardClass14 = contaBancaria9.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) (short) 100);
        boolean boolean4 = contaBancaria2.sacar(0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 87.0, Saldo: R$ 10.0", 110.0d);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        java.lang.String str34 = contaBancaria22.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str26, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str34, "Titular: hi!, Saldo: R$ 97.0");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 197.0", (double) (-1L));
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0, Saldo: R$ 32.0", (double) '4');
        boolean boolean4 = contaBancaria2.sacar((double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        com.example.ContaBancaria contaBancaria34 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNull(contaBancaria19);
        org.junit.Assert.assertNull(contaBancaria34);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        boolean boolean51 = contaBancaria47.sacar(0.0d);
        double double52 = contaBancaria47.consultarSaldo();
        boolean boolean54 = contaBancaria47.sacar((double) 10.0f);
        java.lang.String str55 = contaBancaria47.exibirDetalhes();
        banco0.adicionarConta(contaBancaria47);
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str55, "Titular: , Saldo: R$ 0.0");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 19.0, Saldo: R$ 100.0", (-1.0d));
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 19.0, Saldo: R$ 100.0, Saldo: R$ -1.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ 19.0, Saldo: R$ 100.0, Saldo: R$ -1.0");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertNull(contaBancaria21);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str28, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 52.0d + "'", double29 == 52.0d);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0", (double) (short) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (-1.0f));
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0, Saldo: R$ 10.0" + "'", str5, "Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0, Saldo: R$ 10.0");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        double double74 = contaBancaria73.consultarSaldo();
        java.lang.String str75 = contaBancaria73.exibirDetalhes();
        banco0.adicionarConta(contaBancaria73);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str5, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(contaBancaria73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 52.0d + "'", double74 == 52.0d);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str75, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        com.example.ContaBancaria contaBancaria22 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria26 = new com.example.ContaBancaria("hi!", 0.0d);
        boolean boolean28 = contaBancaria26.sacar((double) (byte) 100);
        java.lang.String str29 = contaBancaria26.exibirDetalhes();
        banco0.adicionarConta(contaBancaria26);
        org.junit.Assert.assertNull(contaBancaria22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 0.0" + "'", str29, "Titular: hi!, Saldo: R$ 0.0");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) ' ');
        contaBancaria2.depositar((double) 100);
        contaBancaria2.depositar((double) 'a');
        boolean boolean8 = contaBancaria2.sacar((double) ' ');
        java.lang.Class<?> wildcardClass9 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 32.0", 0.0d);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        com.example.Banco banco57 = new com.example.Banco();
        com.example.Banco banco58 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria61 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco58.adicionarConta(contaBancaria61);
        banco57.adicionarConta(contaBancaria61);
        com.example.ContaBancaria contaBancaria65 = banco57.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco57.listarContas();
        com.example.ContaBancaria contaBancaria68 = banco57.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        com.example.Banco banco69 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria72 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco69.adicionarConta(contaBancaria72);
        banco69.listarContas();
        com.example.ContaBancaria contaBancaria77 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco69.adicionarConta(contaBancaria77);
        banco69.listarContas();
        com.example.ContaBancaria contaBancaria82 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco69.adicionarConta(contaBancaria82);
        com.example.ContaBancaria contaBancaria86 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco69.adicionarConta(contaBancaria86);
        contaBancaria86.depositar(0.0d);
        banco57.adicionarConta(contaBancaria86);
        banco0.adicionarConta(contaBancaria86);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertNull(contaBancaria21);
        org.junit.Assert.assertNotNull(contaBancaria30);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str51, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(contaBancaria65);
        org.junit.Assert.assertNull(contaBancaria68);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria53 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 152.0");
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(contaBancaria53);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        contaBancaria13.depositar(96.0d);
        double double19 = contaBancaria13.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 148.0d + "'", double19 == 148.0d);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        contaBancaria9.depositar((double) (byte) 0);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str10, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str13, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        double double68 = contaBancaria55.consultarSaldo();
        contaBancaria55.depositar(19.0d);
        java.lang.Class<?> wildcardClass71 = contaBancaria55.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria26);
        org.junit.Assert.assertNull(contaBancaria52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str60, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 100.0");
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
        com.example.ContaBancaria contaBancaria31 = banco13.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        banco13.listarContas();
        com.example.ContaBancaria contaBancaria34 = banco13.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        contaBancaria34.depositar(52.0d);
        boolean boolean38 = contaBancaria34.sacar((double) (short) 10);
        banco0.adicionarConta(contaBancaria34);
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertNull(contaBancaria31);
        org.junit.Assert.assertNotNull(contaBancaria34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0", 11.0d);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        com.example.ContaBancaria contaBancaria63 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 100.0f);
        java.lang.String str64 = contaBancaria63.exibirDetalhes();
        boolean boolean66 = contaBancaria63.sacar(152.0d);
        java.lang.String str67 = contaBancaria63.exibirDetalhes();
        java.lang.String str68 = contaBancaria63.exibirDetalhes();
        banco0.adicionarConta(contaBancaria63);
        double double70 = contaBancaria63.consultarSaldo();
        double double71 = contaBancaria63.consultarSaldo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str5, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria60);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str64, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str67, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str68, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 100.0d + "'", double70 == 100.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 100.0d + "'", double71 == 100.0d);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        double double31 = contaBancaria24.consultarSaldo();
        java.lang.String str32 = contaBancaria24.exibirDetalhes();
        boolean boolean34 = contaBancaria24.sacar(162.0d);
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 53.0d + "'", double31 == 53.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Titular: hi!, Saldo: R$ 53.0" + "'", str32, "Titular: hi!, Saldo: R$ 53.0");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        com.example.ContaBancaria contaBancaria27 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 100.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(contaBancaria27);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        boolean boolean25 = contaBancaria18.sacar(10.0d);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 117.0", 47.0d);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 9.0", (double) 10L);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 9.0, Saldo: R$ 10.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 9.0, Saldo: R$ 10.0");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        java.lang.Class<?> wildcardClass30 = contaBancaria23.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 32.0" + "'", str29, "Titular: hi!, Saldo: R$ 32.0");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        contaBancaria2.depositar(52.0d);
        contaBancaria2.depositar(45.0d);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 20.0", (double) 1);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 1.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 1.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 1.0" + "'", str4, "Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 1.0");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 214.0", 45.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 214.0, Saldo: R$ 45.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 214.0, Saldo: R$ 45.0");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        double double34 = contaBancaria22.consultarSaldo();
        contaBancaria22.depositar(0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str26, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 97.0d + "'", double34 == 97.0d);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        com.example.Banco banco28 = new com.example.Banco();
        banco28.listarContas();
        com.example.Banco banco30 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco30.adicionarConta(contaBancaria33);
        banco30.listarContas();
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco30.adicionarConta(contaBancaria38);
        com.example.ContaBancaria contaBancaria42 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean44 = contaBancaria42.sacar((double) (-1L));
        contaBancaria42.depositar((-1.0d));
        banco30.adicionarConta(contaBancaria42);
        banco28.adicionarConta(contaBancaria42);
        com.example.ContaBancaria contaBancaria51 = new com.example.ContaBancaria("hi!", (double) ' ');
        banco28.adicionarConta(contaBancaria51);
        double double53 = contaBancaria51.consultarSaldo();
        contaBancaria51.depositar((double) 1L);
        boolean boolean57 = contaBancaria51.sacar((double) 10.0f);
        boolean boolean59 = contaBancaria51.sacar((double) (byte) 1);
        banco0.adicionarConta(contaBancaria51);
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 32.0d + "'", double53 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        com.example.ContaBancaria contaBancaria70 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0", 100.0d);
        java.lang.String str71 = contaBancaria70.exibirDetalhes();
        banco0.adicionarConta(contaBancaria70);
        com.example.ContaBancaria contaBancaria74 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 147.0");
        com.example.ContaBancaria contaBancaria76 = banco0.buscarContaPorTitular("Titular: Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0, Saldo: R$ 10.0");
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria26);
        org.junit.Assert.assertNull(contaBancaria52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str60, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Titular: Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0, Saldo: R$ 100.0" + "'", str71, "Titular: Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNull(contaBancaria74);
        org.junit.Assert.assertNull(contaBancaria76);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        boolean boolean33 = contaBancaria24.sacar(0.0d);
        java.lang.String str34 = contaBancaria24.exibirDetalhes();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str30, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str31, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str34, "Titular: , Saldo: R$ 10.0");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria21 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean23 = contaBancaria21.sacar((double) '#');
        banco0.adicionarConta(contaBancaria21);
        boolean boolean26 = contaBancaria21.sacar((double) ' ');
        org.junit.Assert.assertNull(contaBancaria16);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        com.example.ContaBancaria contaBancaria26 = banco8.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean31 = contaBancaria29.sacar((double) 100);
        double double32 = contaBancaria29.consultarSaldo();
        banco8.adicionarConta(contaBancaria29);
        boolean boolean35 = contaBancaria29.sacar((double) (byte) 1);
        banco0.adicionarConta(contaBancaria29);
        com.example.ContaBancaria contaBancaria38 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria40 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 214.0, Saldo: R$ 45.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(contaBancaria38);
        org.junit.Assert.assertNull(contaBancaria40);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        com.example.ContaBancaria contaBancaria67 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 107.0, Saldo: R$ 100.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria70 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 9.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str62, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(contaBancaria67);
        org.junit.Assert.assertNull(contaBancaria70);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        com.example.ContaBancaria contaBancaria43 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 17.0");
        org.junit.Assert.assertNotNull(contaBancaria27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(contaBancaria34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertNull(contaBancaria43);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        double double20 = contaBancaria19.consultarSaldo();
        double double21 = contaBancaria19.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 9.0, Saldo: R$ 0.0", (double) 0L);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        contaBancaria23.depositar(107.0d);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str26, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        com.example.ContaBancaria contaBancaria47 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0", (double) (byte) 100);
        banco0.adicionarConta(contaBancaria47);
        com.example.ContaBancaria contaBancaria50 = banco0.buscarContaPorTitular("");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria34);
        org.junit.Assert.assertNull(contaBancaria36);
        org.junit.Assert.assertNull(contaBancaria38);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(contaBancaria50);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 19.0", (double) 100.0f);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 100.0", (double) 0);
        double double3 = contaBancaria2.consultarSaldo();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 100.0, Saldo: R$ 0.0" + "'", str4, "Titular: Titular: hi!, Saldo: R$ 100.0, Saldo: R$ 0.0");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        double double86 = contaBancaria79.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str62, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(contaBancaria74);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 53.0d + "'", double86 == 53.0d);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        boolean boolean18 = contaBancaria15.sacar(11.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str16, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 0.0");
        com.example.Banco banco12 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria15 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco12.adicionarConta(contaBancaria15);
        banco12.listarContas();
        banco12.listarContas();
        com.example.Banco banco19 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco19.adicionarConta(contaBancaria22);
        banco19.listarContas();
        banco19.listarContas();
        com.example.ContaBancaria contaBancaria28 = new com.example.ContaBancaria("", 10.0d);
        banco19.adicionarConta(contaBancaria28);
        banco12.adicionarConta(contaBancaria28);
        banco0.adicionarConta(contaBancaria28);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria11);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean4 = contaBancaria2.sacar((double) 100);
        boolean boolean6 = contaBancaria2.sacar((double) 'a');
        contaBancaria2.depositar((double) (short) 100);
        boolean boolean10 = contaBancaria2.sacar((double) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 182.0", (double) 1.0f);
        contaBancaria2.depositar(11.0d);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        com.example.Banco banco30 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria33 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco30.adicionarConta(contaBancaria33);
        banco30.listarContas();
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco30.adicionarConta(contaBancaria38);
        banco30.listarContas();
        com.example.ContaBancaria contaBancaria43 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco30.adicionarConta(contaBancaria43);
        com.example.ContaBancaria contaBancaria46 = banco30.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0");
        banco30.listarContas();
        com.example.Banco banco48 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria51 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco48.adicionarConta(contaBancaria51);
        banco48.listarContas();
        banco48.listarContas();
        com.example.ContaBancaria contaBancaria57 = new com.example.ContaBancaria("", 10.0d);
        banco48.adicionarConta(contaBancaria57);
        com.example.ContaBancaria contaBancaria61 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria61.depositar((double) (byte) -1);
        banco48.adicionarConta(contaBancaria61);
        com.example.ContaBancaria contaBancaria66 = banco48.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria68 = banco48.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        com.example.ContaBancaria contaBancaria71 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str72 = contaBancaria71.exibirDetalhes();
        banco48.adicionarConta(contaBancaria71);
        com.example.ContaBancaria contaBancaria75 = banco48.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        boolean boolean77 = contaBancaria75.sacar((double) (short) 100);
        java.lang.String str78 = contaBancaria75.exibirDetalhes();
        double double79 = contaBancaria75.consultarSaldo();
        banco30.adicionarConta(contaBancaria75);
        banco0.adicionarConta(contaBancaria75);
        double double82 = contaBancaria75.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria46);
        org.junit.Assert.assertNotNull(contaBancaria66);
        org.junit.Assert.assertNull(contaBancaria68);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str72, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(contaBancaria75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str78, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        contaBancaria62.depositar(104.0d);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertNull(contaBancaria47);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria18);
    }
}

