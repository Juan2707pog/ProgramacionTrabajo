package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.SpringLayout;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Campeones extends JFrame {
	public Campeones() {
		getContentPane().setBackground(SystemColor.textHighlight);
		setLocationRelativeTo(null);//CENTRO
        setSize(800, 500);//tamano
        setResizable(false); // Para que no se pueda cambiar tamaño
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("¡Bienvenidos a Universo LoL!");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 146, SpringLayout.WEST, getContentPane());
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 37));
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ver Personajes Existentes");
		btnNewButton.setIcon(new ImageIcon(Campeones.class.getResource("/Fondos/fotaca1.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 63, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -68, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -459, SpringLayout.EAST, getContentPane());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new vista.Nacionalidades().setVisible(true);
                dispose();
			}
		});

		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Campeones.class.getResource("/Fondos/fotaca.jpg")));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, 63, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, -335, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_2, -68, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2, -10, SpringLayout.EAST, getContentPane());
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.ExportarCampeones().setVisible(true);
                dispose();
			}
		});
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("VER PERSONAJES");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 14, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 78, SpringLayout.WEST, getContentPane());
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CREAR FICHA TECNICA");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 0, SpringLayout.NORTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_2, -37, SpringLayout.EAST, getContentPane());
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		getContentPane().add(lblNewLabel_2);
	}
}
