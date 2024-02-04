import java.util.List;

public class Cliente {
  private Integer codigo;
  private String nombre;
  List<ItemProducto> factura;

  public Cliente(int codigo, String nombre, List<ItemProducto> factura) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.factura = factura;
  }

  public synchronized void realizarCompra(Tienda tienda) {
    System.out.println("Inicio de la compra");
    for (ItemProducto item : factura) {
      tienda.venderProducto(item.getCodProd(), item.getCantidad());
      System.out.printf("Venta producto: %s - Cliente: %s\n", item.getCodProd(), nombre);
      System.out.println("=================================================");
    }
    System.out.printf("Fin de cuenta de cliente: %s\n", nombre);
    System.out.println("=================================================");
  }

  public int getCodCliente() {
    return codigo;
  }
}
