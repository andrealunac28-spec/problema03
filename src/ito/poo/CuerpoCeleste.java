package ito.poo;

import java.util.ArrayList;
import java.util.Objects;

public class CuerpoCeleste implements Comparable<CuerpoCeleste> {

    private String nombreAsignado;
    private String composicion;
    private ArrayList<Observacion> observaciones;

    public CuerpoCeleste(String nombreAsignado, String composicion) {
        this.nombreAsignado = nombreAsignado;
        this.composicion = composicion;
        observaciones = new ArrayList<>();
    }

    public void addObservacion(Observacion ob) {
        observaciones.add(ob);
    }

    public void removeObservacion(Observacion ob) {
        observaciones.remove(ob);
    }

    public Observacion getObservacion(int index) {
        if(index >= 0 && index < observaciones.size()){
            return observaciones.get(index);
        }
        return null;
    }

    public ArrayList<Observacion> getObservaciones() {
        return observaciones;
    }

    public String getNombre() {
        return nombreAsignado;
    }

    public String getComposicion() {
        return composicion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CuerpoCeleste)) return false;

        CuerpoCeleste c = (CuerpoCeleste) obj;
        return Objects.equals(nombreAsignado, c.nombreAsignado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreAsignado);
    }

    @Override
    public int compareTo(CuerpoCeleste o) {
        return this.nombreAsignado.compareToIgnoreCase(o.nombreAsignado);
    }

    @Override
    public String toString() {
        return "CuerpoCeleste{" +
                "nombre='" + nombreAsignado + '\'' +
                ", composicion='" + composicion + '\'' +
                ", observaciones=" + observaciones +
                '}';
    }
}