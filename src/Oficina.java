/**
 * Local usado como oficina. Puede pertenecer al gobierno o no.
 *
 * Valor por metro cuadrado: 450.
 */
public class Oficina extends Local {

    public static final int VALOR_POR_METRO_CUADRADO = 450;

    protected boolean esDelGobierno;   // true = es del gobierno, false = es privada

    public Oficina(int identificadorInmobiliario, int area, String direccion,
                   Localizacion localizacion, boolean esDelGobierno) {
        super(identificadorInmobiliario, area, direccion, localizacion);
        this.esDelGobierno = esDelGobierno;
    }

    @Override
    public int obtenerValorPorMetroCuadrado() {
        return VALOR_POR_METRO_CUADRADO;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- Oficina ---");
        super.mostrarInformacion();

        if (esDelGobierno) {
            System.out.println("¿Es del gobierno?: Sí");
        } else {
            System.out.println("¿Es del gobierno?: No");
        }

        System.out.println("Valor de compra: $" + calcularValorCompra());
    }

    public boolean isEsDelGobierno() {
        return esDelGobierno;
    }

    public void setEsDelGobierno(boolean esDelGobierno) {
        this.esDelGobierno = esDelGobierno;
    }
}
