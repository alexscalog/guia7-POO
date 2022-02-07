/*
 
 */
package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese numero 1");
        this.numero1 = leer.nextInt();
        System.out.println("Ingrese numero 2");
        this.numero2 = leer.nextInt();

    }

    public void suma() {
        System.out.println("La suma de los numeros es " + (numero1 + numero2));

    }

    public void resta() {
        System.out.println("La resta de los numeros es " + (numero1 - numero2));

    }

    public void multiplicacion() {
        System.out.println("La multiplicación de los numeros es " + (numero1 * numero2));

    }

    public void division() {
        System.out.println("La división de los numeros es " + (numero1 / numero2));

    }

}
