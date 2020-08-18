package front;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import classes.Producto;
import classes.Item;

public class JTableCarBuysModel extends DefaultTableModel {
	
	private ArrayList<Item> productosCantidad= new ArrayList<>();
	private static Object[][] rows =new Object[2][2];
	private static String[] columns = {"Product", "Cant"};
	
	public JTableCarBuysModel() {
        super(columns, 0);
    }
	
	@Override
	public int getColumnCount() {
		return columns.length;
	}

	@Override
	public int getRowCount() {
		return rows.length;
	}

	@Override
	public Object getValueAt(int row, int column) {
		return rows[row][column];
	}
	
	 @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (getRowCount() > 0 && getValueAt(0, columnIndex) != null) {
            return getValueAt(0, columnIndex).getClass();
        }
        return super.getColumnClass(columnIndex);
    }
	
	public Producto getProductAt(int row) {
		return productosCantidad.get(row).getProducto();
	}
	
	public void agregarProducto(Item productoCantidad) {
		productosCantidad.add(productoCantidad);
		this.rows = getRows();
	}
	
	public Object[][] getRows(){
		Object[][] rows = new Object[productosCantidad.size()][2];
		for (int i = 0; i < productosCantidad.size(); i++) {
			rows[i][0] = productosCantidad.get(i).getProducto().getNombre();
			rows[i][1] = productosCantidad.get(i).getCantidad();
		}
		return rows;
	}
	
	public  ArrayList<Item> getProductsCants(){
		return productosCantidad;		
	}
	
	public void setProductsCants(ArrayList<Item> productosCantidad){
		this.productosCantidad = productosCantidad;		
	}
	
	public void addRow(Item productoCantidad) {
        if (productoCantidad == null) {
            throw new IllegalArgumentException("rowData cannot be null");
        }
        Vector<Object> rowVector = new Vector<>();
        rowVector.add(productoCantidad.getProducto().getNombre());
        rowVector.add(productoCantidad.getCantidad());

        super.addRow(rowVector);
    }
	
	

}
