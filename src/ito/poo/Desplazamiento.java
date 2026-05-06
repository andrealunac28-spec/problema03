package ito.poo;

import java.util.Objects;
import java.util.Comparator;

public class Desplazamiento {

    private Observacion observacionInicial;
    private Observacion observacionFinal;

    public Desplazamiento(Observacion ob1, Observacion ob2) {

        if (ob1 == null || ob2 == null) {
            throw new IllegalArgumentException("Observaciones inválidas");
        }

        this.observacionInicial = ob1;
        this.observacionFinal = ob2;
    }

    public float getDesplazamientoLatitud() {
        return Math.abs(
                observacionFinal.getLatitudEnGrados() -
                        observacionInicial.getLatitudEnGrados()
        );
    }

    public float getDesplazamientoLongitud() {
        return Math.abs(
                observacionFinal.getLongitudEnGrados() -
                        observacionInicial.getLongitudEnGrados()
        );
    }

    public float getDesplazamientoDistancia() {
        return Math.abs(
                observacionFinal.getDistanciaDeLaTierra() -
                        observacionInicial.getDistanciaDeLaTierra()
        );
    }

    public static Comparator<Desplazamiento> POR_DISTANCIA =
            (d1, d2) -> Float.compare(d1.getDesplazamientoDistancia(), d2.getDesplazamientoDistancia());

    public static Comparator<Desplazamiento> POR_LATITUD =
            (d1, d2) -> Float.compare(d1.getDesplazamientoLatitud(), d2.getDesplazamientoLatitud());

    public static Comparator<Desplazamiento> POR_LONGITUD =
            (d1, d2) -> Float.compare(d1.getDesplazamientoLongitud(), d2.getDesplazamientoLongitud());

    @Override
    public String toString() {
        return "Desplazamiento{" +
                "latitud=" + getDesplazamientoLatitud() +
                ", longitud=" + getDesplazamientoLongitud() +
                ", distancia=" + getDesplazamientoDistancia() +
                '}';
    }
}