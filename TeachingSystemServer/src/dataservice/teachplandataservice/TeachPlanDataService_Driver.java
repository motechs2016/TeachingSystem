package dataservice.teachplandataservice;
import po.*;
public class TeachPlanDataService_Driver {
	public void drive(TeachPlanDataService teachPlanDataService){
		TeachPlanPO teachPlanPO = teachPlanDataService.find(121250102);
		if(teachPlanPO.getPlan()!=null)
			System.out.println("exists");
		teachPlanDataService.insert(new TeachPlanPO("���ѧԺ","��ɢ��ѧ�ڴ�һ��ѧ�ڿ��Σ�ѧ��Ϊ5��"));
		teachPlanDataService.delete(new TeachPlanPO("���ѧԺ","��ɢ��ѧ�ڴ�һ��ѧ�ڿ��Σ�ѧ��Ϊ5��"));
		teachPlanDataService.update(new TeachPlanPO("���ѧԺ","��ɢ��ѧ�ڴ�һ��ѧ�ڿ��Σ�ѧ��Ϊ5��"));
	}
}
