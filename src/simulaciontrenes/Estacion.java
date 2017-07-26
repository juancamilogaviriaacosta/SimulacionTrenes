package simulaciontrenes;

/**
 *
 * @author juan
 */
public class Estacion {
    private String nombre;
    private Integer orden;

    @Override
    public String toString() {
        return "Estacion{" + "nombre=" + nombre + ", orden=" + orden + '}';
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
}    
