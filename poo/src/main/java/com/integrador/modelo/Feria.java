package main.java.com.integrador.modelo;
import main.java.com.integrador.modelo.Evento;
import java.util.Date;

public class Feria extends Evento {
    private Integer cantidadStands;
    private String tipoUbicacion;
    // Constructor
    public Feria(int idEvento, String nombre, Date fechaInicio, Integer duracionEstimada, Integer cupo, String estado, String tipoEvento) {
         super(idEvento, nombre, fechaInicio, duracionEstimada, cupo, estado, tipoEvento);
         this.cantidadStands = cantidadStands;
         this.tipoUbicacion = tipoUbicacion;
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

