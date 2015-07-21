package data.teachplandata;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import po.TeachPlanPO;

public class TeachPlanDataTest1 {
	//测试所有查找是否正确，由于查找算法都是顺序查找，所以采用随机测试
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFind() {
		TeachPlanPO po = new TeachPlanData().find(12);
		assertEquals("大一上学期:离散数学、计算系统基础、微积分I;大一下学期:计算机组织与体系结构、软件工程与计算I、微积分II;大二上学期:线性代数、软件工程与计算II、数据结构与算法;大二下学期:操作系统、计算机网络;大三上学期:数据库;大三下学期:数据库II;大四上学期:软件工程与计算III;大四下学期:实习",po.getPlan());
		TeachPlanPO po1 =new TeachPlanData().find(5);
		assertEquals("暂无信息",po1.getPlan());
	}


	@Test
	public void testShowMajorCourse() {
		ArrayList<String> st = new ArrayList<String>(20);
		st = new TeachPlanData().showMajorCourse(12, "大一", "上学期");
		assertEquals("计算系统基础",st.get(1));
		st = new TeachPlanData().showMajorCourse(13, "大二","下学期");
		assertEquals("抽象代数",st.get(0));
	}

	@Test
	public void testShowAID() {
		long AID;
		AID = new TeachPlanData().showAID("软件学院");
		assertEquals(12,AID);
		AID = new TeachPlanData().showAID("法学院");
		assertEquals(5,AID);
	}

}
