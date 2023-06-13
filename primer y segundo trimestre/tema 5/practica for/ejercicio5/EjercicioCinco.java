import java.util.Scanner;
/**
 * muestre por pantalla de valor de A elevado a B
 * 
 * Miguel Cedric
 */
 
public class EjercicioCinco {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Dime un numero: ");
    int Numero = s.nextInt();
    
    Scanner a = new Scanner(System.in);
    System.out.print("Dime otro numero: ");
    int NumeroDos = a.nextInt();
    
    for (int i = 1; i <=NumeroDos ; i= i + 1 )
    {
      int acum = acum * Numero;
    }
     System.out.println(" el resultado es:" acum );
  }
}
