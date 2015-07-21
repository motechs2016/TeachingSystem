package data.coursedata;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import po.CoursePO;
import po.TeacherPO;

public class CourseDataTest1 {
	//�������в����Ƿ���ȷ�����ڲ����㷨����˳����ң����Բ����������

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindLong() {
		CoursePO po=new CourseData().find(1);
		assertEquals("΢����I",po.getName());
		CoursePO po2=new CourseData().find(5);
		assertEquals("������������II",po2.getName());
		CoursePO po3=new CourseData().find(3);
		assertEquals("���Դ���",po3.getName());
	}

	@Test
	public void testFindString() {
		ArrayList<CoursePO> li=new CourseData().find("121250102");
		assertEquals("���Դ���",li.get(3).getName());
		ArrayList<CoursePO> li2=new CourseData().find("121250105");
		assertEquals("΢����I",li2.get(0).getName());
		ArrayList<CoursePO> li3=new CourseData().find("121250103");
		assertEquals("���Դ���",li3.get(0).getName());
   }

	@Test
	public void testFindTeacherPO() {
		ArrayList<CoursePO> li=new CourseData().find(new TeacherPO("951260122","����","�ο���ʦ","12",null));
		assertEquals("΢����I",li.get(0).getName());
		ArrayList<CoursePO> li2=new CourseData().find(new TeacherPO("000160177","����","�ο���ʦ","1",null));
		assertEquals("ʫ����",li2.get(2).getName());
	}

	@Test
	public void testShowCourse() {
		ArrayList<CoursePO> li=new CourseData().showCourse();
		assertEquals("������������II",li.get(5).getName());
	}

	@Test
	public void testShowCoursewithAID() {
		ArrayList<CoursePO> li=new CourseData().showCoursewithAID("12");
		assertEquals("���Դ���",li.get(4).getName());
		ArrayList<CoursePO> li2=new CourseData().showCoursewithAID("1");
		assertEquals("Ԫ��",li2.get(0).getName());
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
		long ID=new CourseData().findCourseID("΢����II");
		assertEquals(19,ID);
		long ID1=new CourseData().findCourseID("���Դ���");
		assertEquals(3,ID1);
		long ID2=new CourseData().findCourseID("��ɢ��ѧII");
		assertEquals(59,ID2);
		long ID3=new CourseData().findCourseID("�������ͳ�Ʒ���");
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
