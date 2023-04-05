package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setResizable(false);
		setTitle("Gestor Biblioteca JF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 571, 490);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestor de Biblioteca JF");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(0, 0, 571, 47);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 48, 551, 431);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 11, 257, 185);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Principal.class.getResource("/Iconos/libro (2).png")));
		lblNewLabel_2.setBounds(44, 11, 153, 129);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Libros");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Libros libros=new Libros();
				dispose();
				libros.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(44, 151, 134, 23);
		panel_2.add(btnNewButton);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.GRAY);
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1.setBounds(284, 11, 257, 185);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Principal.class.getResource("/Iconos/leer.png")));
		lblNewLabel_3.setBounds(63, 11, 140, 139);
		panel_2_1.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Usuarios");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuario usuario=new Usuario();
				dispose();
				usuario.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(63, 151, 134, 23);
		panel_2_1.add(btnNewButton_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.GRAY);
		panel_2_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_2.setBounds(9, 207, 257, 213);
		panel_1.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Consultas Libros");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Consultas_Libros consultas=new Consultas_Libros();
				dispose();
				consultas.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(42, 168, 134, 23);
		panel_2_2.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Principal.class.getResource("/Iconos/investigar.png")));
		lblNewLabel_1.setBounds(60, 25, 146, 132);
		panel_2_2.add(lblNewLabel_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(Color.GRAY);
		panel_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1_1.setBounds(284, 207, 257, 213);
		panel_1.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Principal.class.getResource("/Iconos/libro_prestamo.png")));
		lblNewLabel_4.setBounds(62, 11, 138, 151);
		panel_2_1_1.add(lblNewLabel_4);
		
		JButton btnNewButton_3 = new JButton("Prestamos");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Prestamos prestamos=new Prestamos();
				dispose();
				prestamos.setVisible(true);
				
			}
		});
		btnNewButton_3.setBounds(62, 173, 134, 23);
		panel_2_1_1.add(btnNewButton_3);
	}

}
