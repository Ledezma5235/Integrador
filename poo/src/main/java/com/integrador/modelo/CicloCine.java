package main.java.com.integrador.modelo;
import com.integrador.modelo.Evento;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CicloCine extends Evento {

    @Column(name = "orden")
    private Integer orden;
    @Column(name = "hay_charla")
    private Boolean hayCharla;
    @OneToMany(mappedBy = "cicloCine", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Pelicula> peliculas;

    // Constructor
    public CicloCine(int idEvento, String nombre, Date fechaInicio, Integer duracionEstimada, Integer cupo, String estado, String tipoEvento, Integer orden, List<Pelicula> peliculas, Boolean hayCharla) {
        super(idEvento, nombre, fechaInicio, duracionEstimada, cupo, estado, tipoEvento); // Llama al constructor de Evento
        this.orden = orden;
        this.peliculas = peliculas;
        this.hayCharla = hayCharla;
    }

    // Getters and Setters
    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public List<String> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<String> peliculas) {
        this.peliculas = peliculas;
    }

    public Boolean getHayCharla() {
        return hayCharla;
    }

    public void setHayCharla(Boolean hayCharla) {
        this.hayCharla = hayCharla;
    }
}
