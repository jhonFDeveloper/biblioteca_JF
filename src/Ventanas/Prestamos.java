package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class Prestamos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prestamos frame = new Prestamos();
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
	public Prestamos() {
		setResizable(false);
		setTitle("Gestor de Biblioteca JF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 504, 459);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Prestamos ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(348, 12, 151, 50);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Prestar Libro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 73, 252, 375);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cédula Usuario:");
		lblNewLabel_1.setIcon(new ImageIcon(Prestamos.class.getResource("/Iconos/tarjeta-de-identificacion.png")));
		lblNewLabel_1.setBounds(10, 26, 122, 24);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 51, 213, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ISBN Libro:");
		lblNewLabel_2.setIcon(new ImageIcon(Prestamos.class.getResource("/Iconos/bar-code.png")));
		lblNewLabel_2.setBounds(10, 82, 158, 24);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 114, 213, 20);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha Prestamo:");
		lblNewLabel_3.setIcon(new ImageIcon(Prestamos.class.getResource("/Iconos/plazo.png")));
		lblNewLabel_3.setBounds(10, 145, 142, 25);
		panel_1.add(lblNewLabel_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1667538000000L), null, null, Calendar.DAY_OF_YEAR));
		spinner.setBounds(10, 181, 142, 20);
		panel_1.add(spinner);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 225, 182, 2);
		panel_1.add(separator);
		
		JLabel lblNewLabel_3_1 = new JLabel("Fecha Devolución:");
		lblNewLabel_3_1.setIcon(new ImageIcon(Prestamos.class.getResource("/Iconos/plazo.png")));
		lblNewLabel_3_1.setBounds(10, 226, 142, 26);
		panel_1.add(lblNewLabel_3_1);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerDateModel(new Date(1667538000000L), null, null, Calendar.DAY_OF_YEAR));
		spinner_3.setBounds(10, 263, 142, 20);
		panel_1.add(spinner_3);
		
		JLabel lblNewLabel_5 = new JLabel("Cantidad:");
		lblNewLabel_5.setIcon(new ImageIcon(Prestamos.class.getResource("/Iconos/estante-para-libros (1).png")));
		lblNewLabel_5.setBounds(10, 307, 122, 26);
		panel_1.add(lblNewLabel_5);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(10, 344, 46, 20);
		panel_1.add(spinner_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Prestamos.class.getResource("/Iconos/open-book.png")));
		lblNewLabel_6.setBounds(266, 0, 72, 73);
		panel.add(lblNewLabel_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Opc", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(265, 73, 220, 375);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Realizar prestamo");
		btnNewButton.setIcon(new ImageIcon(Prestamos.class.getResource("/Iconos/marcar.png")));
		btnNewButton.setBounds(21, 129, 178, 41);
		panel_2.add(btnNewButton);
		
		JButton btnRefrescar = new JButton("Nuevo Prestamo");
		btnRefrescar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				textField_1.setText("");
			}
			
			
		});
		btnRefrescar.setIcon(new ImageIcon(Prestamos.class.getResource("/Iconos/recargar.png")));
		btnRefrescar.setBounds(21, 193, 178, 41);
		panel_2.add(btnRefrescar);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal principal=new Principal();
				dispose();
				principal.setVisible(true);
					
				
			}
		});
		btnRegresar.setIcon(new ImageIcon(Prestamos.class.getResource("/Iconos/regresar.png")));
		btnRegresar.setBounds(21, 254, 178, 41);
		panel_2.add(btnRegresar);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Prestamos.class.getResource("/Iconos/biblioteca-en-linea.png")));
		lblNewLabel_7.setBounds(71, 11, 79, 70);
		panel_2.add(lblNewLabel_7);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 96, 190, 2);
		panel_2.add(separator_1);
		
		JButton btnPrincipal = new JButton("Salir");
		btnPrincipal.addActionListener(new ActionListener() {
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
		btnPrincipal.setIcon(new ImageIcon(Prestamos.class.getResource("/Iconos/cerrar-sesion.png")));
		btnPrincipal.setBounds(21, 306, 178, 41);
		panel_2.add(btnPrincipal);
		
		JLabel lblNewLabel_2_1 = new JLabel("Biblioteca JF");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		lblNewLabel_2_1.setBounds(10, 0, 210, 59);
		panel.add(lblNewLabel_2_1);
	}
}
