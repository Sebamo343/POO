
import java.util.Scanner;

import Salud.Persona2;

public class Reto2 {
    public static void main(String[] args) {
        Persona2 persona = new Persona2();
        Double peso, estatura;
        Scanner c= new Scanner(System.in);
        System.out.print("Peso (en kg): ");
        peso = c.nextDouble();
        System.out.print("Estatura (en m): ");
        estatura = c.nextDouble();
        persona.calcularImc(0, 0);

        System.out.println();
        persona.pedirDatos();
        persona.mostrarPersona();

        /*persona.mayorEdad();*/

        c.close();
    }
}
