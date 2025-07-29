package main.java.com.integrador.modelo;
import main.java.com.integrador.modelo.Evento;
public class Exposicion extends Evento{

private String tipoArte;

public Exposicion(int idEvento, String nombre, java.util.Date fechaInicio, Integer duracionEstimada, Integer cupo, String estado, String tipoEvento, String tipoArte) {
    super(idEvento, nombre, fechaInicio, duracionEstimada, cupo, estado, tipoEvento);
    this.tipoArte = tipoArte;
    }
public String getTipoArte() {
    return tipoArte;
    }
public void setTipoArte(String tipoArte) {
    this.tipoArte = tipoArte;
    }
}