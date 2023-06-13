package normales.ejer18;

/**
 * 
* Ejercicio 18
* 
* Miguel Cedric
*/
public class Ejercicio18{
  public static void main(String[] args) {
    int[] a = new int[10];
    int[] menores = new int[10];
    int[] mayores = new int[10];
    int cuentaMenores = 0;
    int cuentaMayores = 0;

    for (int i = 0; i < 10; i++) {
    a[i] = (int) (Math.random() * 201);
    if (a[i] <= 100) {
      menores[cuentaMenores++] = a[i];
    } else {
      mayores[cuentaMayores++] = a[i];
    }
    }

    System.out.println("array original:");
    System.out.print("inicio ");

    for (int i = 0; i < 10; i++) {
      System.out.print(" " + i + " ");
    }
    System.out.println();
    System.out.println("numero ");

    for (int i = 0; i < 10; i++) {
      System.out.print(" " + a[i] + " ");
    }


    int[] resultado = new int[10];
    int menoresColocados = 0;
    int mayoresColocados = 0;
    int j = 0;
    do {
      if (menoresColocados < cuentaMenores) {
       resultado[j++] = menores[menoresColocados++];
      }
      if (mayoresColocados < cuentaMayores) {
        resultado[j++] = mayores[mayoresColocados++];
      }
    } while (j < 10);
    System.out.println();
    System.out.println("array cambiado:");
    System.out.println("inicio ");

    for (int i = 0; i < 10; i++) {
      System.out.print(" " + i + " ");
    }
    System.out.println();
    System.out.println("numero ");

    for (int i = 0; i < 10; i++) {
      System.out.print(" " + resultado[i] + " ");
    }
  }
}
