package businesslogic.teacherbl;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import vo.TeacherVO;

public class TeacherTester {

	@Before
	public void setUp() throws Exception {
	}

	@Ignore
	public void testAddTeacher() {
		new TeacherDealController().addTeacher("951260122", "¡ı«’", "»ŒøŒ¿œ ¶", 12);
	}

	@Ignore
	public void testShowTeacher() {
		ArrayList<TeacherVO>  list=new TeacherDealController().showTeacher();
		assertEquals("951260122",list.get(10).ID);
	}

	@Ignore
	public void testShowTeacherString() {
		TeacherVO teacher=new TeacherDealController().showTeacher("951260122");
		assertEquals("¡ı«’",teacher.name);
	}

	@Ignore
	public void testShowHisAID() {
		long aID=new TeacherDealController().showHisAID("951260122");
		assertEquals(12,aID);
	}

	@Ignore
	public void testEndTeacher() {
		fail("Not yet implemented");
	}

}
