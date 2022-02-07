package ejercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el radio para el calculo: ");

        this.radio = leer.nextDouble();

    }

    public void crearArea() {
        System.out.println("El valor del área es: " + (Math.PI * Math.pow(radio, 2)));
    }

    public void crearPerimetro() {
        System.out.println("El valor del perímetro es: " + (2 * Math.PI * radio));
    }

}
