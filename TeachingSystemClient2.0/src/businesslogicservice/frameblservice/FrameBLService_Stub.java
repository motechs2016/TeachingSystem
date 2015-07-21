package businesslogicservice.frameblservice;
import businesslogic.framebl.FrameItem;
import businesslogic.framebl.FrameList;
import vo.*;
public class FrameBLService_Stub implements FrameBLService{
	  public   String modules;
      public  String character;
      public   String catagory;
      public   int credit;
      public String time;
       
       public FrameBLService_Stub(String module, String  character, String catagory, int credit, String time){
    	   this.modules=module;
    	   this.character=character;
    	   this.catagory=catagory;
    	   this.credit=credit;
    	   this.time=time;
       }
       
       public boolean inputFrame(FrameVO framevo){
    	   return true;
       }
       
       public boolean inputFrame(FrameItem item){
    	   return true;
       }
       
       public boolean editFrame(FrameVO item, int location){
    	   return true;
       }
       
       public FrameList showFrame(){
    	   return null;
       }
       
       public boolean endFrame(){
    	   return true;
       }

}
