package main.java.com.integrador.modelo;
import com.integrador.modelo.Evento;
public class Taller extends Evento {
    private Integer cupoMaximo;
    private String modalidad;

    // Constructor
    public Taller(int idEvento, String nombre, Date fechaInicio, Integer duracionEstimada, Integer cupo, String estado, String tipoEvento, Integer cupoMaximo, String modalidad) {
        super(idEvento, nombre, fechaInicio, duracionEstimada, cupo, estado, tipoEvento); // Llama al constructor de Evento con todos sus atributos
        this.cupoMaximo = cupoMaximo;
        this.modalidad = modalidad;
    }

    // Getters and Setters
    public Integer getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(Integer cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    @Override
    public String toString() {
        return "Taller{" +
                "idEvento=" + getIdEvento() +
                ", nombre='" + getNombre() + '\'' +
                ", fechaInicio=" + getFechaInicio() +
                ", duracionEstimada=" + getDuracionEstimada() +
                ", cupo=" + getCupo() +
                ", estado='" + getEstado() + '\'' +
                ", tipoEvento='" + getTipoEvento() + '\'' +
                ", cupoMaximo=" + cupoMaximo +
                ", modalidad='" + modalidad + '\'' +
                '}';
    }
}