package main.java.com.integrador.modelo;

import java.time.LocalDate;

public class Curador extends Persona {
    public Curador(int dni,String nombre, LocalDate fechaNac, int telefono, String correoElectronico) {
        super(dni, nombre, fechaNac, telefono, correoElectronico);
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