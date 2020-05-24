package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bbdd.conexion;

import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Noxus extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Noxus frame = new Noxus();
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
	public Noxus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		table = new JTable();
		sl_contentPane.putConstraint(SpringLayout.NORTH, table, 82, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, table, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, table, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, table, 424, SpringLayout.WEST, contentPane);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Mostrar Tabla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String sql = "SELECT * FROM Campeones WHERE Nacionalidad='Noxus'";


	                DefaultTableModel model = new DefaultTableModel();

	                model.addColumn("Nombre");
	                model.addColumn("Nacionalidad");
	                model.addColumn("Historia");



	                table.setModel(model);

	                String[] dato = new String[6];

	                try {

	                    ResultSet result = conexion.EjecutarSentencia(sql);

	                    while (result.next()) {
	                        dato[0] = result.getString(1);
	                        dato[1] = result.getString(2);
	                        dato[2] = result.getString(3);
	                        model.addRow(dato);
	                    }
	                }catch (SQLException e1) {
	                    e1.printStackTrace();
	                }

	            }
	        });

		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 24, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -167, SpringLayout.EAST, contentPane);
		contentPane.add(btnNewButton);
	}

}
