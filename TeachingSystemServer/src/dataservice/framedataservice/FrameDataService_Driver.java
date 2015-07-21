package dataservice.framedataservice;
import po.*;
public class FrameDataService_Driver {
	public void drive(FrameDataService frameDataService){
		FramePO framePO = frameDataService.find(121250102);
		if(framePO.getCredit()!=0)
			System.out.println("exists");
		frameDataService.insert(new FramePO("通识通修","必选","通识教育课程",null,14,"1至8"));
		frameDataService.update(new FramePO("通识通修","必选","通识教育课程",null,14,"1至8"));
		frameDataService.delete(new FramePO("通识通修","必选","通识教育课程",null,14,"1至8"));
	}
}
