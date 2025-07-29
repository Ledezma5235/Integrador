package main.java.com.integrador.modelo;
import java.time.LocalDate;

import com.integrador.modelo.Persona;
@Entity
public class Organizador extends Persona {

    public Organizador(int dni,String nombre, LocalDate fechaNac, int telefono, String correoElectronico) {
        super(dni, nombre, fechaNac, telefono, correoElectronico);
    }

    public void asignarRol(String rol, Asistente unAsistente) {
        // Lógica para organizar un evento
        System.out.println("El organizador ha asignado el rol " + rol + " al asistente" + unAsistente);
    }
    
}
