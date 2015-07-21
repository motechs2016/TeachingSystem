package data.teachplandata;

import po.CoursePO;
import po.TeachPlanPO;
import dataservice.teachplandataservice.*;
import java.io.*;
import java.util.ArrayList;

public class TeachPlanData implements TeachPlanDataService{

	 public TeachPlanPO find(long ID){
		 String tmp=null;
		 String split[]=new String[3];
          TeachPlanPO po=null;
		 try{
			 FileReader fr=new FileReader("src/p");
			 BufferedReader br=new BufferedReader(fr);
			 br.readLine();
			 while((tmp=br.readLine())!=null){
				 split=tmp.split(" ");
				 if(split[0].equals(""+ID)){
					 po=new TeachPlanPO(split[1],split[2]);
					 break;
				 }
			 }
			 return po;
		 }catch(Exception e){
			 e.printStackTrace();
		 }
	 return null;
}
	 public void insert(TeachPlanPO po){
		String split[]=new String[3];
		String tmp=null;
		String result="";
		try{
			FileReader fr=new FileReader("src/p");
			BufferedReader br=new BufferedReader(fr);
			tmp=br.readLine();
			result=result+tmp+"\n";
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				    if(split[0].equals(po.getDepartment())){
				    	result=result+split[0]+" "+split[1]+" "+po.getPlan()+"\n";
				    }
				    else{
				    	result=result+tmp+"\n";
				    }  
			}
			FileWriter fw=new FileWriter("src/p");
			fw.write(result);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	 }
	 
	 public void delete(TeachPlanPO po){
		 
	 }
	 
	 public void update(TeachPlanPO po){
		 String tmp=null;
		 String result="";
	     String[] split=new String[3];
		 try{
			   FileReader fr=new FileReader("src/p");
			  BufferedReader br=new BufferedReader(fr);
			  tmp=br.readLine();
			  result=result+tmp+"\n";
			  while((tmp=br.readLine())!=null){
				  split=tmp.split(" ");
				  if(split[1].equals(po.getDepartment())){
					  result=result+split[0]+" "+split[1]+" "+po.getPlan()+"\n";
				  }
				  else{
					  result=result+tmp+"\n";
				  }
			  }
			  FileWriter fw=new FileWriter("src/p");
			  fw.write(result);
			  fw.close();
		 }catch(Exception ex){
			 ex.printStackTrace();
		 }
		 
	 }
	 
	 public ArrayList<TeachPlanPO> showTeachPlan(){
		 return null;
	 }
	 
	 public ArrayList<String> showMajorCourse(long aID, String term, String mid){
		 String tmp=null;
		 String[] split=new String[3];
		 ArrayList<String> list=new ArrayList<String>();
		 try{
			 FileReader fr=new FileReader("src/p");
			 BufferedReader br=new BufferedReader(fr);
			 br.readLine();
			 while((tmp=br.readLine())!=null){
				 split=tmp.split(" ");
				   if(split[0].equals(aID+"")){
					   if(split[2].equals("‘›Œﬁ–≈œ¢")){
						   return null;
					   }
					   else{
						   String[] split2=split[2].split(";");
						    for(int i=0;i<=split2.length-1;i++){
						    	String[] split3=split2[i].split(":");
						    	if(split3[0].equals(term+mid)){
						    		String[] split4=split3[1].split("°¢");
						    		   for(int j=0;j<=split4.length-1;j++)
						    			   list.add(split4[j]);
						    	return list;
						    	}
						    }
					   }
				   }
			 }
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 return null;
	 }
	 
	 public long showAID(String aName){
		 String[] split=new String[3];
		 String tmp=null;
		 try{
			 FileReader fr=new FileReader("src/p");
			 BufferedReader br=new BufferedReader(fr);
			 br.readLine();
			 while((tmp=br.readLine())!=null){
				 split=tmp.split(" ");
				 if(split[1].equals(aName)){
					 return Long.parseLong(split[0]);
				 }
			 }
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 return 0;
	 }
	 
}
