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
    private Integer numeroIngresos;
    private Integer numeroSalidas;

    @Override
    public String toString() {
        return "Estacion{" + "nombre=" + nombre + ", orden=" + orden + ", pasajeros=" + pasajeros + ", numeroIngresos=" + numeroIngresos + ", numeroSalidas=" + numeroSalidas + '}';
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

    public Integer getNumeroIngresos() {
        return numeroIngresos;
    }

    public void setNumeroIngresos(Integer numeroIngresos) {
        this.numeroIngresos = numeroIngresos;
    }

    public Integer getNumeroSalidas() {
        return numeroSalidas;
    }

    public void setNumeroSalidas(Integer numeroSalidas) {
        this.numeroSalidas = numeroSalidas;
    }
}