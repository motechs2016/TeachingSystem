package dataservice.framedataservice;
import java.util.ArrayList;

import po.*;
public interface FrameDataService {

	  public FramePO find(long ID);
	  
	  public void insert(FramePO po);
	  
	  public void update(FramePO po);
	  
	  public void delete(FramePO po);
	  
	   public ArrayList<FramePO> showFrameList();
}
