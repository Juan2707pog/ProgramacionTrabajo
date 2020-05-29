  
package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Fondos.Fondos;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField passwordInput;
	private JTextField userInput;

	/**
	 * Create the frame.
	 */
	public Login() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new Fondos("LoginFondo.jpg");
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);//CENTRO
        setResizable(false); // Para que no se pueda cambiar tamaño

		

	

		
		passwordInput = new JTextField();
		passwordInput.setBounds(115, 124, 190, 20);
		contentPane.add(passwordInput);
		passwordInput.setColumns(10);
		
		userInput = new JTextField();
		userInput.setColumns(10);
		userInput.setBounds(115, 62, 190, 20);
		contentPane.add(userInput);
		
		JLabel userLabel = new JLabel("Usuario");
		userLabel.setForeground(new Color(173, 255, 47));
		userLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		userLabel.setBounds(177, 37, 89, 14);
		contentPane.add(userLabel);
		
		JLabel passwordLabel = new JLabel("Contrase\u00F1a");
		passwordLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		passwordLabel.setForeground(new Color(173, 255, 47));
		passwordLabel.setBounds(164, 93, 102, 20);
		contentPane.add(passwordLabel);
		
		JButton insertButton = new JButton("Registrar");
		insertButton.setBounds(10, 168, 89, 23);
		contentPane.add(insertButton);
		
		JButton loginButton = new JButton("Entrar");
		loginButton.setBounds(115, 168, 89, 23);
		contentPane.add(loginButton);
		
		JButton updateButton = new JButton("Actualizar");
		updateButton.setBounds(214, 168, 101, 23);
		contentPane.add(updateButton);
		
		JButton deleteButton = new JButton("Eliminar");
		deleteButton.setBounds(325, 168, 89, 23);
		contentPane.add(deleteButton);
		
		// Acciones
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

                
				// Llamar al controlador
				String usuario = userInput.getText();
				String password = passwordInput.getText();

				new controlador.Login().checkUser(usuario, password);
			}
		});
		
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = userInput.getText();
				String password = passwordInput.getText();
				new controlador.Login().insertUser(user, password);
			}
		});
		
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String user = userInput.getText();
					String password = passwordInput.getText();
					new controlador.Login().updateUser(user, password);
			}
		});
		
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = userInput.getText();
				new controlador.Login().deleteUser(user);
			}
		});
	}
}
