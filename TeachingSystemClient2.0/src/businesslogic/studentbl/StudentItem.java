package businesslogic.studentbl;

import java.util.ArrayList;

import vo.CourseVO;

public class StudentItem {
	public String ID; // ѧ��ѧ��
	public String name; // ѧ������
	public long aID; // ѧ������Ժϵ
	public ArrayList<CourseVO> courseList; // ͬѧ��ѡ���б�

	public StudentItem(String ID, String name, long aID, ArrayList<CourseVO> li) {
		this.ID = ID;
		this.name = name;
		this.aID = aID;
		this.courseList = li;
	}
}
