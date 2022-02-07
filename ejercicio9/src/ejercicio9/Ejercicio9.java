package ejercicio9;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Matematica matematica = new Matematica();
        int opcion;
        matematica.setNumero1(Math.random() * 50);
        matematica.setNumero2(Math.random() * 50);

        System.out.println("El primer número es " + matematica.getNumero1());
        System.out.println("El segundo número es " + matematica.getNumero2());

        do {
            System.out.println("Elija una opción para operar con los números: ");
            System.out.println("1. Calcular el mayor de los dos números.");
            System.out.println("2. Calcular la potencia del número mayor elevado al menor.");
            System.out.println("3. Calcular la raíz cuadrada del número menor");
            System.out.println("4. Salir del menú.");
            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("\n El valor mayor es %.2f \n", matematica.devolverMayor());
                    break;
                case 2:
                    matematica.calcularPotencia();
                    break;
                case 3:
                    matematica.calcularRaiz();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Ingrese una opción correcta (del 1 al 4).");

            }
        } while (opcion != 4);

    }
}
