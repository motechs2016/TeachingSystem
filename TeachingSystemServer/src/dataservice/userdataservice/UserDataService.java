package dataservice.userdataservice;
import java.util.ArrayList;

import po.*;
public interface UserDataService {
 
	  public boolean insert(UserPO po);
	 
	  public String find(String ID, String password);
	    
	  public ArrayList<UserPO> findAll();
}
