package data.teacherdata;

import po.TeacherPO;
import dataservice.teacherdataservice.*;
import java.io.*;
import java.util.ArrayList;
import java.io.*;

public class TeacherData implements TeacherDataService{
 
 public TeacherPO find(String ID){
	 String tmp=null;
	 String[] split=new String[3];
	 try{
		 FileReader fr=new FileReader("src/jstjxx");
		 BufferedReader br=new BufferedReader(fr);
		 br.readLine();
		 while((tmp=br.readLine())!=null){
			 split=tmp.split(" ");
			 if(split[0].equals(ID)){
				 return new TeacherPO(split[0],split[1],"任课老师",split[2],null);
			 }
		 }
	 }catch(Exception e){
		 e.printStackTrace();
	 }
	 return null;
 }
	 
	 public void delete(TeacherPO po){
		 
	 }
	 
	 public boolean insert(TeacherPO po){
			String[] split=new String[3];
			String tmp=null;
			String result="";
			int flag=0;
			try{
				FileReader fr=new FileReader("src/jstjxx");
				BufferedReader br=new BufferedReader(fr);
				tmp=br.readLine();
				result=result+tmp+"\n";
				while((tmp=br.readLine())!=null){
					split=tmp.split(" ");
					if(Long.parseLong(split[0])<Long.parseLong(po.getID())){
						result=result+tmp+"\n";
					}
					else if(Long.parseLong(split[0])==Long.parseLong(po.getID())){
						return false;
					}
					else{
						if(flag==0){
						result=result+po.getID()+" "+po.getName()+" "+po.getAID()+"\n"+tmp+"\n";
						flag=1;
						}
						else{
							result=result+tmp+"\n";
						}
					}
				}
				if(flag==0)
					result=result+po.getID()+" "+po.getName()+" "+po.getAID();
				FileWriter fw=new FileWriter("src/jstjxx");
				fw.write(result);
				fw.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			return true;
	 }
	 
	 public void update(TeacherPO po){
		 
	 }
	 
	 public ArrayList<TeacherPO> showTeacher(){
		 ArrayList<TeacherPO> list=new ArrayList<TeacherPO>();
		 String tmp=null;
		 String split[]=new String[3];
		 try{
			 FileReader fr=new FileReader("src/jstjxx");
			BufferedReader br=new BufferedReader(fr);
			tmp=br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				TeacherPO po=new TeacherPO(split[0],split[1],null,split[2],null);
				list.add(po);
			}
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 return list;
	 }
	 
	 public long showHisAID(String ID){   //查看该编号的老师所在院系的编号
		 String tmp=null;
		 String split[]=new String[3];
		 try{
			 FileReader fr=new FileReader("src/jstjxx");
			 BufferedReader br=new BufferedReader(fr);
			 while((tmp=br.readLine())!=null){
				 split=tmp.split(" ");
				    if(split[0].equals(ID)){
				    	return Long.parseLong(split[2]);
				    }
			 }
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 return 0;
	 }
	 
	
}
