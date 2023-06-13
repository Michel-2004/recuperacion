package ejer24;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.println(" 1 programador junior, 2 programador senior y 3 jefe de proyecto ");
        System.out.print("numero de puesto: ");

        Scanner s = new Scanner(System.in);
        
        int numero = s.nextInt();
        System.out.print("cuantas visitas ha tenido que hacer ");
        
        int visitas = s.nextInt();
        System.out.print("estado civil: 1 soltero, 2 casado: ");
        int estado = s.nextInt();;
        
        int base = 0;
            switch(numero) {
            case 1:
                base = 950;
            break;
            case 2: 
                base = 1200;
            break;
            case 3: 
                base = 1600;
            break;
            default:
        }

        int dietas = visitas * 30;
        int bruto = base + dietas;
        int irpf = 0;

        if (estado == 1) { 
        irpf = 25;
        } 
        else{ 
        irpf = 20;
        } 

        int IRPF = (bruto * irpf) / 100;
        int neto = (bruto - IRPF);
        System.out.println("");
        System.out.print(" salario base "+ base);
        System.out.print(" dientas "+ visitas + dietas);
        System.out.print(" irpf " + irpf + "% = "+ IRPF);
        System.out.println("");
        System.out.print(" Sueldo neto " + neto);
    }
}