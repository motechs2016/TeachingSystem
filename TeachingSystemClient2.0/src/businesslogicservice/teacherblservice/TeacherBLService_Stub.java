package businesslogicservice.teacherblservice;

import java.util.ArrayList;

import vo.CourseVO;
import vo.TeacherVO;

public class TeacherBLService_Stub implements TeacherBLService{
	  public String ID;  //老师工号
	  public  String name; //姓名
	  public  String type;  //老师类型：管理员，院系教务员，教务员，任课老师
	  public  long aID;  //老师所属院系ID
	  public  ArrayList<CourseVO> courseList;  //老师的课程列表
	   
	   public TeacherBLService_Stub(String ID, String name, String type, long aID, ArrayList<CourseVO> li){
		   this.ID=ID;
		   this.name=name;
		   this.type=type;
		   this.aID=aID;
		   this.courseList=li;
	   }
	
		public boolean addTeacher(String ID, String name, String type,long aID){
			return true;
		}
	    
	    public ArrayList<TeacherVO> showTeacher(){
	    	return null;
	    }
	    
	    public TeacherVO showTeacher(String ID){
	    	return null;
	    }
	    
	    public long showHisAID(String ID){
	    	return 12;
	    }
	    
	    public boolean endTeacher(){
	    	return true;
	    }
}
