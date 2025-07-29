package main.java.com.integrador.modelo;

public class Instructor extends Persona {
    public Instructor(String nombre, int edad) {
        super(nombre, edad);
    }

    public void impartirClase() {
        System.out.println("El instructor " + getNombre() + " está impartiendo una clase.");
    }

    public void evaluarParticipante(String participante) {
        System.out.println("El instructor " + getNombre() + " está evaluando al participante: " + participante);
    }
}