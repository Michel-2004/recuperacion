
public class Ejercicio2 {
    public static void main(String[] args) {
        Gato[] gato = new Gato[4];
        int i;

        gato[0] = new Gato("Mia", "naranja", "mestizo");
        gato[1] = new Gato("Mandi", "gris", "bosque");
        gato[2] = new Gato("Homer", "blanco", "mestizo");
        gato[3] = new Gato("Mauro", "blaco", "egipcio");

        System.out.println("Datos de los gatos.");

        for (i = 0; i < 4; i++) {
        System.out.println("Nombre: " + gato[i].getNombre());
        System.out.println("Color: " + gato[i].getColor());
        System.out.println("Raza: " + gato[i].getRaza());
        }
    }
}