package data.userdata;

import dataservice.userdataservice.*;
import po.*;
import java. io.*;
import java.util.ArrayList;

public class UserData implements UserDataService{
    public boolean insert(UserPO user){
    	String tmp=null;
    	String[] split=new String[4];
    	String str="";
    	try{
    		FileReader fr=new FileReader("src/u");
    		BufferedReader br=new BufferedReader(fr);
    		while((tmp=br.readLine())!=null){
    			split=tmp.split(" ");
    			if((user.getID()+"").equals(split[1])){
    				return false;
    			}
    			str=str+tmp+"\n";
    		}
    		str=str+user.getType()+" "+user.getID()+" "+user.getPassword();
    		FileWriter fw=new FileWriter("src/u");
    		fw.write(str);
    		fw.close();
    		return true;
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return true;
    }
    
    public String find(String ID, String password){
    	String tmp=null;
    	String[] split=new String[3];
    	try{
    		FileReader fr=new FileReader("src/u");
    		BufferedReader br=new BufferedReader(fr);
    		while((tmp=br.readLine())!=null){
    			split=tmp.split(" ");
    			if(split[1].equals(ID)&&split[2].equals(password))
    				 return split[0];
    		}
    	
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return "null";
    }
    
    public ArrayList<UserPO> findAll(){
    	String[] split=new String[3];
    	String tmp=null;
    	ArrayList<UserPO> userlist=new ArrayList<UserPO>();
    	try{
    		FileReader fr=new FileReader("src/u");
    		BufferedReader br=new BufferedReader(fr);
    		br.readLine();
    		while((tmp=br.readLine())!=null){
    			split=tmp.split(" ");
    			UserPO po=new UserPO(split[1],"",split[2],split[0]);
    			userlist.add(po);
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return userlist;
    }
    
}
