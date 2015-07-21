package presentation.studentui;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import businesslogic.studentbl.StudentDeal;
import presentation.mainui.MainUI;
import presentation.uicomponents.BackgroundPanel;
import presentation.uicomponents.ChangePhotoFrame;
import presentation.uicomponents.HeaderPanel;
import presentation.uicomponents.PhotoPanel;
import presentation.uicomponents.StretchPanel;
import presentation.userui.LoginUI;
import vo.StudentVO;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class StudentFrame {
	private int fx, fy;
	public static ChangePhotoFrame cpf;
	public static PhotoPanel panel_3;
	public StretchPanel ip;
    private BackgroundPanel panel;
    public static JFrame frame;
    JPanel innerPanel; 
    private JLabel selectedOne;
	public StudentFrame(){
		frame = new JFrame();
		frame.setBounds(100, 100, 760, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		frame.setBackground(Color.WHITE);
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
		
		final HeaderPanel panel_1 = new HeaderPanel();
	//	panel_1.setBorder(new TextFieldBorder(Color.gray));
		panel_1.setBounds(0, 0, 760, 101);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		innerPanel = new MainPanel().mainPanel();
		panel.add(innerPanel);
		
		StudentVO student = new StudentDeal().showStudent(LoginUI.userID);
		JLabel useNameLabel = new JLabel(student.name);
		useNameLabel.setForeground(Color.WHITE);
		useNameLabel.setFont(new Font("微软雅黑 Light", Font.PLAIN, 18));
		useNameLabel.setBounds(591, 15, 135, 36);
		panel_1.add(useNameLabel);
		
		MainUI.lblNewLabel_2.setText("  当前页面：主页");
		MainUI.lblNewLabel_2.setSize(300, 85);
		MainUI.lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		panel_1.add(MainUI.lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(StudentFrame.class.getResource("/img/xiaohui_vs.png")));
		lblNewLabel.setBounds(0, 15, 98, 85);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("在线");
		lblNewLabel_5.setIcon(new ImageIcon(StudentFrame.class.getResource("/img/online.png")));
		lblNewLabel_5.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(591, 59, 56, 36);
		panel_1.add(lblNewLabel_5);
		
		final JLabel lblNewLabel_6 = new JLabel("x");
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
		
		JLabel userTypeLabel = new JLabel("学生");
		userTypeLabel.setIcon(new ImageIcon(StudentFrame.class.getResource("/img/edit_user.png")));
		userTypeLabel.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
		userTypeLabel.setForeground(Color.WHITE);
		userTypeLabel.setBounds(657, 59, 103, 36);
		panel_1.add(userTypeLabel);
		
		JPanel orderPanel = new JPanel();
		orderPanel.setOpaque(true);
		orderPanel.setBackground(new Color(203, 100, 254));
		orderPanel.setBounds(0, 101, 760, 36);
		panel.add(orderPanel);
		orderPanel.setLayout(null);
		
		final JLabel mainButton = new JLabel("主页",JLabel.CENTER);
		//mainButton.set
		mainButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//		mainButton.setForeground(new Color(153, 50, 204));
				panel.repaint();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		//		mainButton.setForeground(Color.white);
				panel.repaint();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				mainButton.setForeground(new Color(153, 50, 204));
				panel_1.remove(MainUI.lblNewLabel_2);
				MainUI.lblNewLabel_2.setText("  当前页面：主页");
				panel_1.add(MainUI.lblNewLabel_2);
				panel.remove(innerPanel);
				innerPanel = new MainPanel().mainPanel();
				panel.add(innerPanel);
				if(selectedOne!=null)
					selectedOne.setForeground(Color.white);
				selectedOne=mainButton;
				frame.repaint();
			}
		});
		mainButton.setForeground(new Color(153, 50, 204));
		selectedOne=mainButton;
		mainButton.setFont(new Font("微软雅黑", Font.BOLD, 18));
		mainButton.setBounds(10, 3, 115, 30);
		orderPanel.add(mainButton);
		
		final JLabel myInfoButton = new JLabel("个人信息",JLabel.CENTER);
		//mainButton.set
		myInfoButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
	//			myInfoButton.setForeground(new Color(153, 50, 204));
				panel.repaint();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	//			myInfoButton.setForeground(Color.white);
				panel.repaint();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				myInfoButton.setForeground(new Color(153, 50, 204));
				panel_1.remove(MainUI.lblNewLabel_2);
				MainUI.lblNewLabel_2.setText("  当前页面：个人信息");
				panel_1.add(MainUI.lblNewLabel_2);
				panel.remove(innerPanel);
				innerPanel = new StudentInfoPanel().studentInfoPanel();
				panel.add(innerPanel);
				if(selectedOne!=null)
					selectedOne.setForeground(Color.white);
				selectedOne=myInfoButton;
				frame.repaint();
			}
		});
		myInfoButton.setForeground(Color.WHITE);
		myInfoButton.setFont(new Font("微软雅黑", Font.BOLD, 18));
		myInfoButton.setBounds(125, 3, 115, 30);
		orderPanel.add(myInfoButton);
		
		final JLabel myCourseButton = new JLabel("我的课程",JLabel.CENTER);
		myCourseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
	//			myCourseButton.setForeground(new Color(153, 50, 204));
				panel.repaint();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	//			myCourseButton.setForeground(Color.white);
				panel.repaint();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				myCourseButton.setForeground(new Color(153, 50, 204));
				panel_1.remove(MainUI.lblNewLabel_2);
				MainUI.lblNewLabel_2.setText("  当前页面：我的课程");
				panel_1.add(MainUI.lblNewLabel_2);
				panel.remove(innerPanel);
				innerPanel = new MyCoursePanel().myCoursePanel();
				panel.add(innerPanel);
				if(selectedOne!=null)
					selectedOne.setForeground(Color.white);
				selectedOne=myCourseButton;
				frame.repaint();
			}
		});
		myCourseButton.setForeground(Color.WHITE);
		myCourseButton.setFont(new Font("微软雅黑", Font.BOLD, 18));
		myCourseButton.setBounds(250, 3, 115, 30);
		orderPanel.add(myCourseButton);
		
		final JLabel allCourseButton = new JLabel("全校课程",JLabel.CENTER);
		allCourseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
		//		allCourseButton.setForeground(new Color(153, 50, 204));
				panel.repaint();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		//		allCourseButton.setForeground(Color.white);
				panel.repaint();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				allCourseButton.setForeground(new Color(153, 50, 204));
				panel_1.remove(MainUI.lblNewLabel_2);
				MainUI.lblNewLabel_2.setText("  当前页面：全校课程");
				panel_1.add(MainUI.lblNewLabel_2);
				panel.remove(innerPanel);
				innerPanel = new AllCoursePanel().allCoursePanel();
				panel.add(innerPanel);
				if(selectedOne!=null)
					selectedOne.setForeground(Color.white);
				selectedOne=allCourseButton;
				frame.repaint();
			}
		});
		allCourseButton.setForeground(Color.WHITE);
		allCourseButton.setFont(new Font("微软雅黑", Font.BOLD, 18));
		allCourseButton.setBounds(375, 3, 115, 30);
		orderPanel.add(allCourseButton);
		
		final JLabel selectCourseButton = new JLabel("选课/退选",JLabel.CENTER);
		selectCourseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
	//			selectCourseButton.setForeground(new Color(153, 50, 204));
				panel.repaint();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	//			selectCourseButton.setForeground(Color.white);
				panel.repaint();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				selectCourseButton.setForeground(new Color(153, 50, 204));
				panel_1.remove(MainUI.lblNewLabel_2);
				MainUI.lblNewLabel_2.setText("  当前页面：选课/退选");
				panel_1.add(MainUI.lblNewLabel_2);
				panel.remove(innerPanel);
				innerPanel = new CourseSelectionPanel().selectCoursePanel();
				panel.add(innerPanel);
				if(selectedOne!=null)
					selectedOne.setForeground(Color.white);
				selectedOne=selectCourseButton;
				frame.repaint();
			}
		});
		selectCourseButton.setForeground(Color.WHITE);
		selectCourseButton.setFont(new Font("微软雅黑", Font.BOLD, 18));
		selectCourseButton.setBounds(500, 3, 115, 30);
		orderPanel.add(selectCourseButton);
		
	}
	
	
}
