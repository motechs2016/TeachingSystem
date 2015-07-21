package dataservice.framedataservice;
import java.util.ArrayList;

import po.*;
public class FrameDataService_Stub implements FrameDataService{
	 public FramePO find(long ID){
		 return new FramePO("通识通修","必选","通识教育课程",null,14,"1至8");
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
