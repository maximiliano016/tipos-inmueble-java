/**
 * Un local es un inmueble que no es para vivienda (comercio u oficina).
 * Es abstracta porque un local siempre será un LocalComercial o una Oficina.
 */
public abstract class Local extends Inmueble {

    // INTERNO o CALLE
    protected Localizacion localizacion;

    public Local(int identificadorInmobiliario, int area, String direccion,
                 Localizacion localizacion) {
        super(identificadorInmobiliario, area, direccion);
        this.localizacion = localizacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();

        if (localizacion == Localizacion.INTERNO) {
            System.out.println("Localización: Interno");
        } else {
            System.out.println("Localización: Da a la calle");
        }
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }
}
