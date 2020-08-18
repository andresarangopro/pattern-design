package front;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import classes.Producto;
import classes.Item;

public class MyTableModel extends DefaultTableModel {
    public static final String[] COLUMN_NAMES = { "Product", "Cant" };
    private ArrayList<Item> productosCantidad= new ArrayList<>();
    
    public MyTableModel() {
        super(COLUMN_NAMES, 0);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (getRowCount() > 0 && getValueAt(0, columnIndex) != null) {
            return getValueAt(0, columnIndex).getClass();
        }
        return super.getColumnClass(columnIndex);
    }
    

    public void addRow(Item rowData) {
        if (rowData == null) {
            throw new IllegalArgumentException("rowData cannot be null");
        }
        Vector<Object> rowVector = new Vector<>();
        productosCantidad.add(rowData);
        rowVector.add(rowData.getProducto().getNombre());
        rowVector.add(rowData.getCantidad());

        super.addRow(rowVector);
    }

    // TODO: methods to return a row as a RowData object
}