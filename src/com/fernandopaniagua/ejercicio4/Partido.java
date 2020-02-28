package com.fernandopaniagua.ejercicio4;

/**
 * Gestiona un partido de fútbol
 * 
 * @author FPA
 */
public class Partido {
    public static void main(String[] args) {
        //Instanciación
        Balon balon = new Balon("Blanco");
        Arbitro arbitro = new Arbitro("Undiano");
        Jugador miguelAngel = new Jugador("Miguel Ángel");
        Jugador veronica = new Jugador("Verónica");
        Jugador pascual = new Jugador("Pascual");
        
        //1. Entregar el balón al árbitro
        arbitro.setBalon(balon);
        //2. Entregar el balón a un jugador
        arbitro.cederBalon(veronica);
        //3. El jugador pasa el balón a otro jugador
        veronica.pasarBalon(miguelAngel);
        miguelAngel.pasarBalon(pascual);
        //4. El jugador dispara a puerta
        pascual.disparar();
    }
}
