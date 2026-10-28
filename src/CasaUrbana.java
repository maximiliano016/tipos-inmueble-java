/**
 * Casa ubicada en la ciudad.
 * Necesitamos atributos propios para agrupar a sus dos tipos: CasaConjuntoCerrado y CasaIndependiente.
 * Es abstracta porque una casa urbana siempre será de uno de esos dos tipos.
 */
public abstract class CasaUrbana extends Casa {

    public CasaUrbana(int identificadorInmobiliario, int area, String direccion,
                      int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
    }
    // No hace falta sobrescribir mostrarInformacion()
}
