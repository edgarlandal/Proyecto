package Vista;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class PanelOpciones extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton btnBack = new JButton();
	JSlider slBar = new JSlider(0,100,100);
	
	public PanelOpciones() {
		intContent();
	}
	public void intContent() {
		this.setLayout(null);
		try {
			FondoSwing fondo = new FondoSwing(ImageIO.read(new File("imagen/fondoOp.png")));
            this.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.setVisible(true);
        slBar.setBounds(20,20, 300, 100);
        slBar.setBackground(Color.green);
        slBar.setOpaque(false);
    	
		btnBack.setBounds(450,20, 64, 64);
		btnBack.setOpaque(false);
		btnBack.setBackground(new Color(0,0,0,0));
		btnBack.setBorderPainted(false);
		
		ImageIcon icon = new ImageIcon("imagen/back.png");
		btnBack.setIcon(new ImageIcon(icon.getImage().getScaledInstance(btnBack.getWidth(), btnBack.getHeight(), Image.SCALE_SMOOTH)));
		btnBack.setVisible(true);
		slBar.setVisible(true);

		add(slBar);
		add(btnBack);
	}
}
