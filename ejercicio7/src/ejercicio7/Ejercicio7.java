package ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {

        int mayor, menor, bajoPeso, pesoIdeal, sobrepeso, imc;
        boolean esMayor;

        mayor = menor = bajoPeso = pesoIdeal = sobrepeso = 0;

        Persona persona1 = new Persona("Pablo", 25, "H", 65, 1.76);
        Persona persona2 = new Persona("Laura", 16, "M", 43, 1.50);
        Persona persona3 = new Persona("Ariel", 30, "O", 100, 1.85);
        Persona persona4 = new Persona("Cristina", 20, "M", 55, 1.49);

        Persona personas[] = {persona1, persona2, persona3, persona4};

        for (int i = 0; i < personas.length; i++) {

            System.out.println("Persona " + personas[i].getNombre());

            imc = personas[i].calcularIMC();

            switch (imc) {
                case -1:
                    System.out.println("La persona tiene bajo peso.");
                    bajoPeso++;
                    break;

                case 0:
                    System.out.println("La persona está en su peso ideal.");
                    pesoIdeal++;
                    break;

                case 1:
                    System.out.println("La persona tiene sobrepeso.");
                    sobrepeso++;
                    break;

            }

            esMayor = personas[i].esMayorDeEdad();

            if (esMayor) {
                System.out.println("Es mayor de edad.");
                mayor++;
            } else {
                System.out.println("Es menor de edad.");
                menor++;
            }

        }

        System.out.printf("El %d %% de las personas tiene bajo peso. \n", (bajoPeso * 100) / personas.length);
        System.out.printf("El %d %% de las personas tiene sobrepeso. \n", (sobrepeso * 100) / personas.length);
        System.out.printf("El %d %% de las personas tiene peso ideal. \n", (pesoIdeal * 100) / personas.length);
        System.out.printf("El %d %% de las personas es mayor de edad. \n", (mayor * 100) / personas.length);
        System.out.printf("El %d %% de las personas es menor de edad. \n", (menor * 100) / personas.length);

    }

}
