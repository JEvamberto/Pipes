/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose
 */
public class StrategyRemoveMaiusculaTest {

    private StrategyRemoveMaiuscula teste;

    public StrategyRemoveMaiusculaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        teste = new StrategyRemoveMaiuscula();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of alterarString method, of class StrategyRemoveMaiuscula.
     */
    @Test
    public void testAlterarString() {
        String nome = "Hello";

        System.out.println(nome);
        nome = nome.replaceAll("He", "Do");
        System.out.println(nome);

        assertEquals("uero", this.teste.alterarString("Quero"));

    }

}
