package businesslogic.teachplanbl;

import java.util.ArrayList;
import presentation.mainui.MainUI;
import vo.TeachPlanVO;
import vo.TeacherVO;
import businesslogic.framebl.FrameList;
import businesslogicservice.teachplanblservice.TeachPlanBLService;

public class TeachPlanDeal implements TeachPlanBLService{
	public TeachPlanVO showTeachPlan(long ID){
		MainUI.net.sendMessage("showTeachPlanwithAID "+ID);
		String info=MainUI.net.getMessage();
		String[] split=info.split(" ");
		TeachPlanVO vo=new TeachPlanVO(0,split[0],split[1]);
	    return vo;
}
  
	public FrameList showTeachPlan(){
		MainUI.net.sendMessage("showTeachPlan");
		return null;
	}
	
	public boolean inputTeachPlan(TeachPlanVO teachplan){
		MainUI.net.sendMessage("InputTeachPlan "+teachplan.aID+" "+teachplan.plan);
		return true;
	}
	
	public long showAID(String academyName){
		MainUI.net.sendMessage("showAIDwithAcademyName "+academyName);
		Long aID=Long.parseLong(MainUI.net.getMessage());
		return aID;
	}
	
	public boolean endTeachPlan(){
		return true;
	}
}
