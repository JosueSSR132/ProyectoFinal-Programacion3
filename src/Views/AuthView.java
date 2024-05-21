package Views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AuthView {

	private JFrame frame;
	
	public AuthView() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100, 100, 790, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));		
	}
	
	public void login() {
		
		JPanel loginPanel = new JPanel();
		loginPanel.setLayout(null);
		loginPanel.setBackground(Color.decode("#FDDFC9"));
		
		JLabel lblNewLabel = new JLabel("CONTROL ESCOLAR");
		lblNewLabel.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(218, 10, 353, 43);
		loginPanel.add(lblNewLabel);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255, 255, 255));
		panel2.setOpaque(true);
		panel2.setBounds(83, 63, 310, 292);
		panel2.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel2.setLayout(null);
		loginPanel.add(panel2);
		
		JLabel lblNewLabel_1 = new JLabel("Inicio de Sesión");
		lblNewLabel_1.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(17, 20, 135, 20);
		panel2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Usuario:");
		lblNewLabel_2.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setBounds(17, 56, 62, 13);
		panel2.add(lblNewLabel_2);
		
		JTextField textField = new JTextField();
		textField.setBackground(Color.decode("#D9D9D9"));
		textField.setBounds(17, 79, 276, 25);
		panel2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña:");
		lblNewLabel_3.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setBounds(17, 120, 82, 13);
		panel2.add(lblNewLabel_3);
		
		JTextField textField2 = new JTextField();
		textField2.setBackground(Color.decode("#D9D9D9"));
		textField2.setBounds(17, 142, 276, 25);
		panel2.add(textField2);
		textField2.setColumns(10);
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 10));
		btnNewButton.setBounds(17, 189, 276, 25);
		btnNewButton.setBackground(Color.decode("#FA3F56"));
		panel2.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox();
		chckbxNewCheckBox.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 10));
		chckbxNewCheckBox.setText("Recordarme");
		chckbxNewCheckBox.setBounds(14, 238, 97, 21);
		chckbxNewCheckBox.setOpaque(false);
		panel2.add(chckbxNewCheckBox);
		
		JButton btnNewButton_1 = new JButton("Olvidaste tu contraseña?");
		btnNewButton_1.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 10));
		btnNewButton_1.setBounds(140, 237, 173, 21);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		panel2.add(btnNewButton_1);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.decode("#FA3F56"));
		panel3.setBounds(392, 63, 310, 292);
		panel3.setOpaque(true);
		panel3.setBorder(BorderFactory.createLineBorder(Color.black , 2));

		loginPanel.add(panel3);
		panel3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Bienvenido al Inicio de Sesión");
		lblNewLabel_4.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(10, 100, 300, 31);
		panel3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("No tienes cuenta?");
		lblNewLabel_5.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(98, 135, 130, 18);
		panel3.add(lblNewLabel_5);
		
		JButton btnNewButton_2 = new JButton("Registrarse");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Inter", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_2.setBounds(98, 168, 110, 23);
		btnNewButton_2.setBorder(BorderFactory.createLineBorder(Color.white , 2));
		btnNewButton_2.setBackground(Color.decode("#FA3F56"));
		panel3.add(btnNewButton_2);
		
		frame.add(loginPanel);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}

}
