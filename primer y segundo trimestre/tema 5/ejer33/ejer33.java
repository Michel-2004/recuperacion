package ejer33;

import java.util.Scanner;

public class ejer33 {
    public static void main(String[] args) {
    System.out.print("altura de la U: ");
    Scanner s = new Scanner(System.in);
    int altura = s.nextInt();
    for (int i = 1; i < altura; i++) {
    System.out.print("* ");
    for (int j = 2; j < altura; j++) {
    System.out.print(" ");
    }
    System.out.println("*");
    }
    System.out.print(" ");
        for (int i = 2; i < altura; i++) {
        System.out.print("* ");
        }
    }

}
