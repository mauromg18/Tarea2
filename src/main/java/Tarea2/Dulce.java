package Tarea2;
/**
 * Tipo de producto que esta disponible.
 */
public abstract class Dulce extends Producto {
    /**
     * Tipo de producto que se encuentra disponible
     * @param serie El número para identificar el producto.
     */
    public Dulce(int serie) {
        super(serie);
    }
    /**
     * lo que hace el cliente después de recibir el dulce.
     * @return El sabor del dulce.
     */
    public abstract String comer();
}
