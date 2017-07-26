package simulaciontrenes;

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

    @Override
    public String toString() {
        return "Tren{" + "id=" + id + ", horaSalida=" + horaSalida + ", estacionOrigen=" + estacionOrigen + ", estacionDestino=" + estacionDestino + ", estacionActual=" + estacionActual + '}';
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
}