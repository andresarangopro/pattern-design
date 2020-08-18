package classes;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto pr1 = new ImpFactoriaProducto().hacerProducto(new RegistroProducto("EA", "Lapicero", "para escribir tinta", 10, 3000));
		Producto pr2 = new ImpFactoriaProducto().hacerProducto(new RegistroProducto("WE", "Arroz", "arroz de ...", 10, 500));
		Producto pr3 = new ImpFactoriaProducto().hacerProducto(new RegistroProducto("DP", "Gelatina", "gelatina de tal", 10, 2500));
		
		Tienda tienda = new Tienda();
		Cliente cliente = new Cliente("Andr�s", new CarroCompras());
		tienda.newClient(cliente);
		tienda.agregarProductoCarrito(cliente, new Item(pr1, 2));
		
		System.out.println(pr1.getClass());
		System.out.println(pr2.getClass());
		System.out.println(pr3.getClass());
		System.out.println(cliente.getCarroCompras().getTotal());
	}

}
