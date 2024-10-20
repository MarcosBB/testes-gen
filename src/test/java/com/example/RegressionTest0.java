package com.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.example.Main main0 = new com.example.Main();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("", 10.0d);
        banco0.adicionarConta(contaBancaria9);
        java.lang.Class<?> wildcardClass11 = contaBancaria9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        java.lang.String str5 = contaBancaria3.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str5, "Titular: hi!, Saldo: R$ 97.0");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        boolean boolean4 = contaBancaria2.sacar((double) (short) 1);
        boolean boolean6 = contaBancaria2.sacar((double) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
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
        double double20 = contaBancaria13.consultarSaldo();
        java.lang.Class<?> wildcardClass21 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        java.lang.Class<?> wildcardClass11 = contaBancaria9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        java.lang.Class<?> wildcardClass9 = contaBancaria8.getClass();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass7 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double3 = contaBancaria2.consultarSaldo();
        boolean boolean5 = contaBancaria2.sacar((-1.0d));
        java.lang.Class<?> wildcardClass6 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(0.0d);
        contaBancaria2.depositar(100.0d);
        double double8 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 152.0d + "'", double8 == 152.0d);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        double double4 = contaBancaria2.consultarSaldo();
        boolean boolean6 = contaBancaria2.sacar((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str3, "Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
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
        java.lang.Class<?> wildcardClass18 = banco0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        boolean boolean8 = contaBancaria4.sacar((double) (byte) 1);
        contaBancaria4.depositar((double) 1.0f);
        java.lang.Class<?> wildcardClass11 = contaBancaria4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        java.lang.Class<?> wildcardClass3 = banco0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
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
        java.lang.Class<?> wildcardClass23 = contaBancaria18.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(0.0d);
        contaBancaria2.depositar(100.0d);
        java.lang.Class<?> wildcardClass8 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        double double3 = contaBancaria2.consultarSaldo();
        java.lang.Class<?> wildcardClass4 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
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
        java.lang.Class<?> wildcardClass24 = contaBancaria20.getClass();
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
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
        java.lang.Class<?> wildcardClass17 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
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
        java.lang.Class<?> wildcardClass29 = contaBancaria21.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str27, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = contaBancaria3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(contaBancaria3);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
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
        contaBancaria20.depositar((double) (short) 10);
        org.junit.Assert.assertNotNull(contaBancaria20);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertNotNull(contaBancaria11);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 100.0f);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar(152.0d);
        boolean boolean7 = contaBancaria2.sacar(1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double3 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) 10L);
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0" + "'", str6, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
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
        java.lang.Class<?> wildcardClass46 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        contaBancaria8.depositar((-1.0d));
        java.lang.String str12 = contaBancaria8.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Titular: hi!, Saldo: R$ 100.0" + "'", str12, "Titular: hi!, Saldo: R$ 100.0");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 0.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        double double4 = contaBancaria2.consultarSaldo();
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str3, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) '#');
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        java.lang.Class<?> wildcardClass17 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = contaBancaria10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 10.0", (double) 10.0f);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
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
        java.lang.Class<?> wildcardClass46 = contaBancaria41.getClass();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        java.lang.Class<?> wildcardClass5 = contaBancaria3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
        java.lang.Class<?> wildcardClass27 = contaBancaria22.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str26, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double9 = contaBancaria8.consultarSaldo();
        contaBancaria8.depositar((double) 10L);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria14 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 51.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = contaBancaria14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        java.lang.Class<?> wildcardClass7 = banco0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
        boolean boolean47 = contaBancaria41.sacar((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (-1.0d));
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        java.lang.String str33 = contaBancaria28.exibirDetalhes();
        java.lang.String str34 = contaBancaria28.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str33, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str34, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
        double double5 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) 1.0f);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", 152.0d);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 152.0d + "'", double3 == 152.0d);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
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
        java.lang.Class<?> wildcardClass19 = banco0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
        com.example.ContaBancaria contaBancaria25 = banco7.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria28 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean30 = contaBancaria28.sacar((double) 100);
        double double31 = contaBancaria28.consultarSaldo();
        banco7.adicionarConta(contaBancaria28);
        contaBancaria28.depositar(52.0d);
        banco0.adicionarConta(contaBancaria28);
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0", (double) (short) 1);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        double double17 = contaBancaria13.consultarSaldo();
        java.lang.Class<?> wildcardClass18 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 10.0d);
        contaBancaria2.depositar((double) 100);
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) ' ');
        boolean boolean11 = contaBancaria2.sacar((double) (-1));
        java.lang.Class<?> wildcardClass12 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
        contaBancaria41.depositar((double) (byte) 10);
        org.junit.Assert.assertNull(contaBancaria14);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
        java.lang.Class<?> wildcardClass30 = contaBancaria20.getClass();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
        boolean boolean29 = contaBancaria22.sacar((double) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str26, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str27, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        banco0.listarContas();
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        java.lang.Class<?> wildcardClass9 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass8 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        banco0.listarContas();
        java.lang.Class<?> wildcardClass8 = banco0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (double) (byte) 10);
        double double3 = contaBancaria2.consultarSaldo();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 10.0" + "'", str4, "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 10.0");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 9.0");
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria12);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        double double42 = contaBancaria40.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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
        com.example.ContaBancaria contaBancaria27 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria27);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", 100.0d);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
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
        java.lang.Class<?> wildcardClass30 = contaBancaria29.getClass();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
        com.example.Banco banco47 = new com.example.Banco();
        com.example.Banco banco48 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria51 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco48.adicionarConta(contaBancaria51);
        banco47.adicionarConta(contaBancaria51);
        com.example.ContaBancaria contaBancaria55 = banco47.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco47.listarContas();
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
        boolean boolean75 = contaBancaria70.sacar((double) (-1.0f));
        java.lang.String str76 = contaBancaria70.exibirDetalhes();
        double double77 = contaBancaria70.consultarSaldo();
        banco47.adicionarConta(contaBancaria70);
        boolean boolean80 = contaBancaria70.sacar((double) 10);
        banco0.adicionarConta(contaBancaria70);
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(contaBancaria55);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str76, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 52.0d + "'", double77 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double6 = contaBancaria5.consultarSaldo();
        banco0.adicionarConta(contaBancaria5);
        double double8 = contaBancaria5.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 11.0", 0.0d);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
        java.lang.Class<?> wildcardClass33 = contaBancaria27.getClass();
        org.junit.Assert.assertNotNull(contaBancaria27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(0.0d);
        contaBancaria2.depositar((double) 0L);
        java.lang.Class<?> wildcardClass8 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) (short) 100);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        java.lang.Class<?> wildcardClass28 = contaBancaria24.getClass();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) ' ');
        contaBancaria2.depositar((double) (-1.0f));
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        java.lang.String str11 = contaBancaria9.exibirDetalhes();
        double double12 = contaBancaria9.consultarSaldo();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str11, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        java.lang.Class<?> wildcardClass27 = contaBancaria21.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = contaBancaria19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(contaBancaria19);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria9);
        org.junit.Assert.assertNull(contaBancaria11);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
        boolean boolean6 = contaBancaria2.sacar((double) (-1.0f));
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar(9.0d);
        double double10 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str7, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 88.0d + "'", double10 == 88.0d);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 11.0", 152.0d);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        double double3 = contaBancaria2.consultarSaldo();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str4, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean4 = contaBancaria2.sacar((double) 100);
        boolean boolean6 = contaBancaria2.sacar((double) 'a');
        double double7 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0", (double) 'a');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0" + "'", str4, "Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        boolean boolean4 = contaBancaria2.sacar((double) (short) 1);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass6 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ 51.0" + "'", str5, "Titular: hi!, Saldo: R$ 51.0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) 10L);
        java.lang.Class<?> wildcardClass8 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0", (double) 'a');
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        java.lang.Class<?> wildcardClass53 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(contaBancaria40);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 52.0d + "'", double46 == 52.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) ' ');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        java.lang.Class<?> wildcardClass30 = contaBancaria22.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str26, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str27, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        java.lang.Class<?> wildcardClass30 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str27, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        contaBancaria29.depositar((double) 'a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        contaBancaria49.depositar(53.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str5, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 10.0", 1.0d);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (double) (short) -1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 0.0", (double) (byte) 10);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        java.lang.Class<?> wildcardClass10 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 11.0", (double) ' ');
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 100.0", (double) (-1.0f));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        java.lang.String str11 = contaBancaria9.exibirDetalhes();
        java.lang.String str12 = contaBancaria9.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str11, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str12, "Titular: hi!, Saldo: R$ 97.0");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double9 = contaBancaria8.consultarSaldo();
        contaBancaria8.depositar((double) 10L);
        banco0.adicionarConta(contaBancaria8);
        java.lang.Class<?> wildcardClass13 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (byte) 0);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass6 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str5, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        double double7 = contaBancaria2.consultarSaldo();
        java.lang.Class<?> wildcardClass8 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        java.lang.Class<?> wildcardClass20 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0", (double) 100.0f);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(53.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str3, "Titular: hi!, Saldo: R$ -1.0");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        double double22 = contaBancaria13.consultarSaldo();
        java.lang.Class<?> wildcardClass23 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str17, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 45.0d + "'", double22 == 45.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
        boolean boolean6 = contaBancaria2.sacar((double) (-1.0f));
        double double7 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass4 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str3, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        boolean boolean8 = contaBancaria2.sacar((double) 10L);
        java.lang.String str9 = contaBancaria2.exibirDetalhes();
        boolean boolean11 = contaBancaria2.sacar(162.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Titular: hi!, Saldo: R$ 42.0" + "'", str9, "Titular: hi!, Saldo: R$ 42.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("", 0.0d);
        java.lang.String str5 = contaBancaria4.exibirDetalhes();
        double double6 = contaBancaria4.consultarSaldo();
        banco0.adicionarConta(contaBancaria4);
        double double8 = contaBancaria4.consultarSaldo();
        java.lang.Class<?> wildcardClass9 = contaBancaria4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str5, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        java.lang.Class<?> wildcardClass32 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        java.lang.Class<?> wildcardClass21 = contaBancaria14.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        java.lang.String str11 = contaBancaria9.exibirDetalhes();
        java.lang.Class<?> wildcardClass12 = contaBancaria9.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str11, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ -1.0");
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria11);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        double double3 = contaBancaria2.consultarSaldo();
        boolean boolean5 = contaBancaria2.sacar((double) ' ');
        java.lang.Class<?> wildcardClass6 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) ' ');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass4 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 32.0" + "'", str3, "Titular: hi!, Saldo: R$ 32.0");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        java.lang.String str11 = contaBancaria9.exibirDetalhes();
        contaBancaria9.depositar((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str11, "Titular: hi!, Saldo: R$ 97.0");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("hi!");
        boolean boolean10 = contaBancaria8.sacar((double) (-1.0f));
        contaBancaria8.depositar((double) (-1.0f));
        contaBancaria8.depositar(0.0d);
        boolean boolean16 = contaBancaria8.sacar((double) '#');
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean4 = contaBancaria2.sacar((double) 100);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str6, "Titular: hi!, Saldo: R$ -1.0");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        com.example.ContaBancaria contaBancaria29 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 84.0");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria29);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (-1.0d));
        boolean boolean4 = contaBancaria2.sacar((double) 100.0f);
        boolean boolean6 = contaBancaria2.sacar(9.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean4 = contaBancaria2.sacar((double) '#');
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        java.lang.Class<?> wildcardClass31 = contaBancaria21.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str30, "Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        double double3 = contaBancaria2.consultarSaldo();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str4, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        com.example.ContaBancaria contaBancaria34 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria34);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("hi!");
        java.lang.Class<?> wildcardClass9 = contaBancaria8.getClass();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        boolean boolean4 = contaBancaria2.sacar((double) (short) 1);
        contaBancaria2.depositar((double) (short) 0);
        contaBancaria2.depositar((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 20.0", (double) ' ');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) ' ');
        java.lang.String str10 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 20.0" + "'", str10, "Titular: hi!, Saldo: R$ 20.0");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 20.0", (double) (short) 1);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 0.0", (double) (byte) 0);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0", (double) 100.0f);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
        contaBancaria2.depositar((double) 0L);
        java.lang.Class<?> wildcardClass7 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(0.0d);
        contaBancaria2.depositar((double) 0L);
        double double8 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0", (double) 'a');
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        boolean boolean52 = contaBancaria44.sacar((double) (byte) 100);
        org.junit.Assert.assertNotNull(contaBancaria41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str50, "Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 100.0", (double) 0);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("", 0.0d);
        java.lang.String str5 = contaBancaria4.exibirDetalhes();
        double double6 = contaBancaria4.consultarSaldo();
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0");
        java.lang.Class<?> wildcardClass10 = banco0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str5, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) (short) 0);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("hi!");
        java.lang.String str9 = contaBancaria8.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str9, "Titular: hi!, Saldo: R$ 97.0");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        contaBancaria30.depositar((double) (short) 100);
        boolean boolean35 = contaBancaria30.sacar((double) 1L);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (double) (byte) 10);
        double double3 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        java.lang.String str8 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass9 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str8, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria18);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        com.example.ContaBancaria contaBancaria35 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria32);
        org.junit.Assert.assertNull(contaBancaria35);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (-1.0d));
        boolean boolean4 = contaBancaria2.sacar((double) 100.0f);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass6 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0" + "'", str5, "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 97.0d);
        boolean boolean4 = contaBancaria2.sacar((double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) (byte) 10);
        contaBancaria2.depositar(107.0d);
        contaBancaria2.depositar(0.0d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) (byte) 0);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        double double4 = contaBancaria2.consultarSaldo();
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str3, "Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str5, "Titular: hi!, Saldo: R$ -1.0");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        java.lang.String str20 = contaBancaria13.exibirDetalhes();
        double double21 = contaBancaria13.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str17, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str20, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        com.example.Banco banco26 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean31 = contaBancaria29.sacar((double) (-1L));
        banco26.adicionarConta(contaBancaria29);
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str36 = contaBancaria35.exibirDetalhes();
        contaBancaria35.depositar(0.0d);
        banco26.adicionarConta(contaBancaria35);
        contaBancaria35.depositar((double) (-1));
        banco0.adicionarConta(contaBancaria35);
        java.lang.Class<?> wildcardClass43 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str36, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        boolean boolean27 = contaBancaria23.sacar((double) 10.0f);
        java.lang.Class<?> wildcardClass28 = contaBancaria23.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria5 = banco0.buscarContaPorTitular("hi!");
        java.lang.Class<?> wildcardClass6 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        java.lang.Class<?> wildcardClass22 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria18);
        org.junit.Assert.assertNotNull(contaBancaria21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        java.lang.Class<?> wildcardClass34 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNotNull(contaBancaria33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        java.lang.Class<?> wildcardClass20 = contaBancaria9.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str14, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        java.lang.String str20 = contaBancaria13.exibirDetalhes();
        java.lang.String str21 = contaBancaria13.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str17, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str20, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str21, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 42.0", 88.0d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        double double24 = contaBancaria22.consultarSaldo();
        org.junit.Assert.assertNull(contaBancaria19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        double double19 = contaBancaria16.consultarSaldo();
        double double20 = contaBancaria16.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 9.0");
        java.lang.Class<?> wildcardClass13 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        contaBancaria13.depositar((double) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        java.lang.String str18 = contaBancaria12.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str18, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 1.0f);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria3.depositar(1.0d);
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        org.junit.Assert.assertNull(contaBancaria9);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0", (double) '4');
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        java.lang.String str58 = contaBancaria49.exibirDetalhes();
        double double59 = contaBancaria49.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str53, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str54, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Titular: hi!, Saldo: R$ 20.0" + "'", str58, "Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 20.0d + "'", double59 == 20.0d);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        double double55 = contaBancaria48.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 107.0d + "'", double53 == 107.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 107.0d + "'", double55 == 107.0d);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria3.depositar(1.0d);
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        java.lang.Class<?> wildcardClass11 = contaBancaria9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 0.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str3, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str4, "Titular: , Saldo: R$ 0.0");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0", (double) 1L);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        contaBancaria20.depositar((double) ' ');
        java.lang.Class<?> wildcardClass29 = contaBancaria20.getClass();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        java.lang.Class<?> wildcardClass19 = contaBancaria16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria2.depositar(1.0d);
        contaBancaria2.depositar(0.0d);
        contaBancaria2.depositar(45.0d);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("");
        java.lang.String str11 = contaBancaria10.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str11, "Titular: hi!, Saldo: R$ 97.0");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        double double29 = contaBancaria21.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 99.0d + "'", double29 == 99.0d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        boolean boolean28 = contaBancaria23.sacar((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean56 = contaBancaria54.sacar((double) 100);
        double double57 = contaBancaria54.consultarSaldo();
        banco33.adicionarConta(contaBancaria54);
        double double59 = contaBancaria54.consultarSaldo();
        contaBancaria54.depositar(100.0d);
        banco0.adicionarConta(contaBancaria54);
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(contaBancaria51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria11 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 10.0f);
        java.lang.String str12 = contaBancaria11.exibirDetalhes();
        banco0.adicionarConta(contaBancaria11);
        double double14 = contaBancaria11.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0" + "'", str12, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        java.lang.Class<?> wildcardClass26 = contaBancaria23.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        boolean boolean35 = contaBancaria28.sacar((double) (short) -1);
        java.lang.Class<?> wildcardClass36 = contaBancaria28.getClass();
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 52.0d + "'", double33 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0", (double) 1.0f);
        contaBancaria2.depositar((double) '4');
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 100.0f);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar(152.0d);
        double double6 = contaBancaria2.consultarSaldo();
        java.lang.Class<?> wildcardClass7 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) '4');
        double double8 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 104.0d + "'", double8 == 104.0d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        double double20 = contaBancaria13.consultarSaldo();
        double double21 = contaBancaria13.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 9.0" + "'", str19, "Titular: hi!, Saldo: R$ 9.0");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 9.0d + "'", double20 == 9.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 9.0d + "'", double21 == 9.0d);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0", (double) (byte) 10);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 45.0d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0", 32.0d);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria5 = banco0.buscarContaPorTitular("");
        banco0.listarContas();
        java.lang.Class<?> wildcardClass7 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        boolean boolean8 = contaBancaria4.sacar((double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = contaBancaria4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 11.0", (double) 1L);
        boolean boolean4 = contaBancaria2.sacar(9.0d);
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = contaBancaria29.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria29);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        java.lang.String str22 = contaBancaria21.exibirDetalhes();
        org.junit.Assert.assertNull(contaBancaria18);
        org.junit.Assert.assertNotNull(contaBancaria21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str22, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        com.example.Banco banco20 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean25 = contaBancaria23.sacar((double) (-1L));
        banco20.adicionarConta(contaBancaria23);
        banco20.listarContas();
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
        com.example.ContaBancaria contaBancaria46 = banco28.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria49 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean51 = contaBancaria49.sacar((double) 100);
        double double52 = contaBancaria49.consultarSaldo();
        banco28.adicionarConta(contaBancaria49);
        boolean boolean55 = contaBancaria49.sacar((double) (byte) 1);
        banco20.adicionarConta(contaBancaria49);
        banco0.adicionarConta(contaBancaria49);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(contaBancaria46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        boolean boolean67 = contaBancaria61.sacar((double) '#');
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str62, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("");
        java.lang.Class<?> wildcardClass11 = contaBancaria10.getClass();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        java.lang.Class<?> wildcardClass20 = contaBancaria9.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (-1L));
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str5, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria5 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria5);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        boolean boolean33 = contaBancaria23.sacar((double) 0L);
        java.lang.Class<?> wildcardClass34 = contaBancaria23.getClass();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        com.example.ContaBancaria contaBancaria61 = null;
        banco0.adicionarConta(contaBancaria61);
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertNull(contaBancaria60);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        banco0.adicionarConta(contaBancaria4);
        banco0.listarContas();
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        com.example.ContaBancaria contaBancaria59 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 32.0");
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str53, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str54, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(contaBancaria59);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        double double23 = contaBancaria9.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 182.0d + "'", double22 == 182.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 182.0d + "'", double23 == 182.0d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        contaBancaria22.depositar((double) (-1));
        java.lang.String str32 = contaBancaria22.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str26, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str27, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0" + "'", str32, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 1.0");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        banco0.adicionarConta(contaBancaria4);
        java.lang.String str6 = contaBancaria4.exibirDetalhes();
        boolean boolean8 = contaBancaria4.sacar(96.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str6, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        java.lang.Class<?> wildcardClass34 = contaBancaria33.getClass();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNotNull(contaBancaria33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        java.lang.Class<?> wildcardClass32 = contaBancaria24.getClass();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str30, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str31, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str10 = contaBancaria9.exibirDetalhes();
        contaBancaria9.depositar(0.0d);
        banco0.adicionarConta(contaBancaria9);
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        double double58 = contaBancaria49.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str53, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str54, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 20.0d + "'", double58 == 20.0d);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) 10L);
        contaBancaria2.depositar((double) (-1L));
        java.lang.Class<?> wildcardClass10 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 97.0", (double) 0);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0", 162.0d);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 162.0d + "'", double3 == 162.0d);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 21.0", (double) (-1.0f));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean4 = contaBancaria2.sacar((double) '#');
        boolean boolean6 = contaBancaria2.sacar((double) 100);
        contaBancaria2.depositar(45.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        com.example.ContaBancaria contaBancaria15 = banco0.buscarContaPorTitular("");
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria10);
        org.junit.Assert.assertNull(contaBancaria13);
        org.junit.Assert.assertNotNull(contaBancaria15);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        com.example.ContaBancaria contaBancaria36 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertNotNull(contaBancaria27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(contaBancaria34);
        org.junit.Assert.assertNull(contaBancaria36);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        java.lang.Class<?> wildcardClass37 = contaBancaria29.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        com.example.ContaBancaria contaBancaria34 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria34);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        double double28 = contaBancaria21.consultarSaldo();
        java.lang.Class<?> wildcardClass29 = contaBancaria21.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("hi!");
        java.lang.Class<?> wildcardClass9 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0", 162.0d);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (-1.0d));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        boolean boolean8 = contaBancaria2.sacar((double) 10L);
        java.lang.String str9 = contaBancaria2.exibirDetalhes();
        boolean boolean11 = contaBancaria2.sacar((double) (-1L));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Titular: hi!, Saldo: R$ 42.0" + "'", str9, "Titular: hi!, Saldo: R$ 42.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 100.0f);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar(152.0d);
        double double6 = contaBancaria2.consultarSaldo();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str7, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        java.lang.String str28 = contaBancaria23.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str26, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str28, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double9 = contaBancaria8.consultarSaldo();
        contaBancaria8.depositar((double) 10L);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria14 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0");
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        contaBancaria24.depositar((double) (short) 1);
        double double33 = contaBancaria24.consultarSaldo();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str30, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 11.0d + "'", double33 == 11.0d);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        com.example.ContaBancaria contaBancaria64 = new com.example.ContaBancaria("", (double) (byte) 10);
        contaBancaria64.depositar(107.0d);
        banco0.adicionarConta(contaBancaria64);
        java.lang.Class<?> wildcardClass68 = contaBancaria64.getClass();
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(contaBancaria51);
        org.junit.Assert.assertNull(contaBancaria53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str57, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) ' ');
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        java.lang.Class<?> wildcardClass27 = contaBancaria20.getClass();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", 53.0d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (short) -1);
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0", 182.0d);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0", (double) 0);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        com.example.ContaBancaria contaBancaria30 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNotNull(contaBancaria30);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(contaBancaria26);
        org.junit.Assert.assertNull(contaBancaria28);
        org.junit.Assert.assertNull(contaBancaria30);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0", 32.0d);
        contaBancaria2.depositar((double) (short) -1);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        boolean boolean46 = contaBancaria42.sacar((double) (-1L));
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria10);
        org.junit.Assert.assertNull(contaBancaria15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(contaBancaria40);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 52.0d + "'", double46 == 52.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria52);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        java.lang.Class<?> wildcardClass68 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str62, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(contaBancaria67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        double double25 = contaBancaria24.consultarSaldo();
        contaBancaria24.depositar((double) (short) 100);
        org.junit.Assert.assertNotNull(contaBancaria24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        boolean boolean27 = contaBancaria22.sacar((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
        contaBancaria2.depositar(10.0d);
        double double7 = contaBancaria2.consultarSaldo();
        boolean boolean9 = contaBancaria2.sacar(97.0d);
        contaBancaria2.depositar((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 107.0d + "'", double7 == 107.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        double double17 = contaBancaria13.consultarSaldo();
        contaBancaria13.depositar(100.0d);
        java.lang.Class<?> wildcardClass20 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", 0.0d);
        boolean boolean4 = contaBancaria2.sacar((double) (-1L));
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        boolean boolean12 = contaBancaria9.sacar((double) (byte) 10);
        double double13 = contaBancaria9.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 87.0d + "'", double13 == 87.0d);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (byte) 0);
        boolean boolean6 = contaBancaria2.sacar((double) (-1));
        contaBancaria2.depositar(84.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        java.lang.String str8 = contaBancaria2.exibirDetalhes();
        java.lang.String str9 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) 1.0f);
        boolean boolean13 = contaBancaria2.sacar((-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str8, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str9, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        boolean boolean23 = contaBancaria21.sacar((double) (-1L));
        boolean boolean25 = contaBancaria21.sacar((double) (byte) 1);
        org.junit.Assert.assertNull(contaBancaria18);
        org.junit.Assert.assertNotNull(contaBancaria21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        java.lang.Class<?> wildcardClass32 = contaBancaria24.getClass();
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 53.0d + "'", double31 == 53.0d);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        double double20 = contaBancaria13.consultarSaldo();
        double double21 = contaBancaria13.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        boolean boolean28 = contaBancaria18.sacar(104.0d);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Titular: hi!, Saldo: R$ 84.0" + "'", str25, "Titular: hi!, Saldo: R$ 84.0");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 84.0d + "'", double26 == 84.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        com.example.ContaBancaria contaBancaria35 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0");
        com.example.ContaBancaria contaBancaria37 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNotNull(contaBancaria33);
        org.junit.Assert.assertNull(contaBancaria35);
        org.junit.Assert.assertNotNull(contaBancaria37);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean4 = contaBancaria2.sacar((double) 100);
        double double5 = contaBancaria2.consultarSaldo();
        boolean boolean7 = contaBancaria2.sacar((double) ' ');
        java.lang.Class<?> wildcardClass8 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        double double35 = contaBancaria24.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str28, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 20.0d + "'", double35 == 20.0d);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 9.0", 53.0d);
        contaBancaria2.depositar(35.0d);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        java.lang.Class<?> wildcardClass38 = banco0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        java.lang.Class<?> wildcardClass34 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (double) (byte) 10);
        double double3 = contaBancaria2.consultarSaldo();
        boolean boolean5 = contaBancaria2.sacar((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        com.example.ContaBancaria contaBancaria60 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 84.0");
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertNull(contaBancaria60);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        java.lang.Class<?> wildcardClass24 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        java.lang.String str26 = contaBancaria13.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str17, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 62.0" + "'", str26, "Titular: hi!, Saldo: R$ 62.0");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = contaBancaria11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria11);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
        contaBancaria2.depositar((double) 0L);
        contaBancaria2.depositar(52.0d);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        contaBancaria13.depositar(53.0d);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) ' ');
        boolean boolean11 = contaBancaria2.sacar((double) (-1));
        java.lang.String str12 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass13 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Titular: hi!, Saldo: R$ 20.0" + "'", str12, "Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        banco0.adicionarConta(contaBancaria4);
        java.lang.String str6 = contaBancaria4.exibirDetalhes();
        contaBancaria4.depositar(11.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str6, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        double double3 = contaBancaria2.consultarSaldo();
        boolean boolean5 = contaBancaria2.sacar((double) ' ');
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        double double7 = contaBancaria2.consultarSaldo();
        java.lang.Class<?> wildcardClass8 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 20.0" + "'", str6, "Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        boolean boolean22 = contaBancaria20.sacar(20.0d);
        org.junit.Assert.assertNotNull(contaBancaria20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        double double26 = contaBancaria20.consultarSaldo();
        double double27 = contaBancaria20.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 162.0d + "'", double26 == 162.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 162.0d + "'", double27 == 162.0d);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) (byte) 1);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertNull(contaBancaria35);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria11);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean4 = contaBancaria2.sacar((double) 100);
        double double5 = contaBancaria2.consultarSaldo();
        boolean boolean7 = contaBancaria2.sacar((double) ' ');
        double double8 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria3.depositar(1.0d);
        banco0.adicionarConta(contaBancaria3);
        java.lang.Class<?> wildcardClass7 = banco0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(0.0d);
        contaBancaria2.depositar((double) 0L);
        contaBancaria2.depositar(32.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        java.lang.String str30 = contaBancaria20.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str30, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        contaBancaria2.depositar(52.0d);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria33);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0", (-1.0d));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        com.example.ContaBancaria contaBancaria35 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNotNull(contaBancaria33);
        org.junit.Assert.assertNull(contaBancaria35);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        boolean boolean8 = contaBancaria4.sacar((double) (byte) 1);
        double double9 = contaBancaria4.consultarSaldo();
        java.lang.String str10 = contaBancaria4.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 96.0d + "'", double9 == 96.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 96.0" + "'", str10, "Titular: hi!, Saldo: R$ 96.0");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 20.0", (double) 1);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 1.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 1.0");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        double double4 = contaBancaria2.consultarSaldo();
        boolean boolean6 = contaBancaria2.sacar(1.0d);
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) 100L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str3, "Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str7, "Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        java.lang.Class<?> wildcardClass85 = contaBancaria73.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        contaBancaria16.depositar((double) (-1));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        java.lang.String str28 = contaBancaria20.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str27, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str28, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 32.0", (double) (-1));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        double double7 = contaBancaria3.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria9 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = contaBancaria11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria9);
        org.junit.Assert.assertNull(contaBancaria11);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria16);
        org.junit.Assert.assertNotNull(contaBancaria18);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0", 9.0d);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        double double60 = contaBancaria49.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str53, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str54, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 29.0d + "'", double60 == 29.0d);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 0.0", (double) (byte) 0);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass4 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0" + "'", str3, "Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (-1L));
        contaBancaria2.depositar((-1.0d));
        contaBancaria2.depositar((double) 1L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        double double33 = contaBancaria27.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 97.0d + "'", double33 == 97.0d);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0", (double) (byte) 100);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (-1.0d));
        contaBancaria2.depositar(1.0d);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str21, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria31);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        boolean boolean31 = contaBancaria29.sacar(0.0d);
        java.lang.String str32 = contaBancaria29.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str32, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 0.0", 0.0d);
        boolean boolean4 = contaBancaria2.sacar(35.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", 100.0d);
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        boolean boolean7 = contaBancaria2.sacar((-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 32.0", 99.0d);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: , Saldo: R$ 0.0, Saldo: R$ 0.0", 10.0d);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("");
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria11);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        com.example.ContaBancaria contaBancaria42 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        java.lang.String str43 = contaBancaria42.exibirDetalhes();
        banco0.adicionarConta(contaBancaria42);
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str43, "Titular: hi!, Saldo: R$ -1.0");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        java.lang.Class<?> wildcardClass20 = banco0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        boolean boolean46 = contaBancaria42.sacar((double) (byte) 10);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria10);
        org.junit.Assert.assertNull(contaBancaria15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0", (double) 10.0f);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 0.0", (double) (byte) 1);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
        contaBancaria2.depositar(10.0d);
        double double7 = contaBancaria2.consultarSaldo();
        java.lang.Class<?> wildcardClass8 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 107.0d + "'", double7 == 107.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double3 = contaBancaria2.consultarSaldo();
        boolean boolean5 = contaBancaria2.sacar(53.0d);
        java.lang.Class<?> wildcardClass6 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        java.lang.Class<?> wildcardClass25 = contaBancaria18.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        boolean boolean8 = contaBancaria4.sacar((double) (byte) 1);
        contaBancaria4.depositar((double) 1.0f);
        contaBancaria4.depositar(96.0d);
        contaBancaria4.depositar(0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 21.0", 45.0d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        contaBancaria52.depositar(100.0d);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(contaBancaria40);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 52.0d + "'", double46 == 52.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria52);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        boolean boolean21 = contaBancaria13.sacar((double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 9.0" + "'", str19, "Titular: hi!, Saldo: R$ 9.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        java.lang.String str66 = contaBancaria61.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str62, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str66, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria29 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(contaBancaria29);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        java.lang.Class<?> wildcardClass21 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        banco0.listarContas();
        banco0.listarContas();
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        contaBancaria13.depositar((double) (-1));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str5 = contaBancaria4.exibirDetalhes();
        banco0.adicionarConta(contaBancaria4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str5, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        boolean boolean33 = contaBancaria24.sacar((double) 100L);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str30, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: , Saldo: R$ 10.0" + "'", str31, "Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0", (double) (short) 10);
        boolean boolean4 = contaBancaria2.sacar(104.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str3, "Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str4, "Titular: hi!, Saldo: R$ -1.0");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        java.lang.Class<?> wildcardClass52 = contaBancaria51.getClass();
        org.junit.Assert.assertNotNull(contaBancaria41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(contaBancaria51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", 53.0d);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0", 107.0d);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 107.0d + "'", double3 == 107.0d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        com.example.ContaBancaria contaBancaria34 = banco0.buscarContaPorTitular("");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNotNull(contaBancaria34);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = contaBancaria21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(contaBancaria21);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria5 = banco0.buscarContaPorTitular("hi!");
        com.example.ContaBancaria contaBancaria7 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 32.0");
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria5);
        org.junit.Assert.assertNull(contaBancaria7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        com.example.ContaBancaria contaBancaria32 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
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
        com.example.ContaBancaria contaBancaria53 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria53.depositar((double) (byte) -1);
        banco40.adicionarConta(contaBancaria53);
        com.example.ContaBancaria contaBancaria58 = banco40.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        java.lang.String str59 = contaBancaria58.exibirDetalhes();
        banco33.adicionarConta(contaBancaria58);
        com.example.ContaBancaria contaBancaria62 = banco33.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        boolean boolean64 = contaBancaria62.sacar(0.0d);
        boolean boolean66 = contaBancaria62.sacar(0.0d);
        banco0.adicionarConta(contaBancaria62);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria32);
        org.junit.Assert.assertNotNull(contaBancaria58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str59, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        banco0.listarContas();
        java.lang.Class<?> wildcardClass7 = banco0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        java.lang.Class<?> wildcardClass57 = contaBancaria50.getClass();
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
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("", 0.0d);
        java.lang.String str5 = contaBancaria4.exibirDetalhes();
        double double6 = contaBancaria4.consultarSaldo();
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria10 = new com.example.ContaBancaria("hi!", (double) '4');
        double double11 = contaBancaria10.consultarSaldo();
        java.lang.String str12 = contaBancaria10.exibirDetalhes();
        double double13 = contaBancaria10.consultarSaldo();
        banco0.adicionarConta(contaBancaria10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str5, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str12, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        boolean boolean34 = contaBancaria28.sacar((double) (byte) 1);
        boolean boolean36 = contaBancaria28.sacar((-1.0d));
        contaBancaria28.depositar(29.0d);
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria3.depositar(1.0d);
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        double double11 = contaBancaria9.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 10.0", (double) (short) 100);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) ' ');
        contaBancaria2.depositar((double) 100);
        contaBancaria2.depositar((double) 'a');
        contaBancaria2.depositar((double) 0);
        contaBancaria2.depositar((double) 1);
        java.lang.Class<?> wildcardClass11 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0", (double) 10);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar(0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0, Saldo: R$ 10.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        boolean boolean28 = contaBancaria18.sacar((double) 0.0f);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Titular: hi!, Saldo: R$ 84.0" + "'", str25, "Titular: hi!, Saldo: R$ 84.0");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 84.0d + "'", double26 == 84.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 32.0", (double) (-1.0f));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0", (double) (byte) 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0", (double) 1.0f);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0, Saldo: R$ 1.0" + "'", str3, "Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0, Saldo: R$ 1.0");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria19);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria43);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.ContaBancaria contaBancaria5 = banco0.buscarContaPorTitular("hi!");
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria5);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        com.example.Banco banco36 = new com.example.Banco();
        banco36.listarContas();
        com.example.ContaBancaria contaBancaria39 = banco36.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco36.listarContas();
        com.example.Banco banco41 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria44 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco41.adicionarConta(contaBancaria44);
        banco41.listarContas();
        banco41.listarContas();
        com.example.ContaBancaria contaBancaria50 = new com.example.ContaBancaria("", 10.0d);
        banco41.adicionarConta(contaBancaria50);
        com.example.Banco banco52 = new com.example.Banco();
        banco52.listarContas();
        com.example.ContaBancaria contaBancaria55 = banco52.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco56 = new com.example.Banco();
        com.example.Banco banco57 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria60 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco57.adicionarConta(contaBancaria60);
        banco56.adicionarConta(contaBancaria60);
        com.example.ContaBancaria contaBancaria65 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco56.adicionarConta(contaBancaria65);
        com.example.Banco banco67 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria70 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco67.adicionarConta(contaBancaria70);
        banco67.listarContas();
        banco67.listarContas();
        com.example.ContaBancaria contaBancaria76 = new com.example.ContaBancaria("", 10.0d);
        banco67.adicionarConta(contaBancaria76);
        banco56.adicionarConta(contaBancaria76);
        banco52.adicionarConta(contaBancaria76);
        com.example.ContaBancaria contaBancaria82 = new com.example.ContaBancaria("hi!", 0.0d);
        banco52.adicionarConta(contaBancaria82);
        contaBancaria82.depositar((double) (short) 100);
        banco41.adicionarConta(contaBancaria82);
        banco36.adicionarConta(contaBancaria82);
        contaBancaria82.depositar((double) (byte) -1);
        banco0.adicionarConta(contaBancaria82);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria33);
        org.junit.Assert.assertNull(contaBancaria35);
        org.junit.Assert.assertNull(contaBancaria39);
        org.junit.Assert.assertNull(contaBancaria55);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        contaBancaria13.depositar((double) 10.0f);
        boolean boolean25 = contaBancaria13.sacar(0.0d);
        java.lang.Class<?> wildcardClass26 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str17, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 1.0", 88.0d);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        contaBancaria22.depositar((double) (-1));
        contaBancaria22.depositar(1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str26, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str27, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        boolean boolean6 = contaBancaria2.sacar((double) (byte) -1);
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        double double8 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        com.example.ContaBancaria contaBancaria34 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria34);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 0.0d);
        boolean boolean4 = contaBancaria2.sacar(100.0d);
        boolean boolean6 = contaBancaria2.sacar(87.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        contaBancaria27.depositar((double) (byte) 1);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(contaBancaria27);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        boolean boolean4 = contaBancaria2.sacar((double) '#');
        boolean boolean6 = contaBancaria2.sacar((double) 100);
        contaBancaria2.depositar(53.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        java.lang.String str65 = contaBancaria53.exibirDetalhes();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria29);
        org.junit.Assert.assertNotNull(contaBancaria38);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str59, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 52.0d + "'", double60 == 52.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 52.0d + "'", double62 == 52.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str63, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str65, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", 10.0d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.lang.String str45 = contaBancaria42.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria10);
        org.junit.Assert.assertNull(contaBancaria15);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Titular: hi!, Saldo: R$ 0.0" + "'", str45, "Titular: hi!, Saldo: R$ 0.0");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 20.0", (double) (byte) 1);
        contaBancaria2.depositar((double) 10L);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 11.0" + "'", str5, "Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 11.0");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        contaBancaria8.depositar((-1.0d));
        boolean boolean13 = contaBancaria8.sacar(100.0d);
        double double14 = contaBancaria8.consultarSaldo();
        double double15 = contaBancaria8.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        contaBancaria18.depositar((double) (-1.0f));
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 182.0d + "'", double31 == 182.0d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria9);
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria14 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 84.0, Saldo: R$ 97.0");
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertNull(contaBancaria14);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        contaBancaria18.depositar((double) 1.0f);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        com.example.ContaBancaria contaBancaria35 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str31, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria35);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        com.example.ContaBancaria contaBancaria31 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 100.0f);
        java.lang.String str32 = contaBancaria31.exibirDetalhes();
        boolean boolean34 = contaBancaria31.sacar(152.0d);
        double double35 = contaBancaria31.consultarSaldo();
        banco0.adicionarConta(contaBancaria31);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str32, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", 107.0d);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        com.example.ContaBancaria contaBancaria38 = null;
        banco0.adicionarConta(contaBancaria38);
        com.example.Banco banco40 = new com.example.Banco();
        com.example.Banco banco41 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria44 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco41.adicionarConta(contaBancaria44);
        banco40.adicionarConta(contaBancaria44);
        com.example.ContaBancaria contaBancaria49 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco40.adicionarConta(contaBancaria49);
        com.example.Banco banco51 = new com.example.Banco();
        com.example.Banco banco52 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria55 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco52.adicionarConta(contaBancaria55);
        banco51.adicionarConta(contaBancaria55);
        com.example.ContaBancaria contaBancaria59 = banco51.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco51.listarContas();
        banco51.listarContas();
        com.example.ContaBancaria contaBancaria64 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria64.depositar((double) (byte) -1);
        banco51.adicionarConta(contaBancaria64);
        contaBancaria64.depositar((double) 1.0f);
        banco40.adicionarConta(contaBancaria64);
        double double71 = contaBancaria64.consultarSaldo();
        banco0.adicionarConta(contaBancaria64);
        org.junit.Assert.assertNotNull(contaBancaria59);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 53.0d + "'", double71 == 53.0d);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria7 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 9.0");
        org.junit.Assert.assertNull(contaBancaria7);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
        contaBancaria2.depositar(10.0d);
        double double7 = contaBancaria2.consultarSaldo();
        boolean boolean9 = contaBancaria2.sacar(97.0d);
        java.lang.Class<?> wildcardClass10 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 107.0d + "'", double7 == 107.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: , Saldo: R$ 11.0", (double) 100);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0", (double) (short) -1);
        boolean boolean4 = contaBancaria2.sacar((double) (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        java.lang.Class<?> wildcardClass31 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 32.0", 100.0d);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0", (double) 10L);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str10 = contaBancaria9.exibirDetalhes();
        contaBancaria9.depositar(0.0d);
        banco0.adicionarConta(contaBancaria9);
        boolean boolean15 = contaBancaria9.sacar((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        contaBancaria13.depositar((double) (short) -1);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        boolean boolean18 = contaBancaria15.sacar(1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str16, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0", 107.0d);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        com.example.ContaBancaria contaBancaria58 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 42.0");
        org.junit.Assert.assertNotNull(contaBancaria34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str35, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(contaBancaria58);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 100.0f);
        contaBancaria2.depositar((double) 10.0f);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0", (double) (-1.0f));
        java.lang.String str23 = contaBancaria22.exibirDetalhes();
        banco0.adicionarConta(contaBancaria22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0, Saldo: R$ -1.0" + "'", str23, "Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0, Saldo: R$ -1.0");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 11.0", (double) (-1));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double6 = contaBancaria5.consultarSaldo();
        banco0.adicionarConta(contaBancaria5);
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
        contaBancaria2.depositar(10.0d);
        double double7 = contaBancaria2.consultarSaldo();
        java.lang.String str8 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(182.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 107.0d + "'", double7 == 107.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Titular: hi!, Saldo: R$ 107.0" + "'", str8, "Titular: hi!, Saldo: R$ 107.0");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        java.lang.Class<?> wildcardClass40 = contaBancaria32.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str33, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        com.example.ContaBancaria contaBancaria61 = null;
        banco0.adicionarConta(contaBancaria61);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str5, "Titular: , Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria60);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        boolean boolean8 = contaBancaria4.sacar((double) (byte) 1);
        contaBancaria4.depositar((double) 1.0f);
        boolean boolean12 = contaBancaria4.sacar((double) 100.0f);
        boolean boolean14 = contaBancaria4.sacar(1.0d);
        java.lang.String str15 = contaBancaria4.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 96.0" + "'", str15, "Titular: hi!, Saldo: R$ 96.0");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        java.lang.Class<?> wildcardClass19 = contaBancaria18.getClass();
        org.junit.Assert.assertNull(contaBancaria16);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        contaBancaria50.depositar(162.0d);
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
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        double double55 = contaBancaria50.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        java.lang.Class<?> wildcardClass37 = contaBancaria33.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        com.example.ContaBancaria contaBancaria53 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria53.depositar((double) (-1));
        boolean boolean57 = contaBancaria53.sacar((double) (-1.0f));
        java.lang.String str58 = contaBancaria53.exibirDetalhes();
        contaBancaria53.depositar(53.0d);
        banco0.adicionarConta(contaBancaria53);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(contaBancaria40);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 52.0d + "'", double46 == 52.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str58, "Titular: hi!, Saldo: R$ 97.0");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        com.example.ContaBancaria contaBancaria54 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0", 9.0d);
        banco0.adicionarConta(contaBancaria54);
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(contaBancaria49);
        org.junit.Assert.assertNull(contaBancaria51);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        com.example.ContaBancaria contaBancaria18 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertNull(contaBancaria16);
        org.junit.Assert.assertNotNull(contaBancaria18);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        contaBancaria9.depositar((double) (-1L));
        double double20 = contaBancaria9.consultarSaldo();
        java.lang.Class<?> wildcardClass21 = contaBancaria9.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 84.0d + "'", double20 == 84.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        double double17 = contaBancaria13.consultarSaldo();
        double double18 = contaBancaria13.consultarSaldo();
        java.lang.Class<?> wildcardClass19 = contaBancaria13.getClass();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 32.0", (double) ' ');
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 97.0, Saldo: R$ 100.0, Saldo: R$ 97.0", 0.0d);
        double double3 = contaBancaria2.consultarSaldo();
        double double4 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        com.example.ContaBancaria contaBancaria38 = null;
        banco0.adicionarConta(contaBancaria38);
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        contaBancaria9.depositar((double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str11, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0, Saldo: R$ 1.0", (double) 'a');
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        com.example.ContaBancaria contaBancaria35 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 10.0, Saldo: R$ -1.0", (double) (byte) -1);
        banco0.adicionarConta(contaBancaria35);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria32);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: , Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        contaBancaria13.depositar((double) 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        java.lang.Class<?> wildcardClass35 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0" + "'", str31, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        java.lang.String str38 = contaBancaria32.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Titular: hi!, Saldo: R$ 51.0" + "'", str38, "Titular: hi!, Saldo: R$ 51.0");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        com.example.ContaBancaria contaBancaria53 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 45.0");
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(contaBancaria49);
        org.junit.Assert.assertNull(contaBancaria51);
        org.junit.Assert.assertNull(contaBancaria53);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", 10.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) ' ');
        boolean boolean11 = contaBancaria2.sacar((double) (short) -1);
        java.lang.String str12 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Titular: hi!, Saldo: R$ 20.0" + "'", str12, "Titular: hi!, Saldo: R$ 20.0");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) (-1L));
        contaBancaria2.depositar(88.0d);
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 100.0", (double) (byte) 10);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        contaBancaria49.depositar(99.0d);
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str53, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str54, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        boolean boolean9 = contaBancaria2.sacar((double) ' ');
        java.lang.String str10 = contaBancaria2.exibirDetalhes();
        java.lang.String str11 = contaBancaria2.exibirDetalhes();
        double double12 = contaBancaria2.consultarSaldo();
        java.lang.Class<?> wildcardClass13 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 20.0" + "'", str10, "Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Titular: hi!, Saldo: R$ 20.0" + "'", str11, "Titular: hi!, Saldo: R$ 20.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 9.0", 53.0d);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        boolean boolean23 = contaBancaria9.sacar((double) ' ');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        banco0.listarContas();
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNotNull(contaBancaria33);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 11.0");
        org.junit.Assert.assertNull(contaBancaria11);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        banco0.adicionarConta(contaBancaria4);
        contaBancaria4.depositar(107.0d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str3, "Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        com.example.ContaBancaria contaBancaria16 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 10.0");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str10, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str13, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNull(contaBancaria16);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        banco0.listarContas();
        com.example.Banco banco5 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco5.adicionarConta(contaBancaria8);
        banco5.listarContas();
        banco5.listarContas();
        com.example.ContaBancaria contaBancaria14 = new com.example.ContaBancaria("", 10.0d);
        banco5.adicionarConta(contaBancaria14);
        com.example.Banco banco16 = new com.example.Banco();
        banco16.listarContas();
        com.example.ContaBancaria contaBancaria19 = banco16.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        com.example.Banco banco20 = new com.example.Banco();
        com.example.Banco banco21 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria24 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco21.adicionarConta(contaBancaria24);
        banco20.adicionarConta(contaBancaria24);
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco20.adicionarConta(contaBancaria29);
        com.example.Banco banco31 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria34 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco31.adicionarConta(contaBancaria34);
        banco31.listarContas();
        banco31.listarContas();
        com.example.ContaBancaria contaBancaria40 = new com.example.ContaBancaria("", 10.0d);
        banco31.adicionarConta(contaBancaria40);
        banco20.adicionarConta(contaBancaria40);
        banco16.adicionarConta(contaBancaria40);
        com.example.ContaBancaria contaBancaria46 = new com.example.ContaBancaria("hi!", 0.0d);
        banco16.adicionarConta(contaBancaria46);
        contaBancaria46.depositar((double) (short) 100);
        banco5.adicionarConta(contaBancaria46);
        banco0.adicionarConta(contaBancaria46);
        com.example.ContaBancaria contaBancaria53 = banco0.buscarContaPorTitular("hi!");
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria19);
        org.junit.Assert.assertNotNull(contaBancaria53);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 20.0", (double) (short) 1);
        contaBancaria2.depositar((double) 10);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        java.lang.Class<?> wildcardClass21 = contaBancaria20.getClass();
        org.junit.Assert.assertNotNull(contaBancaria20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        boolean boolean47 = contaBancaria41.sacar((double) 10.0f);
        java.lang.Class<?> wildcardClass48 = contaBancaria41.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        contaBancaria36.depositar(104.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 0.0", (double) 100L);
        java.lang.Class<?> wildcardClass3 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        com.example.ContaBancaria contaBancaria32 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria32.depositar((double) (byte) -1);
        double double35 = contaBancaria32.consultarSaldo();
        java.lang.String str36 = contaBancaria32.exibirDetalhes();
        java.lang.String str37 = contaBancaria32.exibirDetalhes();
        boolean boolean39 = contaBancaria32.sacar((double) ' ');
        boolean boolean41 = contaBancaria32.sacar(9.0d);
        banco0.adicionarConta(contaBancaria32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str27, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 52.0d + "'", double35 == 52.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str36, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str37, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        boolean boolean5 = contaBancaria2.sacar((double) 100L);
        contaBancaria2.depositar((double) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 100.0", (double) 0);
        boolean boolean4 = contaBancaria2.sacar(88.0d);
        double double5 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        java.lang.Class<?> wildcardClass17 = banco0.getClass();
        org.junit.Assert.assertNull(contaBancaria16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 100.0", (double) 0);
        double double3 = contaBancaria2.consultarSaldo();
        java.lang.String str4 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 100.0, Saldo: R$ 0.0" + "'", str4, "Titular: Titular: hi!, Saldo: R$ 100.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        double double3 = contaBancaria2.consultarSaldo();
        boolean boolean5 = contaBancaria2.sacar((double) ' ');
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar((double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 20.0" + "'", str6, "Titular: hi!, Saldo: R$ 20.0");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(contaBancaria32);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        java.lang.String str33 = contaBancaria28.exibirDetalhes();
        java.lang.Class<?> wildcardClass34 = contaBancaria28.getClass();
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str33, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
        boolean boolean6 = contaBancaria2.sacar((double) (-1.0f));
        java.lang.Class<?> wildcardClass7 = contaBancaria2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(contaBancaria26);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 0.0", (double) (byte) 1);
        banco0.adicionarConta(contaBancaria36);
        org.junit.Assert.assertNull(contaBancaria3);
        org.junit.Assert.assertNull(contaBancaria33);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        contaBancaria54.depositar((double) 0);
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria33);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean32 = contaBancaria30.sacar((double) (-1L));
        banco27.adicionarConta(contaBancaria30);
        com.example.ContaBancaria contaBancaria35 = banco27.buscarContaPorTitular("Titular: , Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria38 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria38.depositar((double) (byte) -1);
        double double41 = contaBancaria38.consultarSaldo();
        java.lang.String str42 = contaBancaria38.exibirDetalhes();
        banco27.adicionarConta(contaBancaria38);
        com.example.Banco banco44 = new com.example.Banco();
        banco44.listarContas();
        banco44.listarContas();
        com.example.ContaBancaria contaBancaria49 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double50 = contaBancaria49.consultarSaldo();
        banco44.adicionarConta(contaBancaria49);
        banco27.adicionarConta(contaBancaria49);
        java.lang.String str53 = contaBancaria49.exibirDetalhes();
        banco0.adicionarConta(contaBancaria49);
        contaBancaria49.depositar((double) '4');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(contaBancaria26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(contaBancaria35);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 52.0d + "'", double41 == 52.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str42, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str53, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) (byte) 1);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 1.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ -1.0, Saldo: R$ 1.0");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        banco0.adicionarConta(contaBancaria36);
        contaBancaria36.depositar(0.0d);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 182.0d + "'", double31 == 182.0d);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        com.example.ContaBancaria contaBancaria44 = banco0.buscarContaPorTitular("");
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str39, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(contaBancaria44);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 10.0d);
        contaBancaria2.depositar((double) (byte) -1);
        boolean boolean6 = contaBancaria2.sacar((double) 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        com.example.ContaBancaria contaBancaria29 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria29.depositar((double) (-1));
        boolean boolean33 = contaBancaria29.sacar((double) (-1.0f));
        banco0.adicionarConta(contaBancaria29);
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        boolean boolean24 = contaBancaria17.sacar((double) 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 1.0", (double) (byte) 10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        java.lang.Class<?> wildcardClass56 = banco0.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 107.0d + "'", double53 == 107.0d);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria4 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 20.0");
        com.example.ContaBancaria contaBancaria7 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        double double8 = contaBancaria7.consultarSaldo();
        contaBancaria7.depositar((double) (-1.0f));
        contaBancaria7.depositar((double) (-1L));
        banco0.adicionarConta(contaBancaria7);
        boolean boolean15 = contaBancaria7.sacar((double) (byte) -1);
        org.junit.Assert.assertNull(contaBancaria4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        com.example.ContaBancaria contaBancaria21 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 117.0");
        org.junit.Assert.assertNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria21);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 97.0", (double) 100.0f);
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        boolean boolean33 = contaBancaria24.sacar((double) 10);
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 53.0d + "'", double31 == 53.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        contaBancaria9.depositar((double) (-1L));
        boolean boolean21 = contaBancaria9.sacar(35.0d);
        java.lang.Class<?> wildcardClass22 = contaBancaria9.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("");
        com.example.ContaBancaria contaBancaria10 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 0.0");
        com.example.ContaBancaria contaBancaria12 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 0.0");
        com.example.Banco banco13 = new com.example.Banco();
        com.example.Banco banco14 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria17 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco14.adicionarConta(contaBancaria17);
        banco13.adicionarConta(contaBancaria17);
        com.example.ContaBancaria contaBancaria22 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco13.adicionarConta(contaBancaria22);
        com.example.ContaBancaria contaBancaria25 = banco13.buscarContaPorTitular("Titular: hi!, Saldo: R$ 100.0");
        com.example.ContaBancaria contaBancaria28 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean30 = contaBancaria28.sacar((double) (-1L));
        contaBancaria28.depositar((-1.0d));
        java.lang.String str33 = contaBancaria28.exibirDetalhes();
        double double34 = contaBancaria28.consultarSaldo();
        banco13.adicionarConta(contaBancaria28);
        java.lang.String str36 = contaBancaria28.exibirDetalhes();
        banco0.adicionarConta(contaBancaria28);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNull(contaBancaria10);
        org.junit.Assert.assertNull(contaBancaria12);
        org.junit.Assert.assertNull(contaBancaria25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str33, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str36, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0, Saldo: R$ 162.0", 96.0d);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        com.example.ContaBancaria contaBancaria47 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 9.0", 100.0d);
        banco0.adicionarConta(contaBancaria47);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertNotNull(contaBancaria10);
        org.junit.Assert.assertNull(contaBancaria15);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        com.example.ContaBancaria contaBancaria31 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 84.0");
        org.junit.Assert.assertNotNull(contaBancaria25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str26, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(contaBancaria29);
        org.junit.Assert.assertNull(contaBancaria31);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        com.example.Banco banco20 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco20.adicionarConta(contaBancaria23);
        banco20.listarContas();
        banco20.listarContas();
        com.example.Banco banco27 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria30 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco27.adicionarConta(contaBancaria30);
        banco27.listarContas();
        banco27.listarContas();
        com.example.ContaBancaria contaBancaria36 = new com.example.ContaBancaria("", 10.0d);
        banco27.adicionarConta(contaBancaria36);
        banco20.adicionarConta(contaBancaria36);
        boolean boolean40 = contaBancaria36.sacar((-1.0d));
        boolean boolean42 = contaBancaria36.sacar((double) (byte) 10);
        java.lang.String str43 = contaBancaria36.exibirDetalhes();
        banco0.adicionarConta(contaBancaria36);
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str43, "Titular: , Saldo: R$ 0.0");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        boolean boolean22 = contaBancaria13.sacar((double) '#');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        java.lang.Class<?> wildcardClass26 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        double double56 = contaBancaria50.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str35, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        java.lang.Class<?> wildcardClass4 = contaBancaria2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        banco0.listarContas();
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        com.example.ContaBancaria contaBancaria20 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ -1.0");
        com.example.ContaBancaria contaBancaria23 = new com.example.ContaBancaria("", (double) (byte) 10);
        contaBancaria23.depositar(107.0d);
        banco0.adicionarConta(contaBancaria23);
        double double27 = contaBancaria23.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str14, "Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 117.0d + "'", double27 == 117.0d);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        contaBancaria18.depositar((double) 100L);
        double double29 = contaBancaria18.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Titular: hi!, Saldo: R$ 84.0" + "'", str25, "Titular: hi!, Saldo: R$ 84.0");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 84.0d + "'", double26 == 84.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 184.0d + "'", double29 == 184.0d);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        boolean boolean23 = contaBancaria19.sacar((double) (byte) 0);
        double double24 = contaBancaria19.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str28, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (-1.0d));
        boolean boolean4 = contaBancaria2.sacar((double) 100.0f);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        double double6 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0" + "'", str5, "Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0", (double) 1);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        contaBancaria13.depositar((double) 1.0f);
        java.lang.Class<?> wildcardClass19 = contaBancaria13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        double double3 = contaBancaria2.consultarSaldo();
        boolean boolean5 = contaBancaria2.sacar(0.0d);
        boolean boolean7 = contaBancaria2.sacar(97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        banco0.listarContas();
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str41, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str46, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str48, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str49, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str77, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        contaBancaria18.depositar((double) (-1.0f));
        boolean boolean26 = contaBancaria18.sacar(32.0d);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str22, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria13 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        banco0.adicionarConta(contaBancaria13);
        banco0.listarContas();
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        com.example.ContaBancaria contaBancaria32 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0");
        org.junit.Assert.assertNotNull(contaBancaria19);
        org.junit.Assert.assertNull(contaBancaria32);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("hi!");
        boolean boolean10 = contaBancaria8.sacar((double) (-1.0f));
        contaBancaria8.depositar((double) (-1.0f));
        boolean boolean14 = contaBancaria8.sacar(32.0d);
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        double double25 = contaBancaria18.consultarSaldo();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        com.example.ContaBancaria contaBancaria28 = null;
        banco0.adicionarConta(contaBancaria28);
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        java.lang.String str49 = contaBancaria46.exibirDetalhes();
        org.junit.Assert.assertNotNull(contaBancaria39);
        org.junit.Assert.assertNull(contaBancaria41);
        org.junit.Assert.assertNull(contaBancaria43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Titular: hi!, Saldo: R$ 100.0" + "'", str49, "Titular: hi!, Saldo: R$ 100.0");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        com.example.ContaBancaria contaBancaria19 = banco0.buscarContaPorTitular("Titular: Titular: hi!, Saldo: R$ 20.0, Saldo: R$ 11.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertNull(contaBancaria17);
        org.junit.Assert.assertNull(contaBancaria19);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        double double85 = contaBancaria73.consultarSaldo();
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
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 1.0d + "'", double85 == 1.0d);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        com.example.ContaBancaria contaBancaria42 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 117.0");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertNull(contaBancaria30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str34, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str36, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(contaBancaria42);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria46 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str47 = contaBancaria46.exibirDetalhes();
        contaBancaria46.depositar(0.0d);
        contaBancaria46.depositar((double) 0L);
        banco0.adicionarConta(contaBancaria46);
        java.lang.Class<?> wildcardClass53 = banco0.getClass();
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str39, "Titular: hi!, Saldo: R$ 97.0");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str47, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        boolean boolean36 = contaBancaria28.sacar((double) 'a');
        java.lang.Class<?> wildcardClass37 = contaBancaria28.getClass();
        org.junit.Assert.assertNotNull(contaBancaria28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str29, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 52.0d + "'", double33 == 52.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 52.0d + "'", double34 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        boolean boolean29 = contaBancaria23.sacar(99.0d);
        java.lang.Class<?> wildcardClass30 = contaBancaria23.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        com.example.ContaBancaria contaBancaria19 = new com.example.ContaBancaria("Titular: Titular: hi!, Saldo: R$ 51.0, Saldo: R$ 100.0", (double) 100.0f);
        banco0.adicionarConta(contaBancaria19);
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(contaBancaria14);
        org.junit.Assert.assertNull(contaBancaria16);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) 10L);
        contaBancaria2.depositar((double) (short) 100);
        contaBancaria2.depositar((double) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        banco0.listarContas();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str15, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        boolean boolean29 = contaBancaria27.sacar((double) (short) 100);
        boolean boolean31 = contaBancaria27.sacar(10.0d);
        java.lang.Class<?> wildcardClass32 = contaBancaria27.getClass();
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertNull(contaBancaria20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str24, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
        org.junit.Assert.assertNotNull(contaBancaria27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        com.example.ContaBancaria contaBancaria31 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 0.0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str21, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria31);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 20.0", (double) 1L);
    }
}

