package businesslogicservice.userblservice;

import java.util.ArrayList;

import vo.UserVO;

public interface UserBLService {

	 public String  login(String ID, String password);
	 
	 public boolean register(String type,String ID, String password);
	 
	 public ArrayList<UserVO> showAllUser();
}
