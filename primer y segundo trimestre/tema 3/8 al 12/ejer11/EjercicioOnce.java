package ejer11;

import java.util.Scanner;

/**
 * Conversor de Kb a Mb
 * 
 * Miguel Cedric
 *  
 */
public class EjercicioOnce {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
      
        System.out.print(" introduzca el numero de Kb:  ");
        int kb;
        kb = s.nextInt();
        
        int mb;
        mb = 1024;
        
        int total;
        total=kb/mb;
        
        System.out.println( "el total es " + total);
      }
}
