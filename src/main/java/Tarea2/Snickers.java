package Tarea2;
/**
 * Un tipo de dulce.
 */
public class Snickers extends Dulce {
    /**
     * Un tipo de dulce.
     * @param serie El número para identificar el producto.
     */
    public Snickers(int serie) {
        super(serie);
    }
    public String comer() {
        return "Snickers";
    }
}