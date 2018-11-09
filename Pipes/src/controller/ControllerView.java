/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
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
    private String resultado="";
    private int [] ordem = new int[5];
    private int pontador=0;
    
    public ControllerView(Modelo model, View view) {
        this.model = model;
        this.view = view;
        this.model.attach(this);
    }
    
    @Override
    public void Update() {
        
    }
    
    public void TratarBox(ActionEvent evt) {
        if ("Adiciona A".equals(evt.getActionCommand()) && this.view.getBoxAdiciona().isSelected() ) {
            
            this.resultado=" "+resultado+evt.getActionCommand()+" ";
            this.view.getLabel_Ordem().setText(resultado);
            this.addOrdem(1);
            
        }
        if ("Converte Minuscula".equals(evt.getActionCommand()) && 
                this.view.getBoxConverteMinuscula().isSelected()) {
            
             this.resultado=" "+resultado+evt.getActionCommand()+" ";
            this.view.getLabel_Ordem().setText(resultado);
            this.addOrdem(2);

        }
        if ("Converte Maiuscula".equals(evt.getActionCommand()) && 
                this.view.getBoxMaiuscula().isSelected() ) {
            
            this.resultado=" "+resultado+evt.getActionCommand()+" ";
            this.view.getLabel_Ordem().setText(resultado);
            this.addOrdem(3);
        }
        if ("Remove Maiusculas".equals(evt.getActionCommand()) && 
                this.view.getBoxRemoveMaiuscula().isSelected()) {
            
            this.resultado=" "+resultado+evt.getActionCommand()+" ";
            this.view.getLabel_Ordem().setText(resultado);
            this.addOrdem(4);
            
        }
        
        if ("Tira vogais".equals(evt.getActionCommand()) && 
                this.view.getBoxTiraVogais().isSelected()) {
            
            this.resultado=" "+resultado+evt.getActionCommand()+" ";
            this.view.getLabel_Ordem().setText(resultado);
            
            this.addOrdem(5);
        }
        
        
        //parte2
        
        if ("Adiciona A".equals(evt.getActionCommand()) && 
                !this.view.getBoxAdiciona().isSelected() ) {
            this.resultado=this.resultado.replaceAll("Adiciona A", "");
             this.view.getLabel_Ordem().setText(resultado);
            this.RemoverOrdem(1);
        }
        if ("Converte Minuscula".equals(evt.getActionCommand()) && 
                !this.view.getBoxConverteMinuscula().isSelected()) {
            
             this.resultado=this.resultado.replaceAll("Converte Minuscula", "");
             this.view.getLabel_Ordem().setText(resultado);
            this.RemoverOrdem(2);
        }
        if ("Converte Maiuscula".equals(evt.getActionCommand()) && 
                !this.view.getBoxMaiuscula().isSelected() ) {
            this.resultado=this.resultado.replaceAll("Converte Maiuscula", "");
             this.view.getLabel_Ordem().setText(resultado);
            this.RemoverOrdem(3);
        }
        if ("Remove Maiusculas".equals(evt.getActionCommand()) && 
                !this.view.getBoxRemoveMaiuscula().isSelected()) {
            this.resultado=this.resultado.replaceAll("Remove Maiusculas", "");
             this.view.getLabel_Ordem().setText(resultado);
            this.RemoverOrdem(4);
        }
        
        if ("Tira vogais".equals(evt.getActionCommand()) && 
                !this.view.getBoxTiraVogais().isSelected()) {
            
            this.resultado=this.resultado.replaceAll("Tira vogais", "");
             this.view.getLabel_Ordem().setText(resultado);
            this.RemoverOrdem(5);
        }
        
      
    }
    
    public void addOrdem(int number){
        
        this.ordem[pontador]=number;
        this.pontador++;
        
    }
    
    public void RemoverOrdem(int number){
        for (int i = 0; i < this.ordem.length; i++) {
            
            if (ordem[i]!=0 && ordem[i]==number) {
                
                ordem[i]=0;
                
            }
            if (ordem[i]==0 &&( ordem.length!=(i+1)) &&  ordem[i+1]!=0) {
                int aux;
                
                aux=ordem[i+1];
                ordem[i]=aux;
                ordem[i+1]=0;
                
            }
            
        }
        this.pontador--;
    }

    public int[] getOrdem() {
        return ordem;
    }

    public void trataBotao(ActionEvent evt) {
        
        
        if ("Alterar".equals(evt.getActionCommand())) {
            this.view.getLabelResult().setText("");
            this.model.transforma(this.ordem, this.view.getTxtEntrada().getText());
        }
        if ("Limpar".equals(evt.getActionCommand())) {
            this.limpaOrdem();
            this.view.getBoxAdiciona().setSelected(false);
            this.view.getBoxConverteMinuscula().setSelected(false);
            this.view.getBoxMaiuscula().setSelected(false);
            this.view.getBoxRemoveMaiuscula().setSelected(false);
            this.view.getBoxTiraVogais().setSelected(false);
            this.view.getTxtEntrada().setText("");
            this.view.getLabel_Ordem().setText("");
            this.view.getLabelResult().setText("");
            this.resultado="";
        }
    }
    
    public void limpaOrdem(){
        for (int i = 0; i < this.ordem.length; i++) {
           this.ordem[i]=0;
        }
        this.pontador=0;
    }
    
}
