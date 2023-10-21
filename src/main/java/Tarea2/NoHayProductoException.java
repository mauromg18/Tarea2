package Tarea2;
/**
 * Excepción arrojada cuando no quedan productos en el depósito.
 */
public class NoHayProductoException extends Exception {
    /**
     * Excepción arrojada cuando no quedan productos en el depósito.
     * @param mensaje Mensaje qiue informa de el error.
     */
    public NoHayProductoException(String mensaje) {
        super(mensaje);
    }
}
