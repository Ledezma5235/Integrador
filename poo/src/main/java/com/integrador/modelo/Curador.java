package main.java.com.integrador.modelo;

public class Curador extends Persona {
    public Curador(String nombre, int edad) {
        super(nombre, edad);
    }

    public void curarEvento(String evento) {
        System.out.println("Curando el evento: " + evento);
    }

    public void seleccionarArtistas(String[] artistas) {
        System.out.println("Seleccionando artistas: ");
        for (String artista : artistas) {
            System.out.println("- " + artista);
        }
    }

}