package main.java.com.integrador.modelo;

import java.util.List;
@Entity
public class Stand {
    private String dueño; // no nulo
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "stands", nullable = false)
    private Feria feria;

    // Constructor
    public Stand(String dueño, String descripcion, Feria feria) {   
        super();
        if (dueño == null || dueño.isEmpty()) {
            throw new IllegalArgumentException("El dueño no puede ser nulo o vacío.");
        }
        this.dueño = dueño;
        this.descripcion = descripcion;
        this.feria = feria;
    }

    // Getters y Setters
    public Feria getFeria() {
        return feria;
    }
    public void setFeria(Feria feria) {
        if (feria == null) {
            throw new IllegalArgumentException("La feria no puede ser nula.");
        }
        this.feria = feria;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        if (dueño == null || dueño.isEmpty()) {
            throw new IllegalArgumentException("El dueño no puede ser nulo o vacío.");
        }
        this.dueño = dueño;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Stand{" +
                "dueño='" + dueño + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", feria=" + (feria != null ? feria.getNombre() : "No asignada") +
                '}';
    }
}
