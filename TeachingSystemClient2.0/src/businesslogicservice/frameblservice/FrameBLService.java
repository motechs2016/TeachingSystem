package businesslogicservice.frameblservice;
import businesslogic.framebl.FrameItem;
import businesslogic.framebl.FrameList;
import vo.*;
public interface FrameBLService {
	 public boolean inputFrame(FrameVO framevo);
     
     public boolean inputFrame(FrameItem item);
     
     public boolean editFrame(FrameVO item, int location);
     
     public FrameList showFrame();
     
     public boolean endFrame();
}
