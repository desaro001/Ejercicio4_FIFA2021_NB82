package com.fernandopaniagua.ejercicio4;

/**
 * Jugador de fútbol
 * 
 * @author FPA
 */
public class Jugador {

    private String nombre;
    private Balon balon;

    /**
     * Constructor
     * 
     * @param nombre Nombre del jugador
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre del Jugador
     * 
     * @return Nombre del jugador
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Recibe el balón
     * 
     * @param balon Referencia al balón
     */
    public void setBalon(Balon balon) {
        System.out.println(this.nombre + " ha recibido el balón");
        this.balon = balon;
    }

    /**
     * Pasa el balón a un destinatario
     * 
     * @param destinatario Destinatario del balón
     */
    public void pasarBalon(Jugador destinatario) {
        System.out.println(this.nombre + " ha pasado el balón a " + destinatario.nombre);
        destinatario.setBalon(balon);
    }

    /**
     * Dispara a puerta
     */
    public void disparar() {
        System.out.println(this.nombre + " ha disparado a puerta");
        balon.volar();
    }
}
