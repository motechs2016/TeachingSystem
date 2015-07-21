package presentation.uicomponents;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import javax.swing.ImageIcon;

public class HeaderPanel extends RoundRectPanel{

	/**
	 * @param args
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	@Override
	public void paint(Graphics g){
		RoundRectangle2D.Double rr=new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 8, 8);
		g.setClip(rr);
		super.paint(g);
	}
	
	public void paintComponent(Graphics g){
		Graphics2D g2=(Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON);
		Image image=new ImageIcon(TopPanel.class.getResource("/img/top_bg.png")).getImage();
		g2.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}

}
