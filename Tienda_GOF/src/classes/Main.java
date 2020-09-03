package classes;

public class Main {
	
	public static void main(String[] args) {
		
		Tienda tienda = new Tienda();
		Cliente cliente = new Cliente("Andrés");
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
	}

}
