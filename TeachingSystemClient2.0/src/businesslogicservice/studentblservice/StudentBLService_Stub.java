package businesslogicservice.studentblservice;

import java.util.ArrayList;

import vo.CourseVO;
import vo.StudentVO;
import vo.TeacherVO;

public class StudentBLService_Stub implements StudentBLService{
	 public   String ID; //ѧ��ѧ��
	 public    String name; //ѧ������
	 public   long aID;  //ѧ������Ժϵ
	 public   ArrayList<CourseVO> courseList; //ͬѧ��ѡ���б�
	    
	     public StudentBLService_Stub(String ID, String name, long aID, ArrayList<CourseVO> li){
	    	this.ID=ID;
	    	this.name=name;
	    	this.aID=aID;
	    	this.courseList=li;
	    }
	
	     public boolean addStudent(String ID, String name, long aID){
	    	 return true;
	     }
		  
		  public StudentVO showStudent(String ID){
			  return null;
		  }
		  
		  public ArrayList<StudentVO> showStudent(){
			  return null;
		  }
		  
		  public ArrayList<StudentVO> showStudent(TeacherVO teacher){
			  return null;
		  }
		  
		  public ArrayList<StudentVO> showStudent(CourseVO course){
			  return null;
		  }
		  
		  public boolean writeTime(String time){
			  return true;
		  }
		  
		  public String registerTime(String ID){
			  return "Jan/2012";
		  }
		  
		  public boolean addStudent2(String stuID){
			  return true;
		  }
		  
		  public boolean endStudent(){
			  return true;
		  }
}
