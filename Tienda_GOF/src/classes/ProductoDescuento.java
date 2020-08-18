package classes;


public class ProductoDescuento extends Producto{	
		
	public ProductoDescuento(RegistroProducto r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice(int cantidad) {	
		int descuentos = cantidad / 3;
		double precioCompleto = this.precioUnitario * cantidad;	
		if(descuentos >= 3 ) {
			return precioCompleto - (precioCompleto*0.5);
		} else if(descuentos >= 1) {
			return precioCompleto - (descuentos*(precioCompleto*0.2));
		} else {
			return precioCompleto;
		}
	}
}
