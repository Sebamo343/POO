package Figuras;

public class Circulo {
    private float pi=314;
    private float radio;
    public Circulo(float pi, float radio) {
        this.pi = pi;
        this.radio = radio;
    }
    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void calcularArea(){
        float Area=0;
        Area=pi*radio;
        System.out.println("La base del triangulo es: "+pi);
        System.out.println("La altura del triangulo es: "+radio);
        System.out.println("El area del triangulo es: "+Area);
    }
}
