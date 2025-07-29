package main.java.com.integrador.modelo;
import java.util.List;
import main.java.com.integrador.modelo.Evento;
public class Concierto extends Evento{

    public enum TipoEntrada {
        GRATUITO,
        PAGA
    }

    private TipoEntrada tipoEntrada;
    private List<String> artistas;
    private List<String> bandas;

    public Concierto(int idEvento, String nombre, Date fechaInicio, Integer duracionEstimada, Integer cupo, String estado, String tipoEvento, TipoEntrada tipoEntrada, List<String> artistas, List<String> bandas) {
        super(idEvento, nombre, fechaInicio, duracionEstimada, cupo, estado, tipoEvento); // Llama al constructor de Evento
        this.tipoEntrada = tipoEntrada;
        this.artistas = artistas;
        this.bandas = bandas;
    }

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public List<String> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<String> artistas) {
        this.artistas = artistas;
    }

    public List<String> getBandas() {
        return bandas;
    }

    public void setBandas(List<String> bandas) {
        this.bandas = bandas;
    }

    @Override
    public String toString() {
        return "Concierto{" +
                "idEvento=" + getIdEvento() +
                ", nombre='" + getNombre() + '\'' +
                ", fechaInicio=" + getFechaInicio() +
                ", duracionEstimada=" + getDuracionEstimada() +
                ", cupo=" + getCupo() +
                ", estado='" + getEstado() + '\'' +
                ", tipoEvento='" + getTipoEvento() + '\'' +
                ", tipoEntrada=" + tipoEntrada +
                ", artistas=" + artistas +
                ", bandas=" + bandas +
                '}';
    }
}