package classes;

import java.util.ArrayList;

public class Tienda {
	
	double acum = 0;
	
	
	ArrayList<Cliente> listClient = new ArrayList<Cliente>();
	ArrayList<Producto> listProd = getProducts();

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
	
	public ArrayList<Producto> getProducts(){
		Producto pr1 = new ImpFactoriaProducto().hacerProducto(new RegistroProducto("EA", "Lapicero", "para escribir tinta", 10, 3000));
		Producto pr2 = new ImpFactoriaProducto().hacerProducto(new RegistroProducto("WE", "Arroz", "arroz de ...", 10, 500));
		Producto pr3 = new ImpFactoriaProducto().hacerProducto(new RegistroProducto("DP", "Gelatina", "gelatina de tal", 10, 2500));
		ArrayList<Producto> list = new ArrayList<Producto>();
		list.add(pr1);
		list.add(pr2);
		list.add(pr3);
		
		return list;
	}

	public ArrayList<Producto> getListProd() {
		return listProd;
	}

	public void setListProd(ArrayList<Producto> listProd) {
		this.listProd = listProd;
	}
	
	

}
