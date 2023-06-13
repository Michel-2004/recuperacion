import java.util.Scanner;
/**
 * muestra numeros naturales hasta un valor introducido por teclado.
 * 
 * Miguel Cedric
 */
 
public class EjercicioDos {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Dime un numero: ");
    int Numero = s.nextInt();
    for (int i = 0; i <=Numero ; i= i+1 )
    {
      System.out.println(i);
    }
  }
}
