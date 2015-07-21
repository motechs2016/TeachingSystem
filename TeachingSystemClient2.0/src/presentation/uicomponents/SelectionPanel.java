package presentation.uicomponents;

import java.awt.AWTException;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.border.Border;

import util.Constants;
import presentation.administratorui.AdministratorUI;
import presentation.uicomponents.UtilBorder;

public class SelectionPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	boolean region1, region2, region3, region4, region5, region6, region7,
			region8;
	int fx, fy;
	int cursorType = 0;
	PhotoPanel panel_1;

	/**
	 * @param args
	 */
	SelectionPanel(PhotoPanel panel_1) {
		this.panel_1=panel_1;
		setSize(Constants.inner_width, Constants.inner_height);
		Border border = new UtilBorder(Constants.color2, UtilBorder.Type.draw,
				UtilBorder.BorderShape.rect, Constants.arc2);
		setBorder(border);
		setOpaque(false);

		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				fx = e.getX();
				fy = e.getY();
			}

			public void mouseExited(MouseEvent e) {
				if (cursorType != 1)
					setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			public void mouseReleased(MouseEvent e) {
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				updatePanel();
				cursorType = 0;
			}

		});

		addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				if (region1) {
					if (cursorType != 1)
						setCursor(new Cursor(Cursor.W_RESIZE_CURSOR));
					int detx = fx - e.getX();
					if (Math.abs(detx) != 1) {
						if (getX() - detx >= 0
								&& getWidth() + detx >= Constants.view_width
								&& getY() - detx / 2 >= 0
								&& getWidth() + getY() + detx / 2 <= Constants.inner_height)
							setBounds(getX() - detx, getY() - detx / 2,
									getWidth() + detx, getWidth() + detx);
					} else {
						if (detx == 1)
							detx = 2;
						else
							detx = -2;
						if (getX() - detx >= 0
								&& getWidth() + detx >= Constants.view_width
								&& getY() - detx / 2 >= 0
								&& getWidth() + getY() + detx / 2 <= Constants.inner_height)
							setBounds(getX() - detx, getY() - detx / 2,
									getWidth() + detx, getWidth() + detx);
					}
				} else if (region2) {
					if (cursorType != 1)
						setCursor(new Cursor(Cursor.SW_RESIZE_CURSOR));
					int detx = e.getY() - getHeight();
					if (getX() - detx >= 0
							&& getY() + e.getY() <= Constants.inner_height
							&& e.getY() >= Constants.view_height)
						setBounds(getX() - detx, getY(), e.getY(), e.getY());
				} else if (region3) {
					if (cursorType != 1)
						setCursor(new Cursor(Cursor.S_RESIZE_CURSOR));
					int det = e.getY() - getWidth();
					if (Math.abs(det) != 1) {
						if (getX() - det / 2 >= 0
								&& e.getY() >= Constants.view_width
								&& e.getY() + getY() <= Constants.inner_height
								&& getX() - det / 2 + e.getY() <= Constants.inner_width)
							setBounds(getX() - det / 2, getY(), e.getY(),
									e.getY());
					} else {
						if (det == 1)
							det = 2;
						else
							det = -2;
						if (getX() - det / 2 >= 0
								&& e.getY() + det >= Constants.view_width
								&& e.getY() + getY() + det <= Constants.inner_height
								&& getX() + det / 2 + e.getY() <= Constants.inner_width)
							setBounds(getX() - det / 2, getY(), e.getY() + det,
									e.getY() + det);
					}
				} else if (region4) {
					if (cursorType != 1)
						setCursor(new Cursor(Cursor.SE_RESIZE_CURSOR));
					if (getX() + e.getX() <= Constants.inner_width
							&& e.getX() >= Constants.view_width
							&& e.getX() >= Constants.view_height
							&& getY() + e.getX() <= Constants.inner_height)
						setBounds(getX(), getY(), e.getX(), e.getX());
				} else if (region5) {
					if (cursorType != 1)
						setCursor(new Cursor(Cursor.E_RESIZE_CURSOR));
					int det = e.getX() - getWidth();
					if (Math.abs(det) != 1) {
						if (getY() - det / 2 >= 0
								&& getWidth() + det >= Constants.view_width
								&& getWidth() + det + getX() <= Constants.inner_width
								&& getWidth() + getY() + det / 2 <= Constants.inner_height)
							setBounds(getX(), getY() - det / 2, getWidth()
									+ det, getWidth() + det);
					} else {
						if (det == 1)
							det = 2;
						else
							det = -2;
						if (getY() - det / 2 >= 0
								&& getWidth() + det >= Constants.view_width
								&& getWidth() + det + getX() <= Constants.inner_width
								&& getWidth() + getY() + det / 2 <= Constants.inner_height)
							setBounds(getX(), getY() - det / 2, getWidth()
									+ det, getWidth() + det);
					}
				} else if (region6) {
					if (cursorType != 1)
						setCursor(new Cursor(Cursor.NE_RESIZE_CURSOR));
					int detx = e.getX() - getWidth();
					if (getY() - detx >= 0
							&& getWidth() + detx + getX() <= Constants.inner_width
							&& getWidth() + detx >= Constants.view_width)
						setBounds(getX(), getY() - detx, getWidth() + detx,
								getWidth() + detx);
				} else if (region7) {
					if (cursorType != 1)
						setCursor(new Cursor(Cursor.N_RESIZE_CURSOR));
					int dety = fy - e.getY();
					if (Math.abs(dety) != 1) {
						if (getX() - dety / 2 >= 0
								&& getY() - dety >= 0
								&& getHeight() + dety >= Constants.view_width
								&& getHeight() + getX() + dety / 2 <= Constants.inner_width)
							setBounds(getX() - dety / 2, getY() - dety,
									getHeight() + dety, getHeight() + dety);
					} else {
						if (dety == 1)
							dety = 2;
						else
							dety = -2;
						if (getX() - dety / 2 >= 0
								&& getY() - dety >= 0
								&& getHeight() + dety >= Constants.view_width
								&& getHeight() + getX() + dety / 2 <= Constants.inner_width)
							setBounds(getX() - dety / 2, getY() - dety,
									getHeight() + dety, getHeight() + dety);
					}
				} else if (region8) {
					if (cursorType != 1)
						setCursor(new Cursor(Cursor.NW_RESIZE_CURSOR));
					int detx = fx - e.getX();
					if (getX() - detx >= 0 && getY() - detx >= 0
							&& getWidth() + detx >= Constants.view_width)
						setBounds(getX() - detx, getY() - detx, getWidth()
								+ detx, getWidth() + detx);
				} else {
					setCursor(new Cursor(Cursor.MOVE_CURSOR));
					int detx = -fx + e.getX();
					int dety = -fy + e.getY();
					int ax = getX() + detx;
					int ay = getY() + dety;
					if (ax >= 0 && ay >= 0
							&& ax <= Constants.inner_width - getWidth()
							&& ay <= Constants.inner_width - getWidth()) {
						setLocation(ax, ay);
					} else if (ax < 0 && ay >= 0
							&& ay <= Constants.inner_width - getWidth()) {
						setLocation(0, ay);
					} else if (ay < 0 && ax >= 0
							&& ax <= Constants.inner_width - getWidth()) {
						setLocation(ax, 0);
					} else if (ax > Constants.inner_width - getWidth()
							&& ay >= 0
							&& ay <= Constants.inner_width - getWidth()) {
						setLocation(Constants.inner_width - getWidth(), ay);
					} else if (ay > Constants.inner_width - getWidth()
							&& ax >= 0
							&& ax <= Constants.inner_width - getWidth()) {
						setLocation(ax, Constants.inner_width - getWidth());
					}
				}
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				region1 = e.getX() >= 0 && e.getX() <= 5 && e.getY() >= 5
						&& e.getY() <= getWidth() - 5;
				region2 = e.getX() >= 0 && e.getX() <= 5
						&& e.getY() >= getWidth() - 5 && e.getY() <= getWidth();
				region3 = e.getX() >= 5 && e.getX() <= getWidth() - 5
						&& e.getY() >= getWidth() - 5 && e.getY() <= getWidth();
				region4 = e.getX() >= getWidth() - 5 && e.getX() <= getWidth()
						&& e.getY() >= getWidth() - 5 && e.getY() <= getWidth();
				region5 = e.getX() >= getWidth() - 5 && e.getX() <= getWidth()
						&& e.getY() >= 5 && e.getY() <= getWidth() - 5;
				region6 = e.getX() >= getWidth() - 5 && e.getX() <= getWidth()
						&& e.getY() >= 0 && e.getY() <= 5;
				region7 = e.getX() >= 5 && e.getX() <= getWidth() - 5
						&& e.getY() >= 0 && e.getY() <= 5;
				region8 = e.getX() >= 0 && e.getX() <= 5 && e.getY() >= 0
						&& e.getY() <= 5;
				if (region1) {
					setCursor(new Cursor(Cursor.W_RESIZE_CURSOR));
					cursorType = 1;
				} else if (region2) {
					setCursor(new Cursor(Cursor.SW_RESIZE_CURSOR));
					cursorType = 1;
				} else if (region3) {
					setCursor(new Cursor(Cursor.S_RESIZE_CURSOR));
					cursorType = 1;
				} else if (region4) {
					setCursor(new Cursor(Cursor.SE_RESIZE_CURSOR));
					cursorType = 1;
				} else if (region5) {
					setCursor(new Cursor(Cursor.E_RESIZE_CURSOR));
					cursorType = 1;
				} else if (region6) {
					setCursor(new Cursor(Cursor.NE_RESIZE_CURSOR));
					cursorType = 1;
				} else if (region7) {
					setCursor(new Cursor(Cursor.N_RESIZE_CURSOR));
					cursorType = 1;
				} else if (region8) {
					setCursor(new Cursor(Cursor.NW_RESIZE_CURSOR));
					cursorType = 1;
				} else {
					setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			}

		});
	}

	public void updatePanel() { // живЊ
		try {
			Robot robot = new Robot();
			BufferedImage bi = robot.createScreenCapture(new Rectangle(
					getLocationOnScreen().x+1, getLocationOnScreen().y+1,
					getWidth() - 2, getHeight() - 2));
			panel_1.updatePhoto(bi);
			panel_1.bi=bi;
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
