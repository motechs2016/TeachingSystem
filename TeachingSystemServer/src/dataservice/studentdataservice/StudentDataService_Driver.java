package dataservice.studentdataservice;
import po.*;
public class StudentDataService_Driver {
	public void drive(StudentDataService studentDataService){
		StudentPO studentDataPO =  studentDataService.find("121250102");
		if(studentDataPO.getID()!=null)
			System.out.println("exists");
		studentDataService.insert(new StudentPO("121250102","Äßè´ÕÂ",12,null));
		studentDataService.delete(new StudentPO("121250102","Äßè´ÕÂ",12,null));
		studentDataService.update(new StudentPO("121250102","Äßè´ÕÂ",12,null));
	}
}
