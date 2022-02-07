/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        Cafetera cafetera1 = new Cafetera(100,0);
        int opcion;

        do {
            System.out.println("Ingrese una de las siguientes opciones: ");
            System.out.println("1. Para llenar la cafetera.");
            System.out.println("2. Para definir el tamaño de la taza y servir café.");
            System.out.println("3. Para vaciar la cafetera. ");
            System.out.println("4. Para agregar una cantidad determinada de café a la cafetera.");
            System.out.println("5. Salir.");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    cafetera1.llenarCafetera();

                    break;

                case 2:
                    System.out.println("Ingrese el tamaño de la taza: ");
                    cafetera1.servirTaza(leer.nextInt());

                    break;

                case 3:
                    cafetera1.vaciarCafetera();

                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de café que quiere agregar: ");
                    cafetera1.agregarCafe(leer.nextInt());

                    break;

                case 5:
                    System.out.println("¡Hasta luego!");

            }
        } while (opcion != 5);

    }

}
