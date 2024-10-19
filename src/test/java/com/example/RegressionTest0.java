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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.example.Main main0 = new com.example.Main();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        java.lang.Class<?> wildcardClass5 = contaBancaria2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        boolean boolean6 = contaBancaria2.sacar((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(0.0d);
        contaBancaria2.depositar((double) 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        contaBancaria2.depositar((double) 10L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
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
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        java.lang.String str5 = contaBancaria3.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ 97.0" + "'", str5, "Titular: hi!, Saldo: R$ 97.0");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean5 = contaBancaria3.sacar((double) (-1L));
        banco0.adicionarConta(contaBancaria3);
        com.example.ContaBancaria contaBancaria9 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str10 = contaBancaria9.exibirDetalhes();
        contaBancaria9.depositar(0.0d);
        banco0.adicionarConta(contaBancaria9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str10, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (-1L));
        contaBancaria2.depositar((double) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 10.0d);
        contaBancaria2.depositar((double) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0" + "'", str3, "Titular: Titular: hi!, Saldo: R$ 52.0, Saldo: R$ 0.0");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ -1.0", (double) 100.0f);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double3 = contaBancaria2.consultarSaldo();
        boolean boolean5 = contaBancaria2.sacar((-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) 'a');
        contaBancaria2.depositar((double) (-1));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str17, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", 0.0d);
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: , Saldo: R$ 0.0" + "'", str3, "Titular: , Saldo: R$ 0.0");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        contaBancaria8.depositar((-1.0d));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (-1.0d));
        contaBancaria2.depositar(1.0d);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        contaBancaria2.depositar(0.0d);
        contaBancaria2.depositar(100.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str3, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double9 = contaBancaria8.consultarSaldo();
        contaBancaria8.depositar((double) 10L);
        banco0.adicionarConta(contaBancaria8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        double double3 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        boolean boolean4 = contaBancaria2.sacar((double) (short) 1);
        boolean boolean6 = contaBancaria2.sacar((double) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (byte) 0);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str5, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
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
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria3 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco0.adicionarConta(contaBancaria3);
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria8 = new com.example.ContaBancaria("hi!", (double) (short) 100);
        banco0.adicionarConta(contaBancaria8);
        com.example.ContaBancaria contaBancaria11 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertNull(contaBancaria11);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 97.0", (double) (short) 100);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        boolean boolean4 = contaBancaria2.sacar((double) (short) 1);
        java.lang.String str5 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Titular: hi!, Saldo: R$ 51.0" + "'", str5, "Titular: hi!, Saldo: R$ 51.0");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
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
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (-1.0f));
        java.lang.String str3 = contaBancaria2.exibirDetalhes();
        double double4 = contaBancaria2.consultarSaldo();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Titular: hi!, Saldo: R$ -1.0" + "'", str3, "Titular: hi!, Saldo: R$ -1.0");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("hi!");
        boolean boolean10 = contaBancaria8.sacar((double) (-1.0f));
        org.junit.Assert.assertNotNull(contaBancaria8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
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
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", 0.0d);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 51.0", (double) (byte) 10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria5 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) 0.0f);
        double double6 = contaBancaria5.consultarSaldo();
        banco0.adicionarConta(contaBancaria5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
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
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str19, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str22, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("", (double) (byte) 100);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
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
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) (short) 0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.example.Banco banco0 = new com.example.Banco();
        banco0.listarContas();
        com.example.ContaBancaria contaBancaria3 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 10.0");
        org.junit.Assert.assertNull(contaBancaria3);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        com.example.ContaBancaria contaBancaria8 = banco0.buscarContaPorTitular("Titular: hi!, Saldo: R$ 97.0");
        banco0.listarContas();
        banco0.listarContas();
        org.junit.Assert.assertNotNull(contaBancaria8);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.example.Banco banco0 = new com.example.Banco();
        com.example.Banco banco1 = new com.example.Banco();
        com.example.ContaBancaria contaBancaria4 = new com.example.ContaBancaria("hi!", (double) 'a');
        banco1.adicionarConta(contaBancaria4);
        banco0.adicionarConta(contaBancaria4);
        boolean boolean8 = contaBancaria4.sacar((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
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
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) '4');
        contaBancaria2.depositar((double) (byte) -1);
        double double5 = contaBancaria2.consultarSaldo();
        java.lang.String str6 = contaBancaria2.exibirDetalhes();
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str6, "Titular: hi!, Saldo: R$ 52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 52.0" + "'", str7, "Titular: hi!, Saldo: R$ 52.0");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("Titular: hi!, Saldo: R$ 52.0", (double) ' ');
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.example.ContaBancaria contaBancaria2 = new com.example.ContaBancaria("hi!", (double) (byte) 10);
        boolean boolean4 = contaBancaria2.sacar((double) (-1L));
        contaBancaria2.depositar((-1.0d));
        java.lang.String str7 = contaBancaria2.exibirDetalhes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Titular: hi!, Saldo: R$ 10.0" + "'", str7, "Titular: hi!, Saldo: R$ 10.0");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
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
        org.junit.Assert.assertNotNull(contaBancaria18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }
}

