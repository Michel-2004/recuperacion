import java.util.Scanner;

/**
 * Calcula el salario semanal de un empleado
 * teniendo en cuenta que cobra 12€/hora
 * 
 * Miguel Cedric
 *  
 */

public class EjercicioOcho {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
  
    System.out.print(" introduzca el numero de horas diarias:  ");
    double horas;
    horas = s.nextInt();
    
    double totalsemanal;
    totalsemanal = horas * 5;
    
    double total;
    total= totalsemanal * 12;
    
    System.out.println( "ha trabajado un total de " + totalsemanal + " horas a la semana");
    System.out.println( "el total es " + total);
  }
}
