package classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto pr1 = new ImpFactoriaProducto().hacerProducto(new RegistroProducto("EA", "Lapicero", "para escribir tinta", 10, 3000));
		Producto pr2 = new ImpFactoriaProducto().hacerProducto(new RegistroProducto("WE", "Arroz", "arroz de ...", 10, 500));
		Producto pr3 = new ImpFactoriaProducto().hacerProducto(new RegistroProducto("DP", "Gelatina", "gelatina de tal", 10, 2500));
		
		System.out.println(pr1.getClass());
		System.out.println(pr2.getClass());
		System.out.println(pr3.getClass());
	}

}
