package dataservice.coursedataservice;
import java.util.ArrayList;
import po.CoursePO;
import po.StudentPO;
public interface CourseDataService {
	 
	public CoursePO find(long ID); //查看该编号的课程
	
	public boolean insert(CoursePO po); //往数据库中添加课程
	
	public void delete(CoursePO po); //从数据库中删除课程
	
	public void update(CoursePO po); //更新该课程的信息
	
	public void recordScore(CoursePO course,StudentPO student,int score);//登记成绩
	
	public ArrayList<CoursePO> showCourse(); //返回所有课程
	
	public boolean selectCourse(CoursePO course,StudentPO student); //选课
	
	public void fillCourseInfo(Long ID, String info);//填写课程大纲
	
	public ArrayList<CoursePO> showCoursewithAID(String aID); //查看学院课程
	
	public boolean quitCourse(long courseID,String stuID);  //退课
	
	public boolean people(long courseID, long maxPeople);  //查看课程限选人数
	
	public ArrayList<String> showPeople(); //查看所有课程的已选/限选情况
	
	public ArrayList<String> showPeople(long aID); //查看某学院所有课程的已选/限选情况
	
	public int showMaxPeople(long courseID); //查看某课程的限选人数
	
	public long findAID(long courseID); //查看这门课的开课院系
	
	public String findPeople(String ID);  //查看某课程已选/限选人数
	
	public boolean addOne(String ID);   //给该课的已选人数+1
	
	public boolean deleteOne(String ID); //给该课的已选人数-1
	
	public void updateTheirMajorCourse(); //更新学生们的必修课
	
	public long findCourseID(String courseName); //查看该课程的ID
	
	public void clearSelectionInfo(); //清空旧信息
	
	public boolean publishCourseCredit(long courseID, long credit); //写入课程学分
	
	public ArrayList<CoursePO> showScore2(String stuID, int term);  //查看学生某学期成绩
	
	public ArrayList<CoursePO> showCourse2(int aID);  //查看学院课程
	
	public ArrayList<CoursePO> showAllScore(String stuID);  //查看所有成绩
	
	public boolean selectCourseTmp(String courseID, String stuID); //选课
	
	public boolean addToSelectInfo(long courseID); //向选课数据库中添加这门课程的编号
	
	public ArrayList<StudentPO> showSelectList(long courseID); //查看该课程的已选列表
	
	public int showHisNumberOfCourse(String stuID); //查看这个学生读了几门课程
	
	public boolean isFull(String stuID); //查看学生是否选满3门跨院系课程
	
	public int getCredit(long courseID);

}
