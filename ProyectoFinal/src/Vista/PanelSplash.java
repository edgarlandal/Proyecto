package Vista;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class PanelSplash extends JPanel{
    static JProgressBar progressBar = new JProgressBar();

	public PanelSplash() {
		this.setLayout(null);
		try {
			FondoSwing fondo = new FondoSwing(ImageIO.read(new File("imagen/splash3.png")));
            this.setBorder(fondo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
		progressBar.setMaximum(50);
		progressBar.setBounds(0, 240, 250, 15);
	    this.add(progressBar);
	    ScreenSplash.loadProgressBar();
	    setSize(256, 256);
	    this.setOpaque(false);
		this.setBackground(new Color(0,0,0,0));
		this.setVisible(true);
	}
}
 