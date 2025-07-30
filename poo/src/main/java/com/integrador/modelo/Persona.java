package main.java.com.integrador.modelo;
import java.time.LocalDate;
import javax.persistence.*;
@Entity
@Ineritance(strategy = InheritanceType.JOINED)
public abstract class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dni", nullable = false, unique = true)
    private int dni;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "fecha_nac", nullable = true)
    private LocalDate fechaNac;
    @Column(name = "telefono", nullable = true)
    private int telefono;
    @Column(name = "correo_electronico", nullable = true)
    private String correoElectronico;

    public Persona() {
        // Default constructor
    }

    public Persona (int dni,String nombre, LocalDate fechaNac, int telefono, String correoElectronico){
        this.dni = dni;
        this.nombre = nombre;
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
