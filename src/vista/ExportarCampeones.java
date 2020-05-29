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

public class ExportarCampeones extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textNacionalidad;
	private JTextField textHistoria;
	
	String barra=File.pathSeparator;
	String CrearUbicacion=System.getProperty("user.dir")+barra+"DatosTXT"+barra;
//Creamos la carpeta donde aparecerá el txt
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExportarCampeones frame = new ExportarCampeones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void crear() {
		String archivo=textNombre.getText()+".txt";
		File CrearUbi=new File(CrearUbicacion);
		File CrearArchi=new File(CrearUbicacion+archivo);
		
		if(textNombre.getText().equals("")){
			JOptionPane.showMessageDialog(rootPane, "NO EXISTE EL NOMBRE");
		}else {
			try {
				if(CrearArchi.exists()) {
					JOptionPane.showMessageDialog(rootPane,"EL NOMBRE YA SE ENCUENTRA REGISTRADO");
				}else{
					CrearUbi.mkdirs();
					Formatter CrearForma=new Formatter(CrearUbicacion+archivo);
					CrearForma.format("%s\r\n%s\r\n%s\r\n", "Nombre="+textNombre.getText(),
							"Nacionalidad="+textNacionalidad.getText(),
							"Historia="+textHistoria.getText());
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
		setBounds(100, 100, 257, 205);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nacionalidad");
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, -164, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblNewLabel_1);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Historia");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(lblNewLabel_2);
		
		textNombre = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textNombre, 73, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 3, SpringLayout.NORTH, textNombre);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textNacionalidad = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textNacionalidad, 73, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textNombre, -13, SpringLayout.NORTH, textNacionalidad);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textNacionalidad, -88, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 3, SpringLayout.NORTH, textNacionalidad);
		contentPane.add(textNacionalidad);
		textNacionalidad.setColumns(10);
		
		textHistoria = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 3, SpringLayout.NORTH, textHistoria);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textHistoria, -55, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textHistoria, 0, SpringLayout.EAST, textNombre);
		contentPane.add(textHistoria);
		textHistoria.setColumns(10);
		
		JButton crearTxt = new JButton("Crear Ficha T\u00E9cnica");
		crearTxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				JTextField Nacionalidad;
				Nacionalidad = textNacionalidad;
				if(textNacionalidad.getText().equals("Jonia") || textNacionalidad.getText().equals("Noxus") || textNacionalidad.getText().equals("Demacia") || textNacionalidad.getText().equals("Piltover") || textNacionalidad.getText().equals("Freljord") || textNacionalidad.getText().equals("Shurima"))  {
					
				crear();
				}else {
					JOptionPane.showMessageDialog(null, "Illo las liado, pon una Nacionalidad existente");

				}
				//llamamos al metodo y ahora despejamos campos
				textNombre.setText("");
				textNacionalidad.setText("");
				textHistoria.setText("");
			}
		});
		sl_contentPane.putConstraint(SpringLayout.WEST, crearTxt, 52, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, crearTxt, -10, SpringLayout.SOUTH, contentPane);
		contentPane.add(crearTxt);
	
	}
}
