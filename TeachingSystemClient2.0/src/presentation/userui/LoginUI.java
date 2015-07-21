package presentation.userui;

import java.awt.Cursor;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;

import java.awt.Color;
import javax.swing.JButton;

import businesslogic.userbl.UserDeal;

import presentation.administratorui.AdministratorUI;
import presentation.departmentofficeteacherui.DepartmentOfficeTeacherUI;
import presentation.officeteacherui.OfficeTeacherUI;
import presentation.studentui.StudentFrame;
import presentation.teacherui.TeacherUI;
import presentation.uicomponents.ImaginationPanel;
import presentation.uicomponents.LoginBtn;
import presentation.uicomponents.RoundRectPanel;
import presentation.uicomponents.TextFieldBorder;
import presentation.uicomponents.TopPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginUI {

	private JFrame frame;
	public JTextField textField;
	public JPasswordField passwordField;
	private int fx, fy;
	public ImaginationPanel ip;
	public JLayeredPane panel_1;
	public JLabel down;
	public boolean checked=false;
	public static String userID;
	public JLabel label_1, lblNewLabel_5;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public LoginUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 422, 341);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);	
		frame.setBackground(new Color(0, 0, 0, 0));
		frame.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				fx=arg0.getX();
				fy=arg0.getY();
				frame.setCursor(new Cursor(Cursor.MOVE_CURSOR));
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
		});
		frame.addMouseMotionListener(new MouseMotionListener(){

			@Override
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				int detx=arg0.getX()-fx;
				int dety=arg0.getY()-fy;
				frame.setLocation(frame.getX()+detx, frame.getY()+dety);
			}

			@Override
			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		final JLayeredPane panel = new TopPanel();
		panel.setOpaque(true);
		panel.setBounds(0, 0, 422, 180);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(LoginUI.class.getResource("/img/xiaohui.png")));
		label.setBounds(101, 30, 100, 125);
		panel.add(label);
		
		JLabel lblNewLabel_2 = new JLabel("\u5357\u4EAC\u5927\u5B66");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setBounds(233, 40, 118, 34);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u6559\u52A1\u7CFB\u7EDF");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.ITALIC, 13));
		lblNewLabel_3.setBounds(222, 84, 63, 15);
		panel.add(lblNewLabel_3);
		
		final JLabel lblNewLabel_4 = new JLabel("\u00D7");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblNewLabel_4.setForeground(Color.red);
				panel.repaint();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lblNewLabel_4.setForeground(Color.white);
				panel.repaint();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				frame.dispose();
			}
		});
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 22));
		lblNewLabel_4.setBounds(396, 0, 24, 34);
		panel.add(lblNewLabel_4);
		
		panel_1 = new RoundRectPanel();
		panel_1.setOpaque(true);
		panel_1.setBackground(new Color(243, 240, 224));
		panel_1.setBounds(0, 179, 422, 162);
		panel_1.setBorder(new TextFieldBorder(Color.LIGHT_GRAY));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
			    if(arg0.getKeyCode()==KeyEvent.VK_UP||arg0.getKeyCode()==KeyEvent.VK_DOWN||arg0.getKeyCode()==KeyEvent.VK_ENTER){
			    	if(arg0.getKeyCode()==KeyEvent.VK_DOWN){
						if(ip!=null){
							if(ip.selected+1<=ip.users.size()-1)
							   ip.selected++;
							ip.updateSelected();
						}
					}
					else if(arg0.getKeyCode()==KeyEvent.VK_UP){
						if(ip!=null){
							if(ip.selected-1>=0)
								ip.selected--;
							ip.updateSelected();
						}
					}				
					else{
						if(ip!=null){
							if(ip.selected!=-1){
								textField.setText(ip.users.get(ip.selected).getText());
								panel_1.remove(ip);
								ip=null;
								down.setIcon(new ImageIcon(LoginUI.class.getResource("/img/down.png")));
								passwordField.setText(getLocalPassword(textField.getText()));
								checked=true;
								label_1.setIcon(new ImageIcon(LoginUI.class.getResource("/img/rem_s.png")));
								panel.repaint();
							}
						}
					}
			    }
			    else{
			    	if(ip!=null)
			    		panel_1.remove(ip);   
			    	String currentText=textField.getText();
			    	ArrayList<String> data=loadData();
			    	ip=new ImaginationPanel();
			    	for(int i=0; i<=data.size()-1; i++){
			    		if(data.get(i).startsWith(currentText)&&!currentText.equals("")){
			    			ip.addOne(data.get(i));
						}
			    	}
					if(ip.users.size()!=0){
						down.setIcon(new ImageIcon(LoginUI.class.getResource("/img/up_s.png")));
						ip.setLocation(124, passwordField.getY());
						panel_1.add(ip, 1);
						ip.selected=0;
						ip.updateSelected();
					}
					else{
						if(ip!=null)
							panel_1.remove(ip);
						ip=null;
						down.setIcon(new ImageIcon(LoginUI.class.getResource("/img/down.png")));
						passwordField.setText("");
					}
			    }
			    
				panel_1.repaint();
			}
		});
		textField.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 14));
		textField.setSelectionColor(new Color(153, 50, 204));
		textField.setSelectedTextColor(Color.white);
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				((TextFieldBorder)textField.getBorder()).updateColor(new Color(173, 70, 224));
				panel_1.repaint();
			}
			@Override
			public void focusLost(FocusEvent e) {
				((TextFieldBorder)textField.getBorder()).updateColor(Color.LIGHT_GRAY);
				panel_1.repaint();
			}
		});
		textField.setBounds(124, 27, 177, 28);
		textField.setBorder(new TextFieldBorder(Color.LIGHT_GRAY));
		panel_1.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.BLACK);
		passwordField.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 14));
		passwordField.setSelectionColor(new Color(153, 50, 204));
		passwordField.setSelectedTextColor(Color.white);
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				((TextFieldBorder)passwordField.getBorder()).updateColor(new Color(173, 70, 224));
				panel_1.repaint();
			}
			@Override
			public void focusLost(FocusEvent e) {
				((TextFieldBorder)passwordField.getBorder()).updateColor(Color.LIGHT_GRAY);
				panel_1.repaint();
			}
		});
		passwordField.setBounds(124, 55, 177, 28);
		passwordField.setBorder(new TextFieldBorder(Color.LIGHT_GRAY));
		panel_1.add(passwordField);
		panel_1.setLayer(passwordField, 0);
		
		JLabel lblNewLabel = new JLabel("\u8D26\u53F7");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblNewLabel.setBounds(49, 34, 54, 15);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		lblNewLabel_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(49, 62, 54, 15);
		panel_1.add(lblNewLabel_1);
		
		down=new JLabel();
		down.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				textField.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				if(ip==null){
					down.setIcon(new ImageIcon(LoginUI.class.getResource("/img/down_s.png")));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
					textField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
				if(ip==null){
					down.setIcon(new ImageIcon(LoginUI.class.getResource("/img/down.png")));
				}
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				if(ip==null){
					ArrayList<String> data=loadData();
					down.setIcon(new ImageIcon(LoginUI.class.getResource("/img/up_s.png")));
					ip=new ImaginationPanel();
					for(int i=0; i<=data.size()-1; i++){
						ip.addOne(data.get(i));
					}
					ip.setLocation(124, passwordField.getY());
					panel_1.add(ip, 1);
					panel_1.repaint();
				}
				else{
					down.setIcon(new ImageIcon(LoginUI.class.getResource("/img/down_s.png")));
					panel_1.remove(ip);
					ip=null;
					panel_1.repaint();
				}
			}
		});
		down.setBounds(148, 0, 28, 28);
		down.setIcon(new ImageIcon(LoginUI.class.getResource("/img/down.png")));
		textField.add(down);
		
		final JButton btnNewButton = new LoginBtn("µÇÂ¼");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(new Color(183, 80, 234));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(153, 50, 204));
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				UserDeal user=new UserDeal();
				String ID=textField.getText();
				String password=new String(passwordField.getPassword());
				if(ID.trim().equals("")||password.trim().equals("")){
					lblNewLabel_5.setText("ÇëÌîÐ´ÕËºÅ»òÃÜÂë!");
				}
				else{
					String userType=user.login(ID, password);
					if(userType.equals("¹ÜÀíÔ±")){
						userID=ID;
						saveLoginInfo(checked, ID, password);
						frame.dispose();
						new AdministratorUI();					
					}
					else if(userType.equals("ÈÎ¿ÎÀÏÊ¦")){
						userID=ID;
						saveLoginInfo(checked, ID, password);
						frame.dispose();
						new TeacherUI();
					}	
					else if(userType.equals("Ñ§Éú")){
						userID=ID;
						saveLoginInfo(checked, ID, password);
						frame.dispose();
						new StudentFrame();
					}
					else if(userType.equals("ÔºÏµ½ÌÎñÀÏÊ¦")){
						userID=ID;
						frame.dispose();
						new DepartmentOfficeTeacherUI();
					}
					else if(userType.equals("½ÌÎñ´¦ÀÏÊ¦")){
						userID=ID;
						saveLoginInfo(checked, ID, password);
						frame.dispose();
						new OfficeTeacherUI();
					}
					else{
						lblNewLabel_5.setText("ÕËºÅ»òÃÜÂë´íÎó!");
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(153, 50, 204));
		btnNewButton.setForeground(Color.white);
		btnNewButton.setBounds(124, 115, 177, 34);
		panel_1.add(btnNewButton);
		panel_1.setLayer(btnNewButton, 0);
		
		label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				if(!checked){
					label_1.setIcon(new ImageIcon(LoginUI.class.getResource("/img/rem_s.png")));
					checked=true;
				}
				else{
					label_1.setIcon(new ImageIcon(LoginUI.class.getResource("/img/rem.png")));
					checked=false;
				}
				panel_1.repaint();
			}
		});
		label_1.setIcon(new ImageIcon(LoginUI.class.getResource("/img/rem.png")));
		label_1.setBounds(124, 88, 82, 22);
		panel_1.add(label_1);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setForeground(new Color(165, 42, 42));
		lblNewLabel_5.setFont(new Font("ºÚÌå", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(314, 125, 106, 15);
		panel_1.add(lblNewLabel_5);
		frame.setVisible(true);
	}
	
	public ArrayList<String> loadData(){
	   ArrayList<String> data=new ArrayList<String>();
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
				data.add(split[0]);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
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
	
	public void saveLoginInfo(boolean checked, String id, String pass){
		if(checked){
			File file=new File("data");
			if(!file.exists()){
				file.mkdir();
			}
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
					if(split[0].equals(id)){ br.close(); return;}
				}
				FileWriter fw=new FileWriter(usr, true);
				fw.append("\n"+id+" "+pass);
				fw.close();		
				br.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
