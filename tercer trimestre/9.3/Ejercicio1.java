import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {

        Producto producto1 = new Producto ("pantalla");
        Producto producto2 = new Producto("teclado");
        Producto producto3 = new Producto("raton");
        Producto producto4 = new Producto("pc");
        Producto producto5 = new Producto("altavoces");


        ArrayList<Producto>producto = new ArrayList<Producto>();
        producto.add(producto1); //posicion 0
        producto.add(producto2); //posicion 1
        producto.add(producto3); //posicion 2
        producto.add(producto4); //posicion 3

        for (Producto p : producto) {
            System.out.println(p);
        }

        producto.remove(1);
        producto.remove(3);

        for (Producto p : producto) {
            System.out.println(p);
        }

        producto.set(3, producto5);

        for (Producto p : producto) {
            System.out.println(p);
        }

        producto.clear();
    }
}
