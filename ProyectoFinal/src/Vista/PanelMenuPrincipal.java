package Vista;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

@SuppressWarnings("serial")
public class PanelMenuPrincipal extends JPanel {
	/**
	 *  hola mi nombre es edgar y estoy escribiendo en este nuevo teclado para mi
	 */
	JLabel lblName = new JLabel();
	JLabel etiqueta = new JLabel();
	JButton btnJugar = new JButton();
	JButton btnOp = new JButton();
	JButton btnExit = new JButton();
	String name;

	public  PanelMenuPrincipal() {
		this.setLayout(null);
		try {
			FondoSwing fondo = new FondoSwing(ImageIO.read(new File("imagen/fondo.png")));
            this.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
		ImageIcon title = new ImageIcon("imagen/title2.png");
		lblName.setBounds(80, 0, 400, 100);
		etiqueta.setBounds(200, 70, 200, 100);
		btnJugar.setBounds(70,150,400,100);
		btnOp.setBounds(100,260,350,80);
		btnExit.setBounds(120,350, 300, 60);
		lblName.setIcon(new ImageIcon(title.getImage().getScaledInstance(lblName.getWidth(), lblName.getHeight(), Image.SCALE_SMOOTH)));

		btnJugar.setOpaque(false);
		btnJugar.setBackground(new Color(0,0,0,0));
		btnJugar.setBorderPainted(false);
		
		btnOp.setOpaque(false);
		btnOp.setBackground(new Color(0,0,0,0));
		btnOp.setBorderPainted(false);

		btnExit.setOpaque(false);
		btnExit.setBackground(new Color(0,0,0,0));
		btnExit.setBorderPainted(false);
		
		Font fuente = new Font("Agency FB", Font.BOLD, 30);
		etiqueta.setFont(fuente); 
		etiqueta.setForeground(new Color(0, 86, 42 ));
		
		ImageIcon icon = new ImageIcon("imagen/jugar.png");
		btnJugar.setIcon(new ImageIcon(icon.getImage().getScaledInstance(btnJugar.getWidth(), btnJugar.getHeight(), Image.SCALE_SMOOTH)));
		ImageIcon icon2 = new ImageIcon("imagen/opciones.png");
		btnOp.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(btnOp.getWidth(), btnOp.getHeight(), Image.SCALE_SMOOTH)));
		ImageIcon icon3 = new ImageIcon("imagen/Salir.png");
		btnExit.setIcon(new ImageIcon(icon3.getImage().getScaledInstance(btnExit.getWidth(), btnExit.getHeight(), Image.SCALE_SMOOTH)));
        
		this.setVisible(true);
        
		add(etiqueta);
        add(lblName);
		add(btnJugar);
		add(btnOp);
		add(btnExit);
	}	
	
	
}
