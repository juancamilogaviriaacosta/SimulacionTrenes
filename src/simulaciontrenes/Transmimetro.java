package simulaciontrenes;

import java.util.List;

/**
 *
 * @author juan
 */
public class Transmimetro {
    private List<Estacion> estaciones;
    private List<Tren> trenes;
    private List<Pasajero> pasajeros;

    @Override
    public String toString() {
        return "Transmimetro{\n" + "estaciones=" + estaciones + ", \ntrenes=" + trenes + ", \npasajeros=" + pasajeros + '}';
    }    
    
    public List<Tren> getTrenes() {
        return trenes;
    }

    public void setTrenes(List<Tren> trenes) {
        this.trenes = trenes;
    }

    public List<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(List<Estacion> estaciones) {
        this.estaciones = estaciones;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
}
