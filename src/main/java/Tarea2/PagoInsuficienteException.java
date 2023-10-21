package Tarea2;
/**
 * Excepción arrojada cuando el valor cancelado es inferior al del producto.
 */
public class PagoInsuficienteException extends Exception {
    /**
     * Excepción arrojada cuando el valor cancelado es inferior al del producto.
     * @param mensaje Mensaje que informa sobre el error.
     */
    public PagoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}