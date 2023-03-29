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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos de la persona");
        System.out.print("Tipo de documento: ");
        tipoDoc = scanner.nextLine();
        System.out.print("Número de documento: ");
        documento = scanner.nextLine();
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        apellido = scanner.nextLine();
        System.out.print("Edad: ");
        edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Sexo: ");
        sexo = scanner.nextLine();
        scanner.close();
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

    public double calcularImc(double peso, double estatura){
        double pesoActual=peso/(estatura*estatura);
        if (pesoActual<20){
            System.out.println("pesobajo");
        }else if (pesoActual >= 20 && pesoActual <= 25){
            System.out.println("pesoideal");
        }else if (pesoActual>25){
            System.out.println("sobrepeso");
        }else{
            System.out.println("no se realizo la operacion correctamente");
        }
        return pesoActual;
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
}