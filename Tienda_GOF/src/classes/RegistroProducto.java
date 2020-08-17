package classes;

public class RegistroProducto extends Producto {

	public RegistroProducto(String sku, String nombre, String descripcion, int unidadesDisponibles,
			double precioUnitario) {
		super(sku, nombre, descripcion, unidadesDisponibles, precioUnitario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice(int cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

}
