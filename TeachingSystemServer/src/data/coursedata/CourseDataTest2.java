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
	/*采用黑盒测试中按边界值确定测试用例的方法，
	  * 测试能否正确写入在文件的开头、中间任意位置、末尾*/
	
  private CoursePO course;
  
	@Before
	public void setUp() throws Exception {
	}
	
	public CourseDataTest2(CoursePO po){
		course=po;
	}

	@Parameters
	public static Collection<CoursePO[]> data(){
		return Arrays.asList(new CoursePO[][]{{new CoursePO(1,"微积分IV","951260122","仙二111","周五1~2",null,12,0)},
				{new CoursePO(6,"离散数学","941270199","仙二211","周四1~2",null,12,0)},
				{new CoursePO(3,"线性代数","951260122","图书馆111","周四1~4",null,12,0)},
				{new CoursePO(8,"软件工程与计算I","941270199","图书馆112","周四1~4",null,12,0)},
				{new CoursePO(19,"线性代数II","951260122","图书馆211","周四2~4",null,12,0)},
				{new CoursePO(20,"唐诗","000160177","图书馆311","周一2~4",null,1,0)},
				{new CoursePO(22,"宋词","000160177","图书馆221","周二2~4",null,1,0)},
				{new CoursePO(11,"元曲","887766554","图书馆212","周三2~4",null,1,0)},
				{new CoursePO(34,"诗词曲","887766554","图书馆210","周四2~4",null,1,0)},
				{new CoursePO(59,"离散数学II","887766554","图书馆111","周五2~4",null,1,0)},
				{new CoursePO(100,"软件工程统计方法","941111228","图书馆121","周四9~11",null,12,0)},
				{new CoursePO(62,"计算机网络III","951260122","图书馆121","周四9~11",null,1,0)}
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
		StudentPO nlz=new StudentPO("121250102","倪陆章",12,null);
		StudentPO nm=new StudentPO("121250103","聂檬",12,null);
		StudentPO mhq=new StudentPO("121250100","缪海清",12,null);
		StudentPO pxr=new StudentPO("121250101","彭宣荣",12,null);
        new CourseData().recordScore(course,nlz,80);
        new CourseData().recordScore(course, nm, 88);
        new CourseData().recordScore(course, mhq, 90);
        new CourseData().recordScore(course, pxr, 100);
	}

	@Ignore
	public void testSelectCourse() {
		StudentPO nlz=new StudentPO("121250102","倪陆章",12,null);
		StudentPO nm=new StudentPO("121250103","聂檬",12,null);
		StudentPO mhq=new StudentPO("121250100","缪海清",12,null);
		StudentPO pxr=new StudentPO("121250101","彭宣荣",12,null);
        new CourseData().selectCourse(course,nlz);
        new CourseData().selectCourse(course, nm);
        new CourseData().selectCourse(course, mhq);
        new CourseData().selectCourse(course, pxr);
	}

	@Ignore
	public void testFillCourseInfo() {
		new CourseData().fillCourseInfo(course.getID(), "测试");
	}

	@Ignore
	public void testQuitCourse() {
		StudentPO stu=new StudentPO("121250101","彭宣荣",12,null);
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
		StudentPO nlz=new StudentPO("121250102","倪陆章",12,null);
		StudentPO nm=new StudentPO("121250103","聂檬",12,null);
		StudentPO mhq=new StudentPO("121250100","缪海清",12,null);
		StudentPO pxr=new StudentPO("121250101","彭宣荣",12,null);
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
