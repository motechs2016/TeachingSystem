package data.studentdata;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

import data.coursedata.CourseData;

import po.CoursePO;
import po.StudentPO;

@RunWith(Parameterized.class)
public class StudentDataTest2 {
	/*���úںв����а��߽�ֵȷ�����������ķ�����
	  * �����ܷ���ȷд�����ļ��Ŀ�ͷ���м�����λ�á�ĩβ*/
	private StudentPO student;

	@Before
	public void setUp() throws Exception {
	}
	public StudentDataTest2 (StudentPO po){
		student=po;
	}
	@Test
	public void testFind() {
		StudentPO po=new StudentData().find("111250123");
		assertEquals("Lucky",po.getName());
	}

	@Parameters
	public static Collection<StudentPO[]> data(){
		return Arrays.asList(new StudentPO[][]{{new StudentPO("121250103","����",1,null)},
				{new StudentPO("121145103","��ɲ���",3,null)},
				{new StudentPO("121145103","����ͬһѧ��",3,null)},
				{new StudentPO("121122393","Mary",1,null)},
				{new StudentPO("133431040","��ɣ׿",2,null)},
				{new StudentPO("111135503","�Ŷ���",13,null)},
				{new StudentPO("132545103","֩����",4,null)},
				{new StudentPO("110145103","����",1,null)},
				{new StudentPO("100145103","ϰ��ƽ",3,null)},
				{new StudentPO("110345233","��ɲ���",3,null)},//����ͬһ����
				{new StudentPO("120245329","ս��ָ�ӹ�",9,null)},
				{new StudentPO("900145703","�ͽ�˹",3,null)}
		});
	}
	@Ignore
      public void testInsert(){
		new StudentData().insert(student);
	}
	
	@Ignore
	public void testShowStudent(){
		ArrayList<StudentPO> list=new StudentData().showStudent();
		assertEquals("101270891",list.get(3).getID());
	}
	
	@Test
	public void testShowStudent2(){
		ArrayList<StudentPO> list=new StudentData().showStudent(12);
		assertEquals("121250102",list.get(3).getID());
	}
	
	@Ignore
	public void testWriteTime(){
		new StudentData().writeTime("����ʱ��");
	}
	
	@Ignore
	public void testAddStudent(){
		new StudentData().addStudent2(student.getID());
	}
	
	
}
