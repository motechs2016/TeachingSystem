package businesslogicservice.courseblservice;
import vo.*;
import java.util.ArrayList;
public class CourseBLService_Driver {

	 public void drive(CourseBLService courseBLService){
		 CourseVO course=courseBLService.showCourse(1);
		 System.out.println(course.courseName);
		 ArrayList<CourseVO> list1=courseBLService.showCourse();
		 System.out.println(list1.toString());
		 ArrayList<CourseVO> list2=courseBLService.showCourse("1");
		 System.out.println(list2.toString());
		 ArrayList<CourseVO> list3=courseBLService.showCourse(new StudentVO("131250105","小明",12,null));
		 System.out.println(list3.toString());
		 boolean message1=courseBLService.publishCourse(new CourseVO(1,"Calculus","121250120",null,null,null,80,1));
		 if(message1==true)
			 System.out.println("Succeed in publishing");
		 else 
			 System.out.println("Fail to publish");
		 boolean message2=courseBLService.editCourse(new CourseVO(1,"Calculus","121250120",null,null,null,80,1));
		 if(message2==true)
			 System.out.println("Succeed in editing");
		 else 
			 System.out.println("Fail to edit");
		 boolean message3=courseBLService.fillCourseInfo(new CourseVO(1,"Calculus","121250120",null,null,null,80,1),"a test");
		 if(message3==true)
			 System.out.println("Succeed in filling");
		 else 
			 System.out.println("Fail to fill");
		 boolean message4=courseBLService.recordScore(new CourseVO(1,"Calculus","121250120",null,null,null,80,1),new StudentVO("131250105","小明",12,null),95);
		 if(message4==true)
			 System.out.println("Succeed in recording");
		 else 
			 System.out.println("Fail to record");
		 boolean message5=courseBLService.selectCourse(new CourseVO(1,"Calculus","121250120",null,null,null,80,1),new StudentVO("131250105","小明",12,null));
		 if(message5==true)
			 System.out.println("Succeed in selecting");
		 else 
			 System.out.println("Fail to select");
		 boolean message6=courseBLService.quitCourse(new CourseVO(1,"Calculus","121250120",null,null,null,80,1),new StudentVO("131250105","小明",12,null));
		 if(message6==true)
			 System.out.println("Succeed in quiting");
		 else 
			 System.out.println("Fail to quit");
		 int score=courseBLService.showScore(new StudentVO("131250105","小明",12,null),new CourseVO(1,"Calculus","121250120",null,null,null,80,1));
		 System.out.println("The score is "+score);
		 courseBLService.endCourse();
		 
	 }
}
