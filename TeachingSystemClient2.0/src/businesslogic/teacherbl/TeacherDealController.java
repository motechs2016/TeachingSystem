package businesslogic.teacherbl;

import businesslogicservice.teacherblservice.*;
import vo.*;
import java.util.ArrayList;

public class TeacherDealController implements TeacherBLService{
	
	public boolean addTeacher(String ID, String name, String type,long aID){
		return new TeacherDeal().addTeacher(ID, name, type, aID);
	}
     public ArrayList<TeacherVO> showTeacher(){
    	 return new TeacherDeal().showTeacher();
     }
     
     public TeacherVO showTeacher(String ID){
    	 return new TeacherDeal().showTeacher(ID);
     }
     
     public long showHisAID(String ID){
    	 return new TeacherDeal().showHisAID(ID);
     }
     public boolean endTeacher(){
    	 return new TeacherDeal().endTeacher();
     }
}
