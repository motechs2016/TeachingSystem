package data.framedata;

import dataservice.framedataservice.*;
import po.*;
import java.io.*;
import java.util.ArrayList;

public class FrameData implements FrameDataService{
     public FramePO find(long ID){
    	 return null;
     }
     
     public void insert(FramePO po){
    	 String tmp=null;
    	 String split[]=new String[6];
    	 String result="";
    	 int flag=0;
    	 int flag2=0;
    	 try{
    		 FileReader fr=new FileReader("src/f");
    		 BufferedReader br=new BufferedReader(fr);
    		 tmp=br.readLine();
    		 result=result+tmp+"\n";
    		 while((tmp=br.readLine())!=null){
    			 split=tmp.split(" ");
    			 if(po.getModules().equals(split[0])){
    				 flag=1;
    				 flag2=1;
    				 result=result+tmp+"\n";
    			 }
    			 else{
    				 if(flag==1){
    					 flag=0;
    					 result=result+po.getModules()+" "+po.getCharacter()+" "+po.getCategory()+" "+po.getName()+" "+po.getCredit()+" "+po.getTime()+"\n";
    					 result=result+tmp+"\n";
    				 }
    				 else{
    					 result=result+tmp+"\n";
    				 }
    			 }
    		 }
    		 if(flag2==0)
    			 result=result+po.getModules()+" "+po.getCharacter()+" "+po.getCategory()+" "+po.getName()+" "+po.getCredit()+" "+po.getTime();
    		 FileWriter fw=new FileWriter("src/f");
    		 fw.write(result);
    		 fw.close();
    	 }catch(Exception e){
    		 e.printStackTrace();
    	 }
     }
     
     public void update(FramePO po){
    	 
     }
     
     public void update(FramePO po, int location){
    	 String[] split=new String[6];
    	 String tmp=null;
    	 int index=-1;
    	 String result="";
    	 try{
    		 FileReader fr=new FileReader("src/f");
    		 BufferedReader br=new BufferedReader(fr);
    		 tmp=br.readLine();
    		 result=result+tmp+"\n";
    		 while((tmp=br.readLine())!=null){
    			 index++;
    			 if(location==index){
    				 String replace=po.getModules()+" "+po.getCharacter()+" "+po.getCategory()+" "+po.getName()+" "+po.getCredit()+" "+po.getTime();
    				 result=result+replace+"\n";
    			 }
    			 else{
    				 result=result+tmp+"\n";
    			 }
    		 }
    		 FileWriter fw=new FileWriter("src/f");
    		 fw.write(result);
    		 fw.close();
    	 }catch(Exception e){
    		 e.printStackTrace();
    	 }
     }
     
     public void delete(FramePO po){
    	 
     }
     
     public ArrayList<FramePO> showFrameList(){
    	 ArrayList<FramePO> list=new ArrayList<FramePO>();
    	 String tmp=null;
    	 String split[]=new String[6];
    	 try{
    		 FileReader fr=new FileReader("src/f");
    		 BufferedReader br=new BufferedReader(fr);
    		 br.readLine();
    		 while((tmp=br.readLine())!=null){
    			split=tmp.split(" ");
    			list.add(new FramePO(split[0],split[1],split[2],split[3],Integer.parseInt(split[4]),split[5]));
    		 }
    	 }catch(Exception e){
    		 e.printStackTrace();
    	 }
    	 return list;
     }
}
