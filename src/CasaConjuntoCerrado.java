/**
 * Casa urbana dentro de un conjunto cerrado.
 * Paga administración y puede tener áreas comunes como piscina
 * y campos deportivos.
 * Valor por metro cuadrado: 350.
 */
public class CasaConjuntoCerrado extends CasaUrbana {

    public static final int VALOR_POR_METRO_CUADRADO = 350;

    protected double valorAdministracion;

    // true = sí tiene, false = no tiene
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;

    public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion,
                               int numeroHabitaciones, int numeroBanos, int numeroPisos,
                               double valorAdministracion, boolean tienePiscina,
                               boolean tieneCamposDeportivos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    @Override
    public int obtenerValorPorMetroCuadrado() {
        return VALOR_POR_METRO_CUADRADO;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- Casa en conjunto cerrado ---");
        super.mostrarInformacion();
        System.out.println("Valor de administración: $" + valorAdministracion);

        // Convertimos el true/false en un texto más fácil de leer.
        if (tienePiscina) {
            System.out.println("¿Tiene piscina?: Sí");
        } else {
            System.out.println("¿Tiene piscina?: No");
        }

        if (tieneCamposDeportivos) {
            System.out.println("¿Tiene campos deportivos?: Sí");
        } else {
            System.out.println("¿Tiene campos deportivos?: No");
        }

        System.out.println("Valor de compra: $" + calcularValorCompra());
    }

    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    public boolean isTienePiscina() {
        return tienePiscina;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }

    public boolean isTieneCamposDeportivos() {
        return tieneCamposDeportivos;
    }

    public void setTieneCamposDeportivos(boolean tieneCamposDeportivos) {
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }
}
