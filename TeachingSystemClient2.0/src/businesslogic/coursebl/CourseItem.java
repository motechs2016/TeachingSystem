package businesslogic.coursebl;

import java.util.ArrayList;

import vo.StudentVO;

public class CourseItem {
	   public   long  ID;  //�γ̱��
	    public String courseName;  //�γ���
	    public String teacherID; //�ο���ʦ����
	   public  String time;   //�Ͽ�ʱ��
	   public  String location; //�Ͽεص�
	    public ArrayList<StudentVO> studentList;   //�γ̵�ѧ���б�
	    public int score; //�ɼ�
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
