package po;
import java.util.ArrayList;
public class TeacherPO {
  String ID;
  String name;
  String type;
  String aID;
  ArrayList<CoursePO> courseList;
  
  public TeacherPO(String ID, String name, String type, String aID, ArrayList<CoursePO> list){
	  this.ID=ID;
	  this.name=name;
	  this.type=type;
	  this.aID=aID;
	  this.courseList=list;
  }
  
  public String getID(){
	  return ID;
  }
  
  public String getName(){
	  return name;
  }
  
  public String getType(){
	  return type;
  }
  
  public String getAID(){
	  return aID;
  }
  
  public ArrayList<CoursePO> getCourseList(){
	  return courseList;
  }
}
