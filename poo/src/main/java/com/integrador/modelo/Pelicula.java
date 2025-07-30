package main.java.com.integrador.modelo;

import java.util.List;

@Entity
public class Pelicula {
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "director")
    private String director;
    @Column(name = "duracion")
    private int duracion; //minutos
    @Column(name = "genero")
    private Boolean genero;
    
    @ManyToMany(mappedBy = "peliculas", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "ciclo_cine_pelicula",
            joinColumns = @JoinColumn(name = "pelicula_id"),
            inverseJoinColumns = @JoinColumn(name = "ciclo_cine_id"))
    private List<CicloCine> ciclosCine;

    // Constructor vacío
    public Pelicula() {
    }

    // Constructor con parámetros
    public Pelicula(String titulo, String director, int duracion, Boolean genero,List<CicloCine> ciclosCine) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.ciclosCine = ciclosCine;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Método toString
    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                '}';
    }
}