package classes;

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
		tienda.agregarProductoCarrito(cliente2, new Item(pr3, 2));
		
		
		System.out.println(pr1.getClass());
		System.out.println(pr2.getClass());
		System.out.println(pr3.getClass());
		System.out.println(cliente.getCarroCompras().getTotal());
		System.out.println(cliente2.getCarroCompras().getTotal());
	}

}
