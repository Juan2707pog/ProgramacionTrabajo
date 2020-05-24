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

public class Campeones extends JFrame {
	public Campeones() {
		setLocationRelativeTo(null);//CENTRO
        setSize(800, 500);//tamano
        setResizable(false); // Para que no se pueda cambiar tamaño
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("¡Bienvenidos a Universo LoL!");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 22, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 140, SpringLayout.WEST, getContentPane());
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ver nacionalidades");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 24, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -421, SpringLayout.EAST, getContentPane());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new vista.Nacionalidades().setVisible(true);
                dispose();
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.PINK);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ver Nombres");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 63, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 145, SpringLayout.EAST, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, -10, SpringLayout.EAST, getContentPane());
		btnNewButton_1.setForeground(Color.PINK);
		btnNewButton_1.setBackground(Color.ORANGE);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("A\u00F1adir Personaje");
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -26, SpringLayout.NORTH, btnNewButton_2);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -26, SpringLayout.NORTH, btnNewButton_2);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, -493, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_2, -22, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2, -168, SpringLayout.EAST, getContentPane());
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnNewButton_2);
	}
}
