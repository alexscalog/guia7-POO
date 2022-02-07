package ejercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Cuenta {

    private int numeroCuenta;
    private long dni;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(long dni, double saldoActual, int numeroCuenta) {
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.numeroCuenta = numeroCuenta;

    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    

    public void crearCuenta() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese sus datos a continuación.");

        System.out.println("Ingrese su DNI: ");
        this.dni = leer.nextLong();

        System.out.println("Ingrese su número de cuenta: ");
        this.numeroCuenta = leer.nextInt();

        System.out.println("Ingrese su saldo actual: ");
        this.saldoActual = leer.nextDouble();

    }

    public void ingresarSaldo(double ingreso) {

        if (ingreso > 0) {
            saldoActual += ingreso;
            System.out.println("Su saldo es: " + saldoActual);

        } else {
            System.out.println("¡Ingrese un monto mayor a 0!");
        }

    }

    public void retirarSaldo(double retiro) {

        if (retiro > saldoActual) {
            saldoActual = 0;
            System.out.println("Su saldo es: " + saldoActual);
        }

        if (retiro > 0) {
            saldoActual -= retiro;
            System.out.println("Su saldo es: " + saldoActual);

        } else {
            System.out.println("¡Ingrese un monto mayor a 0!");

        }

    }

    public void extraccionRapida() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese monto para extracción rápida: ");
        double extraccion = leer.nextDouble();

        if (extraccion <= (saldoActual * 0.2)) {
            saldoActual -= extraccion;
            System.out.println("Su saldo es: " + saldoActual);
        }
        while (extraccion > saldoActual * 0.2) {
            System.out.println("No tiene suficiente saldo. Ingrese un monto menor.");
            extraccion = leer.nextDouble();
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual en la cuenta: " + saldoActual);
    }

    public void consultarDatos() {
        System.out.println("Datos de la cuenta");
        System.out.println("DNI: " + dni);
        System.out.println("Número de cuenta: " + numeroCuenta);
    }
}
