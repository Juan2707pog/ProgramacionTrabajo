package vista;

import java.awt.BorderLayout;

import java.io.File;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import java.util.Formatter;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class ExportarCampeones extends JFrame {

	private JPanel contentPane;
	private JTextField NombreInput;
	private JTextField NacionalidadInput;
	private JTextField HistoriaInput;
	
	String barra=File.pathSeparator;
	String CrearUbicacion=System.getProperty("user.dir")+barra+"DatosTXT"+barra;
//Creamos la carpeta donde aparecerá el txt

	private void crear() {
		String archivo=NombreInput.getText()+".txt";
		File CrearUbi=new File(CrearUbicacion);
		File CrearArchi=new File(CrearUbicacion+archivo);
		
		if(NombreInput.getText().equals("")){
			JOptionPane.showMessageDialog(rootPane, "NO EXISTE EL NOMBRE");
		}else {
			try {
				if(CrearArchi.exists()) {
					JOptionPane.showMessageDialog(rootPane,"EL NOMBRE YA SE ENCUENTRA REGISTRADO");
				}else{
					CrearUbi.mkdirs();
					Formatter CrearForma=new Formatter(CrearUbicacion+archivo);
					CrearForma.format("%s\r\n%s\r\n%s\r\n", "Nombre="+NombreInput.getText(),
							"Nacionalidad="+NacionalidadInput.getText(),
							"Historia="+HistoriaInput.getText());
					CrearForma.close();
					JOptionPane.showMessageDialog(rootPane,"Registro Correcto");
				}
			} catch(Exception e){
				JOptionPane.showMessageDialog(rootPane,"Registro no Correcto");
			}
		}
	}
	/**
	 * Create the frame.
	 */
	public ExportarCampeones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 359);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 28, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, 71, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, 82, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nacionalidad");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 6, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Historia");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_2);
		
		NombreInput = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, NombreInput, 11, SpringLayout.NORTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, NombreInput, 60, SpringLayout.EAST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, NombreInput, 289, SpringLayout.EAST, lblNewLabel);
		contentPane.add(NombreInput);
		NombreInput.setColumns(10);
		
		NacionalidadInput = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, NacionalidadInput, 6, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, NacionalidadInput, 0, SpringLayout.WEST, NombreInput);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, NacionalidadInput, 0, SpringLayout.SOUTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, NacionalidadInput, 229, SpringLayout.WEST, NombreInput);
		contentPane.add(NacionalidadInput);
		NacionalidadInput.setColumns(10);
		
		HistoriaInput = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, -4, SpringLayout.NORTH, HistoriaInput);
		sl_contentPane.putConstraint(SpringLayout.NORTH, HistoriaInput, 20, SpringLayout.SOUTH, NacionalidadInput);
		sl_contentPane.putConstraint(SpringLayout.WEST, HistoriaInput, 0, SpringLayout.WEST, NombreInput);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, HistoriaInput, -163, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, HistoriaInput, 0, SpringLayout.EAST, NombreInput);
		contentPane.add(HistoriaInput);
		HistoriaInput.setColumns(10);
		
		JButton crearTxt = new JButton("Crear Ficha ");
		sl_contentPane.putConstraint(SpringLayout.WEST, crearTxt, 27, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, crearTxt, -71, SpringLayout.SOUTH, contentPane);
		crearTxt.setBackground(SystemColor.activeCaption);
		crearTxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				JTextField Nacionalidad;
				Nacionalidad = NacionalidadInput;
				if(NacionalidadInput.getText().equals("Jonia") || NacionalidadInput.getText().equals("Noxus") || NacionalidadInput.getText().equals("Demacia") || NacionalidadInput.getText().equals("Piltover") || NacionalidadInput.getText().equals("Freljord") || NacionalidadInput.getText().equals("Shurima"))  {
					
				crear();
				}else {
					JOptionPane.showMessageDialog(null, "Illo las liado, pon una Nacionalidad existente");

				}
				//llamamos al metodo y ahora despejamos campos
				NombreInput.setText("");
				NacionalidadInput.setText("");
				HistoriaInput.setText("");
			}
		});
		contentPane.add(crearTxt);
		
		JButton crearTxt_1 = new JButton("Atr\u00E1s");
		crearTxt_1.setBackground(SystemColor.activeCaption);
		sl_contentPane.putConstraint(SpringLayout.NORTH, crearTxt_1, 130, SpringLayout.SOUTH, HistoriaInput);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, crearTxt_1, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, crearTxt_1, -169, SpringLayout.EAST, contentPane);
		crearTxt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new vista.Campeones().setVisible(true);
                dispose();
			}
		});
		contentPane.add(crearTxt_1);
		
		JButton btnNewButton = new JButton("A\u00F1adir Personaje");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 165, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -175, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, crearTxt_1, 0, SpringLayout.WEST, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.NORTH, crearTxt, 2, SpringLayout.NORTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.EAST, crearTxt, -24, SpringLayout.WEST, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 47, SpringLayout.SOUTH, HistoriaInput);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -70, SpringLayout.SOUTH, contentPane);
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nombre = NombreInput.getText();
				String Nacionalidad = NacionalidadInput.getText();
				String Historia = HistoriaInput.getText();
				new controlador.Exportar().insertCampeon(Nombre, Nacionalidad, Historia);
				JOptionPane.showMessageDialog(null, "Campeón añadido ;)");

			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar Personaje");
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nombre = NombreInput.getText();
				new controlador.Exportar().deleteCampeon(Nombre);
				JOptionPane.showMessageDialog(null, "Campeón eliminado :(");

			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, crearTxt);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 27, SpringLayout.EAST, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 92, SpringLayout.SOUTH, HistoriaInput);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, 141, SpringLayout.EAST, btnNewButton);
		contentPane.add(btnNewButton_1);
	
	}
}
