package dataservice.framedataservice;
import po.*;
public class FrameDataService_Driver {
	public void drive(FrameDataService frameDataService){
		FramePO framePO = frameDataService.find(121250102);
		if(framePO.getCredit()!=0)
			System.out.println("exists");
		frameDataService.insert(new FramePO("ͨʶͨ��","��ѡ","ͨʶ�����γ�",null,14,"1��8"));
		frameDataService.update(new FramePO("ͨʶͨ��","��ѡ","ͨʶ�����γ�",null,14,"1��8"));
		frameDataService.delete(new FramePO("ͨʶͨ��","��ѡ","ͨʶ�����γ�",null,14,"1��8"));
	}
}
