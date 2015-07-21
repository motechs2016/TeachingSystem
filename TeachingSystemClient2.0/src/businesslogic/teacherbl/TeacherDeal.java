package businesslogic.teacherbl;

import java.util.ArrayList;
import presentation.mainui.MainUI;
import vo.TeacherVO;
import businesslogicservice.teacherblservice.*;

public class TeacherDeal implements TeacherBLService{

	    public boolean addTeacher(String ID, String name, String type,long aID){
	    	MainUI.net.sendMessage("addTeacher "+ID+" "+name+" "+aID);
	    	String info=MainUI.net.getMessage();
	    	if(info.equals("true"))
	    	    return true;
	    	else
	    		return false;
	    }
	    
	    public ArrayList<TeacherVO> showTeacher(){
	    	ArrayList<TeacherVO> list=new ArrayList<TeacherVO>();
	    	MainUI.net.sendMessage("showTeacher");
	    	String str=MainUI.net.getMessage();
	    	if(str.equals("null"))
	    		return null;
	    	String[] split=str.split(";");
	    	for(int i=0;i<=split.length-1;i++){
	    		String[] split2=split[i].split(" ");
	    		TeacherVO po=new TeacherVO(split2[0],split2[1],null,Long.parseLong(split2[2]),null);
	    		list.add(po);
	    	}
	    	return list;
	    }
	    
	    public TeacherVO showTeacher(String ID){
	    	MainUI.net.sendMessage("showTeacherwithTeacherID "+ID);
	    	String info=MainUI.net.getMessage();
	    	String[] split=info.split(" ");
	    	TeacherVO vo=new TeacherVO(split[0],split[1],"",Long.parseLong(split[2]),null);
	    	return vo;
	    	
	    }
	    
	    public long showHisAID(String ID){
	    	MainUI.net.sendMessage("showHisAID "+ID);
	    	String result=MainUI.net.getMessage();
	    	return Long.parseLong(result);
	    }
	    
	    public boolean endTeacher(){
	    	return true;
	    }
}
