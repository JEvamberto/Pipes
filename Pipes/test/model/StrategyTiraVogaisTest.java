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
public class StrategyTiraVogaisTest {
    
    StrategyTiraVogais v;
    public StrategyTiraVogaisTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.v=  new StrategyTiraVogais();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of alterarString method, of class StrategyTiraVogais.
     */
    @Test
    public void testAlterarString() {
        assertEquals("qr",this.v.alterarString("quero"));
    }   
    
}
