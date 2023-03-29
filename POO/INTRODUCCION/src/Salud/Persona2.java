package Salud;
import java.util.Scanner;

public class Persona2 {
    private String tipoDoc;
    private String documento;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;

    public void pedirDatos() {
        Scanner c = new Scanner(System.in);
        System.out.println("Ingrese los datos de la persona");
        System.out.print("Tipo de documento: ");
        tipoDoc = c.nextLine();
        System.out.print("Número de documento: ");
        documento = c.nextLine();
        System.out.print("Nombre: ");
        nombre = c.nextLine();
        System.out.print("Apellido: ");
        apellido = c.nextLine();
        System.out.print("Edad: ");
        edad = c.nextInt();
        System.out.print("Sexo: ");
        sexo = c.nextLine();
        c.close();
    }

    public void mostrarPersona() {
        System.out.println("Datos de la persona");
        System.out.println("Tipo de documento: " + tipoDoc);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Sexo: " + sexo);
    }

    public Double calcularImc(double peso, double estatura) {
        double pesoActual = peso / estatura*estatura;
        if (pesoActual < 20) {
            System.out.println("El peso está por debajo de lo ideal");
        } else if (pesoActual >= 20 && pesoActual <= 25) {
            System.out.println("El peso es ideal");
        } else (pesoActual >25){
            System.out.println("Tiene sobrepeso");
        }
        return calcularImc(peso, estatura);
    }

    public boolean mayorEdad() {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        } else {
            System.out.println("Es menor de edad");
            return false;
        }
    }

    public Double nextDouble() {
        return null;
    }
}