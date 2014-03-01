/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Coqiz
 */
public class PilaArreglo {
    
    Integer [] pila = new Integer[10];
     int tope=-1;
     
     
     void push(Integer dato){
     if(tope<pila.length-1){
     
     pila[tope+1] = dato;
     tope++;
     
     
     }else{
    System.out.println("La pila esta llena"); 
     
     }
     
     
     }
     
     Integer pop(){
     Integer resultado =0;
     
     if(tope>-1){
         resultado=pila[tope];
         tope--;
         
       
     }else
     System.out.println("La Pila esta vacia");
     return resultado;
     
     }
}
