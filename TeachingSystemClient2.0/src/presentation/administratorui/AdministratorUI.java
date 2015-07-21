package presentation.administratorui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import util.Constants;
import vo.StudentVO;
import vo.TeacherVO;
import vo.UserVO;

import javax.swing.ImageIcon;

import presentation.mainui.MainUI;
import presentation.uicomponents.BackgroundPanel;
import presentation.uicomponents.ChangePhotoFrame;
import presentation.uicomponents.HeaderPanel;
import presentation.uicomponents.MyPopupMenu;
import presentation.uicomponents.PhotoPanel;
import presentation.uicomponents.RoundRectPanel;
import presentation.uicomponents.TabPanel;
import presentation.uicomponents.TextFieldBorder;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JTable;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import businesslogic.studentbl.StudentDeal;
import businesslogic.teacherbl.TeacherDeal;
import businesslogic.userbl.UserDeal;

import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.Vector;

public class AdministratorUI {

	private JFrame frame;
	private int fx, fy;
	private int bfx;
	public static JTable table, table1;
	public static ChangePhotoFrame cpf;
	public static PhotoPanel panel_3;
	private JButton btnNewButton;
	private JLabel label, label_1, lblNewLabel_3,  lblNewLabel_4;
	private Vector<Vector<String>> tableValue, tableValue1;
	 public static JScrollPane scrollPane, scrollPane1;
	 public static DefaultTableModel tableModel, tableModel1;
	 public static BackgroundPanel panel;
	 public JLabel lblNewLabel_8, lblNewLabel_9;
	 private int height1=14, height2=14;
	 private int last1=-1, last2=-1;
	 private TabPanel panel_2, panel_4;
	 private boolean e1=false, e2=false, ani1=true, ani2=true;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public AdministratorUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		
		JLabel lblNewLabel_1 = new JLabel(Constants.admin_name);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("微软雅黑 Light", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(591, 15, 135, 36);
		panel_1.add(lblNewLabel_1);
		
		MainUI.lblNewLabel_2.setText("  学生管理");
		panel_1.add(MainUI.lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(AdministratorUI.class.getResource("/img/xiaohui_vs.png")));
		lblNewLabel.setBounds(0, 15, 98, 85);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("\u5728\u7EBF");
		lblNewLabel_5.setIcon(new ImageIcon(AdministratorUI.class.getResource("/img/online.png")));
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
		
		JLabel lblNewLabel_7 = new JLabel("\u7CFB\u7EDF\u7BA1\u7406\u5458");
		lblNewLabel_7.setIcon(new ImageIcon(AdministratorUI.class.getResource("/img/edit_user.png")));
		lblNewLabel_7.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(657, 59, 103, 36);
		panel_1.add(lblNewLabel_7);
		
		final JLabel lblNewLabel_2 = new JLabel("\u5F53\u524D\u4E1A\u52A1\uFF1A");
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
		
		label = new JLabel("\u5B66\u751F\u7BA1\u7406");
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
				MainUI.lblNewLabel_2.setText("  学生管理");
				
				removeTea();
			}
		});
		label.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		
		label_1 = new JLabel("\u6559\u5E08\u7BA1\u7406");
		label_1.setBounds(115, 10, 54, 15);
		layeredPane.add(label_1);
		label_1.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				SlideThread st=new SlideThread(btnNewButton, btnNewButton.getX(), layeredPane.getWidth()-2-btnNewButton.getWidth());
				st.start();
				
				label_1.setForeground(Color.white);
				label.setForeground(Color.black);
				MainUI.lblNewLabel_2.setText("  教师管理");
				
				removeStu();
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
					MainUI.lblNewLabel_2.setText("  学生管理");
				}
				else{
					label_1.setForeground(Color.white);
					label.setForeground(Color.black);
					MainUI.lblNewLabel_2.setText("  教师管理");
				}
			}
		});
		btnNewButton.setBounds(2, 6, 93, 23);
		btnNewButton.setContentAreaFilled(false);
		layeredPane.add(btnNewButton);
		layeredPane.setLayer(btnNewButton, 100);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(121, 500, 190, 15);
		panel.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(121, 500, 190, 15);

		Vector<String> columnname=new Vector<String>();
		columnname.add("学号");
		columnname.add("姓名");
		columnname.add("密码");
		columnname.add("院系");
		tableValue=new Vector<Vector<String>>();
		ArrayList<UserVO> list=new UserDeal().showAllUser();
		tableModel=new DefaultTableModel(tableValue,columnname){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int rowindex, int colindex){
			return false;
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
				if(last1==-1){
					//do nothing
				}
				else{
					ShrinkThread st=new ShrinkThread(false, lblNewLabel_8, height1);
					st.start();
					
					last1=-1;
				}
				
				if(table.isEditing()){
					last1=2;
				}
				panel.repaint();
			}
		};
		table.addMouseListener(new MouseListener(){

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
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				//System.out.println(table.getSelectedRowCount());
	/*			if(e.isPopupTrigger()&&table.getSelectedRowCount()!=0){
					MyPopupMenu popupmenu=new MyPopupMenu();
					popupmenu.add(new MyPopupMenu().new MyMenuItem("新增学生"));
					popupmenu.add(new MyPopupMenu().new MyMenuItem("删除学生"));
					popupmenu.show(e.getComponent(), e.getX(), e.getY());
				}
				else if(e.isPopupTrigger()&&table.getSelectedRowCount()==0){
					MyPopupMenu popupmenu=new MyPopupMenu();
					popupmenu.add(new MyPopupMenu().new MyMenuItem("新增学生"));
					popupmenu.show(e.getComponent(), e.getX(), e.getY());	
				}*/
			}
			
		});
		DefaultTableCellRenderer tcr=new DefaultTableCellRenderer(){

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			
			public Component getTableCellRendererComponent(JTable table, Object value,

					   boolean isSelected, boolean hasFocus, int row, int column){
				
				 Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				 if(column==3){
				//	 return new JComboBox<String>(new String[]{"文学院", "数学系"});
				 }
				 return cell;
				
			}
			
		};
		table.setFont(new Font("微软雅黑", Font.PLAIN, 12));
        table.getColumn("院系").setCellRenderer(tcr);
				
		scrollPane = new JScrollPane(table);
		scrollPane.addMouseListener(new MouseListener(){

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
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
		//		System.out.println(table.getSelectedRowCount());
		/*		if(e.isPopupTrigger()&&table.getSelectedRowCount()!=0){
					MyPopupMenu popupmenu=new MyPopupMenu();
					popupmenu.add(new MyPopupMenu().new MyMenuItem("新增学生"));
					popupmenu.add(new MyPopupMenu().new MyMenuItem("删除学生"));
					popupmenu.show(e.getComponent(), e.getX(), e.getY());
				}
				else if(e.isPopupTrigger()&&table.getSelectedRowCount()==0){
					MyPopupMenu popupmenu=new MyPopupMenu();
					popupmenu.add(new MyPopupMenu().new MyMenuItem("新增学生"));
					popupmenu.show(e.getComponent(), e.getX(), e.getY());	
				}*/
			}
			
		});
		scrollPane.getViewport().setBackground(new Color(0, 0, 0, 0));
		scrollPane.setBackground(new Color(0, 0, 0, 0));
		scrollPane.setBounds(121, 169, 535, 321);
		panel.add(scrollPane);
		panel.setLayer(scrollPane, 1);
		
		panel_2 = new TabPanel();
		panel_2.setLocation(-535, 169);
		panel.add(panel_2, 0);
		
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(ani1){
					ani1=false;
					if(!e1){
						lblNewLabel_3.setIcon(new ImageIcon(AdministratorUI.class.getResource("/img/left.png")));
						ExtendThreadStu ets=new ExtendThreadStu(true);
						ets.start();
					}
					else{
						lblNewLabel_3.setIcon(new ImageIcon(AdministratorUI.class.getResource("/img/right.png")));
						ExtendThreadStu ets=new ExtendThreadStu(false);
						ets.start();
					}
					panel.repaint();
				}
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(AdministratorUI.class.getResource("/img/right.png")));
		lblNewLabel_3.setBounds(0, 169, 30, 64);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(153, 50, 204, 100));
		//panel.add(lblNewLabel_3);
		//panel.setLayer(lblNewLabel_3, 1);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(ani2){
					ani2=false;
					if(!e2){
						lblNewLabel_4.setIcon(new ImageIcon(AdministratorUI.class.getResource("/img/left.png")));
						ExtendThreadTea ett=new ExtendThreadTea(true);
						ett.start();
					}
					else{
						lblNewLabel_4.setIcon(new ImageIcon(AdministratorUI.class.getResource("/img/right.png")));
						ExtendThreadTea ett=new ExtendThreadTea(false);
						ett.start();
					}
					panel.repaint();
				}
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon(AdministratorUI.class.getResource("/img/right.png")));
		lblNewLabel_4.setBounds(0, 169, 30, 64);
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(new Color(153, 50, 204, 100));
	//	panel.add(lblNewLabel_4);
	//	panel.setLayer(lblNewLabel_4, 1);
		
		panel_4 = new TabPanel();
		panel_4.setLocation(-535, 169);
		
		Vector<String> columnname1=new Vector<String>();
		columnname1.add("工号");
		columnname1.add("姓名");
		columnname1.add("密码");
		columnname1.add("院系");
		columnname1.add("教师类别");
		tableValue1=new Vector<Vector<String>>();
		for(int i=0;i<=list.size()-1;i++){
			if(list.get(i).getType().equals("学生")){
			StudentVO stu=new StudentDeal().showStudent(list.get(i).getID());
			Vector<String> row=new Vector<String>();
			row.add(stu.ID);
			row.add(stu.name);
			row.add(list.get(i).getPassword());
			row.add(getAname(stu.aID));
			tableValue.add(row);
			}
			else{
				TeacherVO tea=new TeacherDeal().showTeacher(list.get(i).getID());
				Vector<String> row=new Vector<String>();
				row.add(tea.ID);
				row.add(tea.name);
				row.add(list.get(i).getPassword());
				row.add(getAname(tea.aID));
				row.add(list.get(i).getType());
				tableValue1.add(row);
			}
		}
		tableModel1=new DefaultTableModel(tableValue1,columnname1){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int rowindex, int colindex){
				return false;
			}
		};
		table1=new JTable(tableModel1){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void changeSelection(int r, int c, boolean t, boolean e){
				super.changeSelection(r, c, t, e);
				if(last2==-1){
					//do nothing
				}
				else{
					ShrinkThread st=new ShrinkThread(false, lblNewLabel_9, height2);
					st.start();
					
					last2=-1;
				}
				
				if(table1.isEditing()){
					last2=2;
				}
				panel.repaint();
				
			}
		};
		table1.addMouseListener(new MouseListener(){

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
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
	/*			if(e.isPopupTrigger()&&table1.getSelectedRowCount()!=0){
					MyPopupMenu popupmenu=new MyPopupMenu();
					popupmenu.add(new MyPopupMenu().new MyMenuItem("新增教师"));
					popupmenu.add(new MyPopupMenu().new MyMenuItem("删除教师"));
					popupmenu.show(e.getComponent(), e.getX(), e.getY());
				}
				else if(e.isPopupTrigger()&&table1.getSelectedRowCount()==0){
					MyPopupMenu popupmenu=new MyPopupMenu();
					popupmenu.add(new MyPopupMenu().new MyMenuItem("新增教师"));
					popupmenu.show(e.getComponent(), e.getX(), e.getY());	
				}*/
			}
			
		});
		DefaultTableCellRenderer tcr1=new DefaultTableCellRenderer(){

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			
			public Component getTableCellRendererComponent(JTable table, Object value,

					   boolean isSelected, boolean hasFocus, int row, int column){
				
				 Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				 if(column==3){
				//	 return new JComboBox<String>(new String[]{"文学院", "数学系"});
				 }
				 return cell;
				
			}
			
		};
	
		table1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
    //    table1.getColumn("院系").setCellRenderer(tcr1);
				
		scrollPane1= new JScrollPane(table1);
		scrollPane1.addMouseListener(new MouseListener(){

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
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			/*	if(e.isPopupTrigger()&&table1.getSelectedRowCount()!=0){
					MyPopupMenu popupmenu=new MyPopupMenu();
					popupmenu.add(new MyPopupMenu().new MyMenuItem("新增教师"));
					popupmenu.add(new MyPopupMenu().new MyMenuItem("删除教师"));
					popupmenu.show(e.getComponent(), e.getX(), e.getY());
				}
				else if(e.isPopupTrigger()&&table1.getSelectedRowCount()==0){
					MyPopupMenu popupmenu=new MyPopupMenu();
					popupmenu.add(new MyPopupMenu().new MyMenuItem("新增教师"));
					popupmenu.show(e.getComponent(), e.getX(), e.getY());	
				}*/
			}
			
		});
		scrollPane1.getViewport().setBackground(new Color(0, 0, 0, 0));
		scrollPane1.setBounds(121, 169, 535, 321);
		scrollPane1.setBackground(new Color(0, 0, 0, 0));
	//	panel.add(scrollPane1);
	}
	
	public void removeStu(){
		panel.remove(scrollPane);
		panel.remove(lblNewLabel_8);
		panel.remove(panel_2);
//		panel.remove(lblNewLabel_3);
		panel.add(scrollPane1); panel.setLayer(scrollPane1, 1);
//		panel.add(lblNewLabel_4); panel.setLayer(lblNewLabel_4, 1);
		panel.add(lblNewLabel_9, 0);
		panel.add(panel_4, 0);
		panel.repaint();
	}
	
	public void removeTea(){
		panel.remove(scrollPane1);
		panel.remove(lblNewLabel_9);
		panel.remove(panel_4);
	//	panel.remove(lblNewLabel_4);
		panel.add(scrollPane); panel.setLayer(scrollPane, 1);
//		panel.add(lblNewLabel_3); panel.setLayer(lblNewLabel_3, 1);
		panel.add(lblNewLabel_8, 0);
		panel.add(panel_2, 0);
		panel.repaint();
	}
	
	public class ExtendThreadStu extends Thread{
		private boolean tag;
		
		public ExtendThreadStu(boolean tag){
			this.tag=tag;
		}
		
		public void run(){
			if(tag){
				do{
					if(scrollPane.getY()<259)
						scrollPane.setBounds(scrollPane.getX(), scrollPane.getY()+1, scrollPane.getWidth(), scrollPane.getHeight()-1);
						panel_2.setBounds(panel_2.getX()+2, panel_2.getY(), panel_2.getWidth(), panel_2.getHeight());
						try{
							Thread.sleep(1);
							}catch(Exception e){
								e.printStackTrace();
							}
				}while(panel_2.getX()!=121);
				e1=true;
			}
			else{
				do{
					if(scrollPane.getY()>169)
						scrollPane.setBounds(scrollPane.getX(), scrollPane.getY()-1, scrollPane.getWidth(), scrollPane.getHeight()+1);
				     panel_2.setBounds(panel_2.getX()-2, panel_2.getY(), panel_2.getWidth(), panel_2.getHeight());
				     try{
				    	 Thread.sleep(1);
				     }catch(Exception e){
				    	 e.printStackTrace();
				     }
				}while(panel_2.getX()!=-535);
				e1=false;
			}
			ani1=true;
		}
	}
	
	public class ExtendThreadTea extends Thread{
        private boolean tag;
		
		public ExtendThreadTea(boolean tag){
			this.tag=tag;
		}
		
		public void run(){
			if(tag){
				do{
					if(scrollPane1.getY()<259)
						scrollPane1.setBounds(scrollPane1.getX(), scrollPane1.getY()+1, scrollPane1.getWidth(), scrollPane1.getHeight()-1);
						panel_4.setBounds(panel_4.getX()+2, panel_4.getY(), panel_4.getWidth(), panel_4.getHeight());
						try{
							Thread.sleep(1);
							}catch(Exception e){
								e.printStackTrace();
							}
				}while(panel_4.getX()!=121);
				e2=true;
			}
			else{
				do{
					if(scrollPane1.getY()>169)
						scrollPane1.setBounds(scrollPane1.getX(), scrollPane1.getY()-1, scrollPane1.getWidth(), scrollPane1.getHeight()+1);
				     panel_4.setBounds(panel_4.getX()-2, panel_4.getY(), panel_4.getWidth(), panel_4.getHeight());
				     try{
				    	 Thread.sleep(1);
				     }catch(Exception e){
				    	 e.printStackTrace();
				     }
				}while(panel_4.getX()!=-535);
				e2=false;
			}
			ani2=true;
		}
	}
	
public class ShrinkThread extends Thread{
		
		private boolean error;
		private JLabel label;
		private int height;
		
		public ShrinkThread(boolean error, JLabel label, int height){
		  this.error=error;	
		  this.label=label;
		  this.height=height;
		  
		}
		
		 public void run(){
	/*		 try {
				s.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			 while(height>=0){
				 label.setSize( label.getWidth(), height);
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
			 label.setSize(190, 15);
			 if(error){
					label.setText("  成绩填写有误, 该修改未上传！");
					label.setForeground(new Color(180, 40, 40));
	                label.setIcon(new ImageIcon(AdministratorUI.class.getResource("/img/error.png")));
			 }
			 else{
					label.setText("  本次修改成功上传！");
					label.setForeground(new Color(20, 140, 20));
	                label.setIcon(new ImageIcon(AdministratorUI.class.getResource("/img/yes.png")));
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
	
	public String getAname(long aID){
		switch((int)aID){
		case 1: return "文学院";
    	case 2: return "历史学院";
    	case 3: return "哲学院";
    	case 4: return "新闻传播学院";
    	case 5: return "法学院";
    	case 6: return "商学院经济学院";
    	case 7: return "商学院管理学院";
    	case 8: return "外国语学院";
    	case 9: return "政府管理学院";
    	case 10: return "信息管理学院";
    	case 11: return "社会学院";
    	case 12: return "软件学院";
    	case 13: return "数学系";
    	case 14: return "海外教育学院";
    	case 15: return "物理学院";
    	case 16: return "天文学院";
    	case 17: return "计算机学院";
    	case 18: return "电子学院";
    	case 19: return "现代工程学院";
    	case 20: return "环境学院";
    	case 21: return "地球科学学院";
    	case 22: return "地理与海洋学院";
    	case 23: return "大气学院";
    	case 24: return "生命科学学院";
    	case 25: return "医学院";
    	case 26: return "工程管理学院";
    	case 27: return "匡亚明学院";
    	case 28: return "建筑学院";
    	case 29: return "化学化工学院";
		}
		return null;
	}
}
