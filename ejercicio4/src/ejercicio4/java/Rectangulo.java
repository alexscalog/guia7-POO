package ejercicio4.java;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.altura = altura;
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese datos del rectángulo.");
        System.out.println("Ingrese la base: ");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura: ");
        this.altura = leer.nextInt();

    }

    public void calcularSuperficie() {
        System.out.println("La superficie del rectángulo es: " + (base * altura));

    }

    public void calcularPerimetro() {
        System.out.println("El perímetro del rectángulo es: " + ((base + altura) * 2));

    }

    public void dibujarRectangulo() {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    
    /*public void crearRectangulo() {
        for (int y = 0; y <= altura; y++) {
            for (int x = 0; x <= base; x++) {
                if (y == 0 || y == altura) {
                    System.out.print("*");
                } else {
                    if (x == 0 || x == base) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }*/

}
