package ejercicios;

import java.util.Scanner;

import funciones.funciones;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("introduce un numero: ");
        long n = s.nextLong();
        System.out.print("introduce cuantos numeros quieres quitar: ");
        int p = s.nextInt();
        System.out.println("El numero entero es " + n + " si le quitas " + p + " se queda en  "+ funciones.quitaPorDetras(n , p));
    }
}
