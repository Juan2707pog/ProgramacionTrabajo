package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Fondos.Fondos;

import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Nacionalidades extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nacionalidades frame = new Nacionalidades();
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
	public Nacionalidades() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane_1 = new Fondos("LoginNacionalidades.jpg");
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_1);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane_1.setLayout(sl_contentPane);
		
		JButton btnNewButton = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 21, SpringLayout.WEST, contentPane_1);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setIcon(new ImageIcon(Nacionalidades.class.getResource("/Fondos/Demacia1.jpg")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.Demacia().setVisible(true);
                dispose();
			}
		});
		contentPane_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, 0, SpringLayout.EAST, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -27, SpringLayout.SOUTH, contentPane_1);
		btnNewButton_1.setIcon(new ImageIcon(Nacionalidades.class.getResource("/Fondos/Noxus.jpg")));
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -34, SpringLayout.NORTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, -288, SpringLayout.EAST, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 21, SpringLayout.WEST, contentPane_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.Noxus().setVisible(true);
                dispose();
			}
		});
		contentPane_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1_1, 34, SpringLayout.NORTH, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1_1, 22, SpringLayout.EAST, btnNewButton);
		btnNewButton_1_1.setIcon(new ImageIcon(Nacionalidades.class.getResource("/Fondos/Piltover1.jpg")));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.Piltover().setVisible(true);
                dispose();
			}
		});
		contentPane_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1_2, 22, SpringLayout.EAST, btnNewButton_1);
		btnNewButton_1_2.setIcon(new ImageIcon(Nacionalidades.class.getResource("/Fondos/Jonia1.jpg")));
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1_2, -27, SpringLayout.SOUTH, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1_2, 146, SpringLayout.NORTH, contentPane_1);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.Jonia().setVisible(true);
                dispose();
			}
		});
		contentPane_1.add(btnNewButton_1_2);

		JButton btnNewButton_1_3 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1_3, 299, SpringLayout.WEST, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1_3, -10, SpringLayout.EAST, contentPane_1);
		btnNewButton_1_3.setIcon(new ImageIcon(Nacionalidades.class.getResource("/Fondos/Freljord.jpg")));
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1_1, -22, SpringLayout.WEST, btnNewButton_1_3);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.Freljord().setVisible(true);
                dispose();
			}
		});
		contentPane_1.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1_2, -26, SpringLayout.WEST, btnNewButton_1_4);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1_4, 0, SpringLayout.NORTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1_4, 0, SpringLayout.WEST, btnNewButton_1_3);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1_4, -27, SpringLayout.SOUTH, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1_4, -10, SpringLayout.EAST, contentPane_1);
		btnNewButton_1_4.setIcon(new ImageIcon(Nacionalidades.class.getResource("/Fondos/Shurima.jpg")));
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.Shurima().setVisible(true);
                dispose();
			}
		});
		contentPane_1.add(btnNewButton_1_4);
		
		JLabel lblNewLabel = new JLabel("DEMACIA");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, -224, SpringLayout.SOUTH, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 7, SpringLayout.SOUTH, lblNewLabel);
		lblNewLabel.setForeground(Color.CYAN);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 50, SpringLayout.WEST, contentPane_1);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOXUS");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -111, SpringLayout.SOUTH, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 6, SpringLayout.SOUTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(Color.ORANGE);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("JONIA");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1, -6, SpringLayout.NORTH, lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 99, SpringLayout.EAST, lblNewLabel_1);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PILTOVER");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_3, 80, SpringLayout.EAST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -6, SpringLayout.NORTH, btnNewButton_1_1);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(Color.CYAN);
		contentPane_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("FRELJORD");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1_3, 6, SpringLayout.SOUTH, lblNewLabel_4);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -223, SpringLayout.SOUTH, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_4, -37, SpringLayout.EAST, contentPane_1);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(Color.CYAN);
		contentPane_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("SHURIMA");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_5, -1, SpringLayout.NORTH, btnNewButton_1_4);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1_3, -11, SpringLayout.NORTH, lblNewLabel_5);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_5, 0, SpringLayout.EAST, lblNewLabel_4);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(Color.ORANGE);
		contentPane_1.add(lblNewLabel_5);
		


	}
}
