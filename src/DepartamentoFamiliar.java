/**
 * Departamento pensado para familias (puede tener varias habitaciones).
 * No tiene atributos propios ya que todo lo hereda de Departamento.
 * Valor por metro cuadrado: 300.
 */
public class DepartamentoFamiliar extends Departamento {

    public static final int VALOR_POR_METRO_CUADRADO = 300;

    public DepartamentoFamiliar(int identificadorInmobiliario, int area, String direccion,
                                int numeroHabitaciones, int numeroBanos, double valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, valorAdministracion);
    }

    @Override
    public int obtenerValorPorMetroCuadrado() {
        return VALOR_POR_METRO_CUADRADO;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- Departamento familiar ---");
        super.mostrarInformacion();
        System.out.println("Valor de compra: $" + calcularValorCompra());
    }
}
