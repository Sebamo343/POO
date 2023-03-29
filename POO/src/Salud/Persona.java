package Salud;
import java.util.Scanner;

public class Persona {
    //atributos
    private String tipoDoc;
    private String documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;

    //metodos
    //metodo vacio
    public Persona(){

    }

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
        System.out.print("Peso (en kg): ");
        peso = scanner.nextDouble();
        System.out.print("Estatura (en m): ");
        estatura = scanner.nextDouble();
        System.out.print("Edad: ");
        edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Sexo: ");
        sexo = scanner.nextLine();
        scanner.close();
    }

    public Persona(String tipoDoc, String documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void mostrarPersona() {
        System.out.println("Datos de la persona");
        System.out.println("Tipo de documento: " + tipoDoc);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Edad: " + edad + " años");
        System.out.println("Sexo: " + sexo);
    }

    public void calcularImc() {
        double pesoActual = peso / Math.pow(estatura, 2);
        if (pesoActual < 20) {
            System.out.println("El peso está por debajo de lo ideal");
        } else if (pesoActual >= 20 && pesoActual <= 25) {
            System.out.println("El peso es ideal");
        } else {
            System.out.println("Tiene sobrepeso");
        }
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
