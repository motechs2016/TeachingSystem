package data.coursedata;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;
import po.CoursePO;
import po.StudentPO;

@RunWith(Parameterized.class)
public class CourseDataTest2 {         
	/*���úںв����а��߽�ֵȷ�����������ķ�����
	  * �����ܷ���ȷд�����ļ��Ŀ�ͷ���м�����λ�á�ĩβ*/
	
  private CoursePO course;
  
	@Before
	public void setUp() throws Exception {
	}
	
	public CourseDataTest2(CoursePO po){
		course=po;
	}

	@Parameters
	public static Collection<CoursePO[]> data(){
		return Arrays.asList(new CoursePO[][]{{new CoursePO(1,"΢����IV","951260122","�ɶ�111","����1~2",null,12,0)},
				{new CoursePO(6,"��ɢ��ѧ","941270199","�ɶ�211","����1~2",null,12,0)},
				{new CoursePO(3,"���Դ���","951260122","ͼ���111","����1~4",null,12,0)},
				{new CoursePO(8,"������������I","941270199","ͼ���112","����1~4",null,12,0)},
				{new CoursePO(19,"���Դ���II","951260122","ͼ���211","����2~4",null,12,0)},
				{new CoursePO(20,"��ʫ","000160177","ͼ���311","��һ2~4",null,1,0)},
				{new CoursePO(22,"�δ�","000160177","ͼ���221","�ܶ�2~4",null,1,0)},
				{new CoursePO(11,"Ԫ��","887766554","ͼ���212","����2~4",null,1,0)},
				{new CoursePO(34,"ʫ����","887766554","ͼ���210","����2~4",null,1,0)},
				{new CoursePO(59,"��ɢ��ѧII","887766554","ͼ���111","����2~4",null,1,0)},
				{new CoursePO(100,"�������ͳ�Ʒ���","941111228","ͼ���121","����9~11",null,12,0)},
				{new CoursePO(62,"���������III","951260122","ͼ���121","����9~11",null,1,0)}
		});
	}
	@Ignore
	public void testInsert() {
		new CourseData().insert(course);
	}

	@Ignore
	public void testUpdate() {
		new CourseData().update(course);
	}

	@Ignore
	public void testRecordScore() {
		StudentPO nlz=new StudentPO("121250102","��½��",12,null);
		StudentPO nm=new StudentPO("121250103","����",12,null);
		StudentPO mhq=new StudentPO("121250100","�Ѻ���",12,null);
		StudentPO pxr=new StudentPO("121250101","������",12,null);
        new CourseData().recordScore(course,nlz,80);
        new CourseData().recordScore(course, nm, 88);
        new CourseData().recordScore(course, mhq, 90);
        new CourseData().recordScore(course, pxr, 100);
	}

	@Ignore
	public void testSelectCourse() {
		StudentPO nlz=new StudentPO("121250102","��½��",12,null);
		StudentPO nm=new StudentPO("121250103","����",12,null);
		StudentPO mhq=new StudentPO("121250100","�Ѻ���",12,null);
		StudentPO pxr=new StudentPO("121250101","������",12,null);
        new CourseData().selectCourse(course,nlz);
        new CourseData().selectCourse(course, nm);
        new CourseData().selectCourse(course, mhq);
        new CourseData().selectCourse(course, pxr);
	}

	@Ignore
	public void testFillCourseInfo() {
		new CourseData().fillCourseInfo(course.getID(), "����");
	}

	@Ignore
	public void testQuitCourse() {
		StudentPO stu=new StudentPO("121250101","������",12,null);
		new CourseData().quitCourse(course.getID(),stu.getID());
	}

	@Ignore
	public void testAddOne() {
		new CourseData().addOne(course.getID()+"");
	}

	@Ignore
	public void testDeleteOne() {
		new CourseData().deleteOne(course.getID()+"");
	}

	@Ignore
	public void testUpdateTheirMajorCourse() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testClearSelectionInfo() {
		fail("Not yet implemented");
	}

	@Test
	public void testPublishCourseCredit() {
		new CourseData().publishCourseCredit(course.getID(), 4);
	}

	@Test
	public void testSelectCourseTmp() {
		StudentPO nlz=new StudentPO("121250102","��½��",12,null);
		StudentPO nm=new StudentPO("121250103","����",12,null);
		StudentPO mhq=new StudentPO("121250100","�Ѻ���",12,null);
		StudentPO pxr=new StudentPO("121250101","������",12,null);
		new CourseData().selectCourseTmp(course.getID()+"",nlz.getID());
		new CourseData().selectCourseTmp(course.getID()+"",nm.getID());
		new CourseData().selectCourseTmp(course.getID()+"",pxr.getID());
		new CourseData().selectCourseTmp(course.getID()+"",mhq.getID());
	}

	@Ignore
	public void testAddToSelectInfo() {
		new CourseData().addToSelectInfo(course.getID());
	}

}
