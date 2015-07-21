package businesslogic.studentbl;

import java.util.ArrayList;
import presentation.mainui.MainUI;
import vo.CourseVO;
import vo.StudentVO;
import vo.TeacherVO;
import businesslogicservice.studentblservice.*;

public class StudentDeal implements StudentBLService{
	public boolean addStudent(String ID, String name, long aID){
		MainUI.net.sendMessage("addStudent "+ID+" "+name+" "+aID);
		return true;
}
	  
	  public StudentVO showStudent(String ID){
		  MainUI.net.sendMessage("showStudentwithID"+" "+ID);
		  String studentinfo=MainUI.net.getMessage();
		  String[] split=studentinfo.split(" ");
		  StudentVO student=new StudentVO(split[0],split[1],Long.parseLong(split[2]),null);
		  return student;
}
	  
	  public ArrayList<StudentVO> showStudent() {
	 MainUI.net.sendMessage("showStudent");
	 String info=MainUI.net.getMessage();
	 if(info.equals("null"))
		 return null;
	 String[] split=info.split(";");
	 ArrayList<StudentVO> list=new ArrayList<StudentVO>();
	 for(int i=0;i<=split.length-1;i++){
		 String[] split2=split[i].split(" ");
		 StudentVO student=new StudentVO(split2[0],split2[1],Long.parseLong(split2[2]),null);
		 list.add(student);
	 }
	 return list;
}
	  
	  public ArrayList<StudentVO> showStudent(TeacherVO teacher){
		  return null;
}
	  
	  public ArrayList<StudentVO> showStudent(CourseVO course){
		  return null;
}
	  
	  public boolean writeTime(String time){
		  MainUI.net.sendMessage("writeTime "+time);
		  return true;
	  }
	  
	  public String registerTime(String ID){
		  MainUI.net.sendMessage("QueryHisRegisterTime "+ID);
		  String info=MainUI.net.getMessage();
		  return info;
	  }
	  
	  public boolean addStudent2(String stuID){
		  MainUI.net.sendMessage("addStudent2 "+stuID);
		  return true;
	  }
	  
	  public boolean endStudent(){
	  return true;
	}
}
