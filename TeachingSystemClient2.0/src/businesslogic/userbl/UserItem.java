package businesslogic.userbl;

public class UserItem {
	  long ID;
	  String name;
	  String password;
	  String type;
	  
	  public UserItem(long id, String name, String password,String type){
		  this.ID=id;
		  this.name=name;
		  this.password=password;
		  this.type=type;
	  }
	  
	  public long getID(){
		  return ID;
	  }
	  
	  public String getName(){
		  return name;
	  }
	  
	  public String getPassword(){
		  return password;
	  }
	  
	  public String getType(){
		  return type;
	  }
}
