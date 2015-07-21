package businesslogicservice.frameblservice;
import vo.*;
import java.util.ArrayList;

import businesslogic.framebl.FrameList;
public class FrameBLService_Driver {
	
        public void drive(FrameBLService frameBLService){
        	boolean message=frameBLService.inputFrame(new FrameVO("通识通修","必选","通识教育课程","大学数学",14,"1至8"));
        	if(message==true)
        		System.out.println("Succeed in inputting");
        	else 
        		System.out.println("Fail to input");
        	boolean message2=frameBLService.editFrame(null,1);
        	if(message2==true)
        		System.out.println("Succeed in editing");
        	else 
        		System.out.println("Fail to edit");
        	FrameList framelist=frameBLService.showFrame();
        	frameBLService.endFrame();
        }
}
