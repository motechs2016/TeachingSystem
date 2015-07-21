package businesslogic.studentbl;

import java.util.ArrayList;
import vo.CourseVO;
import vo.StudentVO;
import vo.TeacherVO;
import businesslogicservice.studentblservice.*;

public class StudentDealController implements StudentBLService{
	
	public boolean addStudent(String ID, String name, long aID){
		return new StudentDeal().addStudent(ID,name,aID);
}
	  
	  public StudentVO showStudent(String ID){
		  return new StudentDeal().showStudent(ID);
}
	  
	  public ArrayList<StudentVO> showStudent() {
	  return new StudentDeal().showStudent();
}
	  
	  public ArrayList<StudentVO> showStudent(TeacherVO teacher){
		  return new StudentDeal().showStudent(teacher);
}
	  
	  public ArrayList<StudentVO> showStudent(CourseVO course){
		  return new StudentDeal().showStudent(course);
}
	  
	  public boolean writeTime(String time){
		  return new StudentDeal().writeTime(time);
	  }
	  
	  public String registerTime(String ID){
		  return new StudentDeal().registerTime(ID);
	  }
	  
	  public boolean addStudent2(String stuID){
		  return new StudentDeal().addStudent2(stuID);
	  }
	  
	  public boolean endStudent(){
	  return new StudentDeal().endStudent();
	}

}
