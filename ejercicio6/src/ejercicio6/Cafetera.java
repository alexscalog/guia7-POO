package ejercicio6;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;

    }

    public void servirTaza(int tazaVacia) {
        if (cantidadActual < tazaVacia) {
            tazaVacia = cantidadActual;
            System.out.println("La cantidad en la taza es igual a :" + tazaVacia + ". La taza no se ha llenado.");
            cantidadActual = 0;

        } else {
            System.out.println("La taza se ha llenado.");
            cantidadActual -= tazaVacia;

        }
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    public void agregarCafe(int cafe) {
        cantidadActual += cafe;
    }

}
