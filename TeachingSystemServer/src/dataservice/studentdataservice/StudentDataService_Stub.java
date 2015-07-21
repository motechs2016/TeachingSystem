package dataservice.studentdataservice;
import java.util.ArrayList;

import po.*;
public class StudentDataService_Stub implements StudentDataService{
	public StudentPO find(String ID){
		return new StudentPO("121250102","ÄßÂ½ÕÂ",12,null);
	}
	
	public void delete(StudentPO po){
		System.out.println("Success!");
	}
	
	public void update(StudentPO po){
		System.out.println("Success!");
	}
	
	public void insert(StudentPO po){
		System.out.println("Success!");
	}
	
   public ArrayList<StudentPO> showStudent(){
	   return null;
   }
	
	public ArrayList<StudentPO> showStudent(long aID){
		return null;
	}
	
	public boolean writeTime(String time){
		return true;
	}
	
	public String showLoginTime(String stuID){
		return "Jan";
	}
	
	public boolean addStudent2(String stuID){
		return true;
	}
}
