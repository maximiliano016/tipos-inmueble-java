/**
 * Departamento pequeño (apartaestudio)
 * SIEMPRE tiene una sola habitación.
 * Por eso su constructor no pide el número de habitaciones: lo fija en 1.
 * Valor por metro cuadrado: 200.
 */
public class Apartaestudio extends Departamento {

    public static final int VALOR_POR_METRO_CUADRADO = 200;

    // Un apartaestudio siempre tiene exactamente 1 habitación.
    public static final int NUMERO_HABITACIONES_FIJO = 1;

    public Apartaestudio(int identificadorInmobiliario, int area, String direccion,
                         int numeroBanos, double valorAdministracion) {
        // Le pasamos 1 habitación a la clase madre, sin preguntarle al usuario.
        super(identificadorInmobiliario, area, direccion,
                NUMERO_HABITACIONES_FIJO, numeroBanos, valorAdministracion);
    }

    /**
     * Sobrescribimos el setter para que nadie pueda cambiar las habitaciones
     * a un número distinto de 1.
     */
    @Override
    public void setNumeroHabitaciones(int numeroHabitaciones) {
        System.out.println("Aviso: un apartaestudio siempre tiene 1 habitación. No se cambió el valor.");
    }

    @Override
    public int obtenerValorPorMetroCuadrado() {
        return VALOR_POR_METRO_CUADRADO;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- Apartaestudio ---");
        super.mostrarInformacion();
        System.out.println("Valor de compra: $" + calcularValorCompra());
    }
}
