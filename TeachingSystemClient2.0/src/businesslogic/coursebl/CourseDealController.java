package businesslogic.coursebl;

import java.util.ArrayList;
import vo.CourseVO;
import vo.StudentVO;
import vo.TeacherVO;
import businesslogicservice.courseblservice.*;

public class CourseDealController implements CourseBLService{

	 public CourseVO showCourse(long ID){
		 return new CourseDeal().showCourse(ID);
	 }
	 
	 public ArrayList<CourseVO> showCourse(String aID){
		 return new CourseDeal().showCourse(aID);
	 }
	 
	 public ArrayList<CourseVO> showCourse(){
		 return new CourseDeal().showCourse();
	 }
	 
	 public ArrayList<CourseVO> showCourse(StudentVO student){
		 return new CourseDeal().showCourse(student);
	 }
	 
	 public ArrayList<CourseVO> showCourse(TeacherVO teacher){
		 return new CourseDeal().showCourse(teacher);
	 }
	 
	 public boolean publishCourse(CourseVO course){
		 return new CourseDeal().publishCourse(course);
	 }
	 
	 public boolean editCourse(CourseVO course){
		 return new CourseDeal().editCourse(course);
	 }
	 
	 public boolean fillCourseInfo(CourseVO course,String detail){
		 return new CourseDeal().fillCourseInfo(course,detail);
	 }
	 
	 public boolean recordScore(CourseVO course,StudentVO student,int score){
		 return new CourseDeal().recordScore(course, student,score);
	 }
	 
	 public boolean selectCourse(CourseVO course,StudentVO student){
		 return  new CourseDeal().selectCourse(course,student);
	 }
	 
	 public boolean quitCourse(CourseVO course,StudentVO student){
		 return new CourseDeal().quitCourse(course,student);
	 }
	 
	 public int showScore(StudentVO student, CourseVO course){
		 return new CourseDeal().showScore(student, course);
	 }
	 
	 public ArrayList<CourseVO> showScore(String ID){
		 return new CourseDeal().showScore(ID);
	 }
	 
	 public boolean people(long courseID,long maxPeople){
		 return new CourseDeal().people(courseID,maxPeople);
	 }
	 
	 public ArrayList<String> showPeople(){
		 return new CourseDeal().showPeople();
	 }
	 
	 public ArrayList<String> showPeople(long aID){
		 return new CourseDeal().showPeople(aID);
	 }
	 
	 public String findPeople(String ID){
		 return new CourseDeal().findPeople(ID);
	 }
	 
	 public boolean addOne(String ID){
		return  new CourseDeal().addOne(ID);
	 }
	 
	 public boolean deleteOne(String ID){
		 return new CourseDeal().deleteOne(ID);
	 }
	 
	 public boolean publishCourseCredit(long courseID,long credit){
		 return new CourseDeal().publishCourseCredit(courseID,credit);
	 }
	 
	 public ArrayList<CourseVO> showScore2(String stuID, int term){
		 return new CourseDeal().showScore2(stuID,term);
	 }
	 
	 public ArrayList<CourseVO> showCourse2(int aID){            //查看学院课程
		 return new CourseDeal().showCourse2(aID);
	 }
	 
	 public ArrayList<CourseVO> showAllScore(String stuID){
		 return new CourseDeal().showAllScore(stuID);
	 }
	 
	 public boolean selectCourseTmp(CourseVO course, StudentVO student){
		 return new CourseDeal().selectCourseTmp(course,student);
	 }
	 
	 public boolean addToSelectInfo(long courseID){
		 return new CourseDeal().addToSelectInfo(courseID);
	 }
	 
	 public boolean isFull(String ID){
		 return new CourseDeal().isFull(ID);
	 }
	 
	 public boolean endCourse(){
		 return new CourseDeal().endCourse();
	 }
	 
	 public int findCourseIDByCourseName(String courseName){
		 return new CourseDeal().findCourseIDByCourseName(courseName);
	 }
}
