package businesslogicservice.courseblservice;
import vo.*;

import java.util.ArrayList;

import presentation.mainui.MainUI;
import businesslogic.studentbl.StudentDealController;
public interface CourseBLService {

	public CourseVO showCourse(long ID); //查看课程
	 
	 public ArrayList<CourseVO> showCourse(String aID); //查看学院课程
	 
	 public ArrayList<CourseVO> showCourse(); //查看全校的课程
	 
	 public ArrayList<CourseVO> showCourse(StudentVO student); //查看学生的课程
	 
	 public ArrayList<CourseVO> showCourse(TeacherVO teacher);  //查看老师的课程
	 
	 public boolean publishCourse(CourseVO course);   //发布课程
	 
	 public boolean editCourse(CourseVO course);   //编辑课程
	 
	 public boolean fillCourseInfo(CourseVO course, String detail);  //填写课程大纲
	 
	 public boolean recordScore(CourseVO course,StudentVO student,int score);  //登记成绩
	 
	 public boolean selectCourse(CourseVO course,StudentVO student); //选课
	 
	 public boolean quitCourse(CourseVO course,StudentVO student);   //退课
	 
	 public int showScore(StudentVO student, CourseVO course); //查看学生某课成绩
	 
	 public ArrayList<CourseVO> showScore(String ID);   //查看某学生所有课程的成绩
	 
	 public boolean people(long courseID,long maxPeople); 
	 
	 public ArrayList<String> showPeople();  //查看所有课程的已选/限选列表
	 
	 public ArrayList<String> showPeople(long aID); //查看这个学院课程的已选/限选列表
	 
	 public String findPeople(String ID);  //查看某课程的已选/限选列表
	 
	 public boolean addOne(String ID); //给该课程的已选人数+1
	 
	 public boolean deleteOne(String ID); //给该课程的已选人数-1
	 
	 public boolean publishCourseCredit(long courseID,long credit);  //发布课程的学分
	 
	 public ArrayList<CourseVO> showScore2(String stuID,int term);   //查看学生某学期的成绩
	 
	 public ArrayList<CourseVO> showCourse2(int aID);  //查看这个学院的课程
	 
	 public ArrayList<CourseVO> showAllScore(String stuID);  //查看这个学生的所有成绩
	 
	 public boolean selectCourseTmp(CourseVO course, StudentVO student); //选课
	 
     public boolean addToSelectInfo(long courseID);  //向选课数据库中添加这门课程的编号
 
    public boolean isFull(String ID);  //查看学生是否选满3门跨院系课程
	 
	 public boolean endCourse();
}
