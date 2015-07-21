package presentation.studentui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel {
	JPanel panel;
	public MainPanel(){
		panel = new JPanel();
		panel.setBounds(0,137,760,396);
		panel.setLayout(null);
		panel.setBackground(new Color(243, 240, 224));	
	}
	
	public JPanel mainPanel(){
		//panel.setBackground(Color.black);
		
		JLabel label1 = new JLabel("通知:");
		label1.setBounds(100, 50, 100, 20);
		label1.setFont(new Font("微软雅黑",Font.BOLD,18));
		panel.add(label1);
		/*
		JLabel label2 = new JLabel("1.新学期的必修课在9月1日和3月1日发布，可在“我的课程”面板查看");
		label2.setBounds(130, 100, 600, 20);
		label2.setFont(new Font("微软雅黑",Font.PLAIN,16));
		panel.add(label2);
		
		JLabel label3 = new JLabel("2.新学期的9.2～9.8、3.2～3.8为跨院系选课时间，每人限选三门以内的跨院系课程");
		label3.setBounds(130, 150, 600, 20);
		label3.setFont(new Font("微软雅黑",Font.PLAIN,16));
		panel.add(label3);
		
		JLabel label4 = new JLabel("3.开学两周后，将无法进行选课");
		label4.setBounds(130, 200, 600, 20);
		label4.setFont(new Font("微软雅黑",Font.PLAIN,16));
		panel.add(label4);
		*/
		
		JLabel label2 = new JLabel("1.新学期的必修课在9月1日和3月1日发布，可在“我的课程”面板查看");
		label2.setBounds(130, 100, 600, 20);
		label2.setFont(new Font("微软雅黑",Font.PLAIN,16));
		panel.add(label2);
		
		JLabel label3 = new JLabel("2.新学期选课正在进行中，请在6号之前完成选课");
		label3.setBounds(130, 150, 600, 20);
		label3.setFont(new Font("微软雅黑",Font.PLAIN,16));
		label3.setForeground(Color.red);
		panel.add(label3);
		
		return panel;
	}
}
