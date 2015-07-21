package businesslogic.framebl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import vo.FrameVO;

public class FrameTester {
	//���Э���ļ��ɲ���

	@Before
	public void setUp() throws Exception {
	}

	@Ignore
	public void testInputFrame() {
		new FrameDealController().inputFrame(new FrameVO("ͨʶͨ��","��ѡ","ͨʶ�����γ�","��ѧ��ѧ",14,"1��8"));
		new FrameDealController().inputFrame(new FrameVO("ͨʶͨ��","��ѡ","ͨʶ�����γ�","��ѧ����",14,"1��8"));
		new FrameDealController().inputFrame(new FrameVO("ͨʶͨ��","��ѡ","ͨʶ�����γ�","��ѧӢ��",14,"1��8"));
	}
	
	@Ignore
	public void testEditFrame(){
		new FrameDealController().editFrame(new FrameVO("ͨʶͨ��","��ѡ","ͨʶ�����γ�","��ѧ��ѧ",14,"1��8"), 0);
		new FrameDealController().editFrame(new FrameVO("ͨʶͨ��","��ѡ","ͨʶ�����γ�","��ѧ����",14,"1��8"),1);
		new FrameDealController().editFrame(new FrameVO("ͨʶͨ��","��ѡ","ͨʶ�����γ�","��ѧӢ��",14,"1��8"),2);
	}
	
   @Ignore
   public void testShowFrame(){
	   FrameList list=new FrameDealController().showFrame();
	   assertEquals(new FrameVO("ͨʶͨ��","��ѡ","ͨʶ�����γ�","��ѧ��ѧ",14,"1��8"),list.framelist.get(0));
	   assertEquals(new FrameVO("ͨʶͨ��","��ѡ","ͨʶ�����γ�","��ѧ����",14,"1��8"),list.framelist.get(1));
	   assertEquals(new FrameVO("ͨʶͨ��","��ѡ","ͨʶ�����γ�","��ѧӢ��",14,"1��8"),list.framelist.get(2));
   }
}
