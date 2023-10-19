package Tarea2;
import java.util.ArrayList;
public class Deposito<T> {
    private final ArrayList<T> negocio;
    public Deposito() {
        this.negocio = new ArrayList<>();
    }
    public void add(T item) {
        this.negocio.add(item);
    }
    public T get() {
        if (this.negocio.isEmpty()) return null;
        return this.negocio.remove(0);
    }
}
