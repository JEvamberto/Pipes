/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class Modelo {

    private ArrayList<Strategy> strategy = new ArrayList();

    private StrategyAdicionaA adicionaA;
    private StrategyConvertMinuscula convertMinuscula;
    private StrategyConverteMaiuscula convertMaiuscula;
    private StrategyRemoveMaiuscula removeMaiuscula;
    private StrategyTiraVogais tiraVogais;
    //constantes
    private final int ADICIONAA=1;
    private final int CONVERTMINUSCULA=2;
    private final int CONVERTEMAIUSCULA=3;
    private final int REMOVEMAIUSCULA=4;
    private final int TIRAVOGAIS=5;
    
    private int ordem [] ;

    public void modelo() {
        
        this.adicionaA = new StrategyAdicionaA();
        this.convertMinuscula = new StrategyConvertMinuscula();
        this.convertMaiuscula = new StrategyConverteMaiuscula();
        this.removeMaiuscula = new StrategyRemoveMaiuscula();
        this.tiraVogais = new StrategyTiraVogais();
        this.ordem= new int[5];
    }

    public void add(Strategy strategy) {
        this.strategy.add(strategy);
        
    }
    public void AdicionandoEmOrdem(){
        
        for (int i = 0; i < this.ordem.length; i++) {
       
            if (this.ordem[i]==ADICIONAA) {
                   this.add(this.adicionaA);
            }
            if (this.ordem[i]== CONVERTMINUSCULA ){
                this.add(this.convertMinuscula);
            }
            
            if (this.ordem[i]==CONVERTEMAIUSCULA) {
                this.add(this.convertMaiuscula);
            }
            
            if (this.ordem[i]==REMOVEMAIUSCULA) {
                this.add(this.removeMaiuscula);
                
            }
            
            if (this.ordem[i]==TIRAVOGAIS) {
                   this.add(this.tiraVogais); 
            }
            
        }
    }
    
    public String transforma(int [] ordem, String frase){
        
        this.ordem=ordem;   
        
        this.AdicionandoEmOrdem();
        
        for (Strategy strategy1 : this.strategy) {
            
            frase=strategy1.alterarString(frase);
        }
        
        return frase;
    }
    
    

}
