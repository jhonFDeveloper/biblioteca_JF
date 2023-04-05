package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;

public class Libros extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	JComboBox<Object> comboBox_1;
	JRadioButton rdbtnNewRadioButton_3;
	JRadioButton rdbtnNewRadioButton_3_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
			
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Libros frame = new Libros();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		int numPaginas,fecha;
		String disponible;
		String sexoAutor;
		
	ButtonGroup bg = new ButtonGroup();
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_8;
	

	
	
	
	public Libros() {
		setResizable(false);
		setTitle("Gestor de Biblioteca JF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 781, 628);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFormularioLibros = new JLabel("Formulario Libros");
		lblFormularioLibros.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblFormularioLibros.setBounds(141, 8, 256, 46);
		panel.add(lblFormularioLibros);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 65, 439, 552);
		panel.add(panel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Fecha Publicaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 245, 419, 75);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/programar.png")));
		lblNewLabel_15.setBounds(40, 22, 39, 42);
		panel_3.add(lblNewLabel_15);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(111, 31, 232, 20);
		panel_3.add(textField_8);
		
		JLabel lblNewLabel_4 = new JLabel("dd/mm/aaaa");
		lblNewLabel_4.setBounds(111, 50, 87, 14);
		panel_3.add(lblNewLabel_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "General", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(10, 20, 419, 214);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		comboBox_1 = new JComboBox<Object>();
		comboBox_1.setBounds(121, 182, 232, 20);
		panel_6.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel<Object>(new String[] {"Científicos", "Literatura y lingüísticos", "De viaje", "Biografías", "Libro de texto", "Libros de gran formato", "De referencia o consulta", "Monografías", "Recreativos", "Poéticos", "Juveniles", "Ficción", "Comedia"}));
		
		JLabel lblNewLabel_3 = new JLabel("Categorías:");
		lblNewLabel_3.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/categorias.png")));
		lblNewLabel_3.setBounds(10, 175, 103, 35);
		panel_6.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("N°_Paginas:");
		lblNewLabel_2.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/paginas.png")));
		lblNewLabel_2.setBounds(10, 98, 101, 27);
		panel_6.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Título:");
		lblNewLabel_1.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/libro-de-tapa-dura.png")));
		lblNewLabel_1.setBounds(10, 60, 77, 27);
		panel_6.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(121, 63, 232, 20);
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 22, 232, 20);
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ISBN Libro:");
		lblNewLabel.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/codigo-de-barras.png")));
		lblNewLabel.setBounds(8, 18, 91, 28);
		panel_6.add(lblNewLabel);
		
		JLabel lblEditorial = new JLabel("Editorial:");
		lblEditorial.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/editorial.png")));
		lblEditorial.setBounds(8, 139, 91, 28);
		panel_6.add(lblEditorial);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(121, 144, 232, 20);
		panel_6.add(textField_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(118, 101, 77, 20);
		panel_6.add(spinner);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 331, 419, 41);
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Stock:");
		lblNewLabel_8.setBounds(10, 11, 46, 14);
		panel_7.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Disponible:");
		lblNewLabel_9.setBounds(186, 11, 82, 14);
		panel_7.add(lblNewLabel_9);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Si");
		rdbtnNewRadioButton_3.setBounds(269, 7, 46, 23);
		panel_7.add(rdbtnNewRadioButton_3);
		bg.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_3_1 = new JRadioButton("No");
		rdbtnNewRadioButton_3_1.setBounds(340, 7, 46, 23);
		panel_7.add(rdbtnNewRadioButton_3_1);
		bg.add(rdbtnNewRadioButton_3_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(49, 8, 101, 20);
		panel_7.add(textField_3);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "Informacion Autor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_8.setBounds(10, 383, 419, 158);
		panel_1.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("ID Autor:");
		lblNewLabel_10.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/codigo-de-barras.png")));
		lblNewLabel_10.setBounds(10, 20, 114, 27);
		panel_8.add(lblNewLabel_10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(150, 23, 165, 20);
		panel_8.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Nombre Autor:");
		lblNewLabel_11.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/escritor.png")));
		lblNewLabel_11.setBounds(10, 51, 130, 27);
		panel_8.add(lblNewLabel_11);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(150, 61, 165, 20);
		panel_8.add(textField_6);
		
		JLabel lblNewLabel_12 = new JLabel("Nacionalidad:");
		lblNewLabel_12.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/ciudadania.png")));
		lblNewLabel_12.setBounds(10, 89, 114, 24);
		panel_8.add(lblNewLabel_12);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(150, 91, 165, 20);
		panel_8.add(textField_7);
		
		JLabel lblNewLabel_13 = new JLabel("Sexo:");
		lblNewLabel_13.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/sexo.png")));
		lblNewLabel_13.setBounds(10, 124, 74, 23);
		panel_8.add(lblNewLabel_13);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBounds(85, 124, 83, 23);
		panel_8.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBounds(185, 124, 83, 23);
		panel_8.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("No especificado");
		rdbtnNewRadioButton_2.setBounds(276, 124, 137, 23);
		panel_8.add(rdbtnNewRadioButton_2);
		bg.add(rdbtnNewRadioButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(459, 11, 312, 606);
		panel.add(panel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "B\u00FAsqueda", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(10, 30, 292, 304);
		panel_2.add(panel_4);
		
		JLabel lblNewLabel_7 = new JLabel("Consultas Libros:");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(73, 22, 136, 27);
		panel_4.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/buscar (1).png")));
		btnNewButton.setBounds(37, 142, 136, 43);
		panel_4.add(btnNewButton);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"ISBN Libro", "Titulo"}));
		comboBox.setBounds(49, 60, 185, 22);
		panel_4.add(comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(27, 93, 239, 27);
		panel_4.add(textField);
		
		JButton btnNewButton_7 = new JButton("Consulta Avanzada");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Consultas_Libros consultas=new Consultas_Libros();
				dispose();
				consultas.setVisible(true);
			}
		});
		btnNewButton_7.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/buscar (2).png")));
		btnNewButton_7.setBounds(49, 221, 200, 48);
		panel_4.add(btnNewButton_7);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 203, 239, 7);
		panel_4.add(separator);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_8.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/recargar.png")));
		btnNewButton_8.setBounds(183, 142, 65, 43);
		panel_4.add(btnNewButton_8);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Opciones", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(10, 345, 292, 250);
		panel_2.add(panel_5);
		
		JButton btnNewButton_1 = new JButton("Agregar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/biblioteca_jf","root","");
					
					Statement comando=conexion.createStatement();
					
					numPaginas =  (int) spinner.getValue();
					
					if(rdbtnNewRadioButton.isSelected()) {
						sexoAutor="Masculino";
						
					}
					
					if(rdbtnNewRadioButton_1.isSelected()) {
						sexoAutor="Femenino";
						
					}
					if(rdbtnNewRadioButton_1.isSelected()) {
						sexoAutor="Sin especificar";
						
					}
					
					
					if(rdbtnNewRadioButton_3.isSelected()) {
						
						disponible="Si";
					}
					if(rdbtnNewRadioButton_3_1.isSelected()) {
						
						disponible="No";
					}
					
					
					comando.executeUpdate("insert into libros (id_Libro,Titulo,N°_Paginas,Editorial,Categoria,Fecha_Lanzamiento,Stock,Disponibilidad) values ("+textField_1.getText()+",'"+textField_2.getText()+"',"+numPaginas+",'"+textField_4.getText()+"','"+comboBox_1.getSelectedItem()+"','"+textField_8.getText()+"',"+textField_3.getText()+",'"+disponible+"')");
					//comando.executeUpdate("Insert into Autores (id_Autor,nombre_Autor,Nacionalidad,Sexo) Values ("+textField_5.getText()+",'"+textField_6.getText()+"','"+textField_7.getText()+"','"+sexoAutor+"')");	
					conexion.close();
					
					
					
					
				}catch(SQLException ex){
					JOptionPane.showMessageDialog(null, "Ocurrió un ERROR: "+ex);
				}	
				
				
				
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/agregar-usuario.png")));
		btnNewButton_1.setBounds(10, 28, 137, 45);
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Modificar");
		btnNewButton_2.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/curriculum.png")));
		btnNewButton_2.setBounds(157, 99, 125, 45);
		panel_5.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Eliminar");
		btnNewButton_3.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/borrar.png")));
		btnNewButton_3.setBounds(157, 28, 125, 45);
		panel_5.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Regresar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal principal=new Principal();
				dispose();
				principal.setVisible(true);
				
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/regresar.png")));
		btnNewButton_4.setBounds(10, 179, 137, 45);
		panel_5.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Salir");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
	      int resp = JOptionPane.showConfirmDialog(null, "Salir ¿Está seguro?");	
				
				
				
				if (resp==JOptionPane.YES_OPTION)
		            {
					
		                 System.exit(0);
		             }
				
				else
				{

		                  }

			}
		});
		btnNewButton_5.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/cerrar-sesion.png")));
		btnNewButton_5.setBounds(157, 179, 125, 45);
		panel_5.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Refrescar");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				bg.clearSelection();
			}
		});
		btnNewButton_6.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/limpieza-de-datos.png")));
		btnNewButton_6.setBounds(10, 99, 137, 45);
		panel_5.add(btnNewButton_6);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(Libros.class.getResource("/Iconos/libros.png")));
		lblNewLabel_14.setBounds(49, 0, 70, 69);
		panel.add(lblNewLabel_14);
	}
}
