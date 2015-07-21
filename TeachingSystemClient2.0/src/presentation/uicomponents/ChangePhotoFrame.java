package presentation.uicomponents;

import java.awt.Cursor;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import util.Constants;
import presentation.administratorui.AdministratorUI;
import presentation.uicomponents.UtilBorder;

import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class ChangePhotoFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PhotoPanel panel_1;
	public SelectionPanel s;
	int fx, fy;
	public PhotoPanel p;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public ChangePhotoFrame(PhotoPanel panel) {
		initialize();
		p=panel;
		setBackground(Color.yellow);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setSize(Constants.frame_height, Constants.frame_width);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Constants.color5);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int detx = e.getX() - fx;
				int dety = e.getY() - fy;
				setLocation(detx + getX(), dety + getY());
			}
		});
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				fx = e.getX();
				fy = e.getY();
			}
		});
		panel.setBounds(0, 0, Constants.frame_height, 33);
		panel.setBackground(Constants.color4);
		getContentPane().add(panel);
		panel.setLayout(null);

		final JLabel lblNewLabel_4 = new JLabel(" \u00D7");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_4.setOpaque(true);
				lblNewLabel_4.setBackground(Constants.color6);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_4.setBackground(new Color(0, 0, 0, 0));
				repaint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				ChangePhotoFrame.this.dispose();
			}
		});
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(564, 0, 36, 33);
		panel.add(lblNewLabel_4);

		final JLabel lblNewLabel_5 = new JLabel("  -");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_5.setOpaque(true);
				lblNewLabel_5.setBackground(Constants.color7);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_5.setBackground(new Color(0, 0, 0, 0));
				repaint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				ChangePhotoFrame.this.setExtendedState(JFrame.ICONIFIED);
			}
		});
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(526, 0, 36, 33);
		panel.add(lblNewLabel_5);

		panel_1 = new PhotoPanel();
		panel_1.setSize(Constants.view_width, Constants.view_height);
		panel_1.setLocation(406, 116);
		getContentPane().add(panel_1);

		Border border2 = new UtilBorder(Constants.color1, UtilBorder.Type.draw,
				UtilBorder.BorderShape.rect, Constants.arc2);
		final InnerPanel panel_2 = new InnerPanel();
		panel_2.setBounds(46, 50, Constants.inner_width, Constants.inner_height);
		panel_2.setBorder(border2);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);

		s = new SelectionPanel(panel_1);
		s.setLocation((panel_2.getWidth() - s.getWidth()) / 2,
				(panel_2.getHeight() - s.getHeight()) / 2);
		panel_2.add(s);

		JLabel lblNewLabel_3 = new JLabel(
				"                               \u70B9\u51FB\u7F16\u8F91");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ChangePhotoFrame.this.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				ChangePhotoFrame.this.setCursor(new Cursor(
						Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				FileDialog d = new FileDialog(ChangePhotoFrame.this, "´ò¿ª",
						FileDialog.LOAD);
				d.setVisible(true);
				String path = d.getDirectory() + d.getFile();
				if (!path.equals("nullnull")) {
					if (s != null)
						panel_2.remove(s);
					ImageIcon i = new ImageIcon(path);
					panel_2.trans(i.getImage());
					s = new SelectionPanel(panel_1);
					s.setLocation((panel_2.getWidth() - s.getWidth()) / 2,
							(panel_2.getHeight() - s.getHeight()) / 2);
					panel_2.add(s);
					panel_1.updatePhoto(i.getImage());
				} else {
					// do nothing
				}
				panel_2.repaint();
			}
		});
		lblNewLabel_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(panel_2.getX(),
				panel_2.getHeight() + panel_2.getY(), 300, 32);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(Constants.color3);
		getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel = new JLabel("\u9884\u89C8");
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 13));
		lblNewLabel.setBounds(406, 71, 54, 15);
		getContentPane().add(lblNewLabel);

		Border border = new UtilBorder(Constants.color1, UtilBorder.Type.draw,
				UtilBorder.BorderShape.round_rect, Constants.arc2);

		JLabel lblNewLabel_1 = new JLabel("     \u786E\u5B9A");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) { // ÖØÒª
/*				 String uuid = UUID.randomUUID().toString();
				 File file=new File("photo");
				 if(!file.exists()){
					 file.mkdir();
				 }
				try {
					if (panel_1.bi != null) {
						ImageIO.write(panel_1.bi, "png",
								new File("photo/"+uuid+".png"));
						p.updatePhoto(panel_1.bi);
					}
					ChangePhotoFrame.this.dispose();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
				ChangePhotoFrame.this.dispose();
			}
		});
		lblNewLabel_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(424, 332, 62, 27);
		lblNewLabel_1.setBorder(border);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("     \u53D6\u6D88");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				ChangePhotoFrame.this.dispose();
			}
		});
		lblNewLabel_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(515, 332, 62, 27);
		lblNewLabel_2.setBorder(border);
		getContentPane().add(lblNewLabel_2);

		setVisible(true);
	}

	public class InnerPanel extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		Image i = new ImageIcon(
				PhotoPanel.class.getResource("/img/avatar_default.png")).getImage();

		public InnerPanel() {

		}

		public void trans(Image image) {
			i = image;
			repaint();
		}

		public void paintComponent(Graphics g) {
			g.clearRect(0, 0, getWidth(), getHeight());
			g.drawImage(i, 1, 1, 298, 298, null);
		}
	}
}
