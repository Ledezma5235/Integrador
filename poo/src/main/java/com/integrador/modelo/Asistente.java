package main.java.com.integrador.modelo;
import java.time.LocalDate;

import com.integrador.modelo.Persona;
@Entity
public class Asistente extends Persona {
    @ManyToMany(mappedBy = "asistentes", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "asistente_evento",
            joinColumns = @JoinColumn(name = "asistente_id"),
            inverseJoinColumns = @JoinColumn(name = "evento_id"))
    private List<Evento> eventos;
    
    public Asistente() {
        // Default constructor
    }
    
    public Asistente(int dni,String nombre, LocalDate fechaNac, int telefono, String correoElectronico, List<Evento> eventos) {
        super(dni, nombre, fechaNac, telefono, correoElectronico);
        this.eventos = eventos;
    }

    public void solicitarAsistirEvento(String evento) {
        System.out.println("Solicitando asistir al evento: " + evento);
    }
}
