package data.teachplandata;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

import po.TeachPlanPO;

@RunWith(Parameterized.class)
public class TeachPlanDataTest {
	/*���úںв����а��߽�ֵȷ�����������ķ�����
	  * �����ܷ���ȷд�����ļ��Ŀ�ͷ���м�����λ�á�ĩβ*/
	
	private TeachPlanPO teachplan;
	
	public TeachPlanDataTest(TeachPlanPO po){
		teachplan=po;
	}
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Parameters
	public static Collection<TeachPlanPO[]> data(){
		return Arrays.asList(new TeachPlanPO[][]{{new TeachPlanPO("2","��һ��ѧ��:ʫ����")},
				{new TeachPlanPO("4","��һ��ѧ�ڣ���ý")},
				{new TeachPlanPO("8","��һ��ѧ�ڣ�Ӣ��")},
				{new TeachPlanPO("28","��һ��ѧ�ڣ�����ѧ")}
				
		});
	}

	@Test
	public void testInsert() {
		new TeachPlanData().insert(teachplan);
	}

}
