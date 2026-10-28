import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        // crear un objeto de cada tipo
        CasaRural casaRural = new CasaRural(1, 120, "Vereda El Rosal, km 5",
                3,  2, 1, 45.5, 2600);

        CasaConjuntoCerrado casaConjunto = new CasaConjuntoCerrado(2, 150, "Conjunto Los Pinos, casa 12",
                4, 3, 2, 350000, true, false);

        CasaIndependiente casaIndependiente = new CasaIndependiente(3, 200, "Calle 10 # 20-30",
                5, +
                3d3, 2);

        Apartaestudio apartaestudio = new Apartaestudio(4, 40, "Carrera 15 # 80-12, apto 301",
                1, 150000);

        DepartamentoFamiliar departamentoFamiliar = new DepartamentoFamiliar(5, 90, "Avenida 68 # 45-10, apto 702",
                3, 2, 280000);

        LocalComercial localComercial = new LocalComercial(6, 60, "Centro Comercial Andino, local 205",
                Localizacion.INTERNO, "Andino");

        Oficina oficina = new Oficina(7, 80, "Calle 26 # 13-19, oficina 501",
                Localizacion.CALLE, true);


        // guardar todos en una lista

        // como TODAS las clases heredan de Inmueble, podemos guardarlas en una misma lista de tipo Inmueble.
        // esto se llama POLIMORFISMO.
        ArrayList<Inmueble> inmuebles = new ArrayList<>();
        inmuebles.add(casaRural);
        inmuebles.add(casaConjunto);
        inmuebles.add(casaIndependiente);
        inmuebles.add(apartaestudio);
        inmuebles.add(departamentoFamiliar);
        inmuebles.add(localComercial);
        inmuebles.add(oficina);


        // mostrar la información de cada uno
        for (Inmueble inmueble : inmuebles) {
            inmueble.mostrarInformacion();
            // línea en blanco para separar
            System.out.println();
        }


        // sumar el valor total
        int valorTotal = 0;
        for (Inmueble inmueble : inmuebles) {
            valorTotal = valorTotal + inmueble.calcularValorCompra();
        }
        System.out.println("Valor total de todos los inmuebles: $" + valorTotal);


        // probar la regla del apartaestudio
        System.out.println();
        System.out.println("Intentando cambiar el apartaestudio a 3 habitaciones...");
        apartaestudio.setNumeroHabitaciones(3);
        System.out.println("Habitaciones del apartaestudio: " + apartaestudio.getNumeroHabitaciones());
    }
}
