package classes;

public class ImpFactoriaProducto implements FactoriaProductos {


	@Override
	public Producto hacerProducto(RegistroProducto r) {
		switch(r.SKU) {
			case "EA":
				return new ProductoNormal(r);
			case "WE":
				return new ProductoPeso(r);
			case "DP":
				return new ProductoDescuento(r);
		}
		return null;
	}


}
