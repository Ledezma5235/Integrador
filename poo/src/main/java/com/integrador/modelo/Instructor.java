package main.java.com.integrador.modelo;
import java.time.LocalDate;

import main.java.com.integrador.modelo.Persona;
@Entity
public class Instructor extends Persona {
    @ManyToOne
    @joinColumn(name = "instructores", nullable = false)
    private Taller taller;
    public Instructor(int dni,String nombre, LocalDate fechaNac, int telefono, String correoElectronico) {
        super(dni, nombre, fechaNac, telefono, correoElectronico);
    }

    public void impartirClase() {
        System.out.println("El instructor " + getNombre() + " está impartiendo una clase.");
    }

    public void evaluarParticipante(String participante) {
        System.out.println("El instructor " + getNombre() + " está evaluando al participante: " + participante);
    }
}