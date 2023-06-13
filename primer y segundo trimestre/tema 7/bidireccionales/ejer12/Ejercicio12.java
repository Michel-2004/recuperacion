/**
 * Ejercicio 12 bidireccional
 * 
 * Miguel Cedric
 * 
 */
public class Ejercicio12{
  public static void main(String[] args) {
    int[][] n = new int[9][9];
    for (int i = 0; i < 9; i++) {
    for (int j = 0; j < 9; j++) {
    n[i][j] = (int) (Math.random() * 401) + 500;
    System.out.print(" " + n[i][j] + " ");
    }
    System.out.println();
    }
    System.out.print("diagonal desde la esquina inferior izquierda ");
    System.out.println("hasta la esquina superior derecha: ");
    int maximo = 500;
    int minimo = 900;
    int suma = 0;
    for (int i = 0; i < 9; i++) {
    int numero = n[8 - i][i];
    System.out.print(numero + " ");
    if (numero > maximo) {
    maximo = numero;
    }
    if (numero < minimo) {
    minimo = numero;
    }
    suma += numero;
    }
    System.out.println("max: " + maximo);
    System.out.println("min: " + minimo);
    System.out.println(",edia: " + (suma / 10));
  }
}
