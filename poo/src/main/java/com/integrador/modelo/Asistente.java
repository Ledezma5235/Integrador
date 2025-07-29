package main.java.com.integrador.modelo;
import com.integrador.modelo.Persona;

public class Asistente extends Persona {
    public Asistente(String nombre, int edad) {
        super(nombre, edad);
    }

    public void solicitarAsistirEvento(String evento) {
        System.out.println("Solicitando asistir al evento: " + evento);
    }
}
