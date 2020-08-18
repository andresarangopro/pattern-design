package classes;
import java.util.ArrayList;

public class CarroCompras {
	

	public ArrayList<Item> productosCantidad;
	
	public CarroCompras() {
		this.productosCantidad = new ArrayList<Item>();
	}	
	
	public ArrayList<Item> getProductos() {
		return productosCantidad;
	}

	public void addProducto(Item producto) {
		this.productosCantidad.add(producto);
	}
	
	public void removeProducto(Item producto) {
		this.productosCantidad.remove(producto);
	}
	
	public void removeProductoAt(int position) {
		this.productosCantidad.remove(position);
			
	}
	
	public double getTotal() {
		Double total = 0.0;
		for (Item productoCantidad : this.productosCantidad) {
			total += productoCantidad.producto.getPrice(productoCantidad.cantidad);
		}
		return total;
	}
	
	
	
}
