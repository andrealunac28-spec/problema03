package ito.poo;

import java.util.Objects;
import java.util.Comparator;

public class Observacion implements Comparable<Observacion> {

    private String periodoDeUbicacion;
    private float latitudEnGrados;
    private String direccionDeLatitud;
    private float longitudEnGrados;
    private String direccionDeLongitud;
    private float distanciaDeLaTierra;

    public Observacion(String periodoDeUbicacion, float latitudEnGrados,
                       String direccionDeLatitud, float longitudEnGrados,
                       String direccionDeLongitud, float distanciaDeLaTierra) {

        this.periodoDeUbicacion = periodoDeUbicacion;
        this.latitudEnGrados = latitudEnGrados;
        this.direccionDeLatitud = direccionDeLatitud;
        this.longitudEnGrados = longitudEnGrados;
        this.direccionDeLongitud = direccionDeLongitud;
        this.distanciaDeLaTierra = distanciaDeLaTierra;
    }

    public String getPeriodoDeUbicacion() {
        return periodoDeUbicacion;
    }

    public float getLatitudEnGrados() {
        return latitudEnGrados;
    }

    public String getDireccionDeLatitud() {
        return direccionDeLatitud;
    }

    public float getLongitudEnGrados() {
        return longitudEnGrados;
    }

    public String getDireccionDeLongitud() {
        return direccionDeLongitud;
    }

    public float getDistanciaDeLaTierra() {
        return distanciaDeLaTierra;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Observacion)) return false;

        Observacion o = (Observacion) obj;
        return Float.compare(latitudEnGrados, o.latitudEnGrados) == 0 &&
                Float.compare(longitudEnGrados, o.longitudEnGrados) == 0 &&
                Objects.equals(periodoDeUbicacion, o.periodoDeUbicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodoDeUbicacion, latitudEnGrados, longitudEnGrados);
    }

    @Override
    public int compareTo(Observacion o) {
        return this.periodoDeUbicacion.compareToIgnoreCase(o.periodoDeUbicacion);
    }

    public static Comparator<Observacion> POR_DISTANCIA =
            (o1, o2) -> Float.compare(o1.distanciaDeLaTierra, o2.distanciaDeLaTierra);

    public static Comparator<Observacion> POR_LATITUD =
            (o1, o2) -> Float.compare(o1.latitudEnGrados, o2.latitudEnGrados);

    @Override
    public String toString() {
        return "Observacion{" +
                "periodo='" + periodoDeUbicacion + '\'' +
                ", latitud=" + latitudEnGrados + "° " + direccionDeLatitud +
                ", longitud=" + longitudEnGrados + "° " + direccionDeLongitud +
                ", distancia=" + distanciaDeLaTierra +
                '}';
    }
}