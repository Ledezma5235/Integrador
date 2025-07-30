package main.java.com.integrador.modelo;
import java.util.List;
import main.java.com.integrador.modelo.Evento;
@Entity
public class Concierto extends Evento{
    public enum TipoEntrada {
        GRATUITO,
        PAGA
    }
    @Column(name = "tipo_entrada")
    private TipoEntrada tipoEntrada;
    @ManyToMany
    @JoinTable(name = "concierto_artista",
            joinColumns = @JoinColumn(name = "concierto_id"),
            inverseJoinColumns = @JoinColumn(name = "artista_id"))
    private List<Artista> artistas;


    public Concierto(int idEvento, String nombre, Date fechaInicio, Integer duracionEstimada, Integer cupo, String estado, List<Artista> artistas, TipoEntrada tipoEntrada) {
        super(idEvento, nombre, fechaInicio, duracionEstimada, cupo, estado);
        this.tipoEntrada = tipoEntrada;
        this.artistas = artistas;
    }

    public Concierto(){
        super();
    }
        
    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
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
                ", artistas=" + artistas.toString() +
                '}';
    }
}