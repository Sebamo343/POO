import Salud.Persona;

public class Reto1 {
    public static void main(String[] args) {
        Persona persona = new Persona();

        System.out.println();
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        persona.mayorEdad();

    }
}
