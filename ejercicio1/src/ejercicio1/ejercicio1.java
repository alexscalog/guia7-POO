/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package ejercicio1;


import java.util.Locale;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Libro libro1 = new Libro();
        

        System.out.println("A continuación ingrese los datos del libro: ");

        System.out.println("Ingrese el ISBN:");
        int ISBN = leer.nextInt();
                
        System.out.println("Ingrese el título del libro: ");
        String titulo = leer.next();

        System.out.println("Ingrese el autor del libro: ");
        String autor = leer.next();

        System.out.println("Ingrese la cantidad de páginas del libro: ");
        int numeroPaginas = leer.nextInt();

        libro1.cargarLibro(ISBN, titulo, autor, numeroPaginas);
        libro1.informarLibro();

    }

}
