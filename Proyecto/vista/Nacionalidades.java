package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nacionalidades extends JFrame {

	private JPanel contentPane;

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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnNewButton = new JButton("Demacia");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 39, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 21, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -288, SpringLayout.EAST, contentPane);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Noxus");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 21, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, -288, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -34, SpringLayout.NORTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 146, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -27, SpringLayout.SOUTH, contentPane);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vista.Noxus().setVisible(true);
                dispose();
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Piltover");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1_1, 0, SpringLayout.NORTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1_1, 26, SpringLayout.EAST, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1, 0, SpringLayout.SOUTH, btnNewButton);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Jonia");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1_2, 26, SpringLayout.EAST, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1_2, 0, SpringLayout.NORTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1_2, 0, SpringLayout.SOUTH, btnNewButton_1);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Freldjord");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1_1, -27, SpringLayout.WEST, btnNewButton_1_3);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1_3, 39, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1_3, 0, SpringLayout.SOUTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1_3, -10, SpringLayout.EAST, contentPane);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Shurima");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1_4, 299, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1_4, -10, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1_3, 0, SpringLayout.WEST, btnNewButton_1_4);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1_2, -32, SpringLayout.WEST, btnNewButton_1_4);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1_4, 0, SpringLayout.SOUTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1_4, 0, SpringLayout.NORTH, btnNewButton_1);
		contentPane.add(btnNewButton_1_4);
	}

}
