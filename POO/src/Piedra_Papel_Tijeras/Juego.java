package Piedra_Papel_Tijeras;

import java.util.Scanner;

public class Juego {
    private String jugador1;
    private String jugador2;
    private int puntaje1;
    private int puntaje2;
    private int rondas;

    public Juego(String jugador1, String jugador2, int rondas) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.rondas = rondas;
        this.puntaje1 = 0;
        this.puntaje2 = 0;
    }

    // Métodos accesores
    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public int getPuntaje1() {
        return puntaje1;
    }

    public int getPuntaje2() {
        return puntaje2;
    }

    public int getRondas() {
        return rondas;
    }

    // Métodos mutadores
    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public void setPuntaje1(int puntaje1) {
        this.puntaje1 = puntaje1;
    }

    public void setPuntaje2(int puntaje2) {
        this.puntaje2 = puntaje2;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    public void iniciar() {
        System.out.println("¡Bienvenidos a Piedra, Papel o Tijeras!");
        System.out.println("Jugador 1: " + this.jugador1);
        System.out.println("Jugador 2: " + this.jugador2);
        System.out.println("Rondas: " + this.rondas);
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < rondas; i++) {
            System.out.println("Ronda " + (i + 1) + ":");
            System.out.println(jugador1 + ", elige entre Piedra (r), Papel (p) o Tijeras (t):");
            String opcion1 = scanner.nextLine();
            System.out.println(jugador2 + ", elige entre Piedra (r), Papel (p) o Tijeras (t):");
            String opcion2 = scanner.nextLine();

            if (opcion1.equals("r")) {
                if (opcion2.equals("r")) {
                    System.out.println("Empate!");
                } else if (opcion2.equals("p")) {
                    System.out.println(jugador2 + " gana la ronda!");
                    puntaje2++;
                } else if (opcion2.equals("t")) {
                    System.out.println(jugador1 + " gana la ronda!");
                    puntaje1++;
                }
            } else if (opcion1.equals("p")) {
                if (opcion2.equals("r")) {
                    System.out.println(jugador1 + " gana la ronda!");
                    puntaje1++;
                } else if (opcion2.equals("p")) {
                    System.out.println("Empate!");
                } else if (opcion2.equals("t")) {
                    System.out.println(jugador2 + " gana la ronda!");
                    puntaje2++;}
        } else if (opcion1.equals("t")) {
            if (opcion2.equals("r")) {
                System.out.println(jugador2 + " gana la ronda!");
                puntaje2++;
            } else if (opcion2.equals("p")) {
                System.out.println(jugador1 + " gana la ronda!");
                puntaje1++;
            } else if (opcion2.equals("t")) {
                System.out.println("Empate!");
            }
        }
    }
}

public void finalizar() {
    System.out.println("Resultados:");
    System.out.println(jugador1 + ": " + puntaje1 + " puntos");
    System.out.println(jugador2 + ": " + puntaje2 + " puntos");
    if (puntaje1 > puntaje2) {
        System.out.println(jugador1 + " es el ganador!");
    } else if (puntaje2 > puntaje1) {
        System.out.println(jugador2 + " es el ganador!");
    } else {
        System.out.println("¡Ha sido un empate!");
    }
}
}