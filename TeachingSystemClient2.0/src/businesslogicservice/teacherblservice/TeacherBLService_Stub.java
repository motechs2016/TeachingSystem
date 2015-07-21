package businesslogicservice.teacherblservice;

import java.util.ArrayList;

import vo.CourseVO;
import vo.TeacherVO;

public class TeacherBLService_Stub implements TeacherBLService{
	  public String ID;  //��ʦ����
	  public  String name; //����
	  public  String type;  //��ʦ���ͣ�����Ա��Ժϵ����Ա������Ա���ο���ʦ
	  public  long aID;  //��ʦ����ԺϵID
	  public  ArrayList<CourseVO> courseList;  //��ʦ�Ŀγ��б�
	   
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
