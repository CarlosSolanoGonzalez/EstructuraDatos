/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradatos;

import java.util.Random;

/**
 *
 * @author CHARLIE-PC
 */
public class GetHigherNumber {
    private int numeros[]= new int[10]; 
    Random rand= new Random();
    
    
    private void generateRandomNumber(){
        
          for(int i=0; i<numeros.length; i++){
            numeros[i]=rand.nextInt(50);
            
        }
        
        for(int m=0; m<numeros.length; m++){
            System.out.println("En la posicion "+m+" esta el numero: "+numeros[m]);
        }
        
    }
    private int higherNumber(int num, int numPos){
        
        if(num>=numPos){
            return num;
        }else{
            return numPos;
        }
    }
    
    private int arrayLength(){
        return numeros.length-1;
    }
    
    private void getHigherNumber(int pos,int arrayLength,int numHigh){
        if(pos==arrayLength){
            System.out.println("El numero mayor es: "+ numHigh);
            
        }else{
           numHigh=higherNumber(numHigh,numeros[pos]);
            getHigherNumber(pos+1,arrayLength,numHigh);
        }
    }
    
    public void star(){
        generateRandomNumber();
        int arrayLength = arrayLength();
        
        getHigherNumber(0,arrayLength,0);
    }
    
}
