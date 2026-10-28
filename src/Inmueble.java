/**
 * Clase base (la "madre") de todos los inmuebles.
 * Es ABSTRACTA: eso significa que no se puede crear un objeto "Inmueble" directamente
 * Siempre se crea un tipo concreto, por ejemplo una CasaRural o una Oficina.
 */

public abstract class Inmueble {

    // "protected" significa que las clases hijas pueden usar estos atributos directamente.
    protected int identificadorInmobiliario;

    // en metros cuadrados
    protected int area;
    protected String direccion;

     //Constructor: se ejecuta cuando se crea el objeto y guarda los datos iniciales
    public Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    /**
     * Cada tipo de inmueble tiene un precio distinto por metro cuadrado.
     * Por eso este metodo es ABSTRACTO: aquí no tiene código, y cada clase
     * hija concreta (CasaRural, Oficina, etc.) está obligada a escribirlo
     * @return el valor de un metro cuadrado para este tipo de inmueble
     */
    public abstract int obtenerValorPorMetroCuadrado();

    // calcula cuanto cuesta comprar el inmueble
    // area (m²) x valor por metro cuadrado
    public int calcularValorCompra() {
        int valorPorMetroCuadrado = obtenerValorPorMetroCuadrado();
        int valorCompra = area * valorPorMetroCuadrado;
        return valorCompra;
    }

    /**
     * Muestra en consola los datos comunes a todos los inmuebles.
     * Las clases hijas agregan sus propios datos llamando primero a
     * "super.mostrarInformacion()" y luego imprimiendo lo suyo.
     */
    public void mostrarInformacion() {
        System.out.println("Identificador inmobiliario: " + identificadorInmobiliario);
        System.out.println("Área: " + area + " m²");
        System.out.println("Dirección: " + direccion);
    }

    // getters y setters (para leer y cambiar los atributos desde fuera)
    public int getIdentificadorInmobiliario() {
        return identificadorInmobiliario;
    }

    public void setIdentificadorInmobiliario(int identificadorInmobiliario) {
        this.identificadorInmobiliario = identificadorInmobiliario;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
