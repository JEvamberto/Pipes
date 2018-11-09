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

    private StrategyAdicionaA adicionaA=new StrategyAdicionaA();
    private StrategyConvertMinuscula convertMinuscula=new StrategyConvertMinuscula();;
    private StrategyConverteMaiuscula convertMaiuscula=new StrategyConverteMaiuscula();
    private StrategyRemoveMaiuscula removeMaiuscula=new StrategyRemoveMaiuscula();
    private StrategyTiraVogais tiraVogais=new StrategyTiraVogais();
    private String resultado;

    
    private ArrayList <Observer> observer= new ArrayList();
    //constantes
    private final int ADICIONAA=1;
    private final int CONVERTMINUSCULA=2;
    private final int CONVERTEMAIUSCULA=3;
    private final int REMOVEMAIUSCULA=4;
    private final int TIRAVOGAIS=5;
    
    private int ordem [] =new int[5];

    public void modelo() {
        
        
         
    }
    
    public void attach(Observer observer){
        this.observer.add(observer);
    }
    
    public  void dettach(Observer observer){
        this.observer.add(observer);
    }
    
    public void nofityall(){
        for (Observer observer1 : this.observer)
        {
            
            observer1.Update();
        }
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
        this.setResultado(frase);
        this.nofityall();
        return frase;
    }

    public int[] getOrdem() {
        return ordem;
    }

    public void setOrdem(int[] ordem) {
        this.ordem = ordem;
    }
    
        public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

}
