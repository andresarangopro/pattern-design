package classes;


public class ProductoPeso extends Producto {

	public ProductoPeso(RegistroProducto r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice(int cantidad) {
		return  this.precioUnitario * cantidad;		
	}

}
