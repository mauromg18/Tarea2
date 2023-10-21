package Tarea2;
/**
 * Máquina que vende los productos.
 */
public class Expendedor {
    /**
     * Depósito con las Coca Cola.
     */
    private final Deposito<Producto> cocaCola;
    /**
     * Depósito con las Fanta.
     */
    private final Deposito<Producto> fanta;
    /**
     * Depósito con las sprites.
     */
    private final Deposito<Producto> sprite;
    /**
     * Depósito con los snickers.
     */
    private final Deposito<Producto> snickers;
    /**
     * Depósito con los superOchos.
     */
    private final Deposito<Producto> superOcho;
    /**
     * Depósito con las monedas del vuelto.
     */
    private final Deposito<Moneda> monedasVuelto;
    /**
     * Máquina que vende los productos.
     * @param numeroProductos Número de productos que vende la máquina.
     */
    public Expendedor(int numeroProductos) {
        this.cocaCola = new Deposito<>();
        this.fanta = new Deposito<>();
        this.sprite = new Deposito<>();
        this.snickers = new Deposito<>();
        this.superOcho = new Deposito<>();
        this.monedasVuelto = new Deposito<>();

        for (int i = 0; i < numeroProductos; i++) {
            this.cocaCola.add(new CocaCola(i));
            this.fanta.add(new Fanta(i));
            this.sprite.add(new Sprite(i));
            this.snickers.add(new Snickers(i));
            this.superOcho.add(new SuperOcho(i));
        }
    }
    /**
     * Para omprar un producto de la máquina.
     * @param moneda Para pagar el producto.
     * @param tipo Tipo del producto a elegir.
     * @return El producto comprado, si no hubo excepciones.
     * @throws NoHayProductoException arrojada cuando no quedan productos en el depósito.
     * @throws PagoIncorrectoException arrojada cuando el pago no es correcto.
     * @throws PagoInsuficienteException arrojada cuando el valor cancelado es inferior al del producto.
     */
    public Producto comprarProducto(Moneda moneda, TipoProducto tipo)
            throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {
        if (moneda == null) {
            throw new PagoIncorrectoException("No se ingreso dinero.");
        }
        if (moneda.getValor() < tipo.getPrecio()) {
            this.monedasVuelto.add(moneda);
            throw new PagoInsuficienteException("lo minimo a pagar es $"
                    + tipo.getPrecio()
                    + " (tu pagaste $" + moneda.getValor() + ")");
        }
        Deposito<Producto> deposito = tipo == TipoProducto.COCA_COLA ? this.cocaCola
                : tipo == TipoProducto.FANTA ? this.fanta
                : tipo == TipoProducto.SPRITE ? this.sprite
                : tipo == TipoProducto.SNICKERS ? this.snickers
                : tipo == TipoProducto.SUPEROCHO ? this.superOcho
                : null;

        Producto producto = deposito != null ? deposito.get() : null;
        if (producto == null) {
            this.monedasVuelto.add(moneda);
            throw new NoHayProductoException("No quedan  " + tipo.getTipo());
        }

        int vuelto = moneda.getValor() - tipo.getPrecio();
        while (vuelto != 0) {
            this.monedasVuelto.add(new Moneda100());
            vuelto -= 100;
        }
        return producto;
    }

    /**
     * Obtiene el vuelto
     * @return el vuelto.
     */
    public Moneda getVuelto() {
        return this.monedasVuelto.get();
    }
}