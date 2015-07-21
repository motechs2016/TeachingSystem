package data.coursedata;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import po.CoursePO;
import po.TeacherPO;

public class CourseDataTest1 {
	//测试所有查找是否正确，由于查找算法都是顺序查找，所以采用随机测试

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindLong() {
		CoursePO po=new CourseData().find(1);
		assertEquals("微积分I",po.getName());
		CoursePO po2=new CourseData().find(5);
		assertEquals("软件工程与计算II",po2.getName());
		CoursePO po3=new CourseData().find(3);
		assertEquals("线性代数",po3.getName());
	}

	@Test
	public void testFindString() {
		ArrayList<CoursePO> li=new CourseData().find("121250102");
		assertEquals("线性代数",li.get(3).getName());
		ArrayList<CoursePO> li2=new CourseData().find("121250105");
		assertEquals("微积分I",li2.get(0).getName());
		ArrayList<CoursePO> li3=new CourseData().find("121250103");
		assertEquals("线性代数",li3.get(0).getName());
   }

	@Test
	public void testFindTeacherPO() {
		ArrayList<CoursePO> li=new CourseData().find(new TeacherPO("951260122","刘钦","任课老师","12",null));
		assertEquals("微积分I",li.get(0).getName());
		ArrayList<CoursePO> li2=new CourseData().find(new TeacherPO("000160177","张三","任课老师","1",null));
		assertEquals("诗词曲",li2.get(2).getName());
	}

	@Test
	public void testShowCourse() {
		ArrayList<CoursePO> li=new CourseData().showCourse();
		assertEquals("软件工程与计算II",li.get(5).getName());
	}

	@Test
	public void testShowCoursewithAID() {
		ArrayList<CoursePO> li=new CourseData().showCoursewithAID("12");
		assertEquals("线性代数",li.get(4).getName());
		ArrayList<CoursePO> li2=new CourseData().showCoursewithAID("1");
		assertEquals("元曲",li2.get(0).getName());
	}

	@Test
	public void testFindAID() {
		long aID=new CourseData().findAID(14);
		assertEquals(12,aID);
		long aID2=new CourseData().findAID(59);
		assertEquals(1,aID2);
		long aID3=new CourseData().findAID(100);
		assertEquals(12,aID3);
		long aID4=new CourseData().findAID(19);
		assertEquals(12,aID4);
	}

	@Test
	public void testFindCourseID() {
		long ID=new CourseData().findCourseID("微积分II");
		assertEquals(19,ID);
		long ID1=new CourseData().findCourseID("线性代数");
		assertEquals(3,ID1);
		long ID2=new CourseData().findCourseID("离散数学II");
		assertEquals(59,ID2);
		long ID3=new CourseData().findCourseID("软件工程统计方法");
		assertEquals(100,ID3);
	}
	
	@Test
	public void testShowHisNumberOfCourse(){
		int num=new CourseData().showHisNumberOfCourse("121250102");
		assertEquals(7,num);
		int num1=new CourseData().showHisNumberOfCourse("101270891");
		assertEquals(0,num1);
		int num2=new CourseData().showHisNumberOfCourse("131250123");
		assertEquals(3,num2);
		int num3=new CourseData().showHisNumberOfCourse("141260129");
		assertEquals(0,num3);
	}
	
	@Test
	public void  testShowMaxPeople(){
		int max=new CourseData().showMaxPeople(13);
		assertEquals(30,max);
	}
	
	@Test
	public void testGetCredit(){
		int c=new CourseData().getCredit(1);
		assertEquals(3,c);
		int c1=new CourseData().getCredit(19);
		assertEquals(4,c1);
		int c2=new CourseData().getCredit(20);
		assertEquals(2,c2);
		int c3=new CourseData().getCredit(100);
		assertEquals(5,c3);
	}

}
