package classes;

public class Cliente {
	
	private String nombre ;
	CarroCompras carroCompras;
	
	Cliente(String nombre, CarroCompras carroCompras){
		this.nombre = nombre;
		this.carroCompras = carroCompras;
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

