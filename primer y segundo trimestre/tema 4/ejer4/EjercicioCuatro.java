import java.util.Scanner;

public class EjercicioCuatro {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print(" introduzca el numero de horas trabajadas durante la semana:  ");
    int horas;
    horas = s.nextInt();
    
    if ( horas <=40 ){
      int horasnormales = horas * 12;
      System.out.println( "El sueldo semanal que le corresponde es de " + horasnormales + " euros");
    }
    else{
      int horasextras;
      horasextras = horas * 16;
      System.out.println( "El sueldo semanal que le corresponde es de " + horasextras + " euros");
    }
  }
}
