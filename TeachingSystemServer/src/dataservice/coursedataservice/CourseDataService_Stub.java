package dataservice.coursedataservice;
import java.util.ArrayList;

import po.*;
public class CourseDataService_Stub implements CourseDataService{
	public CoursePO find(long ID){
		return new CoursePO(5,"软件工程与计算","121250102","仙2 304","星期一1至2节",null,1,1);
	}
	
	public boolean insert(CoursePO po){
		System.out.println("Success!");
		return true;
	}
	
	public void delete(CoursePO po){
		System.out.println("Success!");
	}
	
	public void update(CoursePO po){
		System.out.println("Success!");
	}
	
	public void recordScore(CoursePO course,StudentPO student,int score){
		
	}
	
	public ArrayList<CoursePO> showCourse(){
		return null;
	}
	
	public boolean selectCourse(CoursePO course,StudentPO student){
		return true;
	}
	
	public void fillCourseInfo(Long ID, String info){
		
	}
	
	public ArrayList<CoursePO> showCoursewithAID(String aID){
		return null;
	}
	
	public boolean quitCourse(long courseID,String stuID){
		return true;
	}
	
	public boolean people(long courseID, long maxPeople){
		return true;
	}
	
	public ArrayList<String> showPeople(){
		return null;
	}
	
	public ArrayList<String> showPeople(long aID){
		return null;
	}
	
	public int showMaxPeople(long courseID){
		return 0;
	}
	
	public long findAID(long courseID){
		return 0;
	}
	
	public String findPeople(String ID){
		return "lucy";
	}
	
	public boolean addOne(String ID){
		return true;
	}
	
	public boolean deleteOne(String ID){
		return true;
	}
	
	public void updateTheirMajorCourse(){
		
	}
	
	public long findCourseID(String courseName){
		return 0;
	}
	
	public void clearSelectionInfo(){
		
	}
	
	public boolean publishCourseCredit(long courseID, long credit){
		return true;
	}
	
	public ArrayList<CoursePO> showScore2(String stuID, int term){
		return null;
	}
	
	public ArrayList<CoursePO> showCourse2(int aID){
		return null;
	}
	
	public ArrayList<CoursePO> showAllScore(String stuID){
		return null;
	}
	
	public boolean selectCourseTmp(String courseID, String stuID){
		return true;
	}
	
	public boolean addToSelectInfo(long courseID){
		return true;
	}
	
	public ArrayList<StudentPO> showSelectList(long courseID){
		return null;
	}
	
	public int showHisNumberOfCourse(String stuID){
		return 0;
	}
	
	public boolean isFull(String stuID){
		return true;
	}
	
	public int getCredit(long courseID){
		return 0;
	}

}
