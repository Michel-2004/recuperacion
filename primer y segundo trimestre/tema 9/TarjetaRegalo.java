public class TarjetaRegalo {
    
    int numero;
    double saldo;

    public TarjetaRegalo(double saldo){
        this.saldo = saldo;

        this.numero = (int)(Math.random() * 10);;
    }

    void gasta(double gasto){
        if (gasto > saldo) {
            System.out.print("No hay saldo suficiente.");
        } else {
            saldo -= gasto;
        }
    }

    TarjetaRegalo fusionaCon(TarjetaRegalo t) {
        double nuevoSaldo = this.getSaldo() + t.getSaldo();
        this.setSaldo(0);
        t.setSaldo(0);
        return new TarjetaRegalo(nuevoSaldo);
    }

    public void setSaldo(double saldo) {
     this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }


}