package simulaciontrenes;

/**
 *
 * @author juan
 */
public class Pasajero {
    private Integer id;
    private String nombre;
    private Estacion estacionIngreso;

    @Override
    public String toString() {
        return "Pasajero{" + "id=" + id + ", nombre=" + nombre + ", estacionIngreso=" + estacionIngreso + '}';
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estacion getEstacionIngreso() {
        return estacionIngreso;
    }

    public void setEstacionIngreso(Estacion estacionIngreso) {
        this.estacionIngreso = estacionIngreso;
    }
}
