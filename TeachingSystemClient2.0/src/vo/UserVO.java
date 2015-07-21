package vo;

public class UserVO {
	  String ID;
	  String name;
	  String password;
	  String type;
	  
	  public UserVO(String id, String name, String password,String type){
		  this.ID=id;
		  this.name=name;
		  this.password=password;
		  this.type=type;
	  }
	  
	  public String getID(){
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
