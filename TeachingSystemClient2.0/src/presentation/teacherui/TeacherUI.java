package presentation.teacherui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import javax.swing.ImageIcon;

import presentation.mainui.MainUI;
import presentation.uicomponents.BackgroundPanel;
import presentation.uicomponents.ChangePhotoFrame;
import presentation.uicomponents.HeaderPanel;
import presentation.uicomponents.ItemLabel;
import presentation.uicomponents.LoginBtn;
import presentation.uicomponents.PhotoPanel;
import presentation.uicomponents.RoundRectPanel;
import presentation.uicomponents.StretchPanel;
import presentation.uicomponents.TextFieldBorder;
import presentation.userui.LoginUI;
import util.Point;
import vo.CourseVO;
import vo.StudentVO;
import vo.TeacherVO;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JTable;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import businesslogic.coursebl.CourseDealController;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class TeacherUI {

	private JFrame frame;
	private int fx, fy;
	private int bfx;
	private JTable table;
	public static ChangePhotoFrame cpf;
	public static PhotoPanel panel_3;
	private JButton btnNewButton;
	private JLabel label, label_1, label_2;
	public static JLabel down;
	public static JTextField textField;
	public static StretchPanel ip;
    public static BackgroundPanel panel;
    private JScrollPane scrollPane, scrollPane_1;
    private JButton submit;
    private int last=-1, er=-1, ec=-1;
    private Vector<Vector<String>> tableValue;
    private JLabel lblNewLabel_8;
    private DefaultTableCellRenderer  tcr;
    private ArrayList<Point> list=new ArrayList<Point>();
    private int height=14;
    private JLabel lblNewLabel_9;
    private JTextArea jta;
    ArrayList<CourseVO>  courselist;
    //private Semaphore s=new Semaphore(1);
    //private Semaphore s1=new Semaphore(0);
    
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public TeacherUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		 TeacherVO teacher=new TeacherVO(LoginUI.userID,"","",0,null);
   	     courselist=new CourseDealController().showCourse(teacher);
		 
		frame = new JFrame();
		frame.setBounds(100, 100, 760, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		frame.setBackground(new Color(0, 0, 0));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
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
		
		panel = new BackgroundPanel();
	//	panel.setBorder(new TextFieldBorder(Color.gray));
		panel.setBounds(0, 0, 760, 533);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		HeaderPanel panel_1 = new HeaderPanel();
	//	panel_1.setBorder(new TextFieldBorder(Color.gray));
		panel_1.setBounds(0, 0, 760, 101);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u5218\u94A6");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("微软雅黑 Light", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(591, 15, 135, 36);
		panel_1.add(lblNewLabel_1);
		
		MainUI.lblNewLabel_2.setText("  课程大纲");
		panel_1.add(MainUI.lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(TeacherUI.class.getResource("/img/xiaohui_vs.png")));
		lblNewLabel.setBounds(0, 15, 98, 85);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("\u5728\u7EBF");
		lblNewLabel_5.setIcon(new ImageIcon(TeacherUI.class.getResource("/img/online.png")));
		lblNewLabel_5.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(591, 59, 56, 36);
		panel_1.add(lblNewLabel_5);
		
		final JLabel lblNewLabel_6 = new JLabel("\u00D7");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblNewLabel_6.setForeground(Color.red);
				panel.repaint();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lblNewLabel_6.setForeground(Color.white);
				panel.repaint();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				frame.dispose();
			}
		});
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("微软雅黑", Font.BOLD, 22));
		lblNewLabel_6.setBounds(736, 0, 24, 34);
		panel_1.add(lblNewLabel_6);
		
		panel_3 = new PhotoPanel();
		panel_3.setBounds(509, 18, 72, 72);
		panel_3.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				cpf=new ChangePhotoFrame(panel_3);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
		});
		panel_1.add(panel_3);
		
		JLabel lblNewLabel_7 = new JLabel("\u6388\u8BFE\u6559\u5E08");
		lblNewLabel_7.setIcon(new ImageIcon(TeacherUI.class.getResource("/img/edit_user.png")));
		lblNewLabel_7.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(657, 59, 103, 36);
		panel_1.add(lblNewLabel_7);
		
		final JLabel lblNewLabel_2 = new JLabel("\u4E1A\u52A1\u603B\u89C8\uFF1A");
		lblNewLabel_2.setForeground(new Color(133, 30, 184));
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(22, 121, 60, 15);
		panel.add(lblNewLabel_2);
		
		final JLayeredPane layeredPane = new RoundRectPanel();
		layeredPane.setOpaque(true);
		layeredPane.setBackground(new Color(203, 100, 254));
		layeredPane.setBounds(94, 111, 179, 36);
		panel.add(layeredPane);
		layeredPane.setLayout(null);
		
		label = new JLabel("课程大纲");
		label.setBounds(10, 10, 54, 15);
		layeredPane.add(label);
		label.setForeground(Color.white);
		label.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				SlideThread st=new SlideThread(btnNewButton, btnNewButton.getX(), 2);
				st.start();
				
				label.setForeground(Color.white);
				label_1.setForeground(Color.black);
				MainUI.lblNewLabel_2.setText("  课程大纲");
				
				removeScoreInfo();
			}
		});
		label.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		
		label_1 = new JLabel("学生成绩");
		label_1.setBounds(115, 10, 54, 15);
		layeredPane.add(label_1);
		label_1.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				SlideThread st=new SlideThread(btnNewButton, btnNewButton.getX(), layeredPane.getWidth()-2-btnNewButton.getWidth());
				st.start();
				
				label_1.setForeground(Color.white);
				label.setForeground(Color.black);
				MainUI.lblNewLabel_2.setText("  学生成绩");
				
				removeCourseDG();
			}
		});
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		
		btnNewButton = new JButton("");
		btnNewButton.setBorder(new TextFieldBorder(Color.white));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				bfx=arg0.getX();
			}
			@Override
			public void mouseReleased(MouseEvent arg0){
				int cx=btnNewButton.getX()+btnNewButton.getWidth()/2;
				if(cx<=layeredPane.getWidth()/2){
					SlideThread st=new SlideThread(btnNewButton, btnNewButton.getX(), 2);
					st.start();
				}
				else{
					SlideThread st=new SlideThread(btnNewButton, btnNewButton.getX(), layeredPane.getWidth()-2-btnNewButton.getWidth());
					st.start();
				}
			}
		});
		btnNewButton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int detx=arg0.getX()-bfx;
				int dx=btnNewButton.getX()+detx;
				if(dx>=2&&dx+btnNewButton.getWidth()<=layeredPane.getWidth()-2)
					btnNewButton.setLocation(btnNewButton.getX()+detx, btnNewButton.getY());
				int cx=btnNewButton.getX()+btnNewButton.getWidth()/2;
				if(cx<=layeredPane.getWidth()/2){
					label.setForeground(Color.white);
					label_1.setForeground(Color.black);
					MainUI.lblNewLabel_2.setText("  课程大纲");
				}
				else{
					label_1.setForeground(Color.white);
					label.setForeground(Color.black);
					MainUI.lblNewLabel_2.setText("  学生成绩");
				}
			}
		});
		btnNewButton.setBounds(2, 6, 93, 23);
		btnNewButton.setContentAreaFilled(false);
		layeredPane.add(btnNewButton);
		layeredPane.setLayer(btnNewButton, 100);
		
		jta=new JTextArea();
		jta.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				panel.repaint();
			}
		});
		jta.setLineWrap(true);
		jta.setFont(new Font("微软雅黑", Font.PLAIN, 13));
		jta.setSelectionColor(new Color(153, 50, 204));
		jta.setSelectedTextColor(Color.white);
		jta.setForeground(Color.BLACK);
		jta.setMargin(new Insets(1, 1, 1, 1));
		scrollPane_1 = new JScrollPane(jta);
		scrollPane_1.setBounds(121, 168, 540, 313);
		panel.add(scrollPane_1);
		
	    submit = new LoginBtn("提交");
	    submit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				submit.setBackground(new Color(183, 80, 234));
				panel.repaint();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				submit.setBackground(new Color(153, 50, 204));
				panel.repaint();
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				if(jta.getText().trim().equals("")){
					lblNewLabel_9.setText("请填写完整的大纲信息!");
					lblNewLabel_9.setForeground(new Color(180, 40, 40));
				}
				else if(jta.getText().contains(" ")){
					lblNewLabel_9.setText("请输入合法字符!");
					lblNewLabel_9.setForeground(new Color(180, 40, 40));
				}
				else{
					  String courseName=textField.getText();
			//		  int courseID=new CourseDealController().findCourseIDByCourseName(courseName);
					  String detail=jta.getText();
			//		  CourseVO course=new CourseVO(courseID, "","","","",null,0,0);
			//		  new CourseDealController().fillCourseInfo(course,detail);
					  lblNewLabel_9.setText("课程大纲上传成功!");
				      lblNewLabel_9.setForeground(new Color(20, 140, 20));			  
				}
			   panel.repaint();
			}
		});
	    submit.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		submit.setBackground(new Color(153, 50, 204));
		submit.setForeground(Color.white);
		submit.setBounds(311, 490, 177, 34);
		panel.add(submit);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(525, 500, 124, 15);
		panel.add(lblNewLabel_9);
		//panel.setLayer(submit, 0);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(121, 500, 190, 15);
	//	panel.add(lblNewLabel_8);

		Vector<String> columnname=new Vector<String>();
		columnname.add("学号");
		columnname.add("姓名");
		columnname.add("成绩");
		tableValue=new Vector<Vector<String>>();
		for(int i=0; i<=10; i++){
		Vector<String> r1=new Vector<String>();
		r1.add(i+""); r1.add("小飞侠"+i); r1.add((100-i)+"");
		tableValue.add(r1);
		}
		DefaultTableModel tableModel=new DefaultTableModel(tableValue,columnname){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int rowindex, int colindex){
				if(colindex==0 || colindex==1)
					return false;
				return true;
			}
		};
		table=new JTable(tableModel){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void changeSelection(int r, int c, boolean t, boolean e){
				super.changeSelection(r, c, t, e);
				if(last==-1){
					//do nothing
				}
				else{
					if(checkError(er, ec)){
						list.add(new Point(er, ec));
						ShrinkThread sht=new ShrinkThread(true);
						sht.start();
						
	/*					try {
							s1.acquire();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}*/
						

		  //              s.release();
					}
					else{
						ShrinkThread sht=new ShrinkThread(false);
						sht.start();
	/*					try {
							s1.acquire();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}*/
						

		//                s.release();
					}
					
					last=-1;
				}
				if(table.isEditing()&&c==2){
					er=r;
					ec=c;
					last=2;
				}
				panel.repaint();
			}
		};
		tcr = new DefaultTableCellRenderer() {

			 /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public Component getTableCellRendererComponent(JTable table, Object value,

			   boolean isSelected, boolean hasFocus, int row, int column){
				 Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			     if(isIn(new Point(row, column))&&checkError(row, column)&& cell.isBackgroundSet()){//设置变色的单元格
                     cell.setForeground(new Color(180, 20, 20));
			     }
			     else
			    	 cell.setForeground(Color.black);
			     return cell;
			 }

  };
		table.setFont(new Font("微软雅黑", Font.PLAIN, 12));
        table.getColumn("成绩").setCellRenderer(tcr);
				
		scrollPane = new JScrollPane(table);
		scrollPane.getViewport().setBackground(Color.white);
		scrollPane.setBounds(121, 168, 540, 313);
	//	panel.add(scrollPane);
		
		textField = new JTextField();
		textField.setSelectionColor(new Color(153, 50, 204));
		textField.setSelectedTextColor(Color.WHITE);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBorder(new TextFieldBorder(Color.LIGHT_GRAY));
		textField.setBounds(396, 114, 177, 28);
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
								panel.remove(ip);
								ip=null;
								down.setIcon(new ImageIcon(LoginUI.class.getResource("/img/down.png")));
							}
						}
					}
			    }
			    else{
			    	if(ip!=null)
			    		panel.remove(ip);   
			    	String currentText=textField.getText();
			    	ArrayList<String> data=loadData();
			    	ip=new StretchPanel();
			    	for(int i=0; i<=data.size()-1; i++){
			    		if(data.get(i).startsWith(currentText)&&!currentText.equals("")){
			    			ip.addOne(data.get(i));
						}
			    	}
					if(ip.users.size()!=0){
						down.setIcon(new ImageIcon(LoginUI.class.getResource("/img/up_s.png")));
						ip.setLocation(textField.getX(), textField.getY()+textField.getHeight());
						panel.add(ip, 1);
						ip.selected=0;
						ip.updateSelected();
					}
					else{
						if(ip!=null)
							panel.remove(ip);
						ip=null;
						down.setIcon(new ImageIcon(LoginUI.class.getResource("/img/down.png")));
					}
			    }
			    
				panel.repaint();
			}
		});
		//panel.add(textField, 0);
		
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
					ip=new StretchPanel();
					for(int i=0; i<=data.size()-1; i++){
						ip.addOne(data.get(i));
					}
					ip.setLocation(textField.getX(), textField.getY()+textField.getHeight());
					panel.add(ip, 1);
					panel.repaint();
				}
				else{
					down.setIcon(new ImageIcon(LoginUI.class.getResource("/img/down_s.png")));
					panel.remove(ip);
					ip=null;
					panel.repaint();
				}
			}
		});
		down.setBounds(148, 0, 28, 28);
		down.setIcon(new ImageIcon(LoginUI.class.getResource("/img/down.png")));
		textField.add(down);
		
		label_2 = new JLabel("\u8BFE\u7A0B\u9009\u62E9\uFF1A");
		label_2.setForeground(new Color(133, 30, 184));
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label_2.setBounds(326, 121, 60, 15);
	//	panel.add(label_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(22, 202, 103, 120);
		panel_2.setBorder(new TextFieldBorder(Color.lightGray));
        //panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new ItemLabel("\u8F6F\u5DE51");
		lblNewLabel_3.setBounds(1, 0, 101, 32);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new ItemLabel("软工2");
		lblNewLabel_4.setBounds(1, 32, 101, 32);
		panel_2.add(lblNewLabel_4);
		/*
		SidePanel panel_2 = new SidePanel();
	//	panel_2.setBorder(new TextFieldBorder(Color.gray));
		panel_2.setOpaque(false);
		panel_2.setBounds(0, 111, 98, 422);
		//panel.add(panel_2);
		panel_2.setLayout(null);
		
		OptionLabel lblNewLabel_3 = new OptionLabel("  课程大纲");
		lblNewLabel_3.clicked=true;
		lblNewLabel_3.setBorder(new TextFieldBorder(Color.LIGHT_GRAY));
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(200, 200, 200, 100));
		lblNewLabel_3.setIcon(new ImageIcon(TeacherUI.class.getResource("/img/add_user.png")));
		lblNewLabel_3.setBounds(4, 2, 90, 90);
		panel_2.add(lblNewLabel_3);
		
		OptionLabel lblNewLabel_4 = new OptionLabel("  学生成绩");
		lblNewLabel_4.setIcon(new ImageIcon(TeacherUI.class.getResource("/img/list_add_user.png")));
		lblNewLabel_4.setBounds(4, 92, 90, 90);
		panel_2.add(lblNewLabel_4);
		
		lblNewLabel_3.siblings.add(lblNewLabel_4);
		lblNewLabel_4.siblings.add(lblNewLabel_3);
		
		*/
		
	}
	
	public ArrayList<String> loadData(){
		  ArrayList<String> strList=new ArrayList<String>();
		  strList.add("软工1");
		  strList.add("软工2");
		  strList.add("软工3");
			return strList;
		}
	
	public boolean isIn(Point p){
		for(Point tmp: list){
			if(tmp.x==p.x&&tmp.y==p.y)
				return true;
		}
		return false;
	}
	
	public boolean checkError(int er, int ec){
		int val=0;
		try{
			val=Integer.parseInt(tableValue.get(er).get(ec));
		}catch(NumberFormatException e){
			return true;
		}
		if(val<0||val>100){
			return true;
		}
		return false;
	}
	
	public void removeCourseDG(){
		//删除课程大纲有关组件
		panel.remove(scrollPane_1);
		panel.remove(submit);
		panel.remove(lblNewLabel_9);
		//增加成绩表等组件
		panel.add(textField, 0);
		panel.add(label_2, 0);
		panel.add(scrollPane, 0);
		panel.add(lblNewLabel_8, 0);
		if(ip!=null) panel.add(ip, 1);
	
		panel.repaint();
	}
	
	public void removeScoreInfo(){
		//删除成绩表等组件
		panel.remove(textField);
		panel.remove(label_2);
		panel.remove(scrollPane);
		panel.remove(lblNewLabel_8);
		if(ip!=null) panel.remove(ip);
		//添加课程大纲等组件
		panel.add(scrollPane_1, 0);
		panel.add(submit, 0);
		panel.add(lblNewLabel_9, 0);
		panel.repaint();
	}
	
	public class ShrinkThread extends Thread{
		
		private boolean error;
		
		public ShrinkThread(boolean error){
		  this.error=error;	
		}
		
		 public void run(){
	/*		 try {
				s.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			 while(height>=0){
				 lblNewLabel_8.setSize( lblNewLabel_8.getWidth(), height);
				 panel.repaint();
				 height-=1;
				 try{
					 Thread.sleep(13);
				 }catch(Exception e){
					 e.printStackTrace();
				 }
			 }
			 try{
				 Thread.sleep(100);
			 }catch(Exception e){
				 e.printStackTrace();
			 }
			 height=14;
			 lblNewLabel_8.setSize(190, 15);
			 if(error){
					lblNewLabel_8.setText("  成绩填写有误, 该修改未上传！");
					lblNewLabel_8.setForeground(new Color(180, 40, 40));
	                lblNewLabel_8.setIcon(new ImageIcon(TeacherUI.class.getResource("/img/error.png")));
			 }
			 else{
					lblNewLabel_8.setText("  本次修改成功上传！");
					lblNewLabel_8.setForeground(new Color(20, 140, 20));
	                lblNewLabel_8.setIcon(new ImageIcon(TeacherUI.class.getResource("/img/yes.png")));
			 }
	//		 s1.release();
		 }
	}
	
	public class SlideThread extends Thread{
		
		private JButton btn;
		private int sx, dx;
		
		public SlideThread(JButton jb, int sx, int dx){
			btn=jb;
			this.sx=sx;
			this.dx=dx;
		}
		
		public void run(){
			if(sx>=dx){
				int times=sx-dx;
				while(times!=0){
					btn.setLocation(btn.getX()-1, btn.getY());
					times--;
					try{
						Thread.sleep(2);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
			else{
				int times=dx-sx;
				while(times!=0){
					btn.setLocation(btn.getX()+1, btn.getY());
					times--;
					try{
						Thread.sleep(2);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		}
	}
}
