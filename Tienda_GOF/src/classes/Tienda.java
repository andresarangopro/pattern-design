package classes;

import java.util.ArrayList;

public class Tienda {
	
	double acum = 0;
	
	ArrayList<Cliente> listClient = new ArrayList<Cliente>();
	
	public void agregarProductoCarrito(Cliente cliente, Item item) {
		listClient.get(listClient.indexOf(cliente)).getCarroCompras().addProducto(item);
	}

	public double getAcum() {
		return acum;
	}

	public void setAcum(double acum) {
		this.acum = acum;
	}

	public ArrayList<Cliente> getListClient() {
		return listClient;
	}

	public void setListClient(ArrayList<Cliente> listClient) {
		this.listClient = listClient;
	}
	
	public void newClient(Cliente cliente) {
		listClient.add(cliente);
	}
	
	

}
