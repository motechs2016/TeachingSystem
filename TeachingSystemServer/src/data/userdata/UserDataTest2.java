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
	/*采用黑盒测试中按边界值确定测试用例的方法，
	  * 测试能否正确写入在文件的开头、中间任意位置、末尾*/
	
  private UserPO user;

	@Before
	public void setUp() throws Exception {
	}
	public UserDataTest2(UserPO po){
		user=po;
	}
	@Parameters
	public static Collection<UserPO[]> data(){
		return Arrays.asList(new UserPO[][]{{new UserPO("121277777","张琪琪","zqq000005","学生")},
				{new UserPO("202322984","尹恩泽","yez9420","院系教务老师")},
			{new UserPO("000000001","留情","lq1314","管理员")},
			{new UserPO("121250107","彭宣榕","pxr941020","学生")},
			{new UserPO("202333340","泰兰德","mflanf","教务处老师")},
			{new UserPO("234899999","伊丽丝","1234567890","任课老师")},
			{new UserPO("233333333","豹子","Nm000005","院系教务老师")},
			{new UserPO("202329845","二阶堂","123ez9420","院系教务老师")},
			{new UserPO("121232984","Jack","GH9420","学生")},
			{new UserPO("223233384","无名","ymk344420","院系教务老师")},
			{new UserPO("123434455","密码一样的人","yez9420","学生")},
			{new UserPO("121250777","尹恩泽","tongmingderen","学生")},
			{new UserPO("0000000002","二二二","Er22222","管理员")}
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
