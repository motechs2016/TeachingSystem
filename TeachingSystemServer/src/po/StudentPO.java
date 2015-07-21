package po;
import java.util.ArrayList;
public class StudentPO {
  String ID;
  String name;
  long aID;
  ArrayList<CoursePO> courseList;
  
  public StudentPO(String ID, String name, long aID, ArrayList<CoursePO> list){
	  this.ID=ID;
	  this.name=name;
	  this.aID=aID;
	  this.courseList=list;
	  
  }
  
  public String getID(){
	  return ID;
  }
  
  public String getName(){
	  return name;
  }
  
  public long getAID(){
	  return aID;
  }
  
  public ArrayList<CoursePO> getCourseList(){
	  return courseList;
  }
}
