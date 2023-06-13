package ejercicios;

import java.util.Scanner;

import funciones.funciones;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("introduce un numero: ");
        long n = s.nextLong();
        System.out.print("introduce una posicion: ");
        int p = s.nextInt();
        System.out.println("En la posición " + p + " del " + n + " está el "+ funciones.digitoN(n , p));
    }
}
