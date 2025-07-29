package main.java.com.integrador.modelo;
import com.integrador.modelo.Persona;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
public class Artista extends Persona {
@ManyToOne
@JoinColumn(name = "artistas", nullable = false)
    private Concierto concierto;
    public Artista() {
        super();
    }
    public Artista(int dni,String nombre, LocalDate fechaNac, int telefono, String correoElectronico) {
        super(dni, nombre, fechaNac, telefono, correoElectronico);
    }

}
