import java.util.Scanner;

import Salud.Persona2;

public class Reto2 {
    public static void main(String[] args) {
        
     Persona2 persona = new Persona2();
     double peso, estatura;
     Scanner capturar = new Scanner(System.in);
     //solictar datos
     System.out.println("ingrese peso");
     peso = capturar.nextDouble();
     System.out.println("ingrese estatura");
     estatura = capturar.nextDouble();
    
     persona.pedirDatos();
     persona.mostrarPersona();
     persona.calcularImc( peso, estatura);
     persona.mayorEdad();

     capturar.close();

    }
}
