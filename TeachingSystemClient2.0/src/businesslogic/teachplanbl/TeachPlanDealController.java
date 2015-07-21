package businesslogic.teachplanbl;

import java.util.ArrayList;

import businesslogic.framebl.FrameList;

import vo.TeachPlanVO;
import vo.TeacherVO;

public class TeachPlanDealController {
	public TeachPlanVO showTeachPlan(long ID){
		return new TeachPlanDeal().showTeachPlan(ID);
	}
	  
		public FrameList showTeachPlan(){
			return new  TeachPlanDeal().showTeachPlan();
		}
		
		public boolean inputTeachPlan(TeachPlanVO teachplan){
			new TeachPlanDeal().inputTeachPlan(teachplan);
			return true;
		}
		
		public long showAID(String academyName){
			return new TeachPlanDeal().showAID(academyName);
		}
		
		public boolean endTeachPlan(){
			new TeachPlanDeal().endTeachPlan();
			return true;
		}
}
