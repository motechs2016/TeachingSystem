package data.framedata;

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
import po.FramePO;

@RunWith(Parameterized.class)
public class FrameDataTest2 {
	 /*采用黑盒测试中按边界值确定测试用例的方法，
     * 测试能否正确写入在文件的开头、中间任意位置、末尾*/
private FramePO frame;
	@Before
	public void setUp() throws Exception {
	}
	public FrameDataTest2(FramePO po){
		frame=po;
	}
	@Parameters
	public static Collection<FramePO[]> data(){
		return Arrays.asList(new FramePO[][]{{new FramePO("公选","选修","A","初级日语",2,"2-17周")},
				{new FramePO("指选","必修","C","微积分",5,"2-19周")},
		{new FramePO("自选","选修","B","羽毛球",2,"2-17周")},
		{new FramePO("指选","必修","C","软件工程",5,"2-19周")},
		{new FramePO("指选","必修","A","离散数学",4,"2-19周")},
		{new FramePO("通识","选修","C","音乐鉴赏",5,"2-13周")},
		{new FramePO("通识","选修","A","走进电影大师",3,"7-12周")},
		{new FramePO("指选","选修","C","世界历史",1,"2-10周")},
		{new FramePO("指选","必修","A","软件工程2",4,"2-19周")},
		{new FramePO("指选","必修","C","线性代数",5,"2-19周")},
		{new FramePO("自选","必修","C","毽球",2,"2-17周")},
		{new FramePO("指选","必修","B","数据结构",4,"2-19周")},
		{new FramePO("指选","必修","C","马克思",2,"2-19周")},
		{new FramePO("指选","必修","C","微积分",5,"9-10周")}
		});
	}
	@Test
	public void testInsert() {
		new FrameData().insert(frame);
	}

	@Test
	public void testShowFrameList() {
		ArrayList<FramePO> framelist=new FrameData().showFrameList();
		assertEquals("马克思原理",framelist.get(0).getName());
	}
	

}
