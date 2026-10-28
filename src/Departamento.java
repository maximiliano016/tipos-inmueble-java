/**
 * Un departamento es una vivienda que paga un valor de administración.
 * Es abstracta porque un departamento siempre será
 * un Apartaestudio o un DepartamentoFamiliar.
 */
public abstract class Departamento extends InmuebleVivienda {

    protected double valorAdministracion;

    public Departamento(int identificadorInmobiliario, int area, String direccion,
                        int numeroHabitaciones, int numeroBanos, double valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.valorAdministracion = valorAdministracion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Valor de administración: $" + valorAdministracion);
    }

    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }
}
