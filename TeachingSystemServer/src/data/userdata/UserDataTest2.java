package data.userdata;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

import data.coursedata.CourseData;

import po.CoursePO;
import po.UserPO;

@RunWith(Parameterized.class)
public class UserDataTest2 {         
	/*���úںв����а��߽�ֵȷ�����������ķ�����
	  * �����ܷ���ȷд�����ļ��Ŀ�ͷ���м�����λ�á�ĩβ*/
	
  private UserPO user;

	@Before
	public void setUp() throws Exception {
	}
	public UserDataTest2(UserPO po){
		user=po;
	}
	@Parameters
	public static Collection<UserPO[]> data(){
		return Arrays.asList(new UserPO[][]{{new UserPO("121277777","������","zqq000005","ѧ��")},
				{new UserPO("202322984","������","yez9420","Ժϵ������ʦ")},
			{new UserPO("000000001","����","lq1314","����Ա")},
			{new UserPO("121250107","������","pxr941020","ѧ��")},
			{new UserPO("202333340","̩����","mflanf","������ʦ")},
			{new UserPO("234899999","����˿","1234567890","�ο���ʦ")},
			{new UserPO("233333333","����","Nm000005","Ժϵ������ʦ")},
			{new UserPO("202329845","������","123ez9420","Ժϵ������ʦ")},
			{new UserPO("121232984","Jack","GH9420","ѧ��")},
			{new UserPO("223233384","����","ymk344420","Ժϵ������ʦ")},
			{new UserPO("123434455","����һ������","yez9420","ѧ��")},
			{new UserPO("121250777","������","tongmingderen","ѧ��")},
			{new UserPO("0000000002","������","Er22222","����Ա")}
		});
	}
	@Test
	public void testInsert() {
		new UserData().insert(user);
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
