package Tarea2;
/**
 * El comprador la usa para comprar su producto.
 */
public abstract class Moneda implements Comparable<Moneda> {
    /**
     * El comprador la usa para comprar su producto.
     */
    public Moneda() {
    }

    /**
     * Da el puntero de la moneda para saber si dos de estas son diferentes.
     * @return El puntero.
     */
    public Moneda getSerie() {
        return this;
    }

    /**
     * Obtiene lo que vale la moneda.
     * @return lo que vale la moneda.
     */
    public abstract int getValor();

    @Override
    public int compareTo(Moneda moneda) {
        return Integer.compare(moneda.getValor(), this.getValor());
    }
}