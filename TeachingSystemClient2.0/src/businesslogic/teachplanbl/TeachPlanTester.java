package businesslogic.teachplanbl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import vo.TeachPlanVO;

public class TeachPlanTester {

	@Before
	public void setUp() throws Exception {
	}

	@Ignore
	public void testShowTeachPlanLong() {
		System.out.println(new TeachPlanDealController().showTeachPlan(12));
	}

	@Ignore
	public void testInputTeachPlan() {
		new TeachPlanDealController().inputTeachPlan(new TeachPlanVO(1,"文学院","暂无信息"));
	}

	@Ignore
	public void testShowAID() {
		long aID=new TeachPlanDealController().showAID("软件学院");
		assertEquals(12,aID);
	}

	@Ignore
	public void testEndTeachPlan() {
		fail("Not yet implemented");
	}

}
