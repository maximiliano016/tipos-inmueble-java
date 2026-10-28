/**
 * Inmueble destinado a que viva gente (casas y departamentos).
 * Hereda de Inmueble ("extends Inmueble"), así que ya tiene:
 * identificador, área y dirección. Aquí solo se agregan los atributos nuevos.
 * Es abstracta porque una vivienda siempre será una Casa o un Departamento.
 */
public abstract class InmuebleVivienda extends Inmueble {

    protected int numeroHabitaciones;
    protected int numeroBanos;

    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion,
                            int numeroHabitaciones, int numeroBanos) {
        // "super(...)" llama al constructor de la clase madre (Inmueble)
        // para que guarde el identificador, el área y la dirección.
        super(identificadorInmobiliario, area, direccion);

        // Luego guardamos los atributos propios de esta clase.
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
    }

    @Override
    public void mostrarInformacion() {
        // Primero imprime los datos de Inmueble...
        super.mostrarInformacion();
        // despues los datos de vivienda.
        System.out.println("Número de habitaciones: " + numeroHabitaciones);
        System.out.println("Número de baños: " + numeroBanos);
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroBanos() {
        return numeroBanos;
    }

    public void setNumeroBanos(int numeroBanos) {
        this.numeroBanos = numeroBanos;
    }
}
