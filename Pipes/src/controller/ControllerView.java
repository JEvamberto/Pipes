/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import model.Modelo;
import model.Observer;
import view.View;

/**
 *
 * @author jose
 */
public class ControllerView implements Observer {
    
    private Modelo model;
    private View view;
    public ControllerView(Modelo model, View view){
        this.model=model;
        this.view=view;
        this.model.attach(this);
    }

    @Override
    public void Update() {
        
    }
    
}
