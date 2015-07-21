package presentation.studentui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import presentation.userui.LoginUI;

import vo.StudentVO;
import businesslogic.studentbl.StudentDeal;

public class StudentInfoPanel {
	JPanel panel;
	public StudentInfoPanel(){
		panel = new JPanel();
		panel.setBounds(0,137,760,396);
		panel.setLayout(null);
		panel.setBackground(new Color(243, 240, 224));
	}
	
	public JPanel studentInfoPanel(){
		//panel.setBackground(Color.black);
		
		StudentVO student = new StudentDeal().showStudent(LoginUI.userID);
		String id = student.ID;
		String name = student.name;
		JLabel idLabel = new JLabel("Ñ§ºÅ£º");
		idLabel.setBounds(250, 100, 100, 30);
		idLabel.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,20));
		panel.add(idLabel);
		JLabel idLabel2 = new JLabel(id);
		//JLabel idLabel2 = new JLabel("121250071");
		idLabel2.setBounds(350, 100, 200, 30);
		idLabel2.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,20));
		panel.add(idLabel2);
		JLabel nameLabel = new JLabel("ÐÕÃû£º");
		nameLabel.setBounds(250, 150, 100, 30);
		nameLabel.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,20));
		panel.add(nameLabel);
		
		JLabel nameLabel2 = new JLabel(name);
		//JLabel nameLabel2 = new JLabel("ÀîÃ÷Î°");
		nameLabel2.setBounds(350, 150, 200, 30);
		nameLabel2.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,20));
		panel.add(nameLabel2);
		return panel;
	}

}
