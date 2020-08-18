package classes;

public abstract class Producto {
	
	protected String SKU;
	protected String nombre;
	protected String descripcion;
	protected int unidadesDisponibles;
	protected double precioUnitario;
	
	public Producto(String sku, String nombre, String descripcion, int unidadesDisponibles,double precioUnitario ) {
		this.SKU =sku;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.unidadesDisponibles = unidadesDisponibles;
		this.precioUnitario = precioUnitario;		
	}
	

	public Producto(RegistroProducto r) {
		this.SKU =r.SKU;
		this.nombre = r.nombre;
		this.descripcion = r.descripcion;
		this.unidadesDisponibles = r.unidadesDisponibles;
		this.precioUnitario = r.precioUnitario;	
	}

	
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getUnidadesDisponibles() {
		return unidadesDisponibles;
	}
	public void setUnidadesDisponibles(int unidadesDisponibles) {
		this.unidadesDisponibles = unidadesDisponibles;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	public abstract double getPrice(int cantidad) ;
	
	public boolean tieneUnidadesDisponibles(int cantidad) {
		if(cantidad < this.getUnidadesDisponibles()) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
