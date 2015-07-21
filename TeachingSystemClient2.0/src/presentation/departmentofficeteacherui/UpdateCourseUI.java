package presentation.departmentofficeteacherui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Cursor;

import presentation.uicomponents.BackgroundPanel;
import presentation.uicomponents.TextFieldBorder;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class UpdateCourseUI {
	private JFrame frame;
	private BackgroundPanel panel;
	private JTextField textField_1,textField_2,textField_3,textField_4,textField_5,textField_6,textField_7;
	private JLabel label_1,label_2,label_3,label_4,label_5,label_6,label_7;
	private int fx, fy;
	private JButton button;
	private String course_id,course_name,teacher_id,time,place;

	private final String WARN = "¸ñÊ½´íÎó£¬ÇëÊäÈëÊý×Ö";
    private final String OUT_OF_RANGE_1 = "³¬³ö·¶Î§£¬1-10";
    private final String OUT_OF_RANGE_2 = "³¬³ö·¶Î§£¬1-1000";
    private final String NOT_COMPLETE = "ÇëÌá½»ÍêÕûÐÅÏ¢";
    private JLabel label_9,label,label_8;
    private JLabel label_10;
    private JLabel label_11;
	public UpdateCourseUI(){
		initialize();
	}
	
	public void initialize(){
		frame = new JFrame();
		frame.setBounds(10, 100, 500, 450);
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
		
		final JLabel lblNewLabel = new JLabel("\u00D7");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblNewLabel.setForeground(Color.red);
				panel.repaint();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lblNewLabel.setForeground(Color.white);
				panel.repaint();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				frame.dispose();
			}
		});
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 22));
		lblNewLabel.setBounds(474, 0, 24, 34);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new TextFieldBorder(Color.lightGray));
		textField_1.setBounds(150, 80, 166, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new TextFieldBorder(Color.lightGray));
		textField_2.setColumns(10);
		textField_2.setBounds(150, 120, 166, 21);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new TextFieldBorder(Color.lightGray));
		textField_3.setBounds(150, 160, 166, 21);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBorder(new TextFieldBorder(Color.lightGray));
		textField_4.setColumns(10);
		textField_4.setBounds(150, 200, 166, 21);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBorder(new TextFieldBorder(Color.lightGray));
		textField_5.setColumns(10);
		textField_5.setBounds(150, 240, 166, 21);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBorder(new TextFieldBorder(Color.lightGray));
		textField_6.setColumns(10);
		textField_6.setBounds(150, 280, 166, 21);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBorder(new TextFieldBorder(Color.lightGray));
		textField_7.setColumns(10);
		textField_7.setBounds(150, 320, 166, 21);
		panel.add(textField_7);
		
		label_1 = new JLabel("\u8BFE\u7A0B\u7F16\u53F7\uFF1A",SwingConstants.RIGHT);
		label_1.setBounds(50, 80, 94, 15);
		panel.add(label_1);
		
		label_2 = new JLabel("\u8BFE\u7A0B\u540D\u79F0\uFF1A");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(50, 120, 94, 15);
		panel.add(label_2);
		
		label_3 = new JLabel("\u4EFB\u8BFE\u8001\u5E08\u5DE5\u53F7\uFF1A", SwingConstants.RIGHT);
		label_3.setBounds(50, 160, 94, 15);
		panel.add(label_3);
		
		label_4 = new JLabel("\u5B66\u5206\uFF1A", SwingConstants.RIGHT);
		label_4.setBounds(50, 200, 94, 15);
		panel.add(label_4);
		
		label_5 = new JLabel("\u4E0A\u8BFE\u65F6\u95F4\uFF1A", SwingConstants.RIGHT);
		label_5.setBounds(50, 240, 94, 15);
		panel.add(label_5);
		
		label_6 = new JLabel("\u4E0A\u8BFE\u5730\u70B9\uFF1A", SwingConstants.RIGHT);
		label_6.setBounds(50, 280, 94, 15);
		panel.add(label_6);
		
		label_7 = new JLabel("\u9650\u5236\u4EBA\u6570\uFF1A", SwingConstants.RIGHT);
		label_7.setBounds(50, 320, 94, 15);
		panel.add(label_7);
		
		button = new JButton("\u63D0   \u4EA4");
		button.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		button.setBounds(298, 396, 93, 23);
		panel.add(button);
		
		label = new JLabel("");
		label.setBounds(24, 396, 207, 15);
		panel.add(label);
		
		label_8 = new JLabel("");
		label_8.setBounds(326, 80, 160, 15);
		panel.add(label_8);
		
		label_9 = new JLabel("");
		label_9.setBounds(326, 160, 160, 15);
		panel.add(label_9);
		
		label_10 = new JLabel("");
		label_10.setBounds(326, 200, 160, 15);
		panel.add(label_10);
		
		label_11 = new JLabel("");
		label_11.setBounds(326, 320, 160, 15);
		panel.add(label_11);
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				String course_id,course_name,credit,teacher_id,time,place,number_limit;
				course_id = textField_1.getText().trim();
				course_name = textField_2.getText().trim();
				credit = textField_3.getText().trim();
				teacher_id = textField_4.getText().trim();
				time = textField_5.getText().trim();
				place = textField_6.getText().trim();
				number_limit = textField_7.getText().trim();
				if(course_id==""||course_name==""||credit==""||teacher_id==""||time==""
						||place==""||number_limit=="")
				{
					label.setText(NOT_COMPLETE);
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
						label_8.setText(course_id_2);
					if(teacher_id_2!=null)
						label_9.setText(teacher_id_2);
					if(credit_2!=null)
					    label_10.setText(credit_2);
					if(number_limit_2!=null)
					    label_11.setText(number_limit_2);
					else{
						PublishCourse.publishCourse(course_id,course_name,credit,teacher_id,time,place,number_limit);
					}
				}
			}
			
		});
		

	}
	
	public void update(String a1,String a2,String a4,String a5,String a6){
		course_id = a1;course_name = a2;teacher_id = a4;time = a5;place = a6;
		textField_1.setText(course_id);
		textField_2.setText(course_name);
		textField_3.setText(teacher_id);
		textField_4.setText("");
		textField_5.setText(time);
		textField_6.setText(place);
		textField_7.setText("");
		panel.repaint();
	}
}
