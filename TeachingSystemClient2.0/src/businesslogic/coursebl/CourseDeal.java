package businesslogic.coursebl;

import java.util.ArrayList;
import presentation.mainui.MainUI;
import vo.CourseVO;
import vo.StudentVO;
import vo.TeacherVO;
import businesslogic.studentbl.StudentDealController;
import businesslogicservice.courseblservice.CourseBLService;

public class CourseDeal implements CourseBLService{
	 public CourseVO showCourse(long ID){
		MainUI.net.sendMessage("showCoursewithCourseID "+ID);
		String info=MainUI.net.getMessage();
		String[] split=info.split(" ");
		ArrayList<StudentVO> list=new ArrayList<StudentVO>();
		if(split[5].equals("null")){
			list=null;
		}
		else{
		String[] split2=split[5].split("、");
		for(int i=0;i<=split2.length-1;i++){
			String[] split3=split2[i].split("@");
			StudentVO student=new StudentDealController().showStudent(split3[0]);
			list.add(student);
		}
		}
		CourseVO course=new CourseVO(Long.parseLong(split[0]),split[1],split[2],split[3],split[4],list,0,Long.parseLong(split[6]));
	   return course;
	 }
	 
	 public ArrayList<CourseVO> showCourse(String aID){
		 MainUI.net.sendMessage("showCoursewithAID "+aID);
		 String info=MainUI.net.getMessage();
		 if(info.equals("null"))
			 return null;
		 String[] split=info.split(";");
		 ArrayList<CourseVO> courselist=new ArrayList<CourseVO>();
		for(int i=0;i<=split.length-1;i++){
			String[] split2=split[i].split(" ");
			CourseVO course=new CourseVO(Long.parseLong(split2[0]),split2[1],split2[2],split2[3],split2[4],null,0,0);
			   courselist.add(course);
		}
		 return courselist;
	 }
	 
	 public ArrayList<CourseVO> showCourse(){
		 MainUI.net.sendMessage("showCourse");
		 String info=MainUI.net.getMessage();
		 if(info.equals("null")){
			 return null;
		 }
		 String[] split=info.split(";");
		 ArrayList<CourseVO> courseList=new ArrayList<CourseVO>();
		 for(int i=0;i<=split.length-1;i++){
			 String[] split2=split[i].split(" ");
			 CourseVO course=new CourseVO(Long.parseLong(split2[0]),split2[1],split2[2],split2[3],split2[4],null,0,Long.parseLong(split2[5]));
			 courseList.add(course);
		 }
		 return courseList;
	 }
	 
	 public ArrayList<CourseVO> showCourse(StudentVO student){
		 MainUI.net.sendMessage("showCoursewithStudentID "+student.ID);
		 String info=MainUI.net.getMessage();
		 if(info.equals("null"))
			 return null;
		 String split[]=info.split(";");
		 ArrayList<CourseVO> list=new ArrayList<CourseVO>();
		 for(int i=0;i<=split.length-1;i++){
			 String[] split2=split[i].split(" ");
			 list.add(new CourseVO(Long.parseLong(split2[0]),split2[1],split2[2],split2[3],split2[4],null,0,Long.parseLong(split2[5])));
		 }
		 return list;
	 }
	 
	 public ArrayList<CourseVO> showCourse(TeacherVO teacher){
		 MainUI.net.sendMessage("showCoursewithTeacherID "+teacher.ID);
		 String info=MainUI.net.getMessage();
		 if(info.equals("null")){
			 return null;
		 }
		 String[] split=info.split(";");
		 ArrayList<CourseVO> list=new ArrayList<CourseVO>();
		 for(int i=0;i<=split.length-1;i++){
			 String[] split2=split[i].split(" ");
			 list.add(new CourseVO(Long.parseLong(split2[0]),split2[1],"","","",null,0,0));
		 }
		 return list;
	 }
	 
	 public boolean publishCourse(CourseVO course){
		 String info=course.ID+" "+course.courseName+" "+course.teacherID+" "+course.time+" "+course.location+" "+course.aID;
		 MainUI.net.sendMessage("publishCourse "+info);
		 String message=MainUI.net.getMessage();
		 if(message.equals("success"))
		 return true;
		 else
		 return false;
	 }
	 
	 public boolean editCourse(CourseVO course){
		 String changeinfo=course.ID+" "+course.courseName+" "+course.teacherID+" "+course.time+" "+course.location;
		 MainUI.net.sendMessage("editCourse "+changeinfo);
		 return true;
	 }
	 
	 public boolean fillCourseInfo(CourseVO course, String detail){
		 MainUI.net.sendMessage("fillCourseInfo "+course.ID+" "+detail);
		 return true;
	 }
	 
	 public boolean recordScore(CourseVO course,StudentVO student,int score){
		 MainUI.net.sendMessage("recordScore "+course.ID+" "+student.ID+" "+score);
		 return true;
	 }
	 
	 public boolean selectCourse(CourseVO course,StudentVO student){
		 MainUI.net.sendMessage("selectCourse "+course.ID+" "+student.ID);
		 String can=MainUI.net.getMessage();
		 if(can.equals("true"))
		   return true;
		 else
		   return false;
	 }
	 
	 public boolean quitCourse(CourseVO course,StudentVO student){
		 String info=course.ID+" "+student.ID;
		 MainUI.net.sendMessage("quitCourse "+info);
		 return true;
	 }
	 
	 public int showScore(StudentVO student, CourseVO course){
		 return 100;
	 }
	 
	 public ArrayList<CourseVO> showScore(String ID){
		 ArrayList<CourseVO> list=new ArrayList<CourseVO>();
		 MainUI.net.sendMessage("showScorewithID"+" "+ID);
		 String info=MainUI.net.getMessage();
		 if(info.equals("null"))
			 return null;
		 String[] split=info.split(";");
		 for(int i=0;i<=split.length-1;i++){
			 String[] split2=split[i].split(" ");
			 CourseVO course=new CourseVO(Long.parseLong(split2[0]),split2[1],null,null,null,null,Integer.parseInt(split2[2]),1);
			 list.add(course);
		 }
		 return list;
	 }
	 
	 public boolean people(long courseID,long maxPeople){
		 MainUI.net.sendMessage("people "+courseID+" "+maxPeople);
		 String info=MainUI.net.getMessage();
		 if(info.equals("true"))
		     return true;
		 else
			 return false;
	 }
	 
	 public int findCourseIDByCourseName(String courseName){
		 MainUI.net.sendMessage("findCourseIDByCourseName "+courseName);
		 String info=MainUI.net.getMessage();
	//	 System.out.println(info);
		 if(info.equals("null")){
			 return -1;
		 }
		 else{
			 return Integer.parseInt(info);
		 }
	 }
	 
	 public ArrayList<String> showPeople(){
		 MainUI.net.sendMessage("showPeople");
		 String info=MainUI.net.getMessage();
		 ArrayList<String> list=new ArrayList<String>();
		 if(info.equals("null"))
			 return null;
		 else{
			 String[] split=info.split(";");
			 for(int i=0;i<=split.length-1;i++){
				 list.add(split[i]);
			 }
			 return list;
		 }		 		
	 }
	 
	 public ArrayList<String> showPeople(long aID){
		 MainUI.net.sendMessage("showPeoplewithAID "+aID);
		 String info=MainUI.net.getMessage();
		 ArrayList<String> list=new ArrayList<String>();
		 if(info.equals("null"))
			 return null;
		 else{
			 String[] split=info.split(";");
			 for(int i=0;i<=split.length-1;i++){
				 list.add(split[i]);
			 }
			 return list;
		 }		 		
	 }
	 
	 public String findPeople(String ID){
		 MainUI.net.sendMessage("findPeople "+ID);
		 String info=MainUI.net.getMessage();
		 return info;
	 }
	 
	 public boolean addOne(String ID){
		 MainUI.net.sendMessage("addOne "+ID);
		 return true;
	 }
	 
	 public boolean deleteOne(String ID){
		 MainUI.net.sendMessage("deleteOne "+ID);
		 return true;
	 }
	 
	 public boolean publishCourseCredit(long courseID,long credit){
	MainUI.net.sendMessage("publishCourseCredit "+courseID+" "+credit);
	 return true;
	 }
	 
	 public ArrayList<CourseVO> showScore2(String stuID,int term){      //查看学生过去某学期的课程的成绩
		 MainUI.net.sendMessage("showScore2 "+stuID+" "+term);
		 String info=MainUI.net.getMessage();
		 if(info.equals("null")){
			 return null;
		 }
		 String[] split=info.split(";");
		 ArrayList<CourseVO> list=new ArrayList<CourseVO>();
		 for(int i=0;i<=split.length-1;i++){
			 String[] split2=split[i].split(" ");
			 CourseVO vo=new CourseVO(Long.parseLong(split2[0]),split2[1],null,null,null,null,Integer.parseInt(split2[2]),0);
			 list.add(vo);
		 }
		 return list;
	 }
	 
	 public ArrayList<CourseVO> showCourse2(int aID){
		 MainUI.net.sendMessage("showCourse2 "+aID);
		 String info=MainUI.net.getMessage();
		 if(info.equals("null"))
			 return null;
		 String[] split=info.split(";");
		 ArrayList<CourseVO> courselist=new ArrayList<CourseVO>();
		for(int i=0;i<=split.length-1;i++){
			String[] split2=split[i].split(" ");
			CourseVO course=new CourseVO(Long.parseLong(split2[0]),split2[1],split2[2],split2[3],split2[4],null,0,0);
			   courselist.add(course);
		}
		 return courselist;
	 }
	 
	 public ArrayList<CourseVO> showAllScore(String stuID){
		 MainUI.net.sendMessage("showAllScore "+stuID);
		 String info=MainUI.net.getMessage();
		 if(info.equals("null")){
			 return null;
		 }
		 String[] split=info.split(";");
		 ArrayList<CourseVO> list=new ArrayList<CourseVO>();
		 for(int i=0;i<=split.length-1;i++){
			 String[] split2=split[i].split(" ");
			 CourseVO vo=new CourseVO(Long.parseLong(split2[0]),split2[1],null,null,null,null,Integer.parseInt(split2[2]),0);
			 list.add(vo);
		 }
		 return list;
	 }
	 
	 public boolean selectCourseTmp(CourseVO course, StudentVO student){
		 MainUI.net.sendMessage("selectCourseTmp "+course.ID+" "+student.ID);
		 return true;
	 }
	 
 public boolean addToSelectInfo(long courseID){
		 MainUI.net.sendMessage("addToSelectInfo "+courseID);
		 return true;
	 }
 
 public boolean isFull(String ID){
	 MainUI.net.sendMessage("isFull "+ID);
	 String message=MainUI.net.getMessage();
	 if(message.equals("true"))
		 return true;
	 else{
		 return false;
	 }
 }
	 
	 public boolean endCourse(){
		 return true;
	 }
}
