package businesslogic.userbl;

import java.util.ArrayList;
import presentation.mainui.MainUI;
import vo.UserVO;
import businesslogicservice.userblservice.*;

public class UserDeal implements UserBLService{

	 public String  login(String ID, String password){
		 String cmd="login";
		 MainUI.net.sendMessage(cmd+" "+ID+" "+password);
		 String userType=MainUI.net.getMessage();
		 return userType;
	 }
	 
	 public boolean register(String type,String ID, String password){
		 String cmd="register";
		 MainUI.net.sendMessage("register"+" "+type+" "+ID+" "+password);
		 if(MainUI.net.getMessage().equals("register successfully")){
			 return true;
		 }
		 else
			 return false;
	 }
	 
	 public ArrayList<UserVO> showAllUser(){
		 MainUI.net.sendMessage("showAllUser");
		 String info=MainUI.net.getMessage();
		 String[] split=info.split(";");
		 ArrayList<UserVO> userlist=new ArrayList<UserVO>();
		 for(int i=0;i<=split.length-1;i++){
			 String[] split2=split[i].split(" ");
			 UserVO vo=new UserVO(split2[1],"",split2[2],split2[0]);
			 userlist.add(vo);
		 }
		 
		 return userlist;
	 }
}
