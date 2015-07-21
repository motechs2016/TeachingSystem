package dataservice.coursedataservice;
import java.util.ArrayList;
import po.CoursePO;
import po.StudentPO;
public interface CourseDataService {
	 
	public CoursePO find(long ID); //�鿴�ñ�ŵĿγ�
	
	public boolean insert(CoursePO po); //�����ݿ�����ӿγ�
	
	public void delete(CoursePO po); //�����ݿ���ɾ���γ�
	
	public void update(CoursePO po); //���¸ÿγ̵���Ϣ
	
	public void recordScore(CoursePO course,StudentPO student,int score);//�Ǽǳɼ�
	
	public ArrayList<CoursePO> showCourse(); //�������пγ�
	
	public boolean selectCourse(CoursePO course,StudentPO student); //ѡ��
	
	public void fillCourseInfo(Long ID, String info);//��д�γ̴��
	
	public ArrayList<CoursePO> showCoursewithAID(String aID); //�鿴ѧԺ�γ�
	
	public boolean quitCourse(long courseID,String stuID);  //�˿�
	
	public boolean people(long courseID, long maxPeople);  //�鿴�γ���ѡ����
	
	public ArrayList<String> showPeople(); //�鿴���пγ̵���ѡ/��ѡ���
	
	public ArrayList<String> showPeople(long aID); //�鿴ĳѧԺ���пγ̵���ѡ/��ѡ���
	
	public int showMaxPeople(long courseID); //�鿴ĳ�γ̵���ѡ����
	
	public long findAID(long courseID); //�鿴���ſεĿ���Ժϵ
	
	public String findPeople(String ID);  //�鿴ĳ�γ���ѡ/��ѡ����
	
	public boolean addOne(String ID);   //���ÿε���ѡ����+1
	
	public boolean deleteOne(String ID); //���ÿε���ѡ����-1
	
	public void updateTheirMajorCourse(); //����ѧ���ǵı��޿�
	
	public long findCourseID(String courseName); //�鿴�ÿγ̵�ID
	
	public void clearSelectionInfo(); //��վ���Ϣ
	
	public boolean publishCourseCredit(long courseID, long credit); //д��γ�ѧ��
	
	public ArrayList<CoursePO> showScore2(String stuID, int term);  //�鿴ѧ��ĳѧ�ڳɼ�
	
	public ArrayList<CoursePO> showCourse2(int aID);  //�鿴ѧԺ�γ�
	
	public ArrayList<CoursePO> showAllScore(String stuID);  //�鿴���гɼ�
	
	public boolean selectCourseTmp(String courseID, String stuID); //ѡ��
	
	public boolean addToSelectInfo(long courseID); //��ѡ�����ݿ���������ſγ̵ı��
	
	public ArrayList<StudentPO> showSelectList(long courseID); //�鿴�ÿγ̵���ѡ�б�
	
	public int showHisNumberOfCourse(String stuID); //�鿴���ѧ�����˼��ſγ�
	
	public boolean isFull(String stuID); //�鿴ѧ���Ƿ�ѡ��3�ſ�Ժϵ�γ�
	
	public int getCredit(long courseID);

}
