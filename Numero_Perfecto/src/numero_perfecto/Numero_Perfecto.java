/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero_perfecto;

import java.util.Scanner;

/**
 *
 * @author SCIS3-09
 */
public class Numero_Perfecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long startTime = System.nanoTime();
        int number = 99;
        
        int divisor;
        int par = 0; 
  
        for (int i = 1; i < number; i++) {
            divisor = number % i;
       
            if (divisor == 0) {
                par = i + par;
            }
        }
        if (par == number ) {
            System.out.println("Si es pefecto");
        }else{
            System.out.println("No es pefecto");
        }
        long endTime = System.nanoTime();
  
      System.out.println("Duración " +  (endTime-startTime) + " Nanosegundos.");
    }
    
}
