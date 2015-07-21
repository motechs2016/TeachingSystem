package presentation.uicomponents;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import presentation.mainui.MainUI;
import presentation.officeteacherui.OfficeTeacherUI;
import presentation.teacherui.TeacherUI;
import presentation.userui.LoginUI;

public class APanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
      public ArrayList<UserLabel> users=new ArrayList<UserLabel>();
      public int selected=-1;
      
      public class UserLabel extends JLabel{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		public UserLabel(String str){
			super(str);
			setSize(175, 26);
			setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 14));
			setOpaque(true);
			setForeground(Color.black);
			setBackground(Color.white);
			
			addMouseListener(new MouseListener(){

				@Override
				public void mouseClicked(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					for(int i=0; i<=users.size()-1; i++){
						  if(users.get(i).getText().equals(getText())){
			    				users.get(i).setBackground(new Color(123, 30, 184));
								users.get(i).setForeground(Color.white);
								selected=i;
			    		  }
			    		  else{
			    				users.get(i).setBackground(Color.white);
								users.get(i).setForeground(Color.black);
			    		  }
					}
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					setBackground(Color.white);
					setForeground(Color.black);
					for(int i=0; i<=users.size()-1; i++){
						if(users.get(i).getText().equals(getText())){
							if(selected==i){
								selected=-1;
							}
						}
					}
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					OfficeTeacherUI.textField.setText(getText());
					OfficeTeacherUI.panel.remove(OfficeTeacherUI.ip);
					OfficeTeacherUI.ip=null;
					OfficeTeacherUI.panel.repaint();
					OfficeTeacherUI.down.setIcon(new ImageIcon(ImaginationPanel.class.getResource("/img/down.png")));
				}
				
			});
		}
    	  
      }
      
      public APanel(){
    	  setSize(177, 2);
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
				arg1.setColor(new Color(203, 100, 254));
				arg1.drawRect(0, 0, arg4-1, arg5-1);
			}
    		  
    	  });
    	  setBackground(new Color(0, 0, 0, 0));
      }
      
      public void addOne(String val){
    	  UserLabel ul=new UserLabel(val);
    	  int size=users.size();
    	  ul.setLocation(1, 1+size*26);
    	  setSize(177, getHeight()+26);
    	  add(ul);
    	  users.add(ul);
      }
      
      public void updateSelected(){
    	  for(int i=0; i<=users.size()-1; i++){
    		  if(i==selected){
    				users.get(i).setBackground(new Color(123, 30, 184));
					users.get(i).setForeground(Color.white);
    		  }
    		  else{
    				users.get(i).setBackground(Color.white);
					users.get(i).setForeground(Color.black);
    		  }
    	  }
      }
}