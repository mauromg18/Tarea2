package Tarea2;
/**
 * Quien compra un producto.
 */
public class Comprador {
    /**
     * el sabor del producto.
     */
    private String sabor;
    /**
     * lo que se devuelve si se genera un excedente en el dinero pagado.
     */
    private int vuelto;
    /**
     * Quien compra un producto.
     * @param moneda Con lo que se paga.
     * @param tipoProducto El tipo de producto a comprar.
     * @param expendedor Máquina expendedora que es la que vende los productos.
     * @throws NoHayProductoException Excepción arrojada cuando no hay productos en el depósito.
     * @throws PagoIncorrectoException Excepción arrojada cuando el pago no es correcto.
     * @throws PagoInsuficienteException Excepción arrojada cuando el valor pagado es inferior al del producto.
     */
    public Comprador(Moneda m, TipoProducto tipoProducto, Expendedor exp)
            throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {
        Producto producto = exp.comprarProducto(m, tipoProducto);
        if (producto instanceof Bebida bebida) {
            this.sabor = bebida.beber();
        } else if (producto instanceof Dulce dulce) {
            this.sabor = dulce.comer();
        }
        while (true) {
            Moneda moneda = exp.getVuelto();
            if (moneda == null) break;
            this.vuelto += moneda.getValor();
        }
    }
    /**
     * Cantidad de vuelto que recibe el comprador
     * @return El vuelto.
     */
    public int CantidadVuelto() {
        return this.vuelto;
    }
    /**
     * El sabor de lo que se compró.
     * @return El sabor.
     */
    public String queCompro() {
        return this.sabor;
    }
}