public class Producto {
  private Integer codigoProducto;
  private String nombreProd;
  private Integer stock;
  private Double precio;

  public Producto(int codigoProducto, String nombreProd, int stock, double precio) {
    this.codigoProducto = codigoProducto;
    this.nombreProd = nombreProd;
    this.stock = stock;
    this.precio = precio;
  }
}
