import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    Random random = new Random();
    Tienda tienda = new Tienda();

    for (int i = 0; i < tienda.carroClientes.size(); i++) {
      int cantidad = (random.nextInt(6) + 5);
      ItemProducto itemProducto = tienda.carroClientes.get(i).factura.get(i);
      RealizaCompra rCompra = new RealizaCompra(tienda, tienda.carroClientes.get(i), cantidad, itemProducto);
      Thread hilo = new Thread(rCompra);
      hilo.start();
    }
  }
}