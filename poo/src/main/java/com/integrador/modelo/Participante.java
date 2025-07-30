package main.java.com.integrador.modelo;
import java.time.LocalDate;

import com.integrador.modelo.Persona;
@Entity
public class Participante extends Persona {
    @ManyToMany(mappedBy = "participantes", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "participante_evento",
            joinColumns = @JoinColumn(name = "participante_id"),
            inverseJoinColumns = @JoinColumn(name = "evento_id"))
    private List<Evento> eventos;
    public Participante(int dni,String nombre, LocalDate fechaNac, int telefono, String correoElectronico) {
        super(dni, nombre, fechaNac, telefono, correoElectronico);
    }

    public void inscribirseEvento() {
        // Lógica para inscribirse a un evento
        System.out.println("El participante se ha inscrito en el evento.");
    }
}