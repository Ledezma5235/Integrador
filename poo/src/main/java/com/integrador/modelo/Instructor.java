package main.java.com.integrador.modelo;
import java.time.LocalDate;
import main.java.com.integrador.modelo.Persona;

@Entity
public class Instructor extends Persona {
    @ManyToMany
    @JoinTable(name = "taller_instructor",
            joinColumns = @JoinColumn(name = "instructor_id"),
            inverseJoinColumns = @JoinColumn(name = "taller_id"))
    private List<Taller> talleres;
    public Instructor(int dni,String nombre, LocalDate fechaNac, int telefono, String correoElectronico, List<Taller> talleres) {
        super(dni, nombre, fechaNac, telefono, correoElectronico);
        this.talleres = talleres;
    }

    public void impartirClase() {
        System.out.println("El instructor " + getNombre() + " está impartiendo una clase.");
    }

    public void evaluarParticipante(String participante) {
        System.out.println("El instructor " + getNombre() + " está evaluando al participante: " + participante);
    }
}