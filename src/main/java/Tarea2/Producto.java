package Tarea2;
/**
 * el producto que vende el expendedor.
 */
public abstract class Producto {
    private final int serie;
    /**
     * el producto que vende el expendedor.
     * @param serie El número para identificar el producto.
     */

    public Producto(int serie) {
        this.serie = serie;
    }
    /**
     * Obtiene el numero de serie del producto.
     * @return el numero de serie del producto.
     */

    public int getSerie() {
        return this.serie;
    }
}