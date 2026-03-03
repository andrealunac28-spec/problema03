package ito.poo;

public class Observacion {
    private String periodoDeUbicacion;
    private float latitudEnGrados;
    private String direccionDeLatitud;
    private float longitudEnGrados;
    private String direccionDeLongitud;
    private float distanciaDeLaTierra;

    public Observacion(String periodoDeUbicacion, float latitudEnGrados, String direccionDeLatitud,
                       float longitudEnGrados, String direccionDeLongitud, float distanciaDeLaTierra) {

        this.periodoDeUbicacion = periodoDeUbicacion;
        this.latitudEnGrados = latitudEnGrados;
        this.direccionDeLatitud = direccionDeLatitud;
        this.longitudEnGrados = longitudEnGrados;
        this.direccionDeLongitud = direccionDeLongitud;
        this.distanciaDeLaTierra = distanciaDeLaTierra;
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

    public String getPeriodoDeUbicacion() {
        return periodoDeUbicacion;
    }

    public float getDistanciaDeLaTierra() {
        return distanciaDeLaTierra;
    }

    @Override
    public String toString() {
        return "Observacion {" +
                "periodo='" + periodoDeUbicacion + '\'' +
                ", latitud=" + latitudEnGrados + "° " + direccionDeLatitud +
                ", longitud=" + longitudEnGrados + "° " + direccionDeLongitud +
                ", distancia=" + distanciaDeLaTierra +
                '}';
    }

}
