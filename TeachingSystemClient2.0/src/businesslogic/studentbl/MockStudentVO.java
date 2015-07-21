package businesslogic.studentbl;

import java.util.ArrayList;

import vo.CourseVO;
import vo.StudentVO;

public class MockStudentVO extends StudentVO {

	public MockStudentVO(String ID, String name, long aID,
			ArrayList<CourseVO> li) {
		super(ID, name, aID, li);
	}
}
