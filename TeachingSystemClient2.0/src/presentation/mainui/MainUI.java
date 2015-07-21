package presentation.mainui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import net.Net;
import presentation.userui.LoginUI;

public class MainUI {
	
	public static LoginUI lu;
	public static Net net;
	public static JLabel lblNewLabel_2;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 18));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(98, 15, 98, 85);
        lu=new LoginUI();
        net=new Net();
	}

}
