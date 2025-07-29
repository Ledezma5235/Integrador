package main.java.com.integrador.modelo;
import java.time.LocalDate;

import com.integrador.modelo.Persona;
@Entity
public class Asistente extends Persona {
    public Asistente(int dni,String nombre, LocalDate fechaNac, int telefono, String correoElectronico) {
        super(dni, nombre, fechaNac, telefono, correoElectronico);
    }

    public void solicitarAsistirEvento(String evento) {
        System.out.println("Solicitando asistir al evento: " + evento);
    }
}
