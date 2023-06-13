import java.util.Scanner;

/**
 * Conversor de Mb a Kb
 * 
 * Miguel Cedric
 *  
 */

public class EjercicioDiez {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
  
    System.out.print(" introduzca el numero de Mb:  ");
    int mb;
    mb = s.nextInt();
    
    int kb;
    kb = 1024;
    
    int total;
    total= mb * kb;
    
    System.out.println( "el total es " + total);
  }
}
