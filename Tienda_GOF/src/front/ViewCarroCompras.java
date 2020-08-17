package front;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import classes.Producto;
import classes.ProductoCantidad;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewCarroCompras extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private MyTableModel tableModelCR;
	private JTableOwnModel tableModelP;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCarroCompras frame = new ViewCarroCompras();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewCarroCompras() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);		
	
		
	
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("ADD");
	
		panel.add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		panel.add(btnNewButton_1, BorderLayout.CENTER);
	
		tableModelCR = new MyTableModel();
		
		table_2 = new JTable(tableModelCR);
		contentPane.add(table_2, BorderLayout.EAST);
	
	
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				agregarProductoCarritoCompras(new ProductoCantidad(tableModelP.getProductAt(table_1.getSelectedRow()),1));
			}
		});
		listarProductos(new Test().getProductTable());	
		
	}
	
	public void listarProductos(DefaultTableModel tableModel) {
		tableModelP = new JTableOwnModel();		
		table_1 =new JTable(tableModelP);
		contentPane.add(table_1, BorderLayout.WEST);			
	}
	
	public void agregarProductoCarritoCompras(ProductoCantidad productoCantidad) {
		tableModelCR.addRow(productoCantidad);			
	}

}
