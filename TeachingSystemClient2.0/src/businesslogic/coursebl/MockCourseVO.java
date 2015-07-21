package businesslogic.coursebl;

import java.util.ArrayList;

import vo.CourseVO;
import vo.StudentVO;

public class MockCourseVO extends CourseVO {
    public   long  ID;  //课程编号
    public String courseName;  //课程名
    public String teacherID; //任课老师工号
   public  String time;   //上课时间
   public  String location; //上课地点
    public ArrayList<StudentVO> studentList;   //课程的学生列表
    public int score; //成绩
    public long aID;
    
	public MockCourseVO(long ID, String courseName, String teacherID,
			String time, String location, ArrayList<StudentVO> l1, int score,
			long aID) {
		super(ID,courseName,teacherID,time,location,l1,score,aID);
	}
}
