package classes;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto pr1 = new ImpFactoriaProducto().hacerProducto(new RegistroProducto("EA", "Lapicero", "para escribir tinta", 10, 3000));
		Producto pr2 = new ImpFactoriaProducto().hacerProducto(new RegistroProducto("WE", "Arroz", "arroz de ...", 10, 500));
		Producto pr3 = new ImpFactoriaProducto().hacerProducto(new RegistroProducto("DP", "Gelatina", "gelatina de tal", 10, 2500));
		
		Tienda tienda = new Tienda();
		Cliente cliente = new Cliente("Andrés", new CarroCompras());
		Cliente cliente2 = new Cliente("Juan", new CarroCompras());
		
		tienda.newClient(cliente);
		tienda.newClient(cliente2);
		
		tienda.agregarProductoCarrito(cliente, new Item(pr1, 2));
		tienda.agregarProductoCarrito(cliente, new Item(pr3, 5));
		
		Map<String, Double> productosTotal = new HashMap<>();
		productosTotal = cliente.getCarroCompras().getProductosTotalCarrito();
		
		productosTotal.entrySet().forEach(System.out::println);
		System.out.println("Total: " + cliente.getCarroCompras().getTotal());
		
		    
	}

}
