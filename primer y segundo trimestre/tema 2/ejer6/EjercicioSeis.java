/**
* calcula el total de una factura a partir
* de la base imponible 
*
* Miguel Cedric
*/
public class EjercicioSeis {
	public static void main(String[] args) {
		double base = 50;
		
		System.out.println("Base imponible "+ base );
		System.out.println("IVA " + (base * 0.21));
		System.out.println("Total " + (base * 1.21));
	}
}
