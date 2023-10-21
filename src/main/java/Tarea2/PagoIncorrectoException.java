package Tarea2;
/**
 * Excepción arrojada cuando el pago no es correcto.
 */
public class PagoIncorrectoException extends Exception {
    /**
     * Excepción arrojada cuando el pago no es correcto.
     * @param mensaje Mensaje que informa del error.
     */
    public PagoIncorrectoException(String mensaje) {
        super(mensaje);
    }
}