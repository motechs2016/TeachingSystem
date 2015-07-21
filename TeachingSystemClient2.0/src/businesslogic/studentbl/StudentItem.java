package businesslogic.studentbl;

import java.util.ArrayList;

import vo.CourseVO;

public class StudentItem {
	public String ID; // 学生学号
	public String name; // 学生姓名
	public long aID; // 学生所在院系
	public ArrayList<CourseVO> courseList; // 同学的选课列表

	public StudentItem(String ID, String name, long aID, ArrayList<CourseVO> li) {
		this.ID = ID;
		this.name = name;
		this.aID = aID;
		this.courseList = li;
	}
}
