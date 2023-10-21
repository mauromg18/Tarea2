package Tarea2;
import java.util.ArrayList;
/**
 * Depósito de items.
 * @param <T> se refiere a el tipo del item.
 */
public class Deposito<T> {
    /**
     * donde se almacenan los items.
     */
    private final ArrayList<T> negocio;

    /**
     * Depósito de items.
     */
    public Deposito() {
        this.negocio = new ArrayList<>();
    }
    /**
     * Almacena un item.
     * @param item Es el item en si.
     */
    public void add(T item) {
        this.negocio.add(item);
    }
    /**
     * borra el primer item almacenado.
     * @return El item.
     */
    public T get() {
        if (this.negocio.isEmpty()) return null;
        return this.negocio.remove(0);
    }
}
