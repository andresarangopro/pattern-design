package classes;

public class Cliente {
	
	private String nombre ;
	CarroCompras carroCompras;
	
	public Cliente(String nombre){
		this.nombre = nombre;
		this.carroCompras = new CarroCompras();
	}
	

	public void agregarProducto(Producto item, int cantidad) {
		carroCompras.addProducto(new Item(item, cantidad));
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CarroCompras getCarroCompras() {
		return carroCompras;
	}

	public void setCarroCompras(CarroCompras carroCompras) {
		this.carroCompras = carroCompras;
	}



	
	

}

