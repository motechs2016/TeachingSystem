package data.teacherdata;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

import data.coursedata.CourseData;
import data.teacherdata.TeacherData;

import po.CoursePO;
import po.TeacherPO;

public class TeacherDataTest {
	//测试所有查找是否正确，由于查找算法都是顺序查找，所以采用随机测试
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFind() {
		TeacherPO po = new TeacherData().find("000001212");
		TeacherPO po1=new TeacherPO("000001212","李璐","院系教务老师","12",null);
		assertEquals(po1.getName(),po.getName());
		TeacherPO po2 = new TeacherData().find("918734211");
		TeacherPO po3 = new TeacherPO("918734211","吴磊","教师","3",null);
		assertEquals(po3.getAID(),po2.getAID());
	}

	@Test
	public void testShowTeacher() {
		ArrayList<TeacherPO> li=new TeacherData().showTeacher();
		assertEquals("吴磊",li.get(2).getName());
		assertEquals("000001212",li.get(1).getID());
		assertEquals("11",li.get(3).getAID());
	}

	@Test
	public void testShowHisAID() {
		long AID1 = new TeacherData().showHisAID("000001201");
		assertEquals(12,AID1);
		long AID2 = new TeacherData().showHisAID("970912300");
		assertEquals(11,AID2);
	}

}
