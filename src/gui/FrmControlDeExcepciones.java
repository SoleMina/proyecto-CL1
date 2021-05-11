package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmControlDeExcepciones extends JFrame {
    
	private JPanel contentPane;
	private JLabel lblControlDeExcepciones;
	private JTextArea lstElementosE;
	private JLabel lblPosicion;
	private JTextField txtPosicion;
	private JButton btnVerificar;
	private JTextArea txtResultado;
	
	//Añadir array de elementos
	String elementos[] = {"JOSE", "KARLA", "LUIS", "CECILIA", "JOEL", "DORIS", "MATHIAS"};
    
	//Añadir Inicializa
	private void Inicializa() {
		lstElementosE.setText("-----ELEMENTOS----");
		
		for(String ele: elementos)lstElementosE.append("\n" + ele);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmControlDeExcepciones frame = new FrmControlDeExcepciones();
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
	public FrmControlDeExcepciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblControlDeExcepciones = new JLabel("CONTROL DE EXCEPCIONES");
			lblControlDeExcepciones.setBounds(137, 6, 172, 16);
			contentPane.add(lblControlDeExcepciones);
		}
		{
			lstElementosE = new JTextArea();
			lstElementosE.setBounds(17, 36, 142, 218);
			contentPane.add(lstElementosE);
		}
		{
			lblPosicion = new JLabel("POSICION");
			lblPosicion.setBounds(174, 50, 61, 16);
			contentPane.add(lblPosicion);
		}
		{
			txtPosicion = new JTextField();
			txtPosicion.setBounds(267, 45, 130, 26);
			contentPane.add(txtPosicion);
			txtPosicion.setColumns(10);
		}
		{
			btnVerificar = new JButton("Verificar");
			btnVerificar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionPerformedBtnVerificar(e);
				}
			});
			btnVerificar.setBounds(233, 78, 117, 29);
			contentPane.add(btnVerificar);
		}
		{
			txtResultado = new JTextArea();
			txtResultado.setBounds(187, 141, 233, 108);
			contentPane.add(txtResultado);
		}
		Inicializa();
	}
	//Programar botón Verificar
	protected void actionPerformedBtnVerificar(ActionEvent e) {
		int posicion = Integer.parseInt(txtPosicion.getText());
		txtResultado.setText("");
		
		try {
			txtResultado.append("EL VALOR ES \n" + elementos[posicion]);
		}catch(ArrayIndexOutOfBoundsException e1) {
			txtResultado.append("ERROR: " + e1.getMessage());
		}finally {
			txtResultado.append("\n---FIN DE PROCESO---");
		}
		
		
	}
}
