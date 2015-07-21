package businesslogic.framebl;

import presentation.mainui.MainUI;
import businesslogicservice.frameblservice.*;
import vo.*;

public class FrameDeal implements FrameBLService{
      public boolean inputFrame(FrameVO framevo){
    	  return true;
      }
      
      public boolean inputFrame(FrameItem item){
    	  String info=item.modules+" "+item.character+" "+item.catagory+" "+item.name+" "+item.credit+" "+item.time;
    	  MainUI.net.sendMessage("inputFrame "+info);
    	  return true;
      }
      
      public boolean editFrame(FrameVO item, int location){
    	  String info=item.modules+" "+item.character+" "+item.catagory+" "+item.name+" "+item.credit+" "+item.time;
    	  MainUI.net.sendMessage("editFrame "+info+" "+location);
    	  return true;
      }
      
      public FrameList showFrame(){
    	  MainUI.net.sendMessage("showFramelist");
    	 String info=MainUI.net.getMessage();
    	 if(info.equals("null"))
    			 return null;
    	 String[] split=info.split(";");
    	 String[] split2=new String[6];
    	  FrameList framelist=new FrameList();
    	for(int i=0;i<=split.length-1;i++){
    		split2=split[i].split(" ");
    		framelist.framelist.add(new FrameItem(split2[0],split2[1],split2[2],split2[3],Integer.parseInt(split2[4]),split2[5]));
    	}
    	 return framelist;
      }
      
      public boolean endFrame(){
    	  return true;
      }
}
