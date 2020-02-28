package com.fernandopaniagua.ejercicio4;

/**
 * Representa un Árbitro
 * 
 * @author FPA
 */
public class Arbitro {
    private String nombre;
    private Balon balon;
            
    /**
     * Constructor
     * 
     * @param nombre Nombre del árbitro
     */
    public Arbitro(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * Asigna un objeto de la clase Balon
     * 
     * @param balon Balón
     */
    public void setBalon(Balon balon){
        System.out.println("El árbitro ha recibido el balón");
        this.balon = balon;
    }
    
    /**
     * Cede la referencia del balón a un jugador
     * 
     * @param jugador Jugador destinatario de la referencia
     */
    public void cederBalon(Jugador jugador){
        System.out.println("El árbitro cede el balón a " + jugador.getNombre());
        jugador.setBalon(balon);
    }
}
