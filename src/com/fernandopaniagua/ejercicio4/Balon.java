package com.fernandopaniagua.ejercicio4;

/**
 * Balón de fútbol
 * 
 * @author FPA
 */
public class Balon {
    private String color;

    /**
     * Constructor
     * 
     * @param color Color del balón
     */
    public Balon(String color) {
        this.color = color;
    }
    
    /**
     * Hace que la pelota vaya volando hacia la portería
     */
    public void volar(){
        System.out.println("El balón está volando");
    }
}