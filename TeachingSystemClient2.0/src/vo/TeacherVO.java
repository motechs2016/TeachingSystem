package vo;
import java.util.ArrayList;
public class TeacherVO {
  public  String ID;  //��ʦ����
  public  String name; //����
  public  String type;  //��ʦ���ͣ�����Ա��Ժϵ����Ա������Ա���ο���ʦ
  public  long aID;  //��ʦ����ԺϵID
  public  ArrayList<CourseVO> courseList;  //��ʦ�Ŀγ��б�
   
   public TeacherVO(String ID, String name, String type, long aID, ArrayList<CourseVO> li){
	   this.ID=ID;
	   this.name=name;
	   this.type=type;
	   this.aID=aID;
	   this.courseList=li;
   }
}
