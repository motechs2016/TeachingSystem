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
	/*���úںв����а��߽�ֵȷ�����������ķ�����
	  * �����ܷ���ȷд�����ļ��Ŀ�ͷ���м�����λ�á�ĩβ*/
	@Before
	public void setUp() throws Exception {
	}

	private TeacherPO teacher;
	
	public TeacherDataTest1(TeacherPO po){
		teacher=po;
	}
	
	@Parameters
	public static Collection<TeacherPO[]> data(){
		return Arrays.asList(new TeacherPO[][]{{new TeacherPO("000001201","��ϼ","Ժϵ������ʦ","12",null)},
				{new TeacherPO("000001212","���","Ժϵ������ʦ","12",null)},
				{new TeacherPO("918734211","����","��ʦ","3",null)},
				{new TeacherPO("970912300","����","������ʦ","11",null)}
		});
	}
	
	@Test
	public void testInsert() {
		new TeacherData().insert(teacher);
	}

}
