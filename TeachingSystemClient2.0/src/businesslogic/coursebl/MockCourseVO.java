package businesslogic.coursebl;

import java.util.ArrayList;

import vo.CourseVO;
import vo.StudentVO;

public class MockCourseVO extends CourseVO {
    public   long  ID;  //�γ̱��
    public String courseName;  //�γ���
    public String teacherID; //�ο���ʦ����
   public  String time;   //�Ͽ�ʱ��
   public  String location; //�Ͽεص�
    public ArrayList<StudentVO> studentList;   //�γ̵�ѧ���б�
    public int score; //�ɼ�
    public long aID;
    
	public MockCourseVO(long ID, String courseName, String teacherID,
			String time, String location, ArrayList<StudentVO> l1, int score,
			long aID) {
		super(ID,courseName,teacherID,time,location,l1,score,aID);
	}
}
