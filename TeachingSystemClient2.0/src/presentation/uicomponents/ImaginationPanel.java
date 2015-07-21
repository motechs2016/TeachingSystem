package presentation.uicomponents;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import presentation.mainui.MainUI;
import presentation.userui.LoginUI;

public class ImaginationPanel extends JPanel {

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
					MainUI.lu.textField.setText(getText());
					MainUI.lu.passwordField.setText(getLocalPassword(MainUI.lu.textField.getText()));
					MainUI.lu.panel_1.remove(MainUI.lu.ip);
					MainUI.lu.checked=true;
					MainUI.lu.label_1.setIcon(new ImageIcon(LoginUI.class.getResource("/img/rem_s.png")));
					MainUI.lu.ip=null;
					MainUI.lu.panel_1.repaint();
					MainUI.lu.down.setIcon(new ImageIcon(ImaginationPanel.class.getResource("/img/down.png")));
				}
				
			});
		}
    	  
      }
      
      public String getLocalPassword(String ID){
  		File usr=new File("data/usr");
  		if(!usr.exists())
  			try {
  				usr.createNewFile();
  			} catch (IOException e1) {
  				// TODO Auto-generated catch block
  				e1.printStackTrace();
  			}
  	   try {
  			FileReader fr=new FileReader(usr);
  			BufferedReader br=new BufferedReader(fr);
  			String line=null;
  			while((line=br.readLine())!=null){
  				String[] split=line.split(" ");
  				if(ID.equals(split[0])) {br.close(); return split[1];}
  			}
  			br.close();
  		} catch (FileNotFoundException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		} catch (IOException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  	   return null;
  	}
      
      public ImaginationPanel(){
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
