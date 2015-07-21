package presentation.uicomponents;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.Border;

public class TextFieldBorder implements Border{

	/**
	 * @param args
	 */
    Color color;
    
    public TextFieldBorder(Color c){
    	this.color=c;
    }

	@Override
	public Insets getBorderInsets(Component c) {
		// TODO Auto-generated method stub
		return new Insets(1, 1, 1 , 1);
	}

	@Override
	public boolean isBorderOpaque() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width,
			int height) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.drawRoundRect(0, 0, width-1, height-1, 8, 8);
		
	}
	
	public void updateColor(Color c){
		this.color=c;
	}

}
