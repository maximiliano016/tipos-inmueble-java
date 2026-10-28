/**
 * Casa ubicada en el campo.
 * Esta clase NO es abstracta: sí se pueden crear objetos CasaRural.
 * Valor por metro cuadrado: 200.
 */
public class CasaRural extends Casa {

    // Constante: un valor que nunca cambia. Por convención se escribe en MAYÚSCULAS.
    public static final int VALOR_POR_METRO_CUADRADO = 200;

    protected double distanciaCapital;
    protected double altitud;

    public CasaRural(int identificadorInmobiliario, int area, String direccion,
                     int numeroHabitaciones, int numeroBanos, int numeroPisos,
                     double distanciaCapital, double altitud) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
        this.distanciaCapital = distanciaCapital;
        this.altitud = altitud;
    }

    /**
     * Como Inmueble tiene este metodo abstracto, aquí estamos obligados
     * a decir cuánto vale el metro cuadrado de una casa rural.
     */
    @Override
    public int obtenerValorPorMetroCuadrado() {
        return VALOR_POR_METRO_CUADRADO;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- Casa rural ---");
        super.mostrarInformacion();
        System.out.println("Distancia a la capital: " + distanciaCapital + " km");
        System.out.println("Altitud: " + altitud + " m.s.n.m.");
        System.out.println("Valor de compra: $" + calcularValorCompra());
    }

    public double getDistanciaCapital() {
        return distanciaCapital;
    }

    public void setDistanciaCapital(double distanciaCapital) {
        this.distanciaCapital = distanciaCapital;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }
}
