package businesslogicservice.studentblservice;
import vo.*;

import java.util.ArrayList;

import presentation.mainui.MainUI;
public interface StudentBLService {
	
	public boolean addStudent(String ID, String name, long aID);
	  
	  public StudentVO showStudent(String ID);
	  
	  public ArrayList<StudentVO> showStudent();
	  
	  public ArrayList<StudentVO> showStudent(TeacherVO teacher);
	  
	  public ArrayList<StudentVO> showStudent(CourseVO course);
	  
	  public boolean writeTime(String time);  //记录学生的入学时间
	  
	  public String registerTime(String ID);
	  
	  public boolean addStudent2(String stuID);
	  
	  public boolean endStudent();
}
