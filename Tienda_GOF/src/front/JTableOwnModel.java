package front;

import javax.swing.table.AbstractTableModel;

import classes.Producto;

public class JTableOwnModel extends AbstractTableModel{
	
	private Test test = new Test();
	private Object[][] rows = getRows();
	private String[] columns = {"Product", "Price", "Cant"};
	
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
	
	public Producto getProductAt(int row) {
		return test.productos.get(row);
	}
	
	
	public Object[][] getRows(){
		Object[][] rows = new Object[test.productos.size()][3];
		for (int i = 0; i < test.productos.size(); i++) {
			rows[i][0] = test.productos.get(i).getNombre();
			rows[i][1] = test.productos.get(i).getPrecioUnitario();
			rows[i][2] = test.productos.get(i).getUnidadesDisponibles();
		}
		return rows;
	}
	
	

}
