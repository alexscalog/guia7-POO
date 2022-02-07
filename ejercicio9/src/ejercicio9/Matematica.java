/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio9;

public class Matematica {

    private double numero1;
    private double numero2;

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double devolverMayor() {
       return Math.max(numero1, numero1);
       

    }

    public void calcularPotencia() {
        if (numero1 > numero2) {
            System.out.printf("La potencia de %.0f elevado a %.0f es %d \n", numero1, numero2, (int) Math.pow((int) numero1, (int) numero2));
            
            /*El primer % indica que en esa posición se va a escribir un valor. El valor a escribir se encuentra a continuación de las comillas.
.0 indica el número de decimales que se mostrará, en este caso 0, es decir se redondea el resultado a números enteros.*/
        
        } else {
            System.out.printf("La potencia de %.0f elevado a %.0f es %d \n", numero2, numero1, (int) Math.pow((int) numero2, (int) numero1));
        }
    }

    public void calcularRaiz() {
        if (numero1 < numero2) {
            System.out.printf("La raiz de %.2f es %.2f \n", numero1, Math.sqrt(Math.abs(numero1)));
            
            /* En este caso se utiliza sqrt para sacar la raíz del número entre paréntesis y abs para obtener el valor absoluto
            como pide la consigna.*/
        
        } else {
            System.out.printf("La raiz de %.2f es %.2f \n", numero2, Math.sqrt(Math.abs(numero2)));
        }

    } 
}
