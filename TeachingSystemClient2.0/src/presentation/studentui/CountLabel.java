package presentation.studentui;

import javax.swing.JLabel;

public class CountLabel extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int count;
	public JLabel label;
	public CountLabel(JLabel label,int count){
		this.count = count;
		this.label = label;
	}
}
