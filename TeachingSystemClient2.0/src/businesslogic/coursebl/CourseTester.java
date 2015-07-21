package businesslogic.coursebl;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import vo.CourseVO;
import vo.StudentVO;
import vo.TeacherVO;

public class CourseTester {
	//���Э���ļ��ɲ���
	@Before
	public void setUp() throws Exception {
	}

	@Ignore
	public void testshowCoursewithID() {
		new CourseDealController().showCourse(1);
		new CourseDealController().showCourse(3);
		new CourseDealController().showCourse(19);
	}

	@Ignore
	public void testshowCoursewithaID(){
		new CourseDealController().showCourse("12");
		new CourseDealController().showCourse("1");
		new CourseDealController().showCourse("5");
	}
	
	@Ignore
	public void testshowCourse(){
		ArrayList<CourseVO> course = new CourseDealController().showCourse();
		assertEquals(new CourseVO(1,"΢����IV","951260122","����1~2","�ɶ�111",null,0,12),course.get(0) );
		assertEquals(new CourseVO(11,"Ԫ��","887766554","����2~4","ͼ���212",null,0,1),course.get(4));
		assertEquals(new CourseVO(62,"���������III","951260122","����9~11","ͼ���121",null,0,1),course.get(10));
	}
	
	@Ignore
	public void testshowCoursewithStudent(){
		ArrayList<CourseVO> course = new CourseDealController().showCourse(new StudentVO("070110001","����",1,null));
		assertEquals(new CourseVO(11,"Ԫ��","887766554","����2~4","ͼ���212",null,0,1),course.get(1));
		ArrayList<CourseVO> course2 = new CourseDealController().showCourse(new StudentVO("121250102","��½��",12,null));
		assertEquals(new CourseVO(1,"΢����IV","951260122","����1~2","�ɶ�111",null,0,12),course2.get(0));
	}
	
	@Ignore
	public void testshowCoursewithTeacher(){
		ArrayList<CourseVO> course = new CourseDealController().showCourse(new TeacherVO("000001201","��ϼ","�ο���ʦ",12,null));
		assertEquals(new CourseVO(1,"΢����IV","951260122","����1~2","�ɶ�111",null,0,12),course.get(0));
		ArrayList<CourseVO> course1 = new CourseDealController().showCourse(new TeacherVO("999999999","������","�ο���ʦ",1,null));
		assertEquals(new CourseVO(11,"Ԫ��","887766554","����2~4","ͼ���212",null,0,1),course1.get(0));
	}
	
	@Ignore
	public void testpublishCourse(){
		new CourseDealController().publishCourse(new CourseVO(62,"���������III","951260122","����9~11","ͼ���121",null,0,1));
		new CourseDealController().publishCourse(new CourseVO(19,"���Դ���II","951260122","����2~4","ͼ���211",null,0,12));
		new CourseDealController().publishCourse(new CourseVO(34,"ʫ����","887766554","����2~4","ͼ���210",null,0,1));
	}
	
	@Ignore
	public void testeditCourse(){
		new CourseDealController().editCourse(new CourseVO(62,"���������III","951260122","����9~11","ͼ���122",null,0,1));
		new CourseDealController().editCourse(new CourseVO(19,"���Դ���II","951260122","����2~4","ͼ���211",null,0,12));
		new CourseDealController().editCourse(new CourseVO(34,"ʫ����","887766553","����2~4","ͼ���210",null,0,1));
	}
	
	@Ignore
	public void testfillCourseInfo(){
		new CourseDealController().fillCourseInfo(new CourseVO(62,"���������III","951260122","����9~11","ͼ���121",null,0,1), "���ſγ̺���Ȥ");
		new CourseDealController().fillCourseInfo(new CourseVO(19,"���Դ���II","951260122","����2~4","ͼ���211",null,0,12), "���ſγ̺���Ȥ");
		new CourseDealController().fillCourseInfo(new CourseVO(34,"ʫ����","887766554","����2~4","ͼ���210",null,0,1),"��˵��Ȥ����Ȥ");
	}
	
	@Ignore
	public void testrecordScore(){
		new CourseDealController().recordScore(new CourseVO(1,"΢����IV","951260122","����1~2","�ɶ�111",null,0,12), new StudentVO("121250102","��½��",12,null), 59);
		new CourseDealController().recordScore(new CourseVO(11,"Ԫ��","887766554","����2~4","ͼ���212",null,0,1), new StudentVO("070110001","����",1,null), 101);
	}
	
	@Ignore
	public void testselectCourse(){
		new CourseDealController().selectCourse(new CourseVO(1,"΢����IV","951260122","����1~2","�ɶ�111",null,0,12), new StudentVO("121250102","��½��",12,null));
		new CourseDealController().selectCourse(new CourseVO(11,"Ԫ��","887766554","����2~4","ͼ���212",null,0,1), new StudentVO("070110001","����",1,null));
	}
	
	@Ignore
	public void testquitCourse(){
		new CourseDealController().quitCourse(new CourseVO(1,"΢����IV","951260122","����1~2","�ɶ�111",null,0,12), new StudentVO("121250102","��½��",12,null));
		new CourseDealController().quitCourse(new CourseVO(11,"Ԫ��","887766554","����2~4","ͼ���212",null,0,1), new StudentVO("070110001","����",1,null));
	}
	
	@Ignore
	public void testpeople(){
		new CourseDealController().people(19,255);
		new CourseDealController().people(59, 255);
	}
	
	@Ignore
	public void testshowPeople(){
		ArrayList<String> st = new CourseDealController().showPeople();
		assertEquals("255",st.get(17));
		assertEquals("255",st.get(57));
	}
	
	@Ignore
	public void testshowPeoplewithaID(){
		ArrayList<String> st = new CourseDealController().showPeople(12);
		assertEquals("255",st.get(0));
		assertEquals("255",st.get(3));
	}
	
	@Ignore
	public void testfindPeople(){
		String st = new CourseDealController().findPeople("19");
		assertEquals("255",st);
		String st2 = new CourseDealController().findPeople("59");
		assertEquals("255",st2);
	}
	
	@Ignore
	public void testaddOne(){
		new CourseDealController().addOne("19");
		new CourseDealController().addOne("19");
		new CourseDealController().addOne("59");
	}
	
	@Ignore
	public void testdeleteOne(){
		new CourseDealController().deleteOne("19");
		new CourseDealController().deleteOne("59");
		new CourseDealController().deleteOne("59");
	}
	
	@Ignore
	public void testpublishCourseCredit(){
		new CourseDealController().publishCourseCredit(11, 3);
		new CourseDealController().publishCourseCredit(19, 3);
	}
	
	@Ignore
	public void testshowScore2(){
		ArrayList<CourseVO> course = new CourseDealController().showScore2("101270891", 1);
		assertEquals(78,course.get(0).score);
	}
	
	@Ignore
	public void testshowCourse2(){
		ArrayList<CourseVO> course = new CourseDealController().showCourse2(12);
		assertEquals("���ݽṹ���㷨",course.get(3).courseName);
	}
	
	@Ignore
	public void testshowAllScore(){
		ArrayList<CourseVO> course = new CourseDealController().showAllScore("101270891");
		assertEquals(78,course.get(0).score);
	}
	
	@Ignore
	public void testselectCourseTmp(){
		new CourseDealController().selectCourseTmp(new CourseVO(11,"Ԫ��","887766554","����2~4","ͼ���212",null,0,1), new StudentVO("070110001","����",1,null));
		new CourseDealController().selectCourseTmp(new CourseVO(1,"΢����IV","951260122","����1~2","�ɶ�111",null,0,12), new StudentVO("121250102","��½��",12,null));
	}
	
	@Ignore
	public void testaddToSelectInfo(){
		new CourseDealController().addToSelectInfo(6);
		new CourseDealController().addToSelectInfo(19);
	}
	
	@Ignore
	public void testisFull(){
		new CourseDealController().isFull("19");
		new CourseDealController().isFull("100");
	}

}
