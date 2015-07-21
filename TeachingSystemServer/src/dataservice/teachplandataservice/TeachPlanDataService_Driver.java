package dataservice.teachplandataservice;
import po.*;
public class TeachPlanDataService_Driver {
	public void drive(TeachPlanDataService teachPlanDataService){
		TeachPlanPO teachPlanPO = teachPlanDataService.find(121250102);
		if(teachPlanPO.getPlan()!=null)
			System.out.println("exists");
		teachPlanDataService.insert(new TeachPlanPO("软件学院","离散数学在大一上学期开课，学分为5分"));
		teachPlanDataService.delete(new TeachPlanPO("软件学院","离散数学在大一上学期开课，学分为5分"));
		teachPlanDataService.update(new TeachPlanPO("软件学院","离散数学在大一上学期开课，学分为5分"));
	}
}
