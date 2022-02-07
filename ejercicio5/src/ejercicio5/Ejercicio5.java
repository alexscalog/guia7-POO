/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

 */
package ejercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        Cuenta cuenta1 = new Cuenta();

        cuenta1.crearCuenta();

        System.out.println("Ingrese monto a depositar: ");
        double ingreso = leer.nextDouble();
        cuenta1.ingresarSaldo(ingreso);

        System.out.println("Ingrese monto a retirar: ");
        double retiro = leer.nextDouble();
        cuenta1.retirarSaldo(retiro);
        cuenta1.extraccionRapida();
        cuenta1.consultarSaldo();
        cuenta1.consultarDatos();

    }

}
