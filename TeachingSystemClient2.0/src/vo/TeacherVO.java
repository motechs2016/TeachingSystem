package vo;
import java.util.ArrayList;
public class TeacherVO {
  public  String ID;  //老师工号
  public  String name; //姓名
  public  String type;  //老师类型：管理员，院系教务员，教务员，任课老师
  public  long aID;  //老师所属院系ID
  public  ArrayList<CourseVO> courseList;  //老师的课程列表
   
   public TeacherVO(String ID, String name, String type, long aID, ArrayList<CourseVO> li){
	   this.ID=ID;
	   this.name=name;
	   this.type=type;
	   this.aID=aID;
	   this.courseList=li;
   }
}
