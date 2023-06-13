package ejer20;

import java.util.Scanner;

public class ejer20 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("capacidad de la cuba: ");
    int capacidad = s.nextInt();
    int litros = (int)(Math.random() * (capacidad + 1));
    for (int i = 0; i < capacidad; i++) {
    if (i < (capacidad - litros)) {
    System.out.println("|    |");
    } else {
    System.out.println("|____|");
    }
    }
    System.out.println("|----|");
    System.out.print("la cuba tiene una capacidad de" + capacidad + " litros y contiene " + litros);
  }
}