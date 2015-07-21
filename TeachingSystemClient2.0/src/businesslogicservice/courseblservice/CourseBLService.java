package businesslogicservice.courseblservice;
import vo.*;

import java.util.ArrayList;

import presentation.mainui.MainUI;
import businesslogic.studentbl.StudentDealController;
public interface CourseBLService {

	public CourseVO showCourse(long ID); //�鿴�γ�
	 
	 public ArrayList<CourseVO> showCourse(String aID); //�鿴ѧԺ�γ�
	 
	 public ArrayList<CourseVO> showCourse(); //�鿴ȫУ�Ŀγ�
	 
	 public ArrayList<CourseVO> showCourse(StudentVO student); //�鿴ѧ���Ŀγ�
	 
	 public ArrayList<CourseVO> showCourse(TeacherVO teacher);  //�鿴��ʦ�Ŀγ�
	 
	 public boolean publishCourse(CourseVO course);   //�����γ�
	 
	 public boolean editCourse(CourseVO course);   //�༭�γ�
	 
	 public boolean fillCourseInfo(CourseVO course, String detail);  //��д�γ̴��
	 
	 public boolean recordScore(CourseVO course,StudentVO student,int score);  //�Ǽǳɼ�
	 
	 public boolean selectCourse(CourseVO course,StudentVO student); //ѡ��
	 
	 public boolean quitCourse(CourseVO course,StudentVO student);   //�˿�
	 
	 public int showScore(StudentVO student, CourseVO course); //�鿴ѧ��ĳ�γɼ�
	 
	 public ArrayList<CourseVO> showScore(String ID);   //�鿴ĳѧ�����пγ̵ĳɼ�
	 
	 public boolean people(long courseID,long maxPeople); 
	 
	 public ArrayList<String> showPeople();  //�鿴���пγ̵���ѡ/��ѡ�б�
	 
	 public ArrayList<String> showPeople(long aID); //�鿴���ѧԺ�γ̵���ѡ/��ѡ�б�
	 
	 public String findPeople(String ID);  //�鿴ĳ�γ̵���ѡ/��ѡ�б�
	 
	 public boolean addOne(String ID); //���ÿγ̵���ѡ����+1
	 
	 public boolean deleteOne(String ID); //���ÿγ̵���ѡ����-1
	 
	 public boolean publishCourseCredit(long courseID,long credit);  //�����γ̵�ѧ��
	 
	 public ArrayList<CourseVO> showScore2(String stuID,int term);   //�鿴ѧ��ĳѧ�ڵĳɼ�
	 
	 public ArrayList<CourseVO> showCourse2(int aID);  //�鿴���ѧԺ�Ŀγ�
	 
	 public ArrayList<CourseVO> showAllScore(String stuID);  //�鿴���ѧ�������гɼ�
	 
	 public boolean selectCourseTmp(CourseVO course, StudentVO student); //ѡ��
	 
     public boolean addToSelectInfo(long courseID);  //��ѡ�����ݿ���������ſγ̵ı��
 
    public boolean isFull(String ID);  //�鿴ѧ���Ƿ�ѡ��3�ſ�Ժϵ�γ�
	 
	 public boolean endCourse();
}
