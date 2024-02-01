import java.util.List;

public class Cliente {
  private Integer codigo;
  private String nombre;
  private List<ItemProducto> factura;

  public Cliente(int codigo, String nombre, List<ItemProducto> factura) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.factura = factura;
  }

  public void anadirProducto(ItemProducto itemProducto) {
    factura.add(itemProducto);
  }
}
