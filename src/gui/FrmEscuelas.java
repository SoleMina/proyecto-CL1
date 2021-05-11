package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class FrmEscuelas extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmEscuelas frame = new FrmEscuelas();
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
	public FrmEscuelas() {
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setTitle("Registro de Escuelas");
		setBounds(100, 100, 450, 300);

	}

}
