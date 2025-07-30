package main.java.com.integrador.modelo;
import java.util.Date;
import java.util.List;
@Entity
public abstract class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento")
    private Long idEvento;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    @Column(name = "duracion_estimada")
    private Integer duracionEstimada;
    @Column(name = "cupo")
    private Integer cupo;
    @Column(name = "estado")
    private String estado;

    @ManyToMany
    @JoinTable(name = "evento_asistente",
            joinColumns = @JoinColumn(name = "idEvento"),
            inverseJoinColumns = @JoinColumn(name = "dni"))
    private List<Asistente> asistentes;
    @ManyToOne
    @JoinColumn(name = "dni_organizador")
    private Organizador organizador;

    @ManyToMany
    @JoinTable(name = "participantes",
            joinColumns = @JoinColumn(name = "idEvento"),
            inverseJoinColumns = @JoinColumn(name = "dni"))
    private List<Participante> participantes;

    public Evento() {
        // Constructor vacio para JPA
    }

    // Constructor
    public Evento(int idEvento, String nombre, Date fechaInicio, Integer duracionEstimada, Integer cupo, String estado, List<Asistente> asistentes, Organizador organizador, List<Participante> participantes) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.duracionEstimada = duracionEstimada;
        this.cupo = cupo;
        this.estado = estado;
        this.asistentes = asistentes;
        this.organizador = organizador;
        this.participantes = participantes;
         
    }

    // Getters and Setters
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Integer getDuracionEstimada() {
        return duracionEstimada;
    }

    public void setDuracionEstimada(Integer duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }

    public Integer getCupo() {
        return cupo;
    }

    public void setCupo(Integer cupo) {
        this.cupo = cupo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    // toString method
    @Override
    public String toString() {
        return "Evento{" +
                "idEvento=" + idEvento +
                ", nombre='" + nombre + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", duracionEstimada=" + duracionEstimada +
                ", cupo=" + cupo +
                ", estado='" + estado + '\'' +
                '}';
    }
}
