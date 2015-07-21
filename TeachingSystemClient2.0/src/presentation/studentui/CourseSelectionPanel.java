package presentation.studentui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import presentation.userui.LoginUI;

import vo.StudentVO;
import vo.CourseVO;
import businesslogic.coursebl.CourseDeal;
import businesslogic.studentbl.StudentDeal;
import businesslogic.teacherbl.TeacherDeal;

public class CourseSelectionPanel {
	JPanel panel;
	ArrayList<CourseVO> allList = new ArrayList<CourseVO>();
	int i;
	public CourseSelectionPanel() {
		panel = new JPanel();
		panel.setBounds(0, 137, 760, 396);
		panel.setLayout(null);
		panel.setBackground(new Color(243, 240, 224));
	}

	public JPanel selectCoursePanel() {
		JPanel tablePanel = setTable();
		panel.add(tablePanel);
		return panel;
	}

	private JPanel setTable() {
		JPanel tablePanel = new JPanel();
		tablePanel.setBounds(110, 30, 560, 400);
		tablePanel.setBackground(new Color(243, 240, 224));
		tablePanel.setLayout(null);
		String[] title = { "¿Î³ÌºÅ", "¿Î³ÌÃû", "½ÌÊ¦", "Ê±¼ä", "µØµã"};

		
		allList = new CourseDeal().showCourse();
		StudentVO student = new StudentDeal().showStudent(LoginUI.userID);
		ArrayList<CourseVO> myList = new CourseDeal().showCourse(student);

		if(myList==null){
			String[][] data = {};
			final DefaultTableModel tm=new DefaultTableModel(data,title){
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				public boolean isCellEditable(int r, int c){
					return false;
				}
			};
			final JTable table = new JTable(tm);
			//table.setBounds(0, 0, 250, 350);
			table.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
			table.setLayout(null);

			JScrollPane tablePanel2 = new JScrollPane(table);
			tablePanel2.setBounds(0, 0, 500, 300);
			tablePanel2.getViewport().setBackground(new Color(0, 0, 0, 0));
			tablePanel2.setBackground(new Color(0, 0, 0, 0));
			//tablePanel2.setBorder(BorderFactory.createEtchedBorder());
			tablePanel.add(tablePanel2);
			return tablePanel;
		}else{
			String[][] data = new String[allList.size()][5];
			for (i = 0; i < allList.size(); i++) {
				final CountLabel label = new CountLabel(new JLabel(),i);
				label.setBounds(505, 22+i*16, 45, 14);
				label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
				data[i][0] = String.valueOf(allList.get(i).ID);
				data[i][1] = allList.get(i).courseName;
				data[i][2] =allList.get(i).teacherID;
				data[i][3] = allList.get(i).time;
				data[i][4] = allList.get(i).location;
				for (int j = 0; j < myList.size(); j++) {
					if (allList.get(i).ID == myList.get(j).ID) {
						label.setText("ÒÑÑ¡Ôñ");
						label.setForeground(new Color(21, 0, 170));
						//label.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,12));
					}else {
						label.setText("Î´Ñ¡Ôñ");
						label.setForeground(Color.DARK_GRAY);
						//label.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,12));
					}
				}
				label.addMouseListener(new java.awt.event.MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						if (label.getText().equals("ÒÑÑ¡Ôñ")) {
							CourseVO course = allList.get(label.count);
							StudentVO student = new StudentDeal().showStudent(LoginUI.userID);
							boolean result = new CourseDeal().quitCourse(course,
									student);
							if (result) {
								//label.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,12));
								label.setText("Î´Ñ¡Ôñ");
								label.setForeground(Color.DARK_GRAY);
							}
						} else if (label.getText().equals("Î´Ñ¡Ôñ")){
							CourseVO course = allList.get(label.count);
							StudentVO student = new StudentDeal().showStudent(LoginUI.userID);
							boolean result = new CourseDeal().selectCourseTmp(course,
									student);
							System.out.println(result);
							if (result) {
								//label.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,12));
								label.setText("ÒÑÑ¡Ôñ");
								label.setForeground(new Color(21, 0, 170));
							}
						}
					}
					@Override
					public void mouseEntered(MouseEvent arg0) {
						StudentFrame.frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
						panel.repaint();
					}
					@Override
					public void mouseExited(MouseEvent e) {
						StudentFrame.frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
						panel.repaint();
					}
				});
				tablePanel.add(label);
			}
			

			//String[][] data = { { "1", "li", "1", "1", "1"},
			//		{ "1", "li", "1", "1", "1"},{ "1", "li", "1", "1", "1"}};
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
			table.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
			table.setLayout(null);

			JScrollPane tablePanel2 = new JScrollPane(table);
			tablePanel2.setBounds(0, 0, 500, 300);
			tablePanel2.getViewport().setBackground(new Color(0, 0, 0, 0));
			tablePanel2.setBackground(new Color(0, 0, 0, 0));
			//tablePanel2.setBorder(BorderFactory.createEtchedBorder());
			tablePanel.add(tablePanel2);
			return tablePanel;
		}
		
	}
}
