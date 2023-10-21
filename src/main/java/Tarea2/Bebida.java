package Tarea2;

/**
 * La clase Bebida es una clase abstracta que extiende Producto.
 * Representa un tipo de producto que puede ser bebido.
 */public abstract class Bebida extends Producto {

    /**
     * Constructor de la clase Bebida.
     *
     * @param serie El número para identificar el producto.
     */
    public Bebida(int serie) {
        super(serie);
    }
    /**
     * lo que realiza el cliente luego de recibir su bebida
     *
     * @return sabor de la bebida.
     */
    public abstract String beber();
}
