package vo;
import java.util.ArrayList;
public class StudentVO {
 public   String ID; //ѧ��ѧ��
 public    String name; //ѧ������
 public   long aID;  //ѧ������Ժϵ
 public   ArrayList<CourseVO> courseList; //ͬѧ��ѡ���б�
    
    public StudentVO(String ID, String name, long aID, ArrayList<CourseVO> li){
    	this.ID=ID;
    	this.name=name;
    	this.aID=aID;
    	this.courseList=li;
    }
}
