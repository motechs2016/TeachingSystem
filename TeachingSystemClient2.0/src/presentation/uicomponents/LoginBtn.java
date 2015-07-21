package presentation.uicomponents;

import java.awt.Graphics;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;

public class LoginBtn extends JButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public LoginBtn(String text){	
		super(text);
		setBorder(null);
	}
	
	@Override
	public boolean contains(int x, int y){
		RoundRectangle2D.Double rr=new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 8, 8);
		return rr.contains(x, y);
	}
	
	@Override
	public void paint(Graphics g){
		RoundRectangle2D.Double rr=new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 8, 8);
		g.setClip(rr);
		super.paint(g);
	}

}
