package simulaciontrenes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author juan
 */
public class SimulacionTrenes {

    public static void main(String[] args) {
        SimulacionTrenes st = new SimulacionTrenes();
        st.simular();
    }

    private void simular() {
        try {
            Transmimetro tm = cargarArchivos();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (!llegaronTodosLosTrenes(tm.getTrenes())) {
                            for (Tren t : tm.getTrenes()) {
                                siguienteParada(tm.getEstaciones(), t);
                                System.out.println(t.getId() + ": " + t.getEstacionActual() + "\n");
                            }
                            Thread.sleep(2000);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Transmimetro cargarArchivos() throws Exception {
        URL url = this.getClass().getResource(this.getClass().getSimpleName() + ".class");
        File f = new File(url.getPath()).getParentFile();
        String paquete = f.getAbsolutePath().replaceAll("%20", " ");

        Transmimetro tm = new Transmimetro();
        tm.setTrenes(new ArrayList<>());
        tm.setEstaciones(new ArrayList<>());
        tm.setPasajeros(new ArrayList<>());

        File archivoEstaciones = new File(paquete + File.separator + "archivoEstaciones.csv");
        FileReader fr1 = new FileReader(archivoEstaciones);
        BufferedReader br1 = new BufferedReader(fr1);
        String linea1 = br1.readLine();
        int contador = 0;
        while ((linea1 = br1.readLine()) != null) {
            String[] lineaSplit = linea1.split(";");
            Estacion tmp = new Estacion();
            tmp.setNombre(lineaSplit[0]);
            tmp.setOrden(contador++);
            tm.getEstaciones().add(tmp);
        }
        fr1.close();
        br1.close();

        File archivoTrenes = new File(paquete + File.separator + "archivoTrenes.csv");
        FileReader fr2 = new FileReader(archivoTrenes);
        BufferedReader br2 = new BufferedReader(fr2);
        String linea2 = br2.readLine();
        while ((linea2 = br2.readLine()) != null) {
            String[] lineaSplit = linea2.split(";");
            Tren tmp = new Tren();
            tmp.setId(Integer.valueOf(lineaSplit[0]));
            tmp.setEstacionOrigen(buscarEstacion(tm.getEstaciones(), lineaSplit[1]));
            tmp.setHoraSalida(lineaSplit[2]);
            tmp.setEstacionDestino(buscarEstacion(tm.getEstaciones(), lineaSplit[3]));
            tm.getTrenes().add(tmp);
        }
        fr2.close();
        br2.close();

        File archivoPasajeros = new File(paquete + File.separator + "archivoPasajeros.csv");
        FileReader fr3 = new FileReader(archivoPasajeros);
        BufferedReader br3 = new BufferedReader(fr3);
        String linea3 = br3.readLine();
        while ((linea3 = br3.readLine()) != null) {
            String[] lineaSplit = linea3.split(";");
            Pasajero tmp = new Pasajero();
            tmp.setId(Integer.valueOf(lineaSplit[0]));
            tmp.setNombre(lineaSplit[1]);
            tm.getPasajeros().add(tmp);
        }
        fr3.close();
        br3.close();
        return tm;
    }

    public Estacion buscarEstacion(List<Estacion> estaciones, String nombre) {
        for (Estacion tmp : estaciones) {
            if (tmp.getNombre().equals(nombre)) {
                return tmp;
            }
        }
        return null;
    }

    public Tren buscarTren(List<Tren> trenes, Integer id) {
        for (Tren tmp : trenes) {
            if (tmp.getId().equals(id)) {
                return tmp;
            }
        }
        return null;
    }

    private boolean llegaronTodosLosTrenes(List<Tren> trenes) {
        for (Tren t : trenes) {
            if (t.getEstacionActual() == null) {
                return false;
            } else if (!t.getEstacionActual().equals(t.getEstacionDestino())) {
                return false;
            }
        }
        return true;
    }

    public void siguienteParada(List<Estacion> estaciones, Tren tren) {
        if (tren.getEstacionActual() == null) {
            tren.setEstacionActual(tren.getEstacionOrigen());
        } else if (!tren.getEstacionActual().equals(tren.getEstacionDestino())) {
            if (tren.getEstacionOrigen().getOrden() > tren.getEstacionDestino().getOrden()) {
                for (int i = estaciones.size() - 1; i >= 0; i--) {
                    Estacion e = estaciones.get(i);
                    if (e.getOrden() < tren.getEstacionActual().getOrden()) {
                        tren.setEstacionActual(e);
                        break;
                    }
                }
            } else {
                for (Estacion e : estaciones) {
                    if (e.getOrden() > tren.getEstacionActual().getOrden()) {
                        tren.setEstacionActual(e);
                        break;
                    }
                }
            }
        }
    }
}
