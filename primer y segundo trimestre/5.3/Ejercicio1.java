//Da valores incorerectos al estar todos en el mismo.

public class Ejercicio1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        
        int ejer1 = (a=b);
        System.out.print(ejer1);
        System.out.println();

        int ejer2 = (c=a);
        System.out.print(ejer2);
        System.out.println();
        
        int ejer3 = ((a + b + c)/2);
        System.out.print(ejer3);
        System.out.println();

        int ejer4 = (a + c * 2);
        System.out.print(ejer4);
        System.out.println();

        int ejer5 = b - a;
        System.out.print(ejer5);
        System.out.println();

        int ejer6 = (c * b);
        System.out.print(ejer6);
        System.out.println();

        int ejer7 = (a + b *2 );
        System.out.print(ejer7);
        System.out.println();

        int ejer8 = (c - 2);
        System.out.print(ejer8);
        System.out.println();

        int ejer9 = (a = b);
        System.out.print(ejer9);
        System.out.println();

        int ejer10 = (a/b);
        System.out.print(ejer10);
        System.out.println();
  } 
}
