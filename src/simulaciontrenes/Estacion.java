package simulaciontrenes;

import java.util.List;

/**
 *
 * @author juan
 */
public class Estacion {

    private String nombre;
    private Integer orden;
    private List<Pasajero> pasajeros;

    @Override
    public String toString() {
        return "Estacion{" + "nombre=" + nombre + ", orden=" + orden + ", pasajeros=" + pasajeros + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
}