package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class PanelUsuario extends JPanel {
	JLabel lblName = new JLabel();
	JTextField txtUsuario = new JTextField();
	JButton btnLogin = new JButton();
		
	public PanelUsuario() {
		this.setLayout(null);
		try {
			FondoSwing fondo = new FondoSwing(ImageIO.read(new File("imagen/fondoU.png")));
			this.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

		this.setVisible(true);
		this.setBounds(400,100,550,500);
		txtUsuario.setBounds(100, 100, 350, 100);
		lblName.setBounds(80, 0, 400, 100);
		btnLogin.setBounds(175, 200, 200, 100);
		Font fuente = new Font("Agency FB", Font.BOLD, 30);
		txtUsuario.setFont(fuente); 
		txtUsuario.setForeground(new Color(48, 172, 108));
		btnLogin.setOpaque(false);
		btnLogin.setBackground(new Color(0,0,0,0));
		btnLogin.setBorderPainted(false);
		
		txtUsuario.setOpaque(false);
		txtUsuario.setBackground(new Color(0,0,0,0));

		ImageIcon title = new ImageIcon("imagen/login.png");
		lblName.setIcon(new ImageIcon(title.getImage().getScaledInstance(lblName.getWidth(), lblName.getHeight(), Image.SCALE_SMOOTH)));
		ImageIcon icon = new ImageIcon("imagen/ingresar.png");
		btnLogin.setIcon(new ImageIcon(icon.getImage().getScaledInstance(btnLogin.getWidth(), btnLogin.getHeight(), Image.SCALE_SMOOTH)));
		add(lblName);
		add(txtUsuario);
		add(btnLogin);
	}
}
