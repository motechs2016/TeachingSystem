package dataservice.teachplandataservice;
import java.util.ArrayList;

import po.*;
public class TeachPlanDataService_Stub implements TeachPlanDataService{
	public TeachPlanPO find(long ID){
		return new TeachPlanPO("���ѧԺ","��ɢ��ѧ�ڴ�һ��ѧ�ڿ��Σ�ѧ��Ϊ5��");
	}
    
    public void insert(TeachPlanPO po){
    	System.out.println("Success!");
    }
    
    public void delete(TeachPlanPO po){
    	System.out.println("Success!");
    }
    
    public void update(TeachPlanPO po){
    	System.out.println("Success!");
    }
    
    public ArrayList<TeachPlanPO> showTeachPlan(){
    	return null;
    }
	 
	 public ArrayList<String> showMajorCourse(long aID, String term, String mid){
		 return null;
	 }
	 
	 public long showAID(String aName){
		 return 0;
	 }
}