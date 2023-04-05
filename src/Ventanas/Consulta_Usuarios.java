package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Consulta_Usuarios extends JFrame {

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
					Consulta_Usuarios frame = new Consulta_Usuarios();
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
	public Consulta_Usuarios() {
		setTitle("Gestor de Biblioteca JF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 624);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 781, 585);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "B\u00FAsqueda Avanzada", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 80, 374, 177);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Ingrese el criterio de la Búsqueda:");
		lblNewLabel_2.setBounds(7, 44, 208, 14);
		panel_1.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cédula", "Nombres", "Teléfono", "Sexo", "Correo"}));
		comboBox.setBounds(7, 85, 208, 22);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Consulta_Usuarios.class.getResource("/Iconos/investigacion.png")));
		lblNewLabel_1.setBounds(225, 21, 139, 145);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(null, "Consultar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(394, 80, 377, 177);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(10, 49, 346, 31);
		panel_1_1.add(textField);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setIcon(new ImageIcon(Consulta_Usuarios.class.getResource("/Iconos/busqueda-de-trabajo.png")));
		btnNewButton.setBounds(124, 113, 133, 36);
		panel_1_1.add(btnNewButton);
		
		JLabel lblConsultaUsuariosavanzada = new JLabel("Consulta Usuarios Avanzada");
		lblConsultaUsuariosavanzada.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblConsultaUsuariosavanzada.setBounds(90, 11, 360, 54);
		panel.add(lblConsultaUsuariosavanzada);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 269, 761, 204);
		panel.add(panel_2);
		
		table = new JTable();
		table.setBounds(10, 24, 741, 169);
		panel_2.add(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "Opciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 473, 761, 79);
		panel.add(panel_3);
		
		JButton btnNewButton_1 = new JButton("Refrescar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Consulta_Usuarios.class.getResource("/Iconos/recargar.png")));
		btnNewButton_1.setBounds(22, 26, 138, 42);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Regresar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuario usuario=new Usuario();
					dispose();
					usuario.setVisible(true);
				
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Consulta_Usuarios.class.getResource("/Iconos/regresar.png")));
		btnNewButton_2.setBounds(208, 26, 138, 42);
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
		btnNewButton_3.setIcon(new ImageIcon(Consulta_Usuarios.class.getResource("/Iconos/cerrar-sesion.png")));
		btnNewButton_3.setBounds(575, 26, 132, 42);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_2_1 = new JButton("Principal");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal principal=new Principal();
				dispose();
				principal.setVisible(true);
				
				
			}
		});
		btnNewButton_2_1.setIcon(new ImageIcon(Consulta_Usuarios.class.getResource("/Iconos/pagina-principal.png")));
		btnNewButton_2_1.setBounds(386, 26, 138, 42);
		panel_3.add(btnNewButton_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Consulta_Usuarios.class.getResource("/Iconos/buscar Usuariopng.png")));
		lblNewLabel.setBounds(10, 11, 73, 69);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Consulta_Usuarios.class.getResource("/Iconos/actriz.png")));
		lblNewLabel_3.setBounds(478, 23, 46, 46);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Consulta_Usuarios.class.getResource("/Iconos/hombre-joven.png")));
		lblNewLabel_4.setBounds(587, 23, 46, 46);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Consulta_Usuarios.class.getResource("/Iconos/pregunta.png")));
		lblNewLabel_5.setBounds(688, 23, 46, 46);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Software by Jhon F.");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(10, 560, 761, 14);
		panel.add(lblNewLabel_6);
	}
}
