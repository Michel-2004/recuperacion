package normales.ejer8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] mes = {
        "enero", "febrero", "marzo", "abril", "mayo", "junio",
        "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
        int[] temperatura = new int[12];
        int i;
        for (i = 0; i < 12; i++) {
            System.out.print("temperatura media de " + mes[i] + " ");
            temperatura[i] = s.nextInt();
        }
        for (i = 0; i < 12; i++) {
            System.out.print(mes[i]);
            System.out.println(" " + temperatura[i] + "ºC");
        }
        }
}
