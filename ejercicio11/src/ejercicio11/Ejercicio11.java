/*
 Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio11;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        Date fechaActual = new Date();
        Date fecha = new Date();
        System.out.println("Ingrese el día: ");
        int dia, mes;
        do {
            dia = leer.nextInt();
            if (dia < 31 && dia > 0) {
                fecha.setDate(dia);

            } else {
                System.out.println("Ingrese un número del 1 al 31");
            }
        } while (dia > 31 || dia < 0);

        System.out.println("Ingrese el mes: ");
        
        do {
            mes = leer.nextInt();
            if (mes < 12 && mes > 0) {
                fecha.setMonth(mes);

            } else {
                System.out.println("Ingrese un número del 1 al 31");
            }
        } while (mes > 31 || mes < 0);

        System.out.println("Ingrese el año: ");
        int anio = leer.nextInt();

        System.out.println("La fecha ingresada es: " + fecha.getDate() + "/" + fecha.getMonth() + "/" + fecha.getYear());

        System.out.println("La fecha actual es: " + fechaActual.getDate() + "/" + (fechaActual.getMonth() + 1) + "/" + (fechaActual.getYear() + 1900));

        System.out.println("La diferencia que hay entre ambas fechas es de: " + ((fechaActual.getYear() + 1900) - fecha.getYear()) + " años.");

    }

}
