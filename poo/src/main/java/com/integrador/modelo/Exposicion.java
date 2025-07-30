package main.java.com.integrador.modelo;
import main.java.com.integrador.modelo.Evento;

@Entity
public class Exposicion extends Evento{
    @Column(name = "tipo_arte")
    private String tipoArte;

    @ManyToMany
    @JoinTable(name = "exposicion_artista",
            joinColumns = @JoinColumn(name = "exposicion_id"),
            inverseJoinColumns = @JoinColumn(name = "artista_id"))
    private List<Artista> artistas;
    public Exposicion(int idEvento, String nombre, java.util.Date fechaInicio, Integer duracionEstimada, Integer cupo, String estado, String tipoEvento, String tipoArte, List<Artista> artistas) { 
        super(idEvento, nombre, fechaInicio, duracionEstimada, cupo, estado, tipoEvento);
        this.tipoArte = tipoArte;
        this.artistas = artistas;    
    }
    public String getTipoArte() {
        return tipoArte;
        }
    public void setTipoArte(String tipoArte) {
        this.tipoArte = tipoArte;
        }
}