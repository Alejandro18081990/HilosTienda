public class RealizaCompra implements Runnable {

  private Tienda tienda;

  private Cliente cliente;

  private int cantidad;

  private ItemProducto producto;

  public RealizaCompra(Tienda tienda, Cliente cliente, int cantidad, ItemProducto producto) {
    this.tienda = tienda;
    this.cliente = cliente;
    this.cantidad = cantidad;
    this.producto = producto;
  }

  @Override
  public void run() {
    cliente.realizarCompra(tienda);
  }
}
