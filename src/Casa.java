/**
 * Una casa es una vivienda que tiene cierta cantidad de pisos.
 * Es abstracta porque una casa siempre será rural o urbana.
 */
public abstract class Casa extends InmuebleVivienda {

    protected int numeroPisos;

    public Casa(int identificadorInmobiliario, int area, String direccion,
                int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.numeroPisos = numeroPisos;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de pisos: " + numeroPisos);
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }
}
