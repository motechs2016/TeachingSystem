package businesslogic.teacherbl;

import java.util.ArrayList;

import vo.CourseVO;
import vo.TeacherVO;

public class MockTeacherVO extends TeacherVO {

	public MockTeacherVO(String ID, String name, String type, long aID,
			ArrayList<CourseVO> li) {
		super(ID, name, type, aID, li);
	}
}
