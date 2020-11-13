package Vista;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Modelo.Audio;

public class VentanaPrincipal extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3937054044998923508L;
	/**
	 * 
	 */
	PanelUsuario usuario = new PanelUsuario();
	PanelMenuPrincipal menu = new PanelMenuPrincipal();
	PanelOpciones opciones = new PanelOpciones();
	PanelJugar jugar = new PanelJugar();
	
	JFrame frame = new JFrame("GO EDGAR GO");
	
	Audio audio = new Audio();
	String name="audioU";

	
	public VentanaPrincipal() {
		frame.setBounds(400,100,550,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(usuario);
		frame.setVisible(true);
		audio.Audio(name);
		frame.setResizable(false);
		acciones();

	}

	public void acciones() {
		usuario.btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				usuario.setVisible(false);
				menu.setVisible(true);
				frame.add(menu);
				Audio.detener();
				audio.Audio("audio");
				menu.etiqueta.setText("Hola "+usuario.txtUsuario.getText());        
			}
			
		});
		
		menu.btnJugar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					menu.setVisible(false);
					jugar.setVisible(true);
					frame.add(jugar);
					Audio.detener();
					audio.Audio("audioJugar");
					
					}
				});
		menu.btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		menu.btnOp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				menu.setVisible(false);
				opciones.setVisible(true);
				frame.add(opciones);
				Audio.detener();
				audio.Audio("audioOp");
			}
		});
		opciones.btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				opciones.setVisible(false);
				menu.setVisible(true);
				Audio.detener();
				audio.Audio("audio");
			}
		});
	}
}
