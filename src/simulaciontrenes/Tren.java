package simulaciontrenes;

import java.util.List;

/**
 *
 * @author juan
 */
public class Tren {

    private Integer id;
    private String horaSalida;
    private Estacion estacionOrigen;
    private Estacion estacionDestino;
    private Estacion estacionActual;
    private List<Pasajero> pasajeros;
    private Integer capacidadPasajeros;
    private Integer numeroActualPasajeros;

    @Override
    public String toString() {
        return "Tren{" + "id=" + id + ", horaSalida=" + horaSalida + ", estacionOrigen=" + estacionOrigen + ", estacionDestino=" + estacionDestino + ", estacionActual=" + estacionActual + ", pasajeros=" + pasajeros + ", capacidadPasajeros=" + capacidadPasajeros + ", numeroActualPasajeros=" + numeroActualPasajeros + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Estacion getEstacionOrigen() {
        return estacionOrigen;
    }

    public void setEstacionOrigen(Estacion estacionOrigen) {
        this.estacionOrigen = estacionOrigen;
    }

    public Estacion getEstacionDestino() {
        return estacionDestino;
    }

    public void setEstacionDestino(Estacion estacionDestino) {
        this.estacionDestino = estacionDestino;
    }

    public Estacion getEstacionActual() {
        return estacionActual;
    }

    public void setEstacionActual(Estacion estacionActual) {
        this.estacionActual = estacionActual;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Integer getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(Integer capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public Integer getNumeroActualPasajeros() {
        return numeroActualPasajeros;
    }

    public void setNumeroActualPasajeros(Integer numeroActualPasajeros) {
        this.numeroActualPasajeros = numeroActualPasajeros;
    }
}