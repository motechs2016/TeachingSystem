package businesslogicservice.teachplanblservice;
import vo.*;
import java.util.ArrayList;

import businesslogic.framebl.FrameList;
public class TeachPlanBLService_Driver {
	
	public void Drive(TeachPlanBLService teachPlanBLService){
		TeachPlanVO teachplan=teachPlanBLService.showTeachPlan(1);
		System.out.println(teachplan.plan);
		FrameList teachplanlist=teachPlanBLService.showTeachPlan();
		System.out.println(teachplanlist.toString());
		boolean message=teachPlanBLService.inputTeachPlan(new TeachPlanVO(1,"文学院","暂无信息"));
		if(message==true)
			System.out.println("Success");
		else 
			System.out.println("Fail");
		teachPlanBLService.endTeachPlan();
	}

}
