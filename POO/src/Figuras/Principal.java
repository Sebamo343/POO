package Figuras;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        float base, altura, radio, pi = 3.14f;
        Scanner c = new Scanner(System.in);        
        int opcion;
        do {
            System.out.println("Elija la figura geométrica a la cual desea calcular el área:");
            System.out.println("1. Triángulo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Círculo");
            System.out.println("0. Salir");

            opcion = c.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado triángulo");
                    System.out.print("Digite la base: ");
                    base = c.nextFloat();
                    System.out.print("Digite la altura: ");
                    altura = c.nextFloat();
                    Triangulo t = new Triangulo(base, altura);
                    t.calcularArea();
                    break;
                case 2:
                    System.out.println("Ha seleccionado rectángulo");
                    System.out.print("Digite la base: ");
                    base = c.nextFloat();
                    System.out.print("Digite la altura: ");
                    altura = c.nextFloat();
                    Rectangulo r = new Rectangulo(base, altura);
                    r.calcularArea();
                    break;
                case 3:
                    System.out.println("Ha seleccionado círculo");
                    System.out.print("Digite el radio: ");
                    radio = c.nextFloat();
                    Circulo ci = new Circulo(pi, radio);
                    ci.calcularArea();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar la Calculadora de Áreas");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo\n");
                    break;
            }
        } while (opcion != 0);
        c.close();
    }
}