package businesslogic.studentbl;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import vo.CourseVO;
import vo.StudentVO;
import vo.TeacherVO;

public class StudentTester {

	@Before
	public void setUp() throws Exception {
	}

	@Ignore
	public void testAddStudent() {
		new StudentDealController().addStudent("121250102", "��½��", 12);
		new StudentDealController().addStudent("121250103", "����", 12);
		new StudentDealController().addStudent("121250100", "�Ѻ���", 12);
		new StudentDealController().addStudent("121250105", "������", 12);
	}

	@Ignore
	public void testShowStudentString() {
		 StudentVO s1= new StudentDealController().showStudent("121250102");
		 StudentVO s2= new StudentDealController().showStudent("121250103");
		 StudentVO s3= new StudentDealController().showStudent("121250100");
		 StudentVO s4= new StudentDealController().showStudent("121250105");
        assertEquals("��½��",s1.name);
        assertEquals("����",s2.name);
        assertEquals("�Ѻ���",s3.name);
        assertEquals("������",s4.name);
	}

	@Ignore
	public void testShowStudent() {
		ArrayList<StudentVO> list=new StudentDealController().showStudent();
		assertEquals("�Ѻ���",list.get(0).name);
	}

	@Ignore
	public void testShowStudentTeacherVO() {
		TeacherVO  teacher=new TeacherVO("951260122","����","�ο���ʦ",12,null);
		ArrayList<StudentVO> list=new StudentDealController().showStudent(teacher);
		assertEquals("121250102",list.get(0).ID);
	}

	@Ignore
	public void testShowStudentCourseVO() {
		CourseVO course=new CourseVO(1,"Calculus","121250120",null,null,null,80,1);
		ArrayList<StudentVO> li=new StudentDealController().showStudent(course);
		assertEquals("121250105",li.get(2).ID);
	}

	@Ignore
	public void testWriteTime() {
		new StudentDealController().writeTime("test");
	}

	@Ignore
	public void testRegisterTime() {
		String time=new StudentDealController().registerTime("121250102");
		assertEquals("����/2012",time);
	}

	@Ignore
	public void testAddStudent2() {
		new StudentDealController().addStudent2("121250106");
	}

	@Ignore
	public void testEndStudent() {
		fail("Not yet implemented");
	}

}
