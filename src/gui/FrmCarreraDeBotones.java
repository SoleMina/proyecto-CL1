package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.hiloBotones;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;

public class FrmCarreraDeBotones extends JFrame {

	private JPanel contentPane;
	private JLabel lblCarreraDeBotones;
	private JLabel lblPartida;
	private JLabel lblLlegada;
	private JSeparator separator;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JSeparator separator_1;
	private JButton btnIniciar;
	private JButton btnCerrar;
	
	public static boolean activo = true;
	
	//Método para saber si un botón está vacío
	public static boolean isActivo() {
		return activo;
	}
	
	//Método para cambiar el estado
	public static void CambiarEstado(boolean estado) {
		activo = estado;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCarreraDeBotones frame = new FrmCarreraDeBotones();
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
	public FrmCarreraDeBotones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblCarreraDeBotones = new JLabel("CARRERA DE BOTONES");
			lblCarreraDeBotones.setBounds(134, 6, 142, 16);
			contentPane.add(lblCarreraDeBotones);
		}
		{
			lblPartida = new JLabel("PARTIDA");
			lblPartida.setBounds(20, 43, 61, 16);
			contentPane.add(lblPartida);
		}
		{
			lblLlegada = new JLabel("LLEGADA");
			lblLlegada.setBounds(332, 43, 61, 16);
			contentPane.add(lblLlegada);
		}
		{
			separator = new JSeparator();
			separator.setBounds(20, 59, 391, 12);
			contentPane.add(separator);
		}
		{
			btn1 = new JButton("BOTON-1");
			btn1.setForeground(Color.RED);
			btn1.setBounds(6, 83, 117, 29);
			contentPane.add(btn1);
		}
		{
			btn2 = new JButton("BOTON-2");
			btn2.setForeground(Color.BLUE);
			btn2.setBounds(6, 124, 117, 29);
			contentPane.add(btn2);
		}
		{
			btn3 = new JButton("BOTON-3");
			btn3.setForeground(Color.GREEN);
			btn3.setBounds(6, 170, 117, 29);
			contentPane.add(btn3);
		}
		{
			separator_1 = new JSeparator();
			separator_1.setBounds(20, 211, 391, 12);
			contentPane.add(separator_1);
		}
		{
			btnIniciar = new JButton("Iniciar");
			btnIniciar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnIniciar(e);
				}
			});
			btnIniciar.setBounds(6, 226, 117, 29);
			contentPane.add(btnIniciar);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnCerrar(e);
				}
			});
			btnCerrar.setBounds(308, 226, 117, 29);
			contentPane.add(btnCerrar);
		}
	}
	//Botón iniciar
	protected void actionPerformedBtnIniciar(ActionEvent e) {
		hiloBotones b1 = new hiloBotones(btn1, "SARA");
		hiloBotones b2 = new hiloBotones(btn2, "MARIA");
		hiloBotones b3 = new hiloBotones(btn3, "CARLA");
		b1.start();
		b2.start();
		b3.start();
		
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
