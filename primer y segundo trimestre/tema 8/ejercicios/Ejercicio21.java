package ejercicios;

import funciones.funciones;

public class Ejercicio21 {
    public static void main(String[] args) {
    
        int[] a = funciones.generaArray(10, 0, 50);
        
        funciones.muestraArray(a);
        System.out.println("El minimo es: " + funciones.minimoArray(a));

      }
}
