package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Fondos.Fondos;
import bbdd.conexion;

import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.SystemColor;
import java.awt.ScrollPane;

public class Nacionalidades extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane_1;
	private JTable table;
	private JTable table_2;
	private JTable table_1;
	private JTable table_3;


	/**
	 * Create the frame.
	 */
	public Nacionalidades() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 462);
		contentPane = new JPanel();
		contentPane_1 = new Fondos("LoginNacionalidades.jpg");
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_1);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane_1.setLayout(sl_contentPane);

		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setIcon(new ImageIcon(Nacionalidades.class.getResource("/Fondos/Demacia1.jpg")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String sql = "SELECT * FROM Campeones WHERE Nacionalidad='Demacia'";


	                DefaultTableModel model = new DefaultTableModel();

	                model.addColumn("Nombre");
	                model.addColumn("Nacionalidad");
	                model.addColumn("Historia");



	                table_3.setModel(model);

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
		contentPane_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -179, SpringLayout.SOUTH, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, 0, SpringLayout.EAST, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 23, SpringLayout.WEST, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, -296, SpringLayout.EAST, contentPane_1);
		btnNewButton_1.setIcon(new ImageIcon(Nacionalidades.class.getResource("/Fondos/Noxus.jpg")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String sql = "SELECT * FROM Campeones WHERE Nacionalidad='Noxus'";


	                DefaultTableModel model = new DefaultTableModel();

	                model.addColumn("Nombre");
	                model.addColumn("Nacionalidad");
	                model.addColumn("Historia");



	                table_3.setModel(model);

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

		contentPane_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1_1, 0, SpringLayout.NORTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1, -288, SpringLayout.SOUTH, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1_1, -155, SpringLayout.EAST, contentPane_1);
		btnNewButton_1_1.setIcon(new ImageIcon(Nacionalidades.class.getResource("/Fondos/Piltover1.jpg")));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String sql = "SELECT * FROM Campeones WHERE Nacionalidad='Piltover'";


	                DefaultTableModel model = new DefaultTableModel();

	                model.addColumn("Nombre");
	                model.addColumn("Nacionalidad");
	                model.addColumn("Historia");



	                table_3.setModel(model);

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
		contentPane_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1_1, 0, SpringLayout.WEST, btnNewButton_1_2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1_2, 0, SpringLayout.NORTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1_2, 31, SpringLayout.EAST, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1_2, -179, SpringLayout.SOUTH, contentPane_1);
		btnNewButton_1_2.setIcon(new ImageIcon(Nacionalidades.class.getResource("/Fondos/Jonia1.jpg")));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String sql = "SELECT * FROM Campeones WHERE Nacionalidad='Jonia'";


	                DefaultTableModel model = new DefaultTableModel();

	                model.addColumn("Nombre");
	                model.addColumn("Nacionalidad");
	                model.addColumn("Historia");



	                table_3.setModel(model);

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
		contentPane_1.add(btnNewButton_1_2);

		JButton btnNewButton_1_3 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, btnNewButton_1_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1_3, 299, SpringLayout.WEST, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1_3, -10, SpringLayout.EAST, contentPane_1);
		btnNewButton_1_3.setIcon(new ImageIcon(Nacionalidades.class.getResource("/Fondos/Freljord.jpg")));
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String sql = "SELECT * FROM Campeones WHERE Nacionalidad='Freljord'";


	                DefaultTableModel model = new DefaultTableModel();

	                model.addColumn("Nombre");
	                model.addColumn("Nacionalidad");
	                model.addColumn("Historia");



	                table_3.setModel(model);

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
		contentPane_1.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1_2, -30, SpringLayout.WEST, btnNewButton_1_4);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1_4, 299, SpringLayout.WEST, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1_4, 0, SpringLayout.SOUTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1_4, -10, SpringLayout.EAST, contentPane_1);
		btnNewButton_1_4.setIcon(new ImageIcon(Nacionalidades.class.getResource("/Fondos/Shurima.jpg")));
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String sql = "SELECT * FROM Campeones WHERE Nacionalidad='Shurima'";


	                DefaultTableModel model = new DefaultTableModel();

	                model.addColumn("Nombre");
	                model.addColumn("Nacionalidad");
	                model.addColumn("Historia");



	                table_3.setModel(model);

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
		contentPane_1.add(btnNewButton_1_4);
		
		JLabel lblNewLabel = new JLabel("DEMACIA");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, contentPane_1);
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOXUS");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 6, SpringLayout.SOUTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -14, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 131, SpringLayout.NORTH, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 51, SpringLayout.WEST, contentPane_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(Color.ORANGE);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("JONIA");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -6, SpringLayout.NORTH, btnNewButton_1_2);
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PILTOVER");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 0, SpringLayout.NORTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_3, 92, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(Color.CYAN);
		contentPane_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("FRELJORD");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1_3, 10, SpringLayout.SOUTH, lblNewLabel_4);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 0, SpringLayout.NORTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_4, -47, SpringLayout.EAST, contentPane_1);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(Color.CYAN);
		contentPane_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("SHURIMA");
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_2, -97, SpringLayout.WEST, lblNewLabel_5);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1_3, -14, SpringLayout.NORTH, lblNewLabel_5);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1_4, 6, SpringLayout.SOUTH, lblNewLabel_5);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_5, -37, SpringLayout.EAST, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 0, SpringLayout.NORTH, lblNewLabel_1);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(Color.ORANGE);
		contentPane_1.add(lblNewLabel_5);
		
		table = new JTable();
		sl_contentPane.putConstraint(SpringLayout.NORTH, table, 82, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, table, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, table, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, table, 424, SpringLayout.WEST, contentPane);
		
		JButton btnNewButton_2 = new JButton("Atr\u00E1s");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_2, 0, SpringLayout.EAST, lblNewLabel_2);
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.Campeones().setVisible(true);
                dispose();
			}
		});
		contentPane_1.add(btnNewButton_2);

		ScrollPane scrollPane = new ScrollPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_2, 17, SpringLayout.SOUTH, scrollPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, scrollPane, 16, SpringLayout.SOUTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, scrollPane, 0, SpringLayout.WEST, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollPane, 116, SpringLayout.SOUTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, scrollPane, 0, SpringLayout.EAST, btnNewButton_1_3);
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Nacionalidad", "Historia"
			}
		));
		sl_contentPane.putConstraint(SpringLayout.NORTH, table_3, 40, SpringLayout.SOUTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, table_3, 0, SpringLayout.EAST, btnNewButton_1_3);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, table_3, 40, SpringLayout.SOUTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, table_3, 0, SpringLayout.EAST, btnNewButton_1_3);
		scrollPane.add(table_3);
		contentPane_1.add(scrollPane);
		



	}
}
