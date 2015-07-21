package presentation.departmentofficeteacherui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import presentation.mainui.MainUI;
import presentation.uicomponents.BackgroundPanel;
import presentation.uicomponents.ChangePhotoFrame;
import presentation.uicomponents.HeaderPanel;
import presentation.uicomponents.LoginBtn;
import presentation.uicomponents.PhotoPanel;
import presentation.uicomponents.RoundRectPanel;
import presentation.uicomponents.StretchPanel;
import presentation.uicomponents.TextFieldBorder;
import presentation.userui.LoginUI;
import util.Point;
import vo.CourseVO;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JTable;
import javax.swing.JLayeredPane;
import javax.swing.JButton;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import businesslogic.coursebl.CourseDealController;

import businesslogic.teacherbl.TeacherDealController;
public class DepartmentOfficeTeacherUI {
	private JFrame frame;
	private int fx, fy;
	private int bfx;
	private JTable table;
	public static ChangePhotoFrame cpf;
	public static PhotoPanel panel_3;
	private JButton button;
	private JLabel label, label_1, label_2, down;
	private JTextField textField;
	public StretchPanel ip;
    private BackgroundPanel panel;
    private JScrollPane scrollPane, scrollPane_1;
    private JButton submit;
    private int last=-1, er=-1, ec=-1;
    private Vector<Vector<String>> tableValue;
    private DefaultTableModel tableModel;
    private JLabel lblNewLabel_8;
    private DefaultTableCellRenderer  tcr;
    private ArrayList<Point> list=new ArrayList<Point>();
    private final String WARN = "¸ñÊ½´íÎó£¬ÇëÊäÈëÊý×Ö";
    private final String OUT_OF_RANGE_1 = "³¬³ö·¶Î§£¬1-10";
    private final String OUT_OF_RANGE_2 = "³¬³ö·¶Î§£¬1-1000";
    private final String NOT_COMPLETE = "ÇëÌá½»ÍêÕûÐÅÏ¢";
    
    
    private JMenuBar jmb;
    private JMenu jm; 
    private JMenuItem jmi1;
    private JMenuItem jmi2;
    private JTabbedPane tabbedPane;
    private JLabel lblNewLabel_3;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JPanel panel_2,panel_10,panel_4,panel_5,panel_6,panel_7,panel_8,panel_9;
    private JTextArea textArea,textArea_1,textArea_2,textArea_3,textArea_4,textArea_5,textArea_6,textArea_7;
    
    private JLabel label_411,label_52,label_41,label_51,label_61,label_71,
    label_81,label_91,label_101,label_111,label_121,label_131,label_141,label_151,label_161,label_171,label_181,label_222;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public DepartmentOfficeTeacherUI() {
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
		
		JLabel lblNewLabel_1 = new JLabel("Íõ¶«Ï¼");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(591, 15, 135, 36);
		panel_1.add(lblNewLabel_1);
		
		MainUI.lblNewLabel_2.setText("  ¿Î³Ì´ó¸Ù");
		panel_1.add(MainUI.lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(DepartmentOfficeTeacherUI.class.getResource("/img/xiaohui_vs.png")));
		lblNewLabel.setBounds(0, 15, 98, 85);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("\u5728\u7EBF");
		lblNewLabel_5.setIcon(new ImageIcon(DepartmentOfficeTeacherUI.class.getResource("/img/online.png")));
		lblNewLabel_5.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.PLAIN, 12));
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
		lblNewLabel_6.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 22));
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
		
		
		
		JLabel lblNewLabel_7 = new JLabel("ÔºÏµ½ÌÎñÔ±");
		lblNewLabel_7.setIcon(new ImageIcon(DepartmentOfficeTeacherUI.class.getResource("/img/edit_user.png")));
		lblNewLabel_7.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.PLAIN, 12));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(657, 59, 103, 36);
		panel_1.add(lblNewLabel_7);
		
		final JLabel lblNewLabel_2 = new JLabel("\u4E1A\u52A1\u603B\u89C8\uFF1A");
		lblNewLabel_2.setForeground(new Color(133, 30, 184));
		lblNewLabel_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(22, 121, 60, 15);
		panel.add(lblNewLabel_2);
		
		final JLayeredPane layeredPane = new RoundRectPanel();
		layeredPane.setOpaque(true);
		layeredPane.setBackground(new Color(203, 100, 254));
		layeredPane.setBounds(94, 111, 204, 36);
		panel.add(layeredPane);
		layeredPane.setLayout(null);

		//ÒÔÏÂÊÇ²»Ò»ÑùµÄµØ·½
		MainUI.lblNewLabel_2.setText(" »¶Ó­Äú£¡");
				
		final JLabel label_3 = new JLabel("\u53D1\u5E03\u9662\u7CFB\u6559\u5B66\u8BA1\u5212");
		label_3.setBounds(10, 10, 102, 15);
		label_3.setForeground(Color.white);
		layeredPane.add(label_3);
		label_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_3.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_3.setForeground(Color.white);
				label_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
				jm.setForeground(Color.black);
				jm.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
				MainUI.lblNewLabel_2.setText("ÔºÏµ½ÌÑ§¼Æ»®");
				toPlan();
			}
			public void mousePressed(MouseEvent e){
				label_3.setForeground(Color.white);
			}
		});
		
		jmb = new JMenuBar();
		jmb.setBorderPainted(false);
		jmb.setBounds(120, 6, 60, 25);
		jmb.setBackground(new Color(203, 100, 254));
		
		jm = new JMenu("¿Î³Ì´¦Àí");
		jm.setBackground(new Color(203, 100, 254));
		jm.setForeground(Color.black);
		jm.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		
		jmi1 = new JMenuItem("·¢²¼¿Î³Ì");
		jmi1.setBackground(new Color(228, 246, 222));
		jmi1.setPreferredSize(new Dimension(60,30));
		jmi1.setForeground(Color.BLACK);
		jmi1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		jmi1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jm.setForeground(Color.white);
				jm.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
				label_3.setForeground(Color.black);
				label_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
				MainUI.lblNewLabel_2.setText(" ·¢²¼¿Î³Ì");
				toPublishCourse();
			}
		});
		
		jmi2 = new JMenuItem("²é¿´¿Î³Ì");
		jmi2.setBackground(new Color(228, 246, 222));
		jmi2.setPreferredSize(new Dimension(70,30));
		jmi2.setForeground(Color.black);
		jmi2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		jmi2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jm.setForeground(Color.white);
				jm.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
				label_3.setForeground(Color.black);
				label_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
				MainUI.lblNewLabel_2.setText(" ²é¿´¿Î³Ì");
				toCheckCourse();
			}
		});

		
		jm.add(jmi1);
		jm.add(jmi2);
		jmb.add(jm);
		layeredPane.add(jmb);
		
				
		
		//ÒÔÏÂÊÇ¡±½ÌÑ§¼Æ»®¡°µÄ×é¼þ
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		tabbedPane.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		tabbedPane.setBounds(74, 174, 676, 338);
		panel.add(tabbedPane);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tabbedPane.addTab("´óÒ»ÉÏ", null, panel_2, null);		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setMargin(new Insets(1, 1, 1, 1));
		textArea.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 13));
		textArea.setEditable(false);
		textArea.setForeground(new Color(153, 50, 204));
		textArea.setBounds(133, 31, 498, 214);
		panel_2.add(textArea);		
		final JLabel label_4 = new JLabel("  \u7F16  \u8F91");
		label_4.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_4.setOpaque(true);
		label_4.setBackground(new Color(163, 54, 214));
	    label_4.setForeground(Color.white);
		label_4.setBounds(453, 270, 53, 15);
		panel_2.add(label_4);		
		final JLabel label_5 = new JLabel("");
		label_5.setBackground(new Color(163, 54, 214));
	    label_5.setForeground(Color.white);
		label_5.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_5.setBounds(551, 270, 53, 15);
		panel_2.add(label_5);
		label_4.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_4.setText("");
				label_5.setText("   \u63D0  \u4EA4");
				label_5.setOpaque(true);
				label_4.setOpaque(false);
				textArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				textArea.setEditable(true);
			}
		});
		label_5.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_5.setText("");
				label_4.setText("   \u7F16  \u8F91");
				label_4.setOpaque(true);
				label_5.setOpaque(false);
				textArea.setBorder(null);
				textArea.setEditable(false);
				String a1,a2,a3,a4,a5,a6,a7,a8;
				a1=textArea.getText();
				a2=textArea_1.getText();
				a3=textArea_2.getText();
				a4=textArea_3.getText();
				a5=textArea_4.getText();
				a6=textArea_5.getText();
				a7=textArea_6.getText();
				a8=textArea_7.getText();
				String r = ManagePlan.publishPlan(a1, a2, a3, a4, a5, a6, a7, a8);
				label_111.setText(r);
			}
		});
		
		
		
		panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setLayout(null);
		tabbedPane.addTab("´óÒ»ÏÂ", null, panel_10, null);		
		textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		textArea_1.setMargin(new Insets(1, 1, 1, 1));
		textArea_1.setForeground(new Color(153, 50, 204));
		textArea_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 13));
		textArea_1.setEditable(false);
		textArea_1.setBounds(133, 31, 498, 214);
		panel_10.add(textArea_1);		
		final JLabel label_6 = new JLabel("   \u7F16  \u8F91");
		label_6.setOpaque(true);
		label_6.setBackground(new Color(163, 54, 214));
	    label_6.setForeground(Color.white);
		label_6.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_6.setBounds(453, 270, 53, 15);
		panel_10.add(label_6);		
		final JLabel label_7 = new JLabel("");
		label_7.setBackground(new Color(163, 54, 214));
	    label_7.setForeground(Color.white);
		label_7.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_7.setBounds(551, 270, 53, 15);
		panel_10.add(label_7);
		label_6.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_6.setText("");
				label_7.setText("   \u63D0  \u4EA4");
				label_7.setOpaque(true);
				label_6.setOpaque(false);
				textArea_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				textArea_1.setEditable(true);
			}
		});
		label_7.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_7.setText("");
				label_6.setText("   \u7F16  \u8F91");
				label_6.setOpaque(true);
				label_7.setOpaque(false);
				textArea_1.setBorder(null);
				textArea_1.setEditable(false);
				String a1,a2,a3,a4,a5,a6,a7,a8;
				a1=textArea.getText();
				a2=textArea_1.getText();
				a3=textArea_2.getText();
				a4=textArea_3.getText();
				a5=textArea_4.getText();
				a6=textArea_5.getText();
				a7=textArea_6.getText();
				a8=textArea_7.getText();
				String r = ManagePlan.publishPlan(a1, a2, a3, a4, a5, a6, a7, a8);
				label_111.setText(r);
			}
		});
			
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setLayout(null);
		tabbedPane.addTab("´ó¶þÉÏ", null, panel_4, null);		
		textArea_2 = new JTextArea();
		textArea_2.setMargin(new Insets(1, 1, 1, 1));
		textArea_2.setLineWrap(true);
		textArea_2.setForeground(new Color(153, 50, 204));
		textArea_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 13));
		textArea_2.setEditable(false);
		textArea_2.setBounds(133, 31, 498, 214);
		panel_4.add(textArea_2);		
		final JLabel label_8 = new JLabel("   \u7F16  \u8F91");
		label_8.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_8.setOpaque(true);
		label_8.setBackground(new Color(163, 54, 214));
	    label_8.setForeground(Color.white);
		label_8.setBounds(453, 270, 53, 15);
		panel_4.add(label_8);		
		final JLabel label_9 = new JLabel("");
		label_9.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_9.setBounds(551, 270, 53, 15);
		label_9.setBackground(new Color(163, 54, 214));
	    label_9.setForeground(Color.white);
		panel_4.add(label_9);
		label_8.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_8.setText("");
				label_9.setText("   \u63D0  \u4EA4");
				label_9.setOpaque(true);
				label_8.setOpaque(false);
				textArea_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				textArea_2.setEditable(true);
			}
		});
		label_9.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_9.setText("");
				label_8.setText("   \u7F16  \u8F91");
				label_8.setOpaque(true);
				label_9.setOpaque(false);
				textArea_2.setBorder(null);
				textArea_2.setEditable(false);
				String a1,a2,a3,a4,a5,a6,a7,a8;
				a1=textArea.getText();
				a2=textArea_1.getText();
				a3=textArea_2.getText();
				a4=textArea_3.getText();
				a5=textArea_4.getText();
				a6=textArea_5.getText();
				a7=textArea_6.getText();
				a8=textArea_7.getText();
				String r = ManagePlan.publishPlan(a1, a2, a3, a4, a5, a6, a7, a8);
				label_111.setText(r);
			}
		});
		
		
		panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setLayout(null);
		tabbedPane.addTab("´ó¶þÏÂ", null, panel_5, null);		
		textArea_3 = new JTextArea();
		textArea_3.setLineWrap(true);
		textArea_3.setMargin(new Insets(1, 1, 1, 1));
		textArea_3.setForeground(new Color(153, 50, 204));
		textArea_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 13));
		textArea_3.setEditable(false);
		textArea_3.setBounds(133, 31, 498, 214);
		panel_5.add(textArea_3);		
		final JLabel label_10 = new JLabel("   \u7F16  \u8F91");
		label_10.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_10.setBounds(453, 270, 53, 15);
		label_10.setOpaque(true);
		label_10.setBackground(new Color(163, 54, 214));
	    label_10.setForeground(Color.white);
		panel_5.add(label_10);		
		final JLabel label_11 = new JLabel("");
		label_11.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_11.setBounds(551, 270, 53, 15);
		label_11.setBackground(new Color(163, 54, 214));
	    label_11.setForeground(Color.white);
		panel_5.add(label_11);
		label_10.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_10.setText("");
				label_11.setText("   \u63D0  \u4EA4");
				label_11.setOpaque(true);
				label_10.setOpaque(false);
				textArea_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				textArea_3.setEditable(true);
			}
		});
		label_11.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_11.setText("");
				label_10.setText("   \u7F16  \u8F91");
				label_10.setOpaque(true);
				label_11.setOpaque(false);
				textArea_3.setBorder(null);
				textArea_3.setEditable(false);
				String a1,a2,a3,a4,a5,a6,a7,a8;
				a1=textArea.getText();
				a2=textArea_1.getText();
				a3=textArea_2.getText();
				a4=textArea_3.getText();
				a5=textArea_4.getText();
				a6=textArea_5.getText();
				a7=textArea_6.getText();
				a8=textArea_7.getText();
				String r = ManagePlan.publishPlan(a1, a2, a3, a4, a5, a6, a7, a8);
				label_111.setText(r);
				}
		});
		
		
		panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setLayout(null);
		tabbedPane.addTab("´óÈýÉÏ", null, panel_6, null);		
		textArea_4 = new JTextArea();
		textArea_4.setLineWrap(true);
		textArea_4.setMargin(new Insets(1, 1, 1, 1));
		textArea_4.setForeground(new Color(153, 50, 204));
		textArea_4.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 13));
		textArea_4.setEditable(false);
		textArea_4.setBounds(133, 31, 498, 214);
		panel_6.add(textArea_4);		
		final JLabel label_12 = new JLabel("   \u7F16  \u8F91");
		label_12.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_12.setBounds(453, 270, 53, 15);
		label_12.setOpaque(true);
		label_12.setBackground(new Color(163, 54, 214));
	    label_12.setForeground(Color.white);
		panel_6.add(label_12);		
		final JLabel label_13 = new JLabel("");
		label_13.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_13.setBounds(551, 270, 53, 15);
		label_13.setBackground(new Color(163, 54, 214));
	    label_13.setForeground(Color.white);
		panel_6.add(label_13);
		label_12.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_12.setText("");
				label_13.setText("   \u63D0  \u4EA4");
				label_13.setOpaque(true);
				label_12.setOpaque(false);
				textArea_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				textArea_4.setEditable(true);
			}
		});
		label_13.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_13.setText("");
				label_12.setText("   \u7F16  \u8F91");
				label_12.setOpaque(true);
				label_13.setOpaque(false);
				textArea_4.setBorder(null);
				textArea_4.setEditable(false);
				String a1,a2,a3,a4,a5,a6,a7,a8;
				a1=textArea.getText();
				a2=textArea_1.getText();
				a3=textArea_2.getText();
				a4=textArea_3.getText();
				a5=textArea_4.getText();
				a6=textArea_5.getText();
				a7=textArea_6.getText();
				a8=textArea_7.getText();
				String r = ManagePlan.publishPlan(a1, a2, a3, a4, a5, a6, a7, a8);
				label_111.setText(r);
				}
		});
		
		
		panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setLayout(null);
		tabbedPane.addTab("´óÈýÏÂ", null, panel_7, null);		
		textArea_5 = new JTextArea();
		textArea_5.setLineWrap(true);
		textArea_5.setMargin(new Insets(1, 1, 1, 1));
		textArea_5.setForeground(new Color(153, 50, 204));
		textArea_5.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 13));
		textArea_5.setEditable(false);
		textArea_5.setBounds(133, 31, 498, 214);
		panel_7.add(textArea_5);		
		final JLabel label_14 = new JLabel("   \u7F16  \u8F91");
		label_14.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_14.setBounds(453, 270, 53, 15);
		label_14.setOpaque(true);
		label_14.setBackground(new Color(163, 54, 214));
	    label_14.setForeground(Color.white);
		panel_7.add(label_14);		
		final JLabel label_15 = new JLabel("");
		label_15.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_15.setBounds(551, 270, 53, 15);
		label_15.setBackground(new Color(163, 54, 214));
	    label_15.setForeground(Color.white);
		panel_7.add(label_15);
		label_14.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_14.setText("");
				label_15.setText("   \u63D0  \u4EA4");
				label_15.setOpaque(true);
				label_14.setOpaque(false);
				textArea_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				textArea_5.setEditable(true);
			}
		});
		label_15.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_15.setText("");
				label_14.setText("   \u7F16  \u8F91");
				label_14.setOpaque(true);
				label_15.setOpaque(false);
				textArea_5.setBorder(null);
				textArea_5.setEditable(false);
				String a1,a2,a3,a4,a5,a6,a7,a8;
				a1=textArea.getText();
				a2=textArea_1.getText();
				a3=textArea_2.getText();
				a4=textArea_3.getText();
				a5=textArea_4.getText();
				a6=textArea_5.getText();
				a7=textArea_6.getText();
				a8=textArea_7.getText();
				String r = ManagePlan.publishPlan(a1, a2, a3, a4, a5, a6, a7, a8);
				label_111.setText(r);
				}
		});
		
		
		panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tabbedPane.addTab("´óËÄÉÏ", null, panel_8, null);		
		textArea_6 = new JTextArea();
		textArea_6.setLineWrap(true);
		textArea_6.setMargin(new Insets(1, 1, 1, 1));
		textArea_6.setForeground(new Color(153, 50, 204));
		textArea_6.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 13));
		textArea_6.setEditable(false);
		textArea_6.setBounds(133, 31, 498, 214);
		panel_8.add(textArea_6);		
		final JLabel label_16 = new JLabel("   \u7F16  \u8F91");
		label_16.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_16.setBounds(453, 270, 53, 15);
		label_16.setOpaque(true);
		label_16.setBackground(new Color(163, 54, 214));
	    label_16.setForeground(Color.white);
		panel_8.add(label_16);		
		final JLabel label_17 = new JLabel("");
		label_17.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_17.setBounds(551, 270, 53, 15);
		label_17.setBackground(new Color(163, 54, 214));
	    label_17.setForeground(Color.white);
		panel_8.add(label_17);
		label_16.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_16.setText("");
				label_17.setText("   \u63D0  \u4EA4");
				label_17.setOpaque(true);
				label_16.setOpaque(false);
				textArea_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				textArea_6.setEditable(true);
			}
		});
		label_17.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_17.setText("");
				label_16.setText("   \u7F16  \u8F91");
				label_16.setOpaque(true);
				label_17.setOpaque(false);
				textArea_6.setBorder(null);
				textArea_6.setEditable(false);
				String a1,a2,a3,a4,a5,a6,a7,a8;
				a1=textArea.getText();
				a2=textArea_1.getText();
				a3=textArea_2.getText();
				a4=textArea_3.getText();
				a5=textArea_4.getText();
				a6=textArea_5.getText();
				a7=textArea_6.getText();
				a8=textArea_7.getText();
				String r = ManagePlan.publishPlan(a1, a2, a3, a4, a5, a6, a7, a8);
				label_111.setText(r);
				}
		});
		
		
		panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		panel_9.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tabbedPane.addTab("´óËÄÏÂ", null, panel_9, null);		
		textArea_7 = new JTextArea();
		textArea_7.setLineWrap(true);
		textArea_7.setMargin(new Insets(1, 1, 1, 1));
		textArea_7.setForeground(new Color(153, 50, 204));
		textArea_7.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 13));
		textArea_7.setBounds(133, 31, 498, 214);
		textArea_7.setEditable(false);
		panel_9.add(textArea_7);		
		final JLabel label_18 = new JLabel("   \u7F16  \u8F91");
		label_18.setBounds(453, 270, 53, 15);
		label_18.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_18.setOpaque(true);
		label_18.setBackground(new Color(163, 54, 214));
	    label_18.setForeground(Color.white);
		panel_9.add(label_18);		
		final JLabel label_19 = new JLabel("");
		label_19.setBounds(551, 270, 53, 15);
		label_19.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_19.setBackground(new Color(163, 54, 214));
	    label_19.setForeground(Color.white);
		panel_9.add(label_19);
		label_18.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_18.setText("");
				label_19.setText("   \u63D0  \u4EA4");
				label_19.setOpaque(true);
				label_18.setOpaque(false);
				textArea_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				textArea_7.setEditable(true);
				
			}
		});
		label_19.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_19.setText("");
				label_18.setText("   \u7F16  \u8F91");
				label_18.setOpaque(true);
				label_19.setOpaque(false);
				textArea_7.setBorder(null);
				textArea_7.setEditable(false);
				String a1,a2,a3,a4,a5,a6,a7,a8;
				a1=textArea.getText();
				a2=textArea_1.getText();
				a3=textArea_2.getText();
				a4=textArea_3.getText();
				a5=textArea_4.getText();
				a6=textArea_5.getText();
				a7=textArea_6.getText();
				a8=textArea_7.getText();
				String result = ManagePlan.publishPlan(a1, a2, a3, a4, a5, a6, a7, a8);
				label_111.setText(result);
			}
		});
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(566, 149, 184, 15);
		panel.add(lblNewLabel_3);
		
		
		//ÒÔÏÂÊÇ¡°¿Î³Ì¹ÜÀí¡±ÖÐµÄ¡°·¢²¼¿Î³Ì¡±µÄ×é¼þ
		
		
		textField_1 = new JTextField();
		textField_1.setBorder(new TextFieldBorder(Color.lightGray));
		textField_1.setBounds(385, 190, 166, 21);
		//panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new TextFieldBorder(Color.lightGray));
		textField_2.setColumns(10);
		textField_2.setBounds(385, 230, 166, 21);
		//panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new TextFieldBorder(Color.lightGray));
		textField_3.setColumns(10);
		textField_3.setBounds(385, 270, 166, 21);
		//panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBorder(new TextFieldBorder(Color.lightGray));
		textField_4.setColumns(10);
		textField_4.setBounds(385, 310, 166, 21);
		//panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBorder(new TextFieldBorder(Color.lightGray));
		textField_5.setColumns(10);
		textField_5.setBounds(385, 350, 166, 21);
		//panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBorder(new TextFieldBorder(Color.lightGray));
		textField_6.setColumns(10);
		textField_6.setBounds(385, 390, 166, 21);
		//panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBorder(new TextFieldBorder(Color.lightGray));
		textField_7.setColumns(10);
		textField_7.setBounds(385, 430, 166, 21);
		//panel.add(textField_7);
		
		label_41 = new JLabel("\u8BFE\u7A0B\u7F16\u53F7\uFF1A",SwingConstants.RIGHT);
		label_41.setBounds(269, 190, 94, 15);
		//panel.add(label_41);
		
		label_51 = new JLabel("\u8BFE\u7A0B\u540D\u79F0\uFF1A");
		label_51.setHorizontalAlignment(SwingConstants.RIGHT);
		label_51.setBounds(289, 230, 74, 15);
		//panel.add(label_51);
		
		label_61 = new JLabel("\u4EFB\u8BFE\u8001\u5E08\u5DE5\u53F7\uFF1A", SwingConstants.RIGHT);
		label_61.setBounds(269, 270, 94, 15);
		//panel.add(label_61);
		
		label_71 = new JLabel("\u5B66\u5206\uFF1A", SwingConstants.RIGHT);
		label_71.setBounds(269, 310, 94, 15);
		//panel.add(label_71);
		
		label_81 = new JLabel("\u4E0A\u8BFE\u65F6\u95F4\uFF1A", SwingConstants.RIGHT);
		label_81.setBounds(269, 350, 94, 15);
		//panel.add(label_81);
		
		label_91 = new JLabel("\u4E0A\u8BFE\u5730\u70B9\uFF1A", SwingConstants.RIGHT);
		label_91.setBounds(269, 390, 94, 15);
		//panel.add(label_91);
		
		label_101 = new JLabel("\u9650\u5236\u4EBA\u6570\uFF1A", SwingConstants.RIGHT);
		label_101.setBounds(269, 430, 94, 15);
		//panel.add(label_101);
		
		label_111 = new JLabel("");
		label_111.setForeground(Color.RED);
		label_111.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_111.setBounds(597, 121, 131, 15);
		panel.add(label_111);
		
		
		label_121 = new JLabel("");
		label_121.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.PLAIN, 12));
		label_121.setForeground(Color.RED);
		label_121.setBounds(561, 190, 160, 15);
		//panel.add(label_121);
		
		label_131 = new JLabel("");
		label_131.setForeground(Color.RED);
		label_131.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.PLAIN, 12));
		label_131.setBounds(561, 230, 160, 15);
		//panel.add(label_131);
		
		label_141 = new JLabel("");
		label_141.setForeground(Color.RED);
		label_141.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.PLAIN, 12));
		label_141.setBounds(561, 270, 160, 15);
		//panel.add(label_141);
		
		label_151 = new JLabel("");
		label_151.setForeground(Color.RED);
		label_151.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.PLAIN, 12));
		label_151.setBounds(561, 310, 160, 15);
		//panel.add(label_151);
		
		label_161 = new JLabel("");
		label_161.setForeground(Color.RED);
		label_161.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.PLAIN, 12));
		label_161.setBounds(561, 350, 160, 15);
		//panel.add(label_161);
		
		label_171 = new JLabel("");
		label_171.setForeground(Color.RED);
		label_171.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.PLAIN, 12));
		label_171.setBounds(561, 390, 160, 15);
		//panel.add(label_171);
		
		label_181 = new JLabel("");
		label_181.setForeground(Color.RED);
		label_181.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.PLAIN, 12));
		label_181.setBounds(561, 430, 160, 15);
		//panel.add(label_181);
		
		button = new JButton("·¢²¼");
		button.setBackground(new Color(153, 50, 204));
		button.setForeground(Color.white);
		button.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		button.setBounds(416, 488, 93, 23);
		//panel.add(button);
		//³õ²½ÅÐ¶ÏÌîÐ´µÄ¿Î³ÌÐÅÏ¢ÊÇ·ñÕýÈ·
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String course_id = textField_1.getText().trim();				
				String course_name = textField_2.getText().trim();
				String credit = textField_4.getText().trim();				
				String teacher_id = textField_3.getText().trim();				
				String time = textField_5.getText().trim();
				String place = textField_6.getText().trim();
				String number_limit = textField_7.getText().trim();
				if(course_id==""||course_name==""||credit==""||teacher_id==""||time==""
						||place==""||number_limit=="")
				{
					label_11.setText(NOT_COMPLETE);
				}
				else{
					String course_id_2 = null;
					String credit_2 = null;
					String teacher_id_2 = null;
					String number_limit_2 = null;
					try{
						int a = Integer.parseInt(course_id);
					}catch(NumberFormatException arg1){
						course_id_2 = WARN;
					}
					
					try{
						int a = Integer.parseInt(teacher_id);
					}catch(NumberFormatException arg2){
						teacher_id_2 = WARN;
					}
					try{
						int a = Integer.parseInt(credit);
						if(a>0&&a<10);
						else
							credit_2 = OUT_OF_RANGE_1;
					}catch(NumberFormatException arg3){
						credit_2 = WARN;
					}
					try{
						int a = Integer.parseInt(number_limit);
						if(a>0&&a<10001);
						else
							number_limit_2 = OUT_OF_RANGE_2;
					}catch(NumberFormatException arg4){
						number_limit_2 = WARN;
					}
					if(course_id_2!=null)
						label_121.setText(course_id_2);
					if(teacher_id_2!=null)
						label_141.setText(teacher_id_2);
					if(credit_2!=null)
					    label_151.setText(credit_2);
					if(number_limit_2!=null)
					    label_181.setText(number_limit_2);
					else{
						String result = PublishCourse.publishCourse(course_id,course_name,credit,teacher_id,time,place,number_limit);
						label_111.setText(result);
					}
				}
				
				
			}
			
		});
		
		label_52 = new JLabel("");
		//ÒÔÏÂÊÇ¡®¿Î³Ì¹ÜÀí¡¯"²é¿´¿Î³Ì"×é¼þ
		
		Vector<String> columnname=new Vector<String>();
		columnname.add("¿Î³Ì±àºÅ");
		columnname.add("¿Î³ÌÃû³Æ");
		columnname.add("ÈÎ¿ÎÀÏÊ¦¹¤ºÅ");
		columnname.add("ÉÏ¿ÎÊ±¼ä");
		columnname.add("ÉÏ¿ÎµØµã");
		tableValue=new Vector<Vector<String>>();
		long aID=new TeacherDealController().showHisAID(LoginUI.userID);
		ArrayList<CourseVO> courselist=new CourseDealController().showCourse(aID+"");
		if(courselist==null){
			 label_52.setText( "ÄãµÄÑ§ÔºÉÐÎ´ÓµÓÐÈÎºÎ¿Î³Ì£¬ÇëÏÈ·¢²¼¿Î³Ì");
			 
		}
		
		else{
			for(int i=0;i<=courselist.size()-1;i++){
				Vector<String> row=new Vector<String>();
				row.add(courselist.get(i).ID+"");
				row.add(courselist.get(i).courseName);
				row.add(courselist.get(i).teacherID);
				row.add(courselist.get(i).time);
				row.add(courselist.get(i).location);
				tableValue.add(row);
			}
		}
		tableModel=new DefaultTableModel(tableValue,columnname){
			
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int rowindex, int colindex){
				if(colindex==0 || colindex==1)
					return false;
				return true;
			}
		};
		final ArrayList<Point> list4=new ArrayList<Point>();
		table=new JTable(tableModel);
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
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
			}
			
		});
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer() {

			
			private static final long serialVersionUID = 1L;

			public Component getTableCellRendererComponent(JTable table, Object value,

			   boolean isSelected, boolean hasFocus, int row, int column){
				 Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			     return cell;
			 }

  };
		table.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
        table.getColumn("¿Î³Ì±àºÅ").setCellRenderer(tcr);
				
        scrollPane = new JScrollPane(table);
		scrollPane.setBounds(121, 168, 540, 313);
		//panel.add(scrollPane);
		
		label_411 = new JLabel("  \u4FEE   \u6539");
		label_411.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_411.setBounds(433, 490, 54, 25);
		label_411.setOpaque(true);
		label_411.setBackground(new Color(153, 50, 204));
		label_411.setForeground(Color.white);
		//panel.add(label_411);
		
		label_52.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.PLAIN, 12));
		label_52.setHorizontalAlignment(SwingConstants.RIGHT);
		label_52.setForeground(Color.RED);
		label_52.setBounds(360, 121, 300, 21);
		//panel.add(label_52);
		label_411.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label_411.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN,12));
				int row = table.getSelectedRow();
				if(row<0)
					label_52.setText("ÇëÏÈÑ¡ÖÐÒªÐÞ¸ÄµÄÐÐ£¡");
				else{			
					label_52.setText("");
					String course_id = (String) table.getValueAt(row, 0);
					String course_name = (String) table.getValueAt(row, 1);
					String teacher_id = (String) table.getValueAt(row, 2);
					String time = (String) table.getValueAt(row, 3);
					String place = (String) table.getValueAt(row, 4);
					UpdateCourseUI u = new UpdateCourseUI();
					u.update(course_id,course_name,teacher_id,time,place);
				}
			}
			@Override
			public void mousePressed(MouseEvent e){
				label_411.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD,12));
			}
		});
		ManagePlan m = new ManagePlan();
		String plan[] = m.showTeachPlan();
		textArea.setText(plan[0]);
		textArea_1.setText(plan[1]);
		textArea_2.setText(plan[2]);
		textArea_3.setText(plan[3]);
		textArea_4.setText(plan[4]);
		textArea_5.setText(plan[5]);
		textArea_6.setText(plan[6]);
		textArea_7.setText(plan[7]);
		panel.repaint();
	}
	
	private void toPlan(){
		int x = 270;
		int y = 190;
		for(int i = 0;i<3;i++){
			for(int j = 0;j<7;j++){
				panel.remove(panel.getComponentAt(x,y));
				y += 40;
			}
			y = 190;
			x += 200;
		}
		panel.remove(panel.getComponentAt(121, 168));
		panel.remove(panel.getComponentAt(433, 508));
		panel.remove(panel.getComponentAt(558, 121));
		panel.remove(panel.getComponentAt(74, 174));
		panel.remove(panel.getComponentAt(566, 149));
		panel.remove(label_51);
		panel.remove(label_111);
		ManagePlan m = new ManagePlan();
		String plan[] = m.showTeachPlan();
		textArea.setText(plan[0]);
		textArea_1.setText(plan[1]);
		textArea_2.setText(plan[2]);
		textArea_3.setText(plan[3]);
		textArea_4.setText(plan[4]);
		textArea_5.setText(plan[5]);
		textArea_6.setText(plan[6]);
		textArea_7.setText(plan[7]);
		panel.add(label_111);
		label_111.setText("");
		panel.add(tabbedPane);
		panel.add(lblNewLabel_3);
		panel.repaint();
	}
	private void toPublishCourse(){
		int x = 270;
		int y = 190;
		for(int i = 0;i<3;i++){
			for(int j = 0;j<7;j++){
				panel.remove(panel.getComponentAt(x,y));
				y += 40;
			}
			y = 190;
			x += 200;
		}
		panel.remove(panel.getComponentAt(121, 168));
		panel.remove(panel.getComponentAt(433, 508));
		panel.remove(panel.getComponentAt(558, 121));
		panel.remove(panel.getComponentAt(74, 174));
		panel.remove(panel.getComponentAt(566, 149));
		panel.remove(label_51);
		panel.remove(label_111);
		label_111.setText("");
		panel.add(textField_1);
		panel.add(textField_2);
		panel.add(textField_3);
		panel.add(textField_4);
		panel.add(textField_5);
		panel.add(textField_6);
		panel.add(textField_7);
		panel.add(label_41);
		panel.add(label_51);
		panel.add(label_61);
		panel.add(label_71);
		panel.add(label_81);
		panel.add(label_91);
		panel.add(label_101);
		panel.add(label_111);
		panel.add(label_121);
		panel.add(label_131);
		panel.add(label_141);
		panel.add(label_151);
		panel.add(label_161);
		panel.add(label_171);
		panel.add(label_181);
		panel.add(button);
		panel.repaint();
	}
	
	private void toCheckCourse(){
		int x = 270;
		int y = 190;
		for(int i = 0;i<3;i++){
			for(int j = 0;j<7;j++){
				panel.remove(panel.getComponentAt(x,y));
				y += 40;
			}
			y = 190;
			x += 200;
		}
		panel.remove(panel.getComponentAt(121, 168));
		panel.remove(panel.getComponentAt(433, 508));
		panel.remove(label_51);
		panel.remove(label_111);
		panel.remove(panel.getComponentAt(558, 121));
		panel.remove(panel.getComponentAt(74, 174));
		panel.remove(panel.getComponentAt(566, 149));
		panel.add(scrollPane);
		panel.add(label_52);
		panel.add(label_411);
		panel.repaint();
	}
}
