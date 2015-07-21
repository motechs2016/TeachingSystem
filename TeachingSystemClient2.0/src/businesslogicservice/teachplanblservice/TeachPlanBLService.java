package businesslogicservice.teachplanblservice;
import vo.*;

import java.util.ArrayList;

import presentation.mainui.MainUI;

import businesslogic.framebl.FrameList;
public interface TeachPlanBLService {
	
	public TeachPlanVO showTeachPlan(long ID);
  
	public FrameList showTeachPlan();
	
	public boolean inputTeachPlan(TeachPlanVO teachplan);
	
	public long showAID(String academyName);
	
	public boolean endTeachPlan();
}
