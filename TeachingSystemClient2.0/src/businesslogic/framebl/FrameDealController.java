package businesslogic.framebl;

import businesslogicservice.frameblservice.*;
import vo.*;

public class FrameDealController {
  public boolean inputFrame(FrameVO vo){
	  if(new FrameDeal().inputFrame(vo))
		  return true;
	  else 
		  return false;
  }
  
  public boolean inputFrame(FrameItem item){
	  return new FrameDeal().inputFrame(item);
  }
  
  public boolean editFrame(FrameVO frame,int location){
	  if(new FrameDeal().editFrame(frame,location))
		  return true;
	  else 
		  return false;
  }
  
  public FrameList showFrame(){
	 return  new FrameDeal().showFrame();
  }
  
  public boolean endFrame(){
	  new FrameDeal().endFrame();
	  return true;
  }
}
