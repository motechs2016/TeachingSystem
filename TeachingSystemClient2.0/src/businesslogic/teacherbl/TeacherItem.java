package businesslogic.teacherbl;

import java.util.ArrayList;

import vo.CourseVO;

public class TeacherItem {
	  public  long ID;  //��ʦ����
	  public  String name; //����
	  public  String type;  //��ʦ���ͣ�����Ա��Ժϵ����Ա������Ա���ο���ʦ
	  public  long aID;  //��ʦ����ԺϵID
	  public  ArrayList<CourseVO> courseList;  //��ʦ�Ŀγ��б�
	   
	   public TeacherItem(long ID, String name, String type, long aID, ArrayList<CourseVO> li){
		   this.ID=ID;
		   this.name=name;
		   this.type=type;
		   this.aID=aID;
		   this.courseList=li;
	   }
}
