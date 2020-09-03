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
		double precioConDescuento = precioCompleto - (descuentos*(precioCompleto*0.2));

		if((precioCompleto * 0.5) >= precioConDescuento) {
			return precioConDescuento;
		}else {
			if(descuentos > 0) {
				return precioCompleto - ((descuentos)*(precioCompleto*0.2));
			}else {
				return precioCompleto ;
			}
	
		}		

	}


}
