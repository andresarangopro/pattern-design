package front;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import classes.CarroCompras;
import classes.ImpFactoriaProducto;
import classes.Producto;
import classes.Item;
import classes.ProductoDescuento;
import classes.ProductoNormal;
import classes.ProductoPeso;
import classes.RegistroProducto;

public class Test {
	
	public ArrayList<Producto>  productos;
	public CarroCompras carroCompras;
	
	public Test() {
		productos = new ArrayList<>();
		productos.add(new ImpFactoriaProducto().hacerProducto(new RegistroProducto("EA", "Lapicero", "para escribir tinta", 10, 3000)));
		productos.add(new ImpFactoriaProducto().hacerProducto(new RegistroProducto("WE", "Arroz", "arroz de ...", 10, 500)));
		productos.add(new ImpFactoriaProducto().hacerProducto(new RegistroProducto("DP", "Gelatina", "gelatina de tal", 10, 2500)));
	}
	
	public DefaultTableModel getProductTable() {
		String col[] = {"Product", "Price", "Cant"};
		DefaultTableModel tableModel = new DefaultTableModel(col, 0);
		for (Producto producto : productos) {
			Object[] objs = {producto.getNombre(),producto.getPrecioUnitario(), producto.getUnidadesDisponibles()};
			tableModel.addRow(objs);
		}
		return tableModel;
	}
	
	public void agregarProductoCarroCompras(Producto producto) {}
}
