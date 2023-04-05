package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Usuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	JComboBox comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario frame = new Usuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	ButtonGroup bg = new ButtonGroup();
	
	String SexoUsuario;
	
	public void Limpiar() {
		
		textField.setText("");
        textField_1.setText("");
        textField_2.setText("");
        textField_3.setText("");
        textField_4.setText("");
        textField_5.setText("");
        bg.clearSelection();
		
		
	}
	
	
	public Usuario() {
		setResizable(false);
		setTitle("Gestor de Biblioteca JF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 781, 549);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 70, 439, 438);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Sexo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 186, 419, 100);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBounds(103, 58, 92, 23);
		panel_3.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Feminino");
		rdbtnNewRadioButton_1.setBounds(211, 58, 80, 23);
		panel_3.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Sin especificar");
		rdbtnNewRadioButton_2.setBounds(293, 58, 120, 23);
		panel_3.add(rdbtnNewRadioButton_2);
		bg.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/lector.png")));
		lblNewLabel_8.setBounds(126, 19, 46, 32);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/lectora.png")));
		lblNewLabel_9.setBounds(223, 19, 46, 32);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/pregunta.png")));
		lblNewLabel_10.setBounds(337, 19, 46, 32);
		panel_3.add(lblNewLabel_10);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/sexo64.png")));
		lblNewLabel_16.setBounds(10, 19, 77, 70);
		panel_3.add(lblNewLabel_16);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "General", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(10, 21, 419, 143);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres:");
		lblNewLabel_2.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/nombre.png")));
		lblNewLabel_2.setBounds(94, 54, 97, 28);
		panel_6.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(201, 58, 208, 20);
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(200, 98, 209, 20);
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(201, 24, 208, 20);
		panel_6.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cedula:");
		lblNewLabel_1.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/tarjeta-de-identificacion.png")));
		lblNewLabel_1.setBounds(94, 23, 97, 23);
		panel_6.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de");
		lblNewLabel_5.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/plazo.png")));
		lblNewLabel_5.setBounds(94, 100, 87, 17);
		panel_6.add(lblNewLabel_5);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/usuario.png")));
		lblNewLabel_12.setBounds(10, 33, 64, 70);
		panel_6.add(lblNewLabel_12);
		
		JLabel lblNewLabel_15 = new JLabel("dd/mm/aaaa");
		lblNewLabel_15.setBounds(201, 118, 74, 14);
		panel_6.add(lblNewLabel_15);
		
		JLabel lblNewLabel_5_1 = new JLabel("Nacimiento:");
		lblNewLabel_5_1.setBounds(94, 117, 74, 17);
		panel_6.add(lblNewLabel_5_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "Contacto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(10, 303, 419, 131);
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setBounds(201, 56, 208, 20);
		panel_7.add(textField_5);
		textField_5.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(201, 25, 208, 20);
		panel_7.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Correo:");
		lblNewLabel_4.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/correo-electronico.png")));
		lblNewLabel_4.setBounds(92, 20, 89, 31);
		panel_7.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Dirección:");
		lblNewLabel_6.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/localizacion.png")));
		lblNewLabel_6.setBounds(92, 51, 88, 30);
		panel_7.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3 = new JLabel("Teléfono:");
		lblNewLabel_3.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/telefono-celular.png")));
		lblNewLabel_3.setBounds(86, 92, 95, 31);
		panel_7.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(201, 97, 208, 20);
		panel_7.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/contactos.png")));
		lblNewLabel_13.setBounds(10, 25, 72, 89);
		panel_7.add(lblNewLabel_13);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(459, 11, 312, 502);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "B\u00FAsqueda", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(10, 11, 292, 272);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Consultas Usuario:");
		lblNewLabel_7.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/lupa.png")));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(73, 22, 136, 27);
		panel_4.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
			          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/biblioteca_jf","root" ,"");
			          Statement comando=conexion.createStatement();
			          
			          
			          String seleccionado=(String)comboBox.getSelectedItem();
			          
			          if(seleccionado.equalsIgnoreCase("Cedula")) {
			        	  
			          ResultSet registro = comando.executeQuery("select Nombres_Usuario,Telefono,Correo,Sexo,Fecha_Nacimiento,Direccion from usuarios where Cedula_Usuario="+textField_6.getText());
			          
			          
			          if (registro.next()==true) {
			        	  
			        	 
			        	  textField_1.setText(registro.getString("Nombres_Usuario"));
			        	  textField_2.setText(registro.getString("Fecha_Nacimiento"));
			        	  textField_3.setText(registro.getString("Correo"));
			        	  textField_4.setText(registro.getString("Telefono"));
			        	  textField_5.setText(registro.getString("Direccion"));
			          
			          } else {
			           
			        	  JOptionPane.showMessageDialog(null,"No se encuentra esta cédula");
			          }
			          
			          }//llave del if cedula
			          
			          if(seleccionado.equalsIgnoreCase("Nombres")) {
			        	  
				          ResultSet registro = comando.executeQuery("select Cedula_Usuario,Telefono,Correo,Sexo,Fecha_Nacimiento,Direccion from usuarios where Nombres_Usuario='"+textField_6.getText()+"' ");
				          
				          
				          if (registro.next()==true) {
				        	  
				        	  textField.setText(registro.getString("Cedula_Usuario"));
				        	 
				        	  textField_2.setText(registro.getString("Fecha_Nacimiento"));
				        	  textField_3.setText(registro.getString("Correo"));
				        	  textField_4.setText(registro.getString("Telefono"));
				        	  textField_5.setText(registro.getString("Direccion"));
				          
				          } else {
				           
				        	  JOptionPane.showMessageDialog(null,"No se encuentra esta cédula");
				          }
			          }//llave if nombre
			          
			          conexion.close();
			          
			          
			        } catch (SQLException ex) {
						 
						JOptionPane.showMessageDialog(null, "Ocurrió un ERROR: "+ex);
					
			}
			      }
				
				
				
			
		});
		btnNewButton.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/busqueda-de-trabajo.png")));
		btnNewButton.setBounds(49, 131, 128, 43);
		panel_4.add(btnNewButton);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nombres", "Cedula"}));
		comboBox.setBounds(49, 60, 185, 22);
		panel_4.add(comboBox);
		
		textField_6 = new JTextField();
		textField_6.setBounds(49, 93, 187, 27);
		panel_4.add(textField_6);
		textField_6.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(49, 197, 187, 2);
		panel_4.add(separator);
		
		JButton btnConsultaAvanzada = new JButton("Consulta Avanzada");
		btnConsultaAvanzada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Consulta_Usuarios consultusu=new Consulta_Usuarios();
				dispose();
				consultusu.setVisible(true);
				
			}
		});
		btnConsultaAvanzada.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/lupa.png")));
		btnConsultaAvanzada.setBounds(59, 210, 175, 43);
		panel_4.add(btnConsultaAvanzada);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				textField_6.setText("");
				
				
			}
		});
		btnNewButton_7.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/recargar.png")));
		btnNewButton_7.setBounds(187, 131, 61, 43);
		panel_4.add(btnNewButton_7);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Opciones", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(10, 294, 292, 208);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Agregar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				try {
					
					Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/biblioteca_jf","root" ,"");	
					Statement comando=conexion.createStatement();
					

					  if ( textField.getText().isEmpty()    ) {
							        	  JOptionPane.showMessageDialog(null, " llene el campo cédula");
							          }else {

					  if ( textField_1.getText().isEmpty()    ) {
			        	  JOptionPane.showMessageDialog(null, " llene campo Nombre ");
			          }	else {		
			        	  
					
					  if ( textField_4.getText().isEmpty()    ) {
			        	  JOptionPane.showMessageDialog(null, " llene campo Télefono ");
			          }	else {
					
					  if ( textField_3.getText().isEmpty()    ) {
			        	  JOptionPane.showMessageDialog(null, " llene campo Correo ");
			          }	else {
					

					  if ( textField_2.getText().isEmpty()    ) {
			        	  JOptionPane.showMessageDialog(null, " llene campo Fecha_Nacimineto ");
			          }	else {
					  
					  if ( textField_5.getText().isEmpty()    ) {
			        	  JOptionPane.showMessageDialog(null, " llene campo Dirección ");
			          }	else {
					  
					  
				    if( rdbtnNewRadioButton.isSelected()) {
			          
			        	 SexoUsuario = "Masculino";
			        
			          } if(rdbtnNewRadioButton_1.isSelected()) {
			        	  
			        	SexoUsuario = "Femenino";
			        	  
			          }if(rdbtnNewRadioButton_2.isSelected()) {
			        	  
			        	  SexoUsuario= "Sin Especificar";
			        	  
			          }
					
			         
			          
			          
					comando.executeUpdate("Insert into usuarios(Cedula_Usuario,Nombres_Usuario,Telefono,Correo,Sexo,Fecha_Nacimiento,Direccion) values  ("+textField.getText()+",'"+textField_1.getText()+"',"+textField_4.getText()+",'"+textField_3.getText()+"','"+SexoUsuario+"','"+textField_2.getText()+"','"+textField_5.getText()+"')");
					
					JOptionPane.showMessageDialog(null, "El Usuario se agregó satisfactoriamente");
					
					conexion.close();
					
				    Limpiar();
				    
				    
			          }//cierra campo direccion
			          } //cierra campo fecha_nacimiento 
			          }//cierra campo correo
			          }//cierra campo telefono
			          }//cierra campo Nombre
							          }	//cierra campo cedula
					
				} catch (SQLException ex) {
					 
							JOptionPane.showMessageDialog(null, "Ocurrió un ERROR: "+ex);
						
				}
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/agregar-usuario.png")));
		btnNewButton_1.setBounds(10, 31, 137, 45);
		panel_5.add(btnNewButton_1);
		
	
		
		JButton btnNewButton_2 = new JButton("Modificar");
		btnNewButton_2.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/curriculum.png")));
		btnNewButton_2.setBounds(157, 87, 125, 45);
		panel_5.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Eliminar");
		btnNewButton_3.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/borrar.png")));
		btnNewButton_3.setBounds(157, 31, 125, 45);
		panel_5.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Regresar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal principal=new Principal();
				dispose();
				principal.setVisible(true);
				
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/regresar.png")));
		btnNewButton_4.setBounds(10, 143, 137, 45);
		panel_5.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Salir");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  int resp = JOptionPane.showConfirmDialog(null, "Salir ¿Está seguro?");	
					
					if (resp==JOptionPane.YES_OPTION)
			            {
		                   System.exit(0);
			             }
					
					else {}

			
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/cerrar-sesion.png")));
		btnNewButton_5.setBounds(157, 143, 125, 45);
		panel_5.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Refrescar");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Limpiar();
				
				
				
				
			}
		});
		btnNewButton_6.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/limpieza-de-datos.png")));
		btnNewButton_6.setBounds(10, 87, 137, 45);
		panel_5.add(btnNewButton_6);
		
		JLabel lblNewLabel = new JLabel("Formulario Usuarios");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(131, 11, 256, 46);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(Usuario.class.getResource("/Iconos/lector (1).png")));
		lblNewLabel_11.setBounds(40, 0, 81, 75);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_14 = new JLabel("Software by Jhon F.");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBounds(10, 524, 761, 14);
		panel.add(lblNewLabel_14);
	}
}
