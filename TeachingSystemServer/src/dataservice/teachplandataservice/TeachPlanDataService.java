package dataservice.teachplandataservice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import po.*;
public interface TeachPlanDataService {
	
    public TeachPlanPO find(long ID);
    
    public void insert(TeachPlanPO po);
    
    public void delete(TeachPlanPO po);
    
    public void update(TeachPlanPO po);
    
    public ArrayList<TeachPlanPO> showTeachPlan();
	 
	 public ArrayList<String> showMajorCourse(long aID, String term, String mid);
	 
	 public long showAID(String aName);
}
