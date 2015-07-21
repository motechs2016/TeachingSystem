package businesslogic.framebl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import vo.FrameVO;

public class FrameTester {
	//类间协作的集成测试

	@Before
	public void setUp() throws Exception {
	}

	@Ignore
	public void testInputFrame() {
		new FrameDealController().inputFrame(new FrameVO("通识通修","必选","通识教育课程","大学数学",14,"1至8"));
		new FrameDealController().inputFrame(new FrameVO("通识通修","必选","通识教育课程","大学体育",14,"1至8"));
		new FrameDealController().inputFrame(new FrameVO("通识通修","必选","通识教育课程","大学英语",14,"1至8"));
	}
	
	@Ignore
	public void testEditFrame(){
		new FrameDealController().editFrame(new FrameVO("通识通修","必选","通识教育课程","大学数学",14,"1至8"), 0);
		new FrameDealController().editFrame(new FrameVO("通识通修","必选","通识教育课程","大学体育",14,"1至8"),1);
		new FrameDealController().editFrame(new FrameVO("通识通修","必选","通识教育课程","大学英语",14,"1至8"),2);
	}
	
   @Ignore
   public void testShowFrame(){
	   FrameList list=new FrameDealController().showFrame();
	   assertEquals(new FrameVO("通识通修","必选","通识教育课程","大学数学",14,"1至8"),list.framelist.get(0));
	   assertEquals(new FrameVO("通识通修","必选","通识教育课程","大学体育",14,"1至8"),list.framelist.get(1));
	   assertEquals(new FrameVO("通识通修","必选","通识教育课程","大学英语",14,"1至8"),list.framelist.get(2));
   }
}
