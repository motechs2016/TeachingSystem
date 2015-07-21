package businesslogic.coursebl;

import java.util.ArrayList;

import vo.StudentVO;

public class CourseItem {
	   public   long  ID;  //课程编号
	    public String courseName;  //课程名
	    public String teacherID; //任课老师工号
	   public  String time;   //上课时间
	   public  String location; //上课地点
	    public ArrayList<StudentVO> studentList;   //课程的学生列表
	    public int score; //成绩
	    public long aID;
	    
	    public CourseItem(long ID,String courseName, String teacherID,String time, String location, ArrayList<StudentVO> l1, int score,long aID){
	    	this.ID=ID;
	    	this.courseName=courseName;
	    	this.teacherID=teacherID;
	    	this.time=time;
	    	this.location=location;
	    	this.studentList=l1;
	    	this.score=score;
	    	this.aID=aID;
	    }
}
