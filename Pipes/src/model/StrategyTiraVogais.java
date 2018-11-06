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
public class StrategyTiraVogais implements Strategy{

    @Override
    public String alterarString(String frase) {
                
        if (frase != null) {
            
          char [] fraseArray = frase.toCharArray();
           int count=0;
          
            for (int i = 0; i < fraseArray.length; i++) {
                if (fraseArray[i]== 'a' || fraseArray[i]== 'A' || fraseArray[i]== 'e' || fraseArray[i]== 'E' ||
                    fraseArray[i]== 'i' ||   fraseArray[i]== 'i' ||  fraseArray[i]== 'U' || fraseArray[i]== 'u' 
                    || fraseArray[i] == 'o' || fraseArray[i] =='O') {
                    count ++;
                }
            }
            count=0;
            char oficial[]= new char [fraseArray.length-count];
            
            for (int i = 0; i < fraseArray.length; i++) {
             
                if (fraseArray[i]== 'a' || fraseArray[i]== 'A' || fraseArray[i]== 'e' || fraseArray[i]== 'E' ||
                    fraseArray[i]== 'i' ||   fraseArray[i]== 'i' ||  fraseArray[i]== 'U' || fraseArray[i]== 'u' 
                    || fraseArray[i] == 'o' || fraseArray[i] =='O' ) {
                       
                }else{
                    oficial[count]=fraseArray[i];
                    count++;
                }
               
            }
            
            
            frase= "";
            for (int i = 0; i < oficial.length; i++) {
                
                frase=frase+""+oficial[i];
                
            }
      
         
        

        } else {
            return null;
        }

        return frase;
    }
    
}
