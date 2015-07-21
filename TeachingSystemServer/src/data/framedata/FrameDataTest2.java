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
	 /*���úںв����а��߽�ֵȷ�����������ķ�����
     * �����ܷ���ȷд�����ļ��Ŀ�ͷ���м�����λ�á�ĩβ*/
private FramePO frame;
	@Before
	public void setUp() throws Exception {
	}
	public FrameDataTest2(FramePO po){
		frame=po;
	}
	@Parameters
	public static Collection<FramePO[]> data(){
		return Arrays.asList(new FramePO[][]{{new FramePO("��ѡ","ѡ��","A","��������",2,"2-17��")},
				{new FramePO("ָѡ","����","C","΢����",5,"2-19��")},
		{new FramePO("��ѡ","ѡ��","B","��ë��",2,"2-17��")},
		{new FramePO("ָѡ","����","C","�������",5,"2-19��")},
		{new FramePO("ָѡ","����","A","��ɢ��ѧ",4,"2-19��")},
		{new FramePO("ͨʶ","ѡ��","C","���ּ���",5,"2-13��")},
		{new FramePO("ͨʶ","ѡ��","A","�߽���Ӱ��ʦ",3,"7-12��")},
		{new FramePO("ָѡ","ѡ��","C","������ʷ",1,"2-10��")},
		{new FramePO("ָѡ","����","A","�������2",4,"2-19��")},
		{new FramePO("ָѡ","����","C","���Դ���",5,"2-19��")},
		{new FramePO("��ѡ","����","C","���",2,"2-17��")},
		{new FramePO("ָѡ","����","B","���ݽṹ",4,"2-19��")},
		{new FramePO("ָѡ","����","C","���˼",2,"2-19��")},
		{new FramePO("ָѡ","����","C","΢����",5,"9-10��")}
		});
	}
	@Test
	public void testInsert() {
		new FrameData().insert(frame);
	}

	@Test
	public void testShowFrameList() {
		ArrayList<FramePO> framelist=new FrameData().showFrameList();
		assertEquals("���˼ԭ��",framelist.get(0).getName());
	}
	

}
