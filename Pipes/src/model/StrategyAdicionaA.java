/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jose
 */
public class StrategyAdicionaA implements Strategy {

    @Override
    public String alterarString(String frase) {
           
        if ( frase != null) {
            
            String add= "A"+frase;
            frase=add;
            
        }else{
            
            return null;
        
        }
        
        
        return frase;
    }
    
}
