package main.java.com.integrador.modelo;
import java.time.LocalDate;

import com.integrador.modelo.Persona;
@Entity
public class Organizador extends Persona {

    @OneToMany(mappedBy = "organizador", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Column(name = "eventos")
    private List<Evento> eventos;

    public Organizador(){}

    public Organizador(int dni,String nombre, LocalDate fechaNac, int telefono, String correoElectronico,Evento evento) {
        super(dni, nombre, fechaNac, telefono, correoElectronico);
        this.eventos = new ArrayList<>();
    }

    public void asignarRol(String rol, Asistente unAsistente) {
        // Lógica para organizar un evento
        System.out.println("El organizador ha asignado el rol " + rol + " al asistente" + unAsistente);
    }
    
}
