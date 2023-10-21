package Tarea2;
/**
 * Un tipo de bebida.
 */
public class Sprite extends Bebida {
    /**
     * Un tipo de bebida.
     * @param serie El número para identificar el producto.
     */
    public Sprite(int serie) {
        super(serie);
    }
    public String beber() {
        return "sprite";
    }
}