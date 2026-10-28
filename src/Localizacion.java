/**
 * Un "enum" es una lista cerrada de opciones posibles.
 *
 * Un local solo puede estar en uno de estos dos lugares:
 *  - INTERNO: está dentro de un edificio o centro comercial.
 *  - CALLE:   da directamente a la calle.
 *
 * Usar un enum en vez de un String evita errores de escritura
 * (por ejemplo escribir "Calle", "calle" o "CALE").
 */
public enum Localizacion {
    INTERNO,
    CALLE
}
