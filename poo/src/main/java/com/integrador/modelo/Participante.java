package main.java.com.integrador.modelo;
import java.time.LocalDate;

import com.integrador.modelo.Persona;

public class Participante extends Persona {

    public Participante(int dni,String nombre, LocalDate fechaNac, int telefono, String correoElectronico) {
        super(dni, nombre, fechaNac, telefono, correoElectronico);
    }

    public void inscribirseEvento() {
        // Lógica para inscribirse a un evento
        System.out.println("El participante se ha inscrito en el evento.");
    }
}