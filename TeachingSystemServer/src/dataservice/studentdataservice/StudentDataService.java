package dataservice.studentdataservice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import po.*;
public interface StudentDataService {

	public StudentPO find(String ID);
	
	public void delete(StudentPO po);
	
	public void update(StudentPO po);
	
	public void insert(StudentPO po);
	
	public ArrayList<StudentPO> showStudent();
	
	public ArrayList<StudentPO> showStudent(long aID);
	
	public boolean writeTime(String time);
	
	public String showLoginTime(String stuID);
	
	public boolean addStudent2(String stuID);
}
