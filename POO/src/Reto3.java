import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona;

   public class Reto3 { 
     public static void main(String[] args) {
     String cargo,departamento;
     double valorHora;
     int horastrabajadas;

     Scanner c=new Scanner(System.in); 
     Persona j=new Persona();

    
     j.pedirDatos();
     j.mostrarPersona();
     j.mayorEdad();
     System.out.println("ingrese su cargo");
     cargo=c.next();
    
     System.out.println("ingrese su departamento");
     departamento=c.next();

     System.out.println("ingrese el valor de las horas de trabajo");
     valorHora=c.nextDouble();

     System.out.println("ingrese sus horas trabajadas ");
     horastrabajadas=c.nextInt();
    
    Empleado empleado = new Empleado(j.getTipoDoc(),j.getDocumento(),j.getNombre(),j.getApellido(),j.getPeso(),j.getEstatura(),j.getEdad(),j.getSexo(),cargo, valorHora, horastrabajadas, departamento);
    empleado.calcularHonorarios();
    empleado.mostrarempleado();
   c.close();
}
}