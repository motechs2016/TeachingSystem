package businesslogicservice.courseblservice;

import java.util.ArrayList;

import vo.CourseVO;
import vo.StudentVO;
import vo.TeacherVO;

public class CourseBLService_Stub implements CourseBLService{
	    public   long  ID;  //课程编号
	    public String courseName;  //课程名
	    public String teacherID; //任课老师工号
	    public  String time;   //上课时间
	    public  String location; //上课地点
	    public ArrayList<StudentVO> studentList;   //课程的学生列表
	    public int score; //成绩
	    public long aID;
	    
	    public CourseBLService_Stub(long ID,String courseName, String teacherID,String time, String location, ArrayList<StudentVO> l1, int score,long aID){
	    	this.ID=ID;
	    	this.courseName=courseName;
	    	this.teacherID=teacherID;
	    	this.time=time;
	    	this.location=location;
	    	this.studentList=l1;
	    	this.score=score;
	    	this.aID=aID;
	    }
	
	    public CourseVO showCourse(long ID){
	    	return null;
	    }
		 
		 public ArrayList<CourseVO> showCourse(String aID){
			 return null;
		 }
		 
		 public ArrayList<CourseVO> showCourse(){
			 return null;
		 }
		 
		 public ArrayList<CourseVO> showCourse(StudentVO student){
			 return null;
		 }
		 
		 public ArrayList<CourseVO> showCourse(TeacherVO teacher){
			 return null;
		 }
		 
		 public boolean publishCourse(CourseVO course){
			 return true;
		 }
		 
		 public boolean editCourse(CourseVO course){
			 return true;
		 }
		 
		 public boolean fillCourseInfo(CourseVO course, String detail){
			 return true;
		 }
		 
		 public boolean recordScore(CourseVO course,StudentVO student,int score){
			 return true;
		 }
		 
		 public boolean selectCourse(CourseVO course,StudentVO student){
			 return true;
		 }
		 
		 public boolean quitCourse(CourseVO course,StudentVO student){
			 return true;
		 }
		 
		 public int showScore(StudentVO student, CourseVO course){
			 return 100;
		 }
		 
		 public ArrayList<CourseVO> showScore(String ID){
		 return null;
        }
		 
		 public boolean people(long courseID,long maxPeople){
			 return true;
		 }
		 
		 public ArrayList<String> showPeople(){
			 return null;
		 }
		 
		 public ArrayList<String> showPeople(long aID){
			 return null;
		 }
		 
		 public String findPeople(String ID){
			 return "1/1";
		 }
		 
		 public boolean addOne(String ID){
			 return true;
		 }
		 
		 public boolean deleteOne(String ID){
			 return true;
		 }
		 
		 public boolean publishCourseCredit(long courseID,long credit){
			 return true;
		 }
		 
		 public ArrayList<CourseVO> showScore2(String stuID,int term){
			 return null;
		 }
		 
		 public ArrayList<CourseVO> showCourse2(int aID){
			 return null;
		 }
		 
		 public ArrayList<CourseVO> showAllScore(String stuID){
			 return null;
		 }
		 
		 public boolean selectCourseTmp(CourseVO course, StudentVO student){
			 return true;
		 }
		 
	     public boolean addToSelectInfo(long courseID){
	    	 return true;
	     }
	 
	    public boolean isFull(String ID){
	    	return true;
	    }
		 
		 public boolean endCourse(){
			 return true;
		 }
}
