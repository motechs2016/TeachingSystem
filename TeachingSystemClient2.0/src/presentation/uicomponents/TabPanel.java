package presentation.uicomponents;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import presentation.administratorui.AdministratorUI;

import util.Constants;

public class TabPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	TabLabel selected;

	public TabPanel(){
		setSize( 535, 64);
		setBackground(new Color(238, 238, 238));
		setLayout(null);
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
				 arg1.setColor(new Color(122, 138, 153));
				 arg1.drawRect(0, 0, arg4-1, arg5-1);
			}
			
		});
		
		int w=Constants.tlw;
		int h=Constants.tlh;
		final TabLabel l1=new TabLabel("文学院"); l1.setLocation(0, 0); add(l1);
		TabLabel l2=new TabLabel("历史学院"); l2.setLocation(w-1, 0); add(l2);
		TabLabel l3=new TabLabel("哲学院"); l3.setLocation(w*2-2, 0); add(l3);
		TabLabel l4=new TabLabel("新闻传播学院"); l4.setLocation(w*3-3, 0); add(l4);
		TabLabel l5=new TabLabel("法学院"); l5.setLocation(w*4-4, 0); add(l5);
		TabLabel l6=new TabLabel("商学院"); l6.setLocation(w*5-5, 0); add(l6);
		
		TabLabel l7=new TabLabel("外国语学院"); l7.setLocation(0, h-1); add(l7);
		TabLabel l8=new TabLabel("政府管理学院"); l8.setLocation(w-1, h-1); add(l8);
		TabLabel l9=new TabLabel("信息管理学院"); l9.setLocation(w*2-2, h-1); add(l9);
		TabLabel l10=new TabLabel("软件学院"); l10.setLocation(w*3-3, h-1); add(l10);
		TabLabel l11=new TabLabel("数学系"); l11.setLocation(w*4-4, h-1); add(l11);
		TabLabel l12=new TabLabel("海外教育学院"); l12.setLocation(w*5-5, h-1); add(l12);
		
		TabLabel l13=new TabLabel("物理学院"); l13.setLocation(0, h*2-2); add(l13);
		TabLabel l14=new TabLabel("天文学院"); l14.setLocation(w-1, h*2-2); add(l14);
		TabLabel l15=new TabLabel("计算机学院"); l15.setLocation(w*2-2, h*2-2); add(l15);
		TabLabel l16=new TabLabel("电子学院"); l16.setLocation(w*3-3, h*2-2); add(l16);
		TabLabel l17=new TabLabel("建筑学院"); l17.setLocation(w*4-4, h*2-2); add(l17);
		TabLabel l18=new TabLabel("匡亚明学院"); l18.setLocation(w*5-5, h*2-2); add(l18);
	}
	
	public class TabLabel extends JLabel{
		
		public TabLabel(String text){
			super(text);
			
			setFont(new Font("微软雅黑", Font.PLAIN, 11));
			setHorizontalAlignment(SwingConstants.CENTER);
			setSize(Constants.tlw, Constants.tlh);
			
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
					 arg1.setColor(new Color(122, 138, 153));
					 arg1.drawRect(0, 0, arg4-1, arg5-1);
				}
				
			});
			//setForeground(Color.white);
			addMouseListener(new MouseAdapter(){
				public void mouseReleased(MouseEvent e){
					if(selected!=null){
						selected.setBackground(new Color(0, 0, 0, 0));
					}
					selected=TabLabel.this;
					setOpaque(true);
					setBackground(new Color(203, 100, 254));
					AdministratorUI.panel.repaint();
				}
			});
		}

	}
}
