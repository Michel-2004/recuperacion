package ejercicios;

import java.util.Scanner;

import funciones.funciones;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("introduce un numero: ");
        int n = s.nextInt();
        System.out.println("El siguiente primo mayor a " + n + " es " + funciones.siguientePrimo(n));
    }
}
