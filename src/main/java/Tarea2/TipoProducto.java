package Tarea2;
/**
 * son las constantes que se asocian a todos los tipos de productos vendidos.
 */
public enum TipoProducto {
    /**
     * Representa las Coca Cola.
     */
    COCA_COLA("Coca Cola", 1200),
    /**
     * Representa las Fanta.
     */
    FANTA("Fanta", 1000),
    /**
     * Representa las Sprite.
     */
    SPRITE("Sprite", 1000),
    /**
     * Representa los Snickers.
     */
    SNICKERS("Snickers", 800),
    /**
     * Representa los Super ocho.
     */
    SUPEROCHO("SuperOcho", 500);

    /**
     * Texto que representa al tipo de producto.
     */
    private final String tipo;
    /**
     * El valor del producto.
     */
    private final int precio;
    /**
     * Crea un tipo de producto
     * @param tipo El tipo del producto
     * @param precio El valor del producto
     */
    TipoProducto(String tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }
    /**
     * Obtiene el tipo del producto.
     * @return El tipo del producto.
     */
    public String getTipo() {
        return this.tipo;
    }
    /**
     * Obtiene el valor del producto.
     * @return El valor del producto en cuestion.
     */
    public int getPrecio() {
        return this.precio;
    }
}
