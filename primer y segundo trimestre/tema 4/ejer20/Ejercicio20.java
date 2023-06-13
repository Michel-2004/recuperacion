package ejer20;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        int n = 0; 
        int digito = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("introduzca un numero de maximo 5 digitos: ");
        n =  s.nextInt();

        if ( n < 10 ) {
        digito = 1;
        }

        if (( n >= 10 ) && ( n < 100 )) {
        digito = 2;
        }

        if (( n >= 100 ) && ( n < 1000 )) {
        digito = 3;
        }

        if (( n >= 1000 ) && ( n < 10000 )) {
        digito = 4;
        }

        if ( n >= 10000 ) {
        digito = 5;
        }
    
        System.out.println("El numero tiene " + digito + " digitos");
        }
        
}
