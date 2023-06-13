package ejer15;

import java.util.Scanner;

public class ejer15 {  
    public static void main(String[] args) {
        System.out.print("introduce un numero: ");
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        System.out.print("introduce el exponente: ");
        int exponenteF = s.nextInt();;
        int potencia;
        int exponente;

        for (int i = 1; i <= exponenteF; i++) {
        potencia = 1;
        exponente = i;

        for (int b = 0; b < exponente; b++) {
        potencia *= base;
        }
        
        System.out.println(base + "^" + i + " = " + potencia);
        }
    }

}
