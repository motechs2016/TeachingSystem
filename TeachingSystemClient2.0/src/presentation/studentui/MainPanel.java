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
		
		JLabel label1 = new JLabel("֪ͨ:");
		label1.setBounds(100, 50, 100, 20);
		label1.setFont(new Font("΢���ź�",Font.BOLD,18));
		panel.add(label1);
		/*
		JLabel label2 = new JLabel("1.��ѧ�ڵı��޿���9��1�պ�3��1�շ��������ڡ��ҵĿγ̡����鿴");
		label2.setBounds(130, 100, 600, 20);
		label2.setFont(new Font("΢���ź�",Font.PLAIN,16));
		panel.add(label2);
		
		JLabel label3 = new JLabel("2.��ѧ�ڵ�9.2��9.8��3.2��3.8Ϊ��Ժϵѡ��ʱ�䣬ÿ����ѡ�������ڵĿ�Ժϵ�γ�");
		label3.setBounds(130, 150, 600, 20);
		label3.setFont(new Font("΢���ź�",Font.PLAIN,16));
		panel.add(label3);
		
		JLabel label4 = new JLabel("3.��ѧ���ܺ󣬽��޷�����ѡ��");
		label4.setBounds(130, 200, 600, 20);
		label4.setFont(new Font("΢���ź�",Font.PLAIN,16));
		panel.add(label4);
		*/
		
		JLabel label2 = new JLabel("1.��ѧ�ڵı��޿���9��1�պ�3��1�շ��������ڡ��ҵĿγ̡����鿴");
		label2.setBounds(130, 100, 600, 20);
		label2.setFont(new Font("΢���ź�",Font.PLAIN,16));
		panel.add(label2);
		
		JLabel label3 = new JLabel("2.��ѧ��ѡ�����ڽ����У�����6��֮ǰ���ѡ��");
		label3.setBounds(130, 150, 600, 20);
		label3.setFont(new Font("΢���ź�",Font.PLAIN,16));
		label3.setForeground(Color.red);
		panel.add(label3);
		
		return panel;
	}
}
