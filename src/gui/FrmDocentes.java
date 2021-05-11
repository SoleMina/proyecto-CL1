package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class FrmDocentes extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDocentes frame = new FrmDocentes();
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
	public FrmDocentes() {
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setTitle("Registro de docentes");
		setBounds(100, 100, 450, 300);

	}

}
