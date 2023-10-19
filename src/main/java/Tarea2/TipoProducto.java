package Tarea2;
public enum TipoProducto {
    COCA_COLA("Coca Cola", 1200),
    FANTA("Fanta", 1000),
    SPRITE("Sprite", 1000),
    SNICKERS("Snickers", 800),
    SUPEROCHO("SuperOcho", 500);
    private final String tipo;
    private final int precio;
    TipoProducto(String tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }
    public String getTipo() {
        return this.tipo;
    }
    public int getPrecio() {
        return this.precio;
    }
}