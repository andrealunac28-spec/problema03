package ito.poo;

import java.util.ArrayList;
import java.util.Objects;

/*
 REGLAS:

 - Latitud y longitud no deben superar 180°
 - El periodo debe ser un mes válido
 - No se permiten observaciones nulas
*/

public class CuerpoCeleste implements Comparable<CuerpoCeleste> {

    private String nombreAsignado;
    private String composicion;
    private ArrayList<Observacion> observaciones;

    public CuerpoCeleste(String nombreAsignado, String composicion) {
        this.nombreAsignado = nombreAsignado;
        this.composicion = composicion;
        this.observaciones = new ArrayList<>();
    }

    public void addObservacion(Observacion ob) {
        if (ob == null) {
            throw new IllegalArgumentException("Observación inválida");
        }
        observaciones.add(ob);
    }

    public void removeObservacion(Observacion ob) {
        observaciones.remove(ob);
    }

    public Observacion getObservacion(int index) {
        if (index < 0 || index >= observaciones.size()) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        return observaciones.get(index);
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
    public int compareTo(CuerpoCeleste o) {
        return this.nombreAsignado.compareToIgnoreCase(o.nombreAsignado);
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
    public String toString() {
        return "CuerpoCeleste{" +
                "nombre='" + nombreAsignado + '\'' +
                ", composicion='" + composicion + '\'' +
                ", observaciones=" + observaciones +
                '}';
    }
}