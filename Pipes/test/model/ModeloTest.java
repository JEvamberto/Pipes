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
public class ModeloTest {
    
    
    Modelo modelo ;
    public ModeloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.modelo= new Modelo();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of modelo method, of class Modelo.
     */
    @Test
    public void testModelo() {
      
    }

    /**
     * Test of add method, of class Modelo.
     */
    @Test
    public void testAdd() {
     
    }

    /**
     * Test of AdicionandoEmOrdem method, of class Modelo.
     */
    @Test
    public void testAdicionandoEmOrdem() {
      
       
    }

    /**
     * Test of transforma method, of class Modelo.
     */
    @Test
    public void testTransforma() {
     
        int [] ordem = new int [5];
        
        
        ordem[0]=1;
        ordem[1]=4;
        ordem[2]=2;
        ordem[3]=3;
        ordem[4]=5;
        assertEquals("ateste",this.modelo.transforma(ordem, "Teste"));
        
      
    }

    /**
     * Test of getOrdem method, of class Modelo.
     */
    @Test
    public void testGetOrdem() {
        
    }

    /**
     * Test of setOrdem method, of class Modelo.
     */
    @Test
    public void testSetOrdem() {
       
    }
    
}
