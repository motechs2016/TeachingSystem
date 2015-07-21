package dataservice.teacherdataservice;
import po.*;
public class TeacherDataService_Driver {
	public void drive(TeacherDataService teacherDataService){
		TeacherPO teacherPO = teacherDataService.find("121250102");
		if(teacherPO.getID()!=null)
			System.out.println("exists");
		teacherDataService.insert(new TeacherPO("121250102","Qin Liu","任课老师","12",null));
		teacherDataService.delete(new TeacherPO("121250102","Qin Liu","任课老师","12",null));
		teacherDataService.update(new TeacherPO("121250102","Qin Liu","任课老师","12",null));
	}
}
