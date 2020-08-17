package classes;
import java.util.ArrayList;

public class CarroCompras {
	

	public ArrayList<ProductoCantidad> productosCantidad;
	
	public CarroCompras() {
		this.productosCantidad = new ArrayList<ProductoCantidad>();
	}	
	
	public ArrayList<ProductoCantidad> getProductos() {
		return productosCantidad;
	}

	public void addProducto(ProductoCantidad producto) {
		this.productosCantidad.add(producto);
	}
	
	public void removeProducto(ProductoCantidad producto) {
		this.productosCantidad.remove(producto);
	}
	
	public void removeProductoAt(int position) {
		this.productosCantidad.remove(position);
			
	}
	
	public double getTotal() {
		Double total = 0.0;
		for (ProductoCantidad productoCantidad : this.productosCantidad) {
			total += productoCantidad.producto.getPrice(productoCantidad.cantidad);
		}
		return total;
	}
	
	
	
}
