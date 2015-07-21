package presentation.uicomponents;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JLayeredPane;

public class RoundRectPanel extends JLayeredPane{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	@Override
	public void paint(Graphics g){
		 Graphics2D g2=(Graphics2D)g;
		 g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,  
                 RenderingHints.VALUE_ANTIALIAS_ON);
		RoundRectangle2D.Double rr=new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 8, 8);
		g2.setClip(rr);
		
		super.paint(g2);
	}
	
	@Override
	public boolean contains(int x, int y){
		RoundRectangle2D.Double rr=new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 8, 8);
		return rr.contains(x, y);
	}
}
