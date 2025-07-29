package main.java.com.integrador.modelo;

public class Pelicula {
    private String titulo;
    private String director;
    private int duracion; // Duración en minutos
    private Boolean genero;

    // Constructor vacío
    public Pelicula() {
    }

    // Constructor con parámetros
    public Pelicula(String titulo, String director, int duracion, Boolean genero) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
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