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

        // VALIDACIONES

        if (latitudEnGrados < 0 || latitudEnGrados > 180) {
            throw new IllegalArgumentException("Latitud inválida (0-180)");
        }

        if (longitudEnGrados < 0 || longitudEnGrados > 180) {
            throw new IllegalArgumentException("Longitud inválida (0-180)");
        }

        if (!direccionDeLatitud.equalsIgnoreCase("N") &&
                !direccionDeLatitud.equalsIgnoreCase("S")) {
            throw new IllegalArgumentException("Dirección de latitud inválida (N/S)");
        }

        if (!direccionDeLongitud.equalsIgnoreCase("E") &&
                !direccionDeLongitud.equalsIgnoreCase("O")) {
            throw new IllegalArgumentException("Dirección de longitud inválida (E/O)");
        }

        String[] meses = {"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO",
                "JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};

        boolean mesValido = false;
        for (String mes : meses) {
            if (mes.equalsIgnoreCase(periodoDeUbicacion)) {
                mesValido = true;
                break;
            }
        }

        if (!mesValido) {
            throw new IllegalArgumentException("Mes inválido");
        }

        if (distanciaDeLaTierra <= 0) {
            throw new IllegalArgumentException("Distancia inválida");
        }

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

    public float getLongitudEnGrados() {
        return longitudEnGrados;
    }

    public float getDistanciaDeLaTierra() {
        return distanciaDeLaTierra;
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
    public String toString() {
        return "Observacion{" +
                "periodo='" + periodoDeUbicacion + '\'' +
                ", latitud=" + latitudEnGrados + "° " + direccionDeLatitud +
                ", longitud=" + longitudEnGrados + "° " + direccionDeLongitud +
                ", distancia=" + distanciaDeLaTierra +
                '}';
    }
}