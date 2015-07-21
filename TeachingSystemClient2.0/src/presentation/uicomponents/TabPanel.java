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
		final TabLabel l1=new TabLabel("��ѧԺ"); l1.setLocation(0, 0); add(l1);
		TabLabel l2=new TabLabel("��ʷѧԺ"); l2.setLocation(w-1, 0); add(l2);
		TabLabel l3=new TabLabel("��ѧԺ"); l3.setLocation(w*2-2, 0); add(l3);
		TabLabel l4=new TabLabel("���Ŵ���ѧԺ"); l4.setLocation(w*3-3, 0); add(l4);
		TabLabel l5=new TabLabel("��ѧԺ"); l5.setLocation(w*4-4, 0); add(l5);
		TabLabel l6=new TabLabel("��ѧԺ"); l6.setLocation(w*5-5, 0); add(l6);
		
		TabLabel l7=new TabLabel("�����ѧԺ"); l7.setLocation(0, h-1); add(l7);
		TabLabel l8=new TabLabel("��������ѧԺ"); l8.setLocation(w-1, h-1); add(l8);
		TabLabel l9=new TabLabel("��Ϣ����ѧԺ"); l9.setLocation(w*2-2, h-1); add(l9);
		TabLabel l10=new TabLabel("���ѧԺ"); l10.setLocation(w*3-3, h-1); add(l10);
		TabLabel l11=new TabLabel("��ѧϵ"); l11.setLocation(w*4-4, h-1); add(l11);
		TabLabel l12=new TabLabel("�������ѧԺ"); l12.setLocation(w*5-5, h-1); add(l12);
		
		TabLabel l13=new TabLabel("����ѧԺ"); l13.setLocation(0, h*2-2); add(l13);
		TabLabel l14=new TabLabel("����ѧԺ"); l14.setLocation(w-1, h*2-2); add(l14);
		TabLabel l15=new TabLabel("�����ѧԺ"); l15.setLocation(w*2-2, h*2-2); add(l15);
		TabLabel l16=new TabLabel("����ѧԺ"); l16.setLocation(w*3-3, h*2-2); add(l16);
		TabLabel l17=new TabLabel("����ѧԺ"); l17.setLocation(w*4-4, h*2-2); add(l17);
		TabLabel l18=new TabLabel("������ѧԺ"); l18.setLocation(w*5-5, h*2-2); add(l18);
	}
	
	public class TabLabel extends JLabel{
		
		public TabLabel(String text){
			super(text);
			
			setFont(new Font("΢���ź�", Font.PLAIN, 11));
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
