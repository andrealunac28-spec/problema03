package ito.poo;
import java.util.ArrayList;
public class CuerpoCeleste {
    private String nombreAsignado;
    private String composicion;
    private ArrayList<Observacion> observaciones;

    public CuerpoCeleste(String nombreAsignado, String composicion) {
        this.nombreAsignado = nombreAsignado;
        this.composicion = composicion;
        this.observaciones = new ArrayList<>();
    }

    public void addObservacion(Observacion obs) {
        observaciones.add(obs);
    }

    public void removeObservacion(Observacion obs) {
        observaciones.remove(obs);
    }

    public Observacion getObservacion(int index) {
        if (index >= 0 && index < observaciones.size()) {
            return observaciones.get(index);
        }
        return null;
    }

    public String getNombre() {
        return nombreAsignado;
    }

    public String getComposicion() {
        return composicion;
    }

    public ArrayList<Observacion> getObservaciones() {
        return observaciones;
    }
    public float getDesplazamiento(Observacion a, Observacion b) {

        if (a == null || b == null) return 0;

        float difLat = Math.abs(a.getLatitudEnGrados() - b.getLatitudEnGrados());
        float difLong = Math.abs(a.getLongitudEnGrados() - b.getLongitudEnGrados());
        float difDist = Math.abs(a.getDistanciaDeLaTierra() - b.getDistanciaDeLaTierra());

        return difLat + difLong + difDist;
    }
    @Override
    public String toString() {
        return "CuerpoCeleste {" +
                "nombre='" + nombreAsignado + '\'' +
                ", composicion='" + composicion + '\'' +
                ", observaciones=" + observaciones +
                '}';
    }
}
