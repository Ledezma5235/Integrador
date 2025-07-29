package main.java.com.integrador.modelo;

public class Stand {
    private String dueño; // Not null
    private String descripcion;

    // Constructor
    public Stand(String dueño, String descripcion) {
        if (dueño == null || dueño.isEmpty()) {
            throw new IllegalArgumentException("El dueño no puede ser nulo o vacío.");
        }
        this.dueño = dueño;
        this.descripcion = descripcion;
    }

    // Getters y Setters
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
                '}';
    }
}
