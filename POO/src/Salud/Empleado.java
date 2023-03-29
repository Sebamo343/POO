package Salud;
public class Empleado extends Persona {

    private String cargo;
    private double valorHora;
    private int horastrabajadas;
    private String departamento;

    public Empleado(String tipoDoc, String documento, String nombre, String apellido, double peso, double estatura,
        int edad, String genero, String cargo, double valorhora, int horastrabajadas, String departamento) {
        super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, genero);
        this.cargo = cargo;
        this.valorHora = valorhora;
        this.horastrabajadas = horastrabajadas;
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorhora() {
        return valorHora;
    }

    public void setValorhora(double valorhora) {
        this.valorHora = valorhora;
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void calcularHonorarios(){
        double reteica;
        double honorarios=0;
        honorarios=valorHora;
        reteica=(0.966);
        honorarios=(honorarios=reteica);
        System.out.println("" );
        System.out.println("el total apagar es de:"+honorarios);

    }

    public void mostrarempleado(){
      System.out.println("el en pleado"+getNombre()+getApellido()+"que tiene un cargo de"+cargo+"trabja un total de horas"+getHorastrabajadas()+"con valor de"+getValorhora());
    }

}
