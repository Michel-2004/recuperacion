/**
 * Ejercicio 4 bidireccional
 * 
 * Miguel Cedric
 * 
 */
public class Ejercicio4{
  public static void main(String[] args) {
    int[][] num = new int[4][5]; 
    int fila;
    int columna;

    for(fila = 0; fila < 4; fila++) {
    for(columna = 0; columna < 5; columna++) {
    num[fila][columna] = (int)(Math.random() * 900) + 100;
    }
    }

    int sumaFila;
    for(fila = 0; fila < 4; fila++) {
    sumaFila = 0;
    for(columna = 0; columna < 5; columna++) {
    System.out.print( " " + num[fila][columna] + " ");
    sumaFila += num[fila][columna];

    }
    System.out.print(" " + sumaFila + " " );
    }

    int sumaColumna;
    int sumaTotal = 0;
    for(columna = 0; columna < 5; columna++) {
    sumaColumna = 0;
    for(fila = 0; fila < 4; fila++) {
    sumaColumna += num[fila][columna];
    }
    sumaTotal += sumaColumna;
    System.out.printf(" " + sumaColumna + " ");
    }
    System.out.printf(" " + sumaTotal + " ");
  }
}
