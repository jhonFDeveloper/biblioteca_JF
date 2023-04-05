package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Consultas_Libros extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultas_Libros frame = new Consultas_Libros();
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
	public Consultas_Libros() {
		setResizable(false);
		setTitle("Gestor de Biblioteca JF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 781, 600);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulta Libros Avanzada");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(104, 22, 360, 54);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Consultas_Libros.class.getResource("/Iconos/libro.png")));
		lblNewLabel_1.setBounds(21, 12, 73, 64);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Busqueda Avanzada", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 84, 385, 199);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ISBN Libro", "Título", "Autor", "Editorial", "Nacionalidad Autor", "Genero del Autor", "Fecha de Publicación"}));
		comboBox.setBounds(10, 46, 185, 22);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Ingrese el criterio de la Búsqueda:");
		lblNewLabel_2.setBounds(10, 25, 208, 14);
		panel_1.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Científicos", "Literatura y lingüísticos", "De viaje", "Biografías", "Libro de texto", "Libros de gran formato", "De referencia o consulta", "Monografías", "Recreativos", "Poéticos", "Juveniles", "Ficción", "Comedia"}));
		comboBox_1.setBounds(10, 112, 185, 22);
		panel_1.add(comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("Búsqueda por Categorías:");
		lblNewLabel_3.setBounds(10, 87, 185, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(228, 30, 131, 128);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon(Consultas_Libros.class.getResource("/Iconos/libro (1).png")));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 294, 761, 204);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 24, 741, 169);
		panel_2.add(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(10, 509, 761, 64);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Refrescar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Consultas_Libros.class.getResource("/Iconos/limpieza-de-datos.png")));
		btnNewButton_1.setBounds(25, 11, 138, 42);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Regresar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Libros libros=new Libros();
				dispose();
				libros.setVisible(true);
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Consultas_Libros.class.getResource("/Iconos/regresar.png")));
		btnNewButton_2.setBounds(208, 11, 138, 42);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
	         int resp = JOptionPane.showConfirmDialog(null, "Salir ¿Está seguro?");	
				
				if (resp==JOptionPane.YES_OPTION)
		            {
	                   System.exit(0);
		             }
				
				else {}
				

		                  

			}
		});
		btnNewButton_3.setIcon(new ImageIcon(Consultas_Libros.class.getResource("/Iconos/cerrar-sesion.png")));
		btnNewButton_3.setBounds(575, 11, 132, 42);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_2_1 = new JButton("Principal");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal principal=new Principal();
			    dispose();
			    principal.setVisible(true);
				
			}
		});
		btnNewButton_2_1.setIcon(new ImageIcon(Consultas_Libros.class.getResource("/Iconos/pagina-principal.png")));
		btnNewButton_2_1.setBounds(386, 11, 138, 42);
		panel_3.add(btnNewButton_2_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "B\u00FAsqueda", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(405, 84, 366, 199);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setIcon(new ImageIcon(Consultas_Libros.class.getResource("/Iconos/buscar (1).png")));
		btnNewButton.setBounds(120, 127, 133, 36);
		panel_4.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(10, 62, 346, 31);
		panel_4.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Software by Jhon F.");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 584, 761, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Consultas_Libros.class.getResource("/Iconos/dia-mundial-del-libro.png")));
		lblNewLabel_6.setBounds(473, 22, 56, 46);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Consultas_Libros.class.getResource("/Iconos/shakespeare.png")));
		lblNewLabel_7.setBounds(567, 22, 46, 40);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Consultas_Libros.class.getResource("/Iconos/estante-para-libros.png")));
		lblNewLabel_8.setBounds(662, 22, 46, 40);
		panel.add(lblNewLabel_8);
	}
}
