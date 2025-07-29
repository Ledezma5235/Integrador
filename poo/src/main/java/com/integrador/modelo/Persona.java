package main.java.com.integrador.modelo;
import java.time.LocalDate;

public abstract class Persona {

    private String nombre;
    private int dni;
    private LocalDate fechaNac;
    private int telefono;
    private String correoElectronico;

    public Persona (String nombre, int dni, LocalDate fechaNac, int telefono, String correoElectronico){
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    
    // Getter for nombre
    public String getNombre(){
        return this.nombre;
    }

    // Getter for dni
    public int getDni(){
        return this.dni;
    }

    // Getter for fechaNac
    public LocalDate getFechaNac(){
        return this.fechaNac;
    }

    // Getter for telefono
    public int getTelefono(){
        return this.telefono;
    }

    // Getter for correoElectronico
    public String getCorreoElectronico(){
        return this.correoElectronico;
    }

    // Optional: You might want to add a toString method to print the details of Persona
    @Override
    public String toString(){
        return "Persona [nombre=" + nombre + ", dni=" + dni + ", fechaNac=" + fechaNac + ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + "]";
    }
}
