package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.BoxLayout;

public class FrmMenuPrincipal extends JFrame {

	private JPanel contentPane;
	private JDesktopPane escritorio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMenuPrincipal frame = new FrmMenuPrincipal();
					frame.setExtendedState(MAXIMIZED_BOTH);
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
	public FrmMenuPrincipal() {
		setTitle("Men\u00FA Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 321);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmDocentes = new JMenuItem("Docentes");
		mntmDocentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmDocentes(e);
			}
		});
		mnArchivo.add(mntmDocentes);
		
		JMenuItem mntmAlumnos = new JMenuItem("Alumnos");
		mntmAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmAlumnos(e);
			}
		});
		mnArchivo.add(mntmAlumnos);
		
		JMenuItem mntmEscuelas = new JMenuItem("Escuelas");
		mntmEscuelas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmEscuelas(e);
			}
		});
		mnArchivo.add(mntmEscuelas);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedMntmSalir(e);
			}
		});
		mnArchivo.add(mntmSalir);
		
		JMenu mnEdicin = new JMenu("Edici\u00F3n");
		menuBar.add(mnEdicin);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			escritorio = new JDesktopPane();
			escritorio.setBounds(6, 6, 1500, 865);
			contentPane.add(escritorio);
			escritorio.setLayout(new BoxLayout(escritorio, BoxLayout.X_AXIS));
		}
		
		
	}
	
	//Invocar formulario de registro docentes
	protected void actionPerformedMntmDocentes(ActionEvent e) {
		FrmDocentes ObjD = new FrmDocentes();
		ObjD.setVisible(true);
		escritorio.add(ObjD);
		
	}
	//Invocar formulario de registro alumnos
	protected void actionPerformedMntmAlumnos(ActionEvent e) {
		FrmAlumnos ObjA = new FrmAlumnos();
		ObjA.setVisible(true);
		escritorio.add(ObjA);
	}
	//Invocar formulario de registro escuelas
	protected void actionPerformedMntmEscuelas(ActionEvent e) {
		FrmEscuelas ObjE = new FrmEscuelas();
		ObjE.setVisible(true);
		escritorio.add(ObjE);
	}
	protected void actionPerformedMntmSalir(ActionEvent e) {
		dispose();
	}
}