/**
 * muestre por pantalla, independientemente la suma de los números 
 * pares y la suma de impares de los números comprendidos 
 * entre 100 y 200
 * 
 * Miguel Cedric
 */
 
public class EjercicioCuatro {
  public static void main(String[] args){
    for (int i = 100; i <=200 ; i= i + 2 )
    {
      System.out.println(i);
    }
    
    System.out.println("-------------");
    
    for (int a = 100; a <=200 ; a= a + 1 )
    {
      System.out.println(a);
    }
  }
}
