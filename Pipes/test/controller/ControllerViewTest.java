/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Modelo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import view.View;

/**
 *
 * @author jose
 */
public class ControllerViewTest {
    
    ControllerView controller;
    View view;
    Modelo model;
    
    public ControllerViewTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.controller= new ControllerView(model, view);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Update method, of class ControllerView.
     */
    @Test
    public void testUpdate() {
    }

    /**
     * Test of TratarBox method, of class ControllerView.
     */
    @Test
    public void testTratarBox() {
       
    }

    /**
     * Test of addOrdem method, of class ControllerView.
     */
    @Test
    public void testAddOrdem() {
      
    }

    /**
     * Test of RemoverOrdem method, of class ControllerView.
     */
    @Test
    public void testRemoverOrdem() {
        this.controller.getOrdem()[0]=1;
        this.controller.getOrdem()[1]=2;
        this.controller.getOrdem()[2]=3;
        this.controller.getOrdem()[3]=4;
        this.controller.getOrdem()[4]=5;
        int teste [] = new int[5];
        //assertEquals(teste, this.controller.addOrdem(i));
    }
    
}
