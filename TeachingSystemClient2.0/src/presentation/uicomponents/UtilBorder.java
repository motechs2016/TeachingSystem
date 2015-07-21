package presentation.uicomponents;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.Border;

public class UtilBorder implements Border{
	
	Color color;
    public  enum Type{fill, draw};		//живЊ
    public enum BorderShape{rect, round_rect};
    Type type;
    BorderShape shape;
    int arc;
	
	public UtilBorder(Color c, Type t, BorderShape s, int a){
		color=c;
		type=t;
		shape=s;
		arc=a;
	}

	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width,
			int height) {
		// TODO Auto-generated method stub
		switch(type){
		case fill: 
			g.setColor(color);
			if(shape==BorderShape.rect){
				g.fillRect(0, 0, width, height);
			}
			else{
				g.fillRoundRect(0, 0, width, height, arc, arc);
			}
			break;
		case draw:
			g.setColor(color);
			if(shape==BorderShape.rect){
				g.drawRect(0, 0, width-1, height-1);
			}
			else{
				g.drawRoundRect(0, 0, width-1, height-1, arc, arc);
			}
			break;
		}
	}

	@Override
	public Insets getBorderInsets(Component c) {
		// TODO Auto-generated method stub
		return new Insets(0,0,0,0);
	}

	@Override
	public boolean isBorderOpaque() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * @param args
	 */
	
}
