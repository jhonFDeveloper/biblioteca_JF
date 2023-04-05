package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setTitle("Gestor de Biblioteca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 259, 389);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Iconos/libro (3).png")));
		lblNewLabel.setBounds(54, 110, 147, 156);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Biblioteca JF");
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(22, 11, 210, 72);
		panel.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 97, 210, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 298, 210, 2);
		panel.add(separator_1);
		
		JLabel lblNewLabel_5 = new JLabel("Gestor de Biblioteca by Jhon F.");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(0, 331, 259, 14);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(259, 0, 259, 389);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Iniciar Sesión");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lblNewLabel_1.setBounds(10, 11, 161, 58);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Usuario/Email:");
		lblNewLabel_3.setIcon(null);
		lblNewLabel_3.setBounds(10, 94, 249, 24);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contraseña:");
		lblNewLabel_4.setIcon(null);
		lblNewLabel_4.setBounds(10, 179, 144, 25);
		panel_1.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal principal=new Principal();
				dispose();
				principal.setVisible(true);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/Iconos/iniciar-sesion.png")));
		btnNewButton.setBounds(59, 296, 144, 49);
		panel_1.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBorder(null);
		textField.setBounds(45, 129, 194, 25);
		panel_1.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.LIGHT_GRAY);
		passwordField.setBorder(null);
		passwordField.setBounds(49, 203, 190, 24);
		panel_1.add(passwordField);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBackground(Color.WHITE);
		separator_2.setBounds(45, 154, 194, 2);
		panel_1.add(separator_2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Login.class.getResource("/Iconos/usuario (1).png")));
		lblNewLabel_6.setBounds(10, 129, 24, 25);
		panel_1.add(lblNewLabel_6);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(Color.WHITE);
		separator_2_1.setBackground(Color.WHITE);
		separator_2_1.setBounds(45, 228, 194, 2);
		panel_1.add(separator_2_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Login.class.getResource("/Iconos/candado.png")));
		lblNewLabel_7.setBounds(10, 203, 32, 24);
		panel_1.add(lblNewLabel_7);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Recordarme");
		chckbxNewCheckBox.setBackground(Color.LIGHT_GRAY);
		chckbxNewCheckBox.setBorder(null);
		chckbxNewCheckBox.setBounds(90, 253, 97, 23);
		panel_1.add(chckbxNewCheckBox);
	}
}
