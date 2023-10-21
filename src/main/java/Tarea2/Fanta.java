package Tarea2;
/**
 * Un tipo de bebida.
 */
public class Fanta extends Bebida {
    /**
     * Un tipo de bebida.
     * @param serie El número para identificar el producto.
     */
    public Fanta(int serie) {
        super(serie);
    }
    public String beber() {
        return "fanta";
    }
}