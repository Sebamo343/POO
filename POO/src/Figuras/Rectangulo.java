package Figuras;

public class Rectangulo extends Figuras{
    private float base, altura;
    public Rectangulo (float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void calcularArea(){
        float Area=0;
        Area=(base*base)*(altura*altura);
        System.out.println("La base del triangulo es: "+base);
        System.out.println("La altura del triangulo es: "+altura);
        System.out.println("El area del triangulo es: "+Area);
    }
}
