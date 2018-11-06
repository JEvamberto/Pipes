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
public class StrategyRemoveMaiuscula implements Strategy {

    @Override
    public String alterarString(String frase) {
        
        if (frase != null) {
            
          char [] fraseArray = frase.toCharArray();
           int count=0;
          
            for (int i = 0; i < fraseArray.length; i++) {
                if (Character.isUpperCase(fraseArray[i])) {
                    count ++;
                }
            }
            count=0;
            char oficial[]= new char [fraseArray.length-count];
            
            for (int i = 0; i < fraseArray.length; i++) {
            
                if (Character.isUpperCase(fraseArray[i])) {
                       
                }else{
                    oficial[count]=fraseArray[i];
                    count++;
                }
               
            }
            System.out.println(frase);
            
            frase="";
            for (int i = 0; i < oficial.length; i++) {
                
                frase=frase+""+oficial[i];
                
            }
            System.out.println(frase);
         
        

        } else {
            return null;
        }

        return frase;
    }

}
