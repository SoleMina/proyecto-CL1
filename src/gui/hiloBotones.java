package gui;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import gui.FrmCarreraDeBotones;

public class hiloBotones extends Thread {
	//Campos o tributos
	private JButton boton;
	private String piloto;
		
	//Constructor
	public hiloBotones(JButton boton, String piloto) {
	this.boton = boton;
	this.piloto = piloto;
	}
	//Método run
	public void run() {
	while(FrmCarreraDeBotones.isActivo()) {
	int desplazamientos = (int)(Math.random() * 50);
	boton.setLocation(boton.getX() + desplazamientos, boton.getY());
	if(boton.getX() + boton.getWidth() > 420) {
	FrmCarreraDeBotones.CambiarEstado(false);
	JOptionPane.showMessageDialog(null, "Ganó " + piloto );
					
	}
	try {
		Thread.sleep(250);
	}catch(InterruptedException e1) {
					
			}
		}
	}
}
