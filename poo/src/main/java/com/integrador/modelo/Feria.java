package main.java.com.integrador.modelo;
import javax.persistence.*;
import main.java.com.integrador.modelo.Evento;
import java.util.Date;
@Entity
public class Feria extends Evento {
    @Column(name = "cantidad_stands")
    private Integer cantidadStands;
    @Column(name = "tipo_ubicacion")
    private String tipoUbicacion;
    @OneToMany(mappedBy = "feria", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Stands> stands;
    
    // Constructor
    public Feria(int idEvento, String nombre, Date fechaInicio, Integer duracionEstimada, Integer cupo, String estado, String tipoEvento, Integer cantidadStands, String tipoUbicacion, List<Stands> stands) {
        super(idEvento, nombre, fechaInicio, duracionEstimada, cupo, estado, tipoEvento);
        this.cantidadStands = cantidadStands;
        this.tipoUbicacion = tipoUbicacion;
        this.stands = stands;
    }
    public List<Stands> getStands() {
        return stands;
    }
    public void setStands(List<Stands> stands) {
        this.stands = stands;
    }
     // Getters and Setters
    public Integer getCantidadStands() {
         return cantidadStands;
     }
     
    public void setCantidadStands(Integer cantidadStands) {
         this.cantidadStands = cantidadStands;
     }
    public String getTipoUbicacion() {
         return tipoUbicacion;
     }
    public void setTipoUbicacion(String tipoUbicacion) {
         this.tipoUbicacion = tipoUbicacion;
     }
    @Override
    public String toString() {
        return "Feria{" +
                "idEvento=" + getIdEvento() +
                ", nombre='" + getNombre() + '\'' +
                ", fechaInicio=" + getFechaInicio() +
                ", duracionEstimada=" + getDuracionEstimada() +
                ", cupo=" + getCupo() +
                ", estado='" + getEstado() + '\'' +
                ", tipoEvento='" + getTipoEvento() + '\'' +
                ", cantidadStands=" + cantidadStands +
                ", tipoUbicacion='" + tipoUbicacion + '\'' +
                '}';
    }
}

