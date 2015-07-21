package presentation.studentui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import presentation.userui.LoginUI;

import businesslogic.coursebl.CourseDeal;
import businesslogic.studentbl.StudentDeal;
import businesslogic.teacherbl.TeacherDeal;
import vo.StudentVO;
import vo.CourseVO;

public class MyCoursePanel {
	JPanel panel;
	public MyCoursePanel(){
		panel = new JPanel();
		panel.setBounds(0,137,760,396);
		panel.setLayout(null);
		panel.setBackground(new Color(243, 240, 224));
	}
	
	public JPanel myCoursePanel(){
		String[] title = {"课程号","课程名","教师","时间","地点"};
		
		StudentVO student = new StudentDeal().showStudent(LoginUI.userID);
		
		ArrayList<CourseVO> list = new CourseDeal().showCourse(student);
		if(list==null){
			String[][] data = {};
			JScrollPane tablePanel = setTable(title,data);
			panel.add(tablePanel);
		}else{
			String[][] data = new String[list.size()][5];
			for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i).teacherID);
				data[i][0] = String.valueOf(list.get(i).ID);
				data[i][1] = list.get(i).courseName;
				data[i][2] =list.get(i).teacherID;
				data[i][3] = list.get(i).time;
				data[i][4] = list.get(i).location;
			}
			JScrollPane tablePanel = setTable(title,data);
			panel.add(tablePanel);
		}
		//String[][] data = {{"1","li","1","1","1","1"},{"1","li","1","1","1","1"}};
		return panel;
	}
	
	private JScrollPane setTable(String[] title,String[][] data){
		
		//JPanel tablePanel = new JPanel();
		//tablePanel.setBounds(130, 30, 500, 320);
		//tablePanel.setBackground(new Color(243, 240, 224));
		final DefaultTableModel tm=new DefaultTableModel(data, title){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int r, int c){
				return false;
			}
		};
		final JTable table = new JTable(tm);
		//table.setBounds(0, 0, 250, 350);
		table.setLayout(null);
		table.setFont(new Font("微软雅黑", Font.PLAIN, 12));

		JScrollPane tablePanel2 = new JScrollPane(table);
		tablePanel2.setBounds(130, 30, 500, 300);
		tablePanel2.getViewport().setBackground(new Color(0, 0, 0, 0));
		tablePanel2.setBackground(new Color(0, 0, 0, 0));
		//tablePanel2.setBorder(BorderFactory.createEtchedBorder());
		//tablePanel.add(tablePanel2);
		return tablePanel2;
	}

}
