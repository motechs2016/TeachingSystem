package presentation.departmentofficeteacherui;

import presentation.userui.LoginUI;
import businesslogic.coursebl.CourseDealController;
import businesslogic.teacherbl.TeacherDealController;
import vo.CourseVO;

public class PublishCourse {

;
	//参数分别是：课程编号，课程名，老师工号，学分，时间，地点，限制人数
	public static String publishCourse(String a1,String a2,String a3,String a4,String a5,String a6,String a7){
		System.out.println("fuwuqi1");
		long aID=new TeacherDealController().showHisAID(LoginUI.userID);
		System.out.println("fuwuqi2");
		CourseVO course=new CourseVO(Long.parseLong(a1),a2,a3,a5,a6,null,0,aID);
        boolean message= new CourseDealController().publishCourse(course);
        new CourseDealController().people(Long.parseLong(a1),Long.parseLong(a7));
        new CourseDealController().publishCourseCredit(Long.parseLong(a1),Long.parseLong(a4));
        new CourseDealController().addToSelectInfo(Long.parseLong(a1));
        System.out.println("fuwuqi");
        if(message==false)
        	return "错误!课程编号已经存在";
        else{
        	return "发布成功";
        }
	}
}
