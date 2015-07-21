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
	/*采用黑盒测试中按边界值确定测试用例的方法，
	  * 测试能否正确写入在文件的开头、中间任意位置、末尾*/
	
	private TeachPlanPO teachplan;
	
	public TeachPlanDataTest(TeachPlanPO po){
		teachplan=po;
	}
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Parameters
	public static Collection<TeachPlanPO[]> data(){
		return Arrays.asList(new TeachPlanPO[][]{{new TeachPlanPO("2","大一上学期:诗词曲")},
				{new TeachPlanPO("4","大一上学期：传媒")},
				{new TeachPlanPO("8","大一上学期：英语")},
				{new TeachPlanPO("28","大一上学期：建筑学")}
				
		});
	}

	@Test
	public void testInsert() {
		new TeachPlanData().insert(teachplan);
	}

}
