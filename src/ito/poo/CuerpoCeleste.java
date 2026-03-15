package ito.poo;

import java.util.ArrayList;

public class CuerpoCeleste {

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
    public String toString() {
        return "CuerpoCeleste{" +
                "nombre='" + nombreAsignado + '\'' +
                ", composicion='" + composicion + '\'' +
                ", observaciones=" + observaciones +
                '}';
    }
}
