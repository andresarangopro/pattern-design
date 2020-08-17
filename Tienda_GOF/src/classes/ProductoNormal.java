package classes;

public class ProductoNormal extends Producto{	
	
	public ProductoNormal(RegistroProducto r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice(int cantidad) {
		return  this.precioUnitario * cantidad;		
	}

}
