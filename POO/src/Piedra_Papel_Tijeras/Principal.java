package Piedra_Papel_Tijeras;

public class Principal {
public static void main(String[] args) {
  Juego juego = new Juego ("Jugador 1", "Jugador 2", 0, 0, 0);
    juego.iniciar();
    juego.jugar();
    juego.finalizar();
}
}