/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador=1;
        int contador2;
        String cadena="";
        for(contador2=1;contador2<=7;contador2++){
            if(contador%2==0){
                contador = contador + 1;
            cadena= String.format("%s+1/%d, ", cadena,contador);
        }else{
                contador = contador + 2;
            cadena= String.format("%s-1/%d, ", cadena,contador);
                
            }
            contador2=contador2+1;
            contador=contador+1;
        }
        System.out.printf("1, %s",cadena);
    }
    
}
