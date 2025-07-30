package main.java.com.integrador.modelo;
import com.integrador.modelo.Persona;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Entity
public class Curador extends Persona {
    @ManyToMany(mappedBy = "curadores", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "curador_exposicion",
            joinColumns = @JoinColumn(name = "curador_id"),
            inverseJoinColumns = @JoinColumn(name = "exposicion_id"))
    private List<Exposicion> exposiciones;
    public Curador() {
        // Default constructor
    }
    
    public Curador(int dni,String nombre, LocalDate fechaNac, int telefono, String correoElectronico, List<Exposicion> exposiciones) {
        super(dni, nombre, fechaNac, telefono, correoElectronico);
        this.exposiciones = exposiciones;
    }

    public void seleccionarArtistas(String[] artistas) {
        System.out.println("Seleccionando artistas: ");
        for (String artista : artistas) {
            System.out.println("- " + artista);
        }
    }

}