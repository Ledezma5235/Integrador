package main.java.com.integrador.modelo;
import com.integrador.modelo.Evento;
import java.util.ArrayList;
import java.util.List;

public class CicloCine extends Evento {
    private Integer orden;
    private List<String> peliculas;
    private Boolean hayCharla;

    // Constructor
    public CicloCine(int idEvento, String nombre, Date fechaInicio, Integer duracionEstimada, Integer cupo, String estado, String tipoEvento, Integer orden, List<String> peliculas, Boolean hayCharla) {
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
