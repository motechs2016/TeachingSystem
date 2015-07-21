package presentation.officeteacherui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import presentation.mainui.MainUI;
import presentation.uicomponents.APanel;
import presentation.uicomponents.BackgroundPanel;
import presentation.uicomponents.ChangePhotoFrame;
import presentation.uicomponents.HeaderPanel;
import presentation.uicomponents.PhotoPanel;
import presentation.uicomponents.RoundRectPanel;
import presentation.uicomponents.StretchPanel;
import presentation.uicomponents.TextFieldBorder;
import presentation.userui.LoginUI;
import util.Point;
import vo.CourseVO;
import vo.StudentVO;
import vo.TeachPlanVO;
import vo.TeacherVO;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import businesslogic.coursebl.CourseDealController;
import businesslogic.framebl.FrameDealController;
import businesslogic.framebl.FrameList;
import businesslogic.studentbl.StudentDealController;
import businesslogic.teacherbl.TeacherDealController;
import businesslogic.teachplanbl.TeachPlanDealController;


public class OfficeTeacherUI {

	private JFrame frame;
	private int fx, fy;
	public static JTable table,table2,table3, table4;
	public static DefaultTableModel tableModel,tableModel2,tableModel3,tableModel4;
	public static ChangePhotoFrame cpf;
	public static PhotoPanel panel_3;
	private JLabel label;
	public static APanel ip;
    public static BackgroundPanel panel;
    private JScrollPane scrollPane;
    private int last=-1, er=-1, ec=-1;
    private Vector<Vector<String>> tableValue;
    private JLabel lblNewLabel_8;
    private DefaultTableCellRenderer  tcr;
    private ArrayList<Point> list=new ArrayList<Point>();
    private final int standard_Height = 15;
     
    private FrameList l;
    private JMenuBar jmb;
    private JMenu jm; 
    private JMenuItem jmi1;
    private JMenuItem jmi2;
    private JMenuItem jmi3;
    private JMenuItem jmi4;
    private JScrollPane scrollPane3;
    private JScrollPane scrollPane4;
    private JScrollPane scrollPane2;
    private JLabel lblNewLabel_3;
    private JScrollPane scrollPane_2;
    private JTextArea textArea;
    private JButton button;
    public static JLabel down;
	public static JTextField textField;
	private String[] detartlist = {"文学院","历史学院","哲学院","新闻传播学院","法学院","商学院经济学院",
			"商学院管理学院","外国语学院","政府管理学院","信息管理学院","社会学院","软件学院","数学系",
			"海外教育学院","物理学院","天文学院","计算机学院","电子学院","现代工程学院","环境学院",
			"地球科学学院","地理与海洋学院","大气学院","生命科学学院","医学院","工程管理学院","匡亚明学院"
			,"建筑学院","化学化工学院"};
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
    
	public OfficeTeacherUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		MainUI.lblNewLabel_2.setBounds(98, 15, 150, 85);
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
		
		JLabel lblNewLabel_1 = new JLabel("李军");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("微软雅黑 Light", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(591, 15, 135, 36);
		panel_1.add(lblNewLabel_1);
		
		MainUI.lblNewLabel_2.setText("  课程大纲");
		panel_1.add(MainUI.lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(OfficeTeacherUI.class.getResource("/img/xiaohui_vs.png")));
		lblNewLabel.setBounds(0, 15, 98, 85);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("\u5728\u7EBF");
		lblNewLabel_5.setIcon(new ImageIcon(OfficeTeacherUI.class.getResource("/img/online.png")));
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
		
		JLabel lblNewLabel_7 = new JLabel("教务员");
		lblNewLabel_7.setIcon(new ImageIcon(OfficeTeacherUI.class.getResource("/img/edit_user.png")));
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
		layeredPane.setBounds(94, 111, 169, 36);
		panel.add(layeredPane);
		layeredPane.setLayout(null);
		
		//
		label = new JLabel("\u6559\u5B66\u6846\u67B6\u7B56\u7565");
		label.setBounds(10, 10, 77, 15);
		label.setForeground(Color.white);
		layeredPane.add(label);
		label.setForeground(Color.black);
		label.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		label.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e){
				label.setForeground(Color.white);
				jm.setForeground(Color.black);
				jm.setFont(new Font("微软雅黑", Font.PLAIN, 12));
				MainUI.lblNewLabel_2.setText(" 教学框架策略");
				addFrame();
			}
		});
				
		
		jmb = new JMenuBar();
		jmb.setBorderPainted(false);
		jmb.setBounds(100, 10, 40, 15);
		jmb.setBackground(new Color(203, 100, 254));
		jm = new JMenu("其它");
		jm.setBackground(new Color(203, 100, 254));
		jm.setForeground(Color.white);
		jm.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		
		jmi1 = new JMenuItem("院系教学计划");
		jmi1.setBackground(new Color(203, 100, 254));
		jmi1.setForeground(Color.white);
		jmi1.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		jmi1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jm.setForeground(Color.white);
				label.setForeground(Color.black);
				label.setFont(new Font("微软雅黑", Font.PLAIN, 12));
				MainUI.lblNewLabel_2.setText(" 院系教学计划");
				addPlan();
			}
		});
		
		
		jmi2 = new JMenuItem("学生统计");
		jmi2.setBackground(new Color(203, 100, 254));
		jmi2.setForeground(Color.white);
		jmi2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		jmi2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jm.setForeground(Color.white);
				label.setForeground(Color.black);
				label.setFont(new Font("微软雅黑", Font.PLAIN, 12));
				MainUI.lblNewLabel_2.setText(" 学生统计");
				addStudent();
			}
		});
		
		jmi3 = new JMenuItem("课程统计");
		jmi3.setBackground(new Color(203, 100, 254));
		jmi3.setForeground(Color.white);
		jmi3.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		jmi3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jm.setForeground(Color.white);
				label.setForeground(Color.black);
				label.setFont(new Font("微软雅黑", Font.PLAIN, 12));
				MainUI.lblNewLabel_2.setText(" 课程统计");
				addCourse();
			}
		});
		
		jmi4 = new JMenuItem("教师统计");
		jmi4.setBackground(new Color(203, 100, 254));
		jmi4.setForeground(Color.white);
		jmi4.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		jmi4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jm.setForeground(Color.white);
				label.setForeground(Color.black);
				label.setFont(new Font("微软雅黑", Font.PLAIN, 12));
				MainUI.lblNewLabel_2.setText(" 教师统计");
				addTeacher();
			}
		});
		
		jm.add(jmi1);
		jm.add(jmi2);
		jm.add(jmi3);
		jm.add(jmi4);
		jmb.add(jm);		
		layeredPane.add(jmb);
		

		
		
		//以下是“框架策略”组件
		Vector<String> columnname=new Vector<String>();
		columnname.add("课程模块");
		columnname.add("课程性质");
		columnname.add("课程类别");
		columnname.add("课程名称");
		columnname.add("建议学分");
		columnname.add("开设学期");
		tableValue=new Vector<Vector<String>>();
		l=new FrameDealController().showFrame();
		if(l==null){
			
		}
		else{
			for(int i=0;i<=l.framelist.size()-1;i++){
				Vector<String> row=new Vector<String>();
				row.add(l.framelist.get(i).modules);
				row.add(l.framelist.get(i).character);
				row.add(l.framelist.get(i).catagory);
				row.add(l.framelist.get(i).name);
				row.add(l.framelist.get(i).credit+"");
				row.add(l.framelist.get(i).time);
				tableValue.add(row);
			}
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
			@Override
			public void changeSelection(int r, int c, boolean t, boolean e){
				super.changeSelection(r, c, t, e);
				if(last==-1){
					//do nothing
				}
				else{
					if(checkError(er, ec)){
						list.add(new Point(er, ec));
						ShrinkThread sht=new ShrinkThread(true,lblNewLabel_8);
						sht.start();
					}
					else{
						ShrinkThread sht=new ShrinkThread(false,lblNewLabel_8);
						sht.start();
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
        table.getColumn("课程性质").setCellRenderer(tcr);
				
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(121, 168, 540, 313);
		//panel.add(scrollPane);
		
		
		
		//以下是“院系教学计划”的组件：
		
		/*comboBox = new JComboBox(detartlist);
		comboBox.setForeground(new Color(133, 30, 184));
		comboBox.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		comboBox.setBounds(528, 111, 142, 29);
		
		panel.add(comboBox); */
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblNewLabel_8.setForeground(Color.red);
		lblNewLabel_8.setBounds(121, 500, 190, 15);
		panel.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setSelectionColor(new Color(153, 50, 204));
		textField.setSelectedTextColor(Color.WHITE);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBorder(new TextFieldBorder(Color.LIGHT_GRAY));
		textField.setBounds(500, 114, 177, 28);
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
			    	ip=new APanel();
			    	for(int i=0; i<=data.size()-1; i++){
			    		if(data.get(i).startsWith(currentText)&&!currentText.equals("")){
			    			ip.addOne(data.get(i));
						}
			    	}
					if(ip.users.size()!=0){
						down.setIcon(new ImageIcon(LoginUI.class.getResource("/img/up_s.png")));
						ip.setLocation(textField.getX(), textField.getY()+textField.getHeight());
						panel.add(ip); panel.setLayer(ip, 1);
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
					ip=new APanel();
					for(int i=0; i<=data.size()-1; i++){
						ip.addOne(data.get(i));
					}
					ip.setLocation(textField.getX(), textField.getY()+textField.getHeight());
					panel.add(ip); panel.setLayer(ip, 1);
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
		panel.add(textField, 0);
		
		lblNewLabel_3 = new JLabel("\u9662\u7CFB\uFF1A");
		lblNewLabel_3.setBounds(464, 121, 42, 15);
		lblNewLabel_3.setForeground(new Color(133, 30, 184));
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		panel.add(lblNewLabel_3);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font("微软雅黑", Font.PLAIN, 13));
		textArea.setForeground(new Color(153, 50, 204));
		
		scrollPane_2 = new JScrollPane(textArea);
		scrollPane_2.setBounds(121, 168, 540, 313);
		panel.add(scrollPane_2, 0);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(94, 500, 54, 15);
		panel.add(label_1);
		
		button = new JButton("\u67E5  \u770B");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String department = textField.getText().trim();
				System.out.println(department);
				int dm = 1;
				boolean app= false;
				for(int i = 0;i<detartlist.length;i++){
					if(detartlist[i].equals(department)){
						dm = i+1;
						app = true;
						TeachPlanVO vo=new TeachPlanDealController().showTeachPlan(dm);
						String split[]=vo.plan.split(";");
						String result="";
						for(int j=0;j<=split.length-1;j++)
							result+=split[j]+"\n";
						textArea.setText(result);
						panel.repaint();
					}
				}
				if(!app){
					lblNewLabel_8.setText("请选择正确的院系！");
				}
				
			}
		});
		button.setBackground(new Color(203, 100, 254));
		button.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		button.setBounds(401, 491, 93, 25);
		panel.add(button);
		
		//以下是”学生统计“的组件
		Vector<String> columnname2=new Vector<String>();
		columnname2.add("学号");
		columnname2.add("姓名");
		columnname2.add("所属院系");
		Vector<Vector<String>> tableValue2=new Vector<Vector<String>>();
		ArrayList<StudentVO> studentList=new StudentDealController().showStudent();
		if(studentList==null){
			tableValue2 = null;
		}
		else{
			for(int i=0;i<=studentList.size()-1;i++){
				Vector<String> row=new Vector<String>();
		    	row.add(studentList.get(i).ID);
		    	row.add(studentList.get(i).name);
		    	row.add(detartlist[(int)studentList.get(i).aID-1]);
		    	tableValue2.add(row);
			}
		}
		
		tableModel2=new DefaultTableModel(tableValue2,columnname2){
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
		final ArrayList<Point> list2=new ArrayList<Point>();
		table2=new JTable(tableModel2){
			@Override
			public void changeSelection(int r, int c, boolean t, boolean e){
				super.changeSelection(r, c, t, e);
				if(last==-1){
					//do nothing
				}
				else{
					if(checkError(er, ec)){
						list2.add(new Point(er, ec));
						ShrinkThread sht=new ShrinkThread(true,lblNewLabel_8);
						sht.start();
					}
					else{
						ShrinkThread sht=new ShrinkThread(false,lblNewLabel_8);
						sht.start();
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
		table2.addMouseListener(new MouseListener(){

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
		DefaultTableCellRenderer tcr2 = new DefaultTableCellRenderer() {

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
		table2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
        table2.getColumn("学号").setCellRenderer(tcr2);
				
        scrollPane2 = new JScrollPane(table2);
		scrollPane2.setBounds(121, 168, 540, 313);
		//panel.add(scrollPane2);
		
		//以下是“教師統計”組件：
		Vector<String> columnname3=new Vector<String>();
		columnname3.add("工号");
		columnname3.add("姓名");
		columnname3.add("所属院系");
		Vector<Vector<String>> tableValue3=new Vector<Vector<String>>();
		ArrayList<TeacherVO> teacherlist=new TeacherDealController().showTeacher();
		if(teacherlist==null){
			tableValue3 = null;
		}
		else{
			for(int i=0;i<=teacherlist.size()-1;i++){
				Vector<String> row=new Vector<String>();
		    	row.add(teacherlist.get(i).ID);
		    	row.add(teacherlist.get(i).name);
		    	row.add(detartlist[(int)teacherlist.get(i).aID-1]);
		    	tableValue3.add(row);
			}
		}
		tableModel3=new DefaultTableModel(tableValue3,columnname3){
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
		final ArrayList<Point> list3=new ArrayList<Point>();
		table3=new JTable(tableModel3){
			@Override
			public void changeSelection(int r, int c, boolean t, boolean e){
				super.changeSelection(r, c, t, e);
				if(last==-1){
					//do nothing
				}
				else{
					if(checkError(er, ec)){
						list3.add(new Point(er, ec));
						ShrinkThread sht=new ShrinkThread(true,lblNewLabel_8);
						sht.start();
					}
					else{
						ShrinkThread sht=new ShrinkThread(false,lblNewLabel_8);
						sht.start();
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
		table3.addMouseListener(new MouseListener(){

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
		DefaultTableCellRenderer tcr3 = new DefaultTableCellRenderer() {

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
		table3.setFont(new Font("微软雅黑", Font.PLAIN, 12));
        table3.getColumn("工号").setCellRenderer(tcr3);
				
        scrollPane3 = new JScrollPane(table3);
		scrollPane3.setBounds(121, 168, 540, 313);
		//panel.add(scrollPane3);
		
		//以下是“课程统计”组件：
		Vector<String> columnname4=new Vector<String>();
		columnname4.add("课程编号");
		columnname4.add("课程名称");
		columnname4.add("开设院系");
		Vector<Vector<String>> tableValue4=new Vector<Vector<String>>();
		ArrayList<CourseVO> courseList=new CourseDealController().showCourse();
		if(courseList==null){
			tableValue3 = null;
		}
		else{
			for(int i=0;i<=courseList.size()-1;i++){
				Vector<String> row=new Vector<String>();
		    	row.add(""+courseList.get(i).ID);
		    	row.add(courseList.get(i).courseName);
		    	row.add(detartlist[(int)courseList.get(i).aID-1]);
		    	tableValue3.add(row);
			}
		}
		tableModel4=new DefaultTableModel(tableValue4,columnname4){
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
		final ArrayList<Point> list4=new ArrayList<Point>();
		table4=new JTable(tableModel4){
			@Override
			public void changeSelection(int r, int c, boolean t, boolean e){
				super.changeSelection(r, c, t, e);
				if(last==-1){
					//do nothing
				}
				else{
					if(checkError(er, ec)){
						list4.add(new Point(er, ec));
						ShrinkThread sht=new ShrinkThread(true,lblNewLabel_8);
						sht.start();
					}
					else{
						ShrinkThread sht=new ShrinkThread(false,lblNewLabel_8);
						sht.start();
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
		table4.addMouseListener(new MouseListener(){

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
			}
			
		});
		DefaultTableCellRenderer tcr4 = new DefaultTableCellRenderer() {

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
		table4.setFont(new Font("微软雅黑", Font.PLAIN, 12));
        table4.getColumn("课程编号").setCellRenderer(tcr4);
				
        scrollPane4 = new JScrollPane(table4);
		scrollPane4.setBounds(121, 168, 540, 313);
		//panel.add(scrollPane4); 
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
	
	//添加“框架策略”组件
    public void addFrame(){
    	panel.remove(panel.getComponentAt(130, 180));
    	panel.remove(panel.getComponentAt(528, 111));
    	panel.remove(panel.getComponentAt(464, 121));
    	panel.remove(lblNewLabel_8);
    	panel.add(scrollPane,0);
    	panel.remove(button);
    	panel.remove(textField);
    	panel.remove(lblNewLabel_3);
    	panel.repaint();
    }
    //添加“院系教学计划”组件
    public void addPlan(){
    	panel.remove(panel.getComponentAt(130, 180));
    	panel.remove(panel.getComponentAt(528, 111));
    	panel.remove(panel.getComponentAt(464, 121));
    	panel.add(textField,0);
    	panel.add(lblNewLabel_8,0);
    	lblNewLabel_8.setText("");
    	panel.add(lblNewLabel_3,0);
    	panel.add(scrollPane_2,0);
    	panel.add(button);
    	panel.repaint();
    }
  //添加“学生统计”组件
    public void addStudent(){
    	panel.remove(panel.getComponentAt(130, 180));
    	panel.remove(panel.getComponentAt(528, 111));
    	panel.remove(panel.getComponentAt(464, 121));
    	panel.remove(lblNewLabel_8);
    	panel.add(scrollPane2,0);
    	panel.remove(button);
    	panel.remove(lblNewLabel_3);
    	panel.remove(textField);
    	panel.repaint();
    }//添加“教师统计”组件
    public void addTeacher(){
    	panel.remove(panel.getComponentAt(130, 180));
    	panel.remove(panel.getComponentAt(528, 111));
    	panel.remove(panel.getComponentAt(464, 121));
    	panel.remove(lblNewLabel_8);
    	panel.add(scrollPane3,0);
    	panel.remove(button);
    	panel.remove(lblNewLabel_3);
    	panel.remove(textField);
    	panel.repaint();
    }//添加“课程统计”组件
    public void addCourse(){
    	panel.remove(panel.getComponentAt(130, 180));
    	panel.remove(panel.getComponentAt(528, 111));
    	panel.remove(panel.getComponentAt(464, 121));
    	panel.remove(lblNewLabel_8);
    	panel.add(scrollPane4,0);
    	panel.remove(lblNewLabel_3);
    	panel.remove(button);
    	panel.remove(textField);
    	panel.repaint();
    }
	
	
    public class ShrinkThread extends Thread{
    	private boolean error;
		private JLabel label;
		private int height=0;
		public ShrinkThread(boolean error, JLabel label){
		  this.error=error;	
		  this.label=label;
		}
		
		 public void run(){
			 if(error){
					label.setText("  成绩填写有误, 该修改未上传！");
					label.setForeground(new Color(180, 40, 40));
	                label.setIcon(new ImageIcon(OfficeTeacherUI.class.getResource("/img/error.png")));
			 }
			 else{
					label.setText("  本次修改成功上传！");
					label.setForeground(new Color(20, 140, 20));
	                label.setIcon(new ImageIcon(OfficeTeacherUI.class.getResource("/img/yes.png")));
			 }
			 while(height<standard_Height){
				 label.setSize( label.getWidth(), height);
				 panel.repaint();
				 height++;
				 try{
					 Thread.sleep(30);
				 }catch(Exception e){
					 e.printStackTrace();
				 }
			 }
			 try{
				 Thread.sleep(100);
			 }catch(Exception e){
				 e.printStackTrace();
			 }
			 
		 }
	}
    
	public ArrayList<String> loadData(){
		
		ArrayList<String> strList=new ArrayList<String>();
		for(int i = 0;i<detartlist.length;i++){
			strList.add(detartlist[i]);
		}  
		return strList;
		}
}