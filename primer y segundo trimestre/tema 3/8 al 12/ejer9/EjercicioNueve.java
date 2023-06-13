package ejer9;

import java.util.Scanner;
/**
 * Calcula el volumen de un cono
 * 
 * Miguel Cedric
 *  
 */
public class EjercicioNueve {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double PI = 3.14;
        System.out.print("introduzca la altura en cm: ");
        double altura = s.nextDouble();
        System.out.print("Introduzca el radio en cm: ");
        double radio = s.nextDouble();
        double volumen = (1.0/3.0) * PI * radio * altura;
        System.out.println("El volumen del cono es de " + volumen);
        }
        
}
