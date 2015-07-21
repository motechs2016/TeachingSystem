package data.teacherdata;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

import data.teacherdata.TeacherData;

import po.TeacherPO;

@RunWith(Parameterized.class)
public class TeacherDataTest1 {
	/*采用黑盒测试中按边界值确定测试用例的方法，
	  * 测试能否正确写入在文件的开头、中间任意位置、末尾*/
	@Before
	public void setUp() throws Exception {
	}

	private TeacherPO teacher;
	
	public TeacherDataTest1(TeacherPO po){
		teacher=po;
	}
	
	@Parameters
	public static Collection<TeacherPO[]> data(){
		return Arrays.asList(new TeacherPO[][]{{new TeacherPO("000001201","王霞","院系教务老师","12",null)},
				{new TeacherPO("000001212","李璐","院系教务老师","12",null)},
				{new TeacherPO("918734211","吴磊","教师","3",null)},
				{new TeacherPO("970912300","刘畅","教务处老师","11",null)}
		});
	}
	
	@Test
	public void testInsert() {
		new TeacherData().insert(teacher);
	}

}
