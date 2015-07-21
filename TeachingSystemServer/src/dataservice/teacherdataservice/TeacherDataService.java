package dataservice.teacherdataservice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import po.*;
public interface TeacherDataService {

	 public TeacherPO find(String ID);
	 
	 public void delete(TeacherPO po);
	 
	 public boolean insert(TeacherPO po);
	 
	 public void update(TeacherPO po);
	 
	 public ArrayList<TeacherPO> showTeacher();
	 
	 public long showHisAID(String ID);
}
