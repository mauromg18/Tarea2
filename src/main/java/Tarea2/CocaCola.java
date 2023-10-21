package Tarea2;
/**
 * Un tipo de bebida.
 */
public class CocaCola extends Bebida {
    /**
     *   /**
     *      * @param serie El número para identificar el producto.
     *      */

    public CocaCola(int serie) {
        super(serie);
    }
    public String beber() {
        return "cocacola";
    }
}