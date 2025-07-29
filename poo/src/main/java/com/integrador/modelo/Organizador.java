package main.java.com.integrador.modelo;
import com.integrador.modelo.Persona;

public class Organizador extends Persona {

    public Organizador() {
        super();
    }

    public void asignarRol(String rol, Asistente unAsistente) {
        // Lógica para organizar un evento
        System.out.println("El organizador ha asignado el rol " + rol + " al asistente" + unAsistente);
    }
    
}
