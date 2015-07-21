package dataservice.teacherdataservice;
import java.util.ArrayList;

import po.*;
public class TeacherDataService_Stub implements TeacherDataService{
	
	 public TeacherPO find(String ID){
		 return new TeacherPO("121250102","Qin Liu","»ŒøŒ¿œ ¶","12",null);
	 }
	 
	 public void delete(TeacherPO po){
		 System.out.println("Success!");
	 }
	 
	 public boolean insert(TeacherPO po){
		 System.out.println("Success!");
		 return true;
	 }
	 
	 public void update(TeacherPO po){
		 System.out.println("Success!");
	 }
	 
	 public ArrayList<TeacherPO> showTeacher(){
		 return null;
	 }
	 
	 public long showHisAID(String ID){
		 return 0;
	 }

}
