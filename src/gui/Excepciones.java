package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Excepciones extends JFrame {

	private JPanel contentPane;
	private JLabel lblManejoDeExcepciones;
	private JLabel lblNumerador;
	private JLabel lblDenominador;
	private JTextField txtNumerador;
	private JTextField txtDenominador;
	private JButton btnCalcular;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Excepciones frame = new Excepciones();
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
	public Excepciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblManejoDeExcepciones = new JLabel("MANEJO DE EXCEPCIONES");
			lblManejoDeExcepciones.setBounds(121, 6, 161, 16);
			contentPane.add(lblManejoDeExcepciones);
		}
		{
			lblNumerador = new JLabel("NUMERADOR");
			lblNumerador.setBounds(25, 42, 82, 16);
			contentPane.add(lblNumerador);
		}
		{
			lblDenominador = new JLabel("DENOMINADOR");
			lblDenominador.setBounds(25, 70, 99, 16);
			contentPane.add(lblDenominador);
		}
		{
			txtNumerador = new JTextField();
			txtNumerador.setBounds(143, 34, 130, 26);
			contentPane.add(txtNumerador);
			txtNumerador.setColumns(10);
		}
		{
			txtDenominador = new JTextField();
			txtDenominador.setBounds(143, 65, 130, 26);
			contentPane.add(txtDenominador);
			txtDenominador.setColumns(10);
		}
		{
			btnCalcular = new JButton("Calcular");
			btnCalcular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnCalcular(e);
				}
			});
			btnCalcular.setBounds(301, 65, 117, 29);
			contentPane.add(btnCalcular);
		}
		{
			txtResultado = new JTextArea();
			txtResultado.setBounds(25, 123, 402, 133);
			contentPane.add(txtResultado);
		}
	}
	//Programar botón calcular
	protected void actionPerformedBtnCalcular(ActionEvent e) {
		int numerador = Integer.parseInt(txtNumerador.getText());
		int denominador = Integer.parseInt(txtDenominador.getText());
		int cociente = 0;
		txtResultado.setText("");
		
		try {
			cociente = numerador/denominador;
			
		}catch(ArithmeticException e1) {
			txtResultado.append("ERROR: " + e1.getMessage());
		}finally {
			txtResultado.append("\nEl cociente es: " + cociente);
		}
		

	}
}
