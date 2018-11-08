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
public class StrategyConvertMinusculaTest {
    StrategyConvertMinuscula con;
    public StrategyConvertMinusculaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.con= new StrategyConvertMinuscula();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of alterarString method, of class StrategyConvertMinuscula.
     */
    @Test
    public void testAlterarString() {
        
        
        assertEquals("hello",this.con.alterarString("HELLO"));
    }
    
}
