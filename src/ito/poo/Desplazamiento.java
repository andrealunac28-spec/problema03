package ito.poo;

public class Desplazamiento {

    private Observacion observacionInicial;
    private Observacion observacionFinal;

    public Desplazamiento(Observacion ob1, Observacion ob2) {
        observacionInicial = ob1;
        observacionFinal = ob2;
    }

    public float getDesplazamientoLatitud() {
        return Math.abs(
                observacionFinal.getLatitudEnGrados()
                        - observacionInicial.getLatitudEnGrados()
        );
    }

    public float getDesplazamientoLongitud() {
        return Math.abs(
                observacionFinal.getLongitudEnGrados()
                        - observacionInicial.getLongitudEnGrados()
        );
    }

    public float getDesplazamientoDistancia() {
        return Math.abs(
                observacionFinal.getDistanciaDeLaTierra()
                        - observacionInicial.getDistanciaDeLaTierra()
        );
    }

    @Override
    public String toString() {
        return "Desplazamiento{" +
                "latitud=" + getDesplazamientoLatitud() +
                ", longitud=" + getDesplazamientoLongitud() +
                ", distancia=" + getDesplazamientoDistancia() +
                '}';
    }
}
