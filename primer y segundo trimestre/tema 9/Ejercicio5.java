public class Ejercicio5{
    public class caballo {
        String nombre;
        String raza;
        int edad;
        int peso;
        
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getRaza() {
            return raza;
        }
        public void setRaza(String raza) {
            this.raza = raza;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public int getPeso() {
            return peso;
        }
        public void setPeso(int peso) {
            this.peso = peso;
        }

        public void Trota() {
            this.trota();
        }
    
        public void trota() {
            System.out.println("El cabbalo trota");
        }

        public void Come() {
            this.come();
        }
    
        public void come() {
            System.out.println("El cabbalo come paja");
        }

    }
}