package main.java.com.integrador.modelo;
import com.integrador.modelo.Persona;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
public class Artista extends Persona {
    @ManyToMany
    @JoinTable(name = "artista_concierto",
            joinColumns = @JoinColumn(name = "artista_id"),
            inverseJoinColumns = @JoinColumn(name = "concierto_id"))
    private List<Concierto> conciertos;

    public Artista(){}

    public Artista(int dni,String nombre, LocalDate fechaNac, int telefono, String correoElectronico, List<Concierto> conciertos) {
        super(dni, nombre, fechaNac, telefono, correoElectronico);
        this.conciertos = conciertos;
    }

}
