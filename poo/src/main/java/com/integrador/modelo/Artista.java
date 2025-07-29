package main.java.com.integrador.modelo;

public class Artista extends Persona {
    public Artista(String nombre, int edad) {
        super(nombre, edad);
    }

    public void crearObra() {
        System.out.println("El artista " + getNombre() + " está creando una obra.");
    }

    public void exhibirObra() {
        System.out.println("El artista " + getNombre() + " está exhibiendo su obra.");
    }
}
