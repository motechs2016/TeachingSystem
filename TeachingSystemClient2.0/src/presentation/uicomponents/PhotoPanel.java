package presentation.uicomponents;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class PhotoPanel extends RoundRectPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Image i = new ImageIcon(PhotoPanel.class.getResource("/img/avatar_default.png")).getImage();
	BufferedImage bi;
	
	public PhotoPanel(){
		setBorder(new TextFieldBorder(Color.LIGHT_GRAY));
		setOpaque(true);
		setBackground(Color.white);
	}
	

	public void paintComponent(Graphics g) {     
		g.drawImage(i, 1, 1, getWidth() - 2, getHeight() - 2, null);
	}

	public void updatePhoto(Image i) {
		this.i = i;
		repaint();
	}

}
