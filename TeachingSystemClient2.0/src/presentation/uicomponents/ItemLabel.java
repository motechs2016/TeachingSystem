package presentation.uicomponents;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class ItemLabel extends JLabel {
	
	public ItemLabel(String text){
		super(text);
		setForeground(Color.WHITE);
		setOpaque(true);
		setBackground(new Color(183, 80, 234));
		setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		setHorizontalAlignment(SwingConstants.CENTER);
		setBorder(new Border(){

			@Override
			public Insets getBorderInsets(Component arg0) {
				// TODO Auto-generated method stub
				return new Insets(0, 0, 0, 0);
			}

			@Override
			public boolean isBorderOpaque() {
				// TODO Auto-generated method stub
				return true;
			}

			@Override
			public void paintBorder(Component arg0, Graphics arg1, int arg2,
					int arg3, int arg4, int arg5) {
				// TODO Auto-generated method stub
				arg1.setColor(new Color(203, 100, 254));
				arg1.drawRect(0, 0, arg4-1, arg5-1);
			}
			
		});
	}

}
