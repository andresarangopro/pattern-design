package classes;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		Tienda tienda = new Tienda();
		Cliente cliente = new Cliente("Andr�s");
		Cliente cliente2 = new Cliente("Juan");
		
		tienda.newClient(cliente);
		tienda.newClient(cliente2);

		cliente.agregarProducto(tienda.getListProd().get(0), 2);
		cliente.agregarProducto(tienda.getListProd().get(0), 2);
		cliente.agregarProducto(tienda.getListProd().get(0), 2);
		cliente.agregarProducto(tienda.getListProd().get(0), 2);
		cliente2.agregarProducto(tienda.getListProd().get(1), 9);		
		
	
		System.out.println(cliente.getCarroCompras().getTotal());
		System.out.println(cliente2.getCarroCompras().getTotal());

		tienda.agregarProductoCarrito(cliente, new Item(pr1, 2));
		tienda.agregarProductoCarrito(cliente, new Item(pr3, 5));
		
		Map<String, Double> productosTotal = new HashMap<>();
		productosTotal = cliente.getCarroCompras().getProductosTotalCarrito();
		
		productosTotal.entrySet().forEach(System.out::println);
		System.out.println("Total: " + cliente.getCarroCompras().getTotal());
		

		tienda.agregarProductoCarrito(cliente, new Item(pr1, 2));
		tienda.agregarProductoCarrito(cliente, new Item(pr3, 5));
		
		Map<String, Double> productosTotal = new HashMap<>();
		productosTotal = cliente.getCarroCompras().getProductosTotalCarrito();
		
		productosTotal.entrySet().forEach(System.out::println);
		System.out.println("Total: " + cliente.getCarroCompras().getTotal());

	}

}
