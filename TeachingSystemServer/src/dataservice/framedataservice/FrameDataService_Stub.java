package dataservice.framedataservice;
import java.util.ArrayList;

import po.*;
public class FrameDataService_Stub implements FrameDataService{
	 public FramePO find(long ID){
		 return new FramePO("ͨʶͨ��","��ѡ","ͨʶ�����γ�",null,14,"1��8");
	 	}
	 public void insert(FramePO po){
		 System.out.println("Success!");
	 	}
	 public void update(FramePO po){
		 System.out.println("Success!");
	 	}
	 public void delete(FramePO po){
		 System.out.println("Success!");
	 } 
	   public ArrayList<FramePO> showFrameList(){
	    	return null;
	     }
}
