package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bbdd.conexion;
import java.awt.Color;

public class Jonia extends JFrame {


	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton_1;



	/**
	 * Create the frame.
	 */
	public Jonia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
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
		btnNewButton.setBackground(new Color(255, 215, 0));
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, table);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -18, SpringLayout.NORTH, table);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, 155, SpringLayout.WEST, contentPane);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String sql = "SELECT * FROM Campeones WHERE Nacionalidad='Jonia'";


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
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Volver atr\u00E1s");
		btnNewButton_1.setBackground(new Color(255, 215, 0));
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, -155, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -18, SpringLayout.NORTH, table);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, 0, SpringLayout.EAST, table);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new vista.Nacionalidades().setVisible(true);
                dispose();
			}
		});
		contentPane.add(btnNewButton_1);
	}
}
