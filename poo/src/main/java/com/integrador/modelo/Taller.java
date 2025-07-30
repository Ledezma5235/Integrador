package main.java.com.integrador.modelo;
import java.util.Date;

import com.integrador.modelo.Evento;
@Entity
public class Taller extends Evento {
    @Column(name = "cupo_maximo")
    private Integer cupoMaximo;
    @Column(name = "modalidad")
    private String modalidad;
    @ManyToMany(mappedBy = "talleres", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "taller_instructor",
            joinColumns = @JoinColumn(name = "taller_id"),
            inverseJoinColumns = @JoinColumn(name = "instructor_id"))
    @Column(name = "instructores")
    private List<Instructor> instructores;
    
    // Constructor
    public Taller(int idEvento, String nombre, Date fechaInicio, Integer duracionEstimada, Integer cupo, String estado, String tipoEvento, Integer cupoMaximo, String modalidad, List<Instructor> instructores) {
        super(idEvento, nombre, fechaInicio, duracionEstimada, cupo, estado, tipoEvento); // Llama al constructor de Evento con todos sus atributos
        this.cupoMaximo = cupoMaximo;
        this.modalidad = modalidad;
        this.instructores = instructores;
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