package businesslogicservice.teacherblservice;
import vo.*;

import java.util.ArrayList;

import presentation.mainui.MainUI;
public interface TeacherBLService {
	
	public boolean addTeacher(String ID, String name, String type,long aID);
    
    public ArrayList<TeacherVO> showTeacher();
    
    public TeacherVO showTeacher(String ID);
    
    public long showHisAID(String ID);
    
    public boolean endTeacher();
}
