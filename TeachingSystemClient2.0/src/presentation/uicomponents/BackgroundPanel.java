package presentation.uicomponents;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;

public class BackgroundPanel extends RoundRectPanel {

	/**
	 * @param args
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */

    public void paintComponent(Graphics g){
		Graphics2D g2=(Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON);
//		Image image=new ImageIcon(TopPanel.class.getResource("/img/sky.png")).getImage();
//		g2.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		setOpaque(true);
		setBackground(new Color(243, 240, 224));
    }
}
