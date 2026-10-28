/**
 * Casa urbana que NO está en un conjunto cerrado.
 * No tiene atributos propios: todo lo hereda de CasaUrbana / Casa.
 * Valor por metro cuadrado: 400.
 */
public class CasaIndependiente extends CasaUrbana {

    public static final int VALOR_POR_METRO_CUADRADO = 400;

    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion,
                             int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
    }

    @Override
    public int obtenerValorPorMetroCuadrado() {
        return VALOR_POR_METRO_CUADRADO;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- Casa independiente ---");
        super.mostrarInformacion();
        System.out.println("Valor de compra: $" + calcularValorCompra());
    }
}
