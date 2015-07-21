package businesslogicservice.teacherblservice;
import vo.*;
import java.util.ArrayList;
public class TeacherBLService_Driver {

	    public void drive(TeacherBLService teacherBLService){
	    	boolean message=teacherBLService.addTeacher("121250102","Qin Liu","»ŒøŒ¿œ ¶",12);
	    	if(message==true)
	    		System.out.println("Succeed in adding a teacher");
	    	else 
	    		System.out.println("Fail to add a teacher");
	    	TeacherVO teacher=teacherBLService.showTeacher("121250102");
	    	System.out.println(teacher.name);
	    	ArrayList<TeacherVO> list=teacherBLService.showTeacher();
	    	System.out.println(list.toString());
	    	teacherBLService.endTeacher();
	    }
}
