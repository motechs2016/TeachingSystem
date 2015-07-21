package businesslogicservice.studentblservice;
import vo.*;
import java.util.ArrayList;
public class StudentBLService_Driver {

	  public void drive(StudentBLService studentBLService){
		  boolean message=studentBLService.addStudent("131250105", "小明", 12);
		  if(message==true)
			  System.out.println("Success in adding a student");
		  else
			  System.out.println("Fail to add a student");
		  StudentVO student=studentBLService.showStudent("131250102");
		  System.out.println(student.name);
		  ArrayList<StudentVO> l1=studentBLService.showStudent();
		  System.out.println(l1.toString());
		  ArrayList<StudentVO> l2=studentBLService.showStudent(new TeacherVO("121250102","Qin Liu","任课老师",12,null));
		  System.out.println(l2.toString());
		  ArrayList<StudentVO> l3=studentBLService.showStudent(new CourseVO(1,null,"121250102",null,null,null,100,1));
		  System.out.println(l3.toString());
		  studentBLService.endStudent();
	  }
}
