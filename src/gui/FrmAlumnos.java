package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class FrmAlumnos extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAlumnos frame = new FrmAlumnos();
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
	public FrmAlumnos() {
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setTitle("Registro de alumnos");
		setBounds(100, 100, 450, 300);

	}

}
