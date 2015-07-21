package businesslogicservice.teachplanblservice;

import java.util.ArrayList;

import businesslogic.framebl.FrameList;

import vo.TeachPlanVO;
import vo.TeacherVO;

public class TeachPlanBLService_Stub implements TeachPlanBLService{
	 public long aID;
	 public  String plan;
	  
	  public TeachPlanBLService_Stub(long aID, String plan){
		  this.aID=aID;
		  this.plan=plan;
	  }
	
	
	  public TeachPlanVO showTeachPlan(long ID){
		  return null;
	  }
	  
		public FrameList showTeachPlan(){
			return null;
		}
		
		public boolean inputTeachPlan(TeachPlanVO teachplan){
			return true;
		}
		
		public long showAID(String academyName){
			return 12;
		}
		
		public boolean endTeachPlan(){
			return true;
		}
}
