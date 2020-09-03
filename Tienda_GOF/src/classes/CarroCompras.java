package classes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarroCompras {
	

	public ArrayList<Item> listItems;
	
	public CarroCompras() {
		this.listItems = new ArrayList<Item>();
	}	
	
	public ArrayList<Item> getProductos() {
		return listItems;
	}

	public void addProducto(Item item) {
		if(item.getProducto().tieneUnidadesDisponibles(item.getCantidad())) {
			this.listItems.add(item);
		}
	}
	
	public void removeProducto(Item item) {
		this.listItems.remove(item);
	}
	
	public void removeProductoAt(int position) {
		this.listItems.remove(position);
			
	}
	
	public Map<String, Double> getProductosTotalCarrito(){
		Map <String, Double> productosTotal = new HashMap<>();
		for (Item item : this.listItems) {
			productosTotal.put(item.getProducto().getNombre(), item.producto.getPrice(item.cantidad));
		}
		return productosTotal;
	}
	
	public double getTotal() {
		Double total = 0.0;
		for (Item item : this.listItems) {
			total += item.producto.getPrice(item.cantidad);
		}
		return total;
	}
	
	
	
}
