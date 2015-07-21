package data.teachplandata;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import po.TeachPlanPO;

public class TeachPlanDataTest1 {
	//�������в����Ƿ���ȷ�����ڲ����㷨����˳����ң����Բ����������
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFind() {
		TeachPlanPO po = new TeachPlanData().find(12);
		assertEquals("��һ��ѧ��:��ɢ��ѧ������ϵͳ������΢����I;��һ��ѧ��:�������֯����ϵ�ṹ��������������I��΢����II;�����ѧ��:���Դ�����������������II�����ݽṹ���㷨;�����ѧ��:����ϵͳ�����������;������ѧ��:���ݿ�;������ѧ��:���ݿ�II;������ѧ��:������������III;������ѧ��:ʵϰ",po.getPlan());
		TeachPlanPO po1 =new TeachPlanData().find(5);
		assertEquals("������Ϣ",po1.getPlan());
	}


	@Test
	public void testShowMajorCourse() {
		ArrayList<String> st = new ArrayList<String>(20);
		st = new TeachPlanData().showMajorCourse(12, "��һ", "��ѧ��");
		assertEquals("����ϵͳ����",st.get(1));
		st = new TeachPlanData().showMajorCourse(13, "���","��ѧ��");
		assertEquals("�������",st.get(0));
	}

	@Test
	public void testShowAID() {
		long AID;
		AID = new TeachPlanData().showAID("���ѧԺ");
		assertEquals(12,AID);
		AID = new TeachPlanData().showAID("��ѧԺ");
		assertEquals(5,AID);
	}

}
