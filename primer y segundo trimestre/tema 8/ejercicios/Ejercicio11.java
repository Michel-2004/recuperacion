package ejercicios;

import java.util.Scanner;

import funciones.funciones;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("introduce un numero: ");
        long n = s.nextLong();
        System.out.print("introduce el numero que quiere añadir: ");
        int p = s.nextInt();
        System.out.println("El numero entero es " + n + " si le añades " + p + " se queda en  "+ funciones.pegaPorDetras(n , p));
    }
}
