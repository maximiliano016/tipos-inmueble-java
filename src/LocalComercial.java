/**
 * Local donde funciona un negocio, dentro de un centro comercial.
 * Valor por metro cuadrado: 400.
 */
public class LocalComercial extends Local {

    public static final int VALOR_POR_METRO_CUADRADO = 400;

    // nombre del centro comercial
    protected String centroComercial;

    public LocalComercial(int identificadorInmobiliario, int area, String direccion,
                          Localizacion localizacion, String centroComercial) {
        super(identificadorInmobiliario, area, direccion, localizacion);
        this.centroComercial = centroComercial;
    }

    @Override
    public int obtenerValorPorMetroCuadrado() {
        return VALOR_POR_METRO_CUADRADO;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- Local comercial ---");
        super.mostrarInformacion();
        System.out.println("Centro comercial: " + centroComercial);
        System.out.println("Valor de compra: $" + calcularValorCompra());
    }

    public String getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }
}
