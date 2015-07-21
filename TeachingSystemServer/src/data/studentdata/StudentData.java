package data.studentdata;

import po.StudentPO;
import dataservice.studentdataservice.*;
import java.io.*;
import java.util.ArrayList;

public class StudentData implements StudentDataService{
public StudentPO find(String ID){    //查找该学号的学生
	String tmp=null;
	String []split=new String[3];
	StudentPO po=null;
	  try{
		  FileReader fr=new FileReader("src/xstjxx");
		  BufferedReader br=new BufferedReader(fr);
		  br.readLine();
		  while((tmp=br.readLine())!=null){
			  split=tmp.split(" ");
			  if(split[0].equals(ID)){
				  po=new StudentPO(split[0],split[1],Long.parseLong(split[2]),null);
				  break;
			  }
		  }
	  }catch(Exception e){
		  e.printStackTrace();
	  }
	  return po;
}
	
	public void delete(StudentPO po){
		
	}
	
	public void update(StudentPO po){
		
	}
	
	public void insert(StudentPO po){
		String[] split=new String[3];
		String tmp=null;
		String result="";
		int flag=0;
		try{
			FileReader fr=new FileReader("src/xstjxx");
			BufferedReader br=new BufferedReader(fr);
			tmp=br.readLine();
			result=result+tmp+"\n";
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				if(Long.parseLong(split[0])<Long.parseLong(po.getID())){
					result=result+tmp+"\n";
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
			if(flag==0){
				result=result+po.getID()+" "+po.getName()+" "+po.getAID()+"\n";
			}
			FileWriter fw=new FileWriter("src/xstjxx");
			fw.write(result);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public ArrayList<StudentPO> showStudent(){
		String tmp=null;
		ArrayList<StudentPO> list=new ArrayList<StudentPO>();
		String split[]=new String[3];
		try{
			FileReader fr=new FileReader("src/xstjxx");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				StudentPO po=new StudentPO(split[0],split[1],Long.parseLong(split[2]),null);
				list.add(po);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<StudentPO> showStudent(long aID){
		String[] split=new String[3];
		String tmp=null;
		ArrayList<StudentPO> studentList=new ArrayList<StudentPO>();
		try{
			FileReader fr=new FileReader("src/xstjxx");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				    if(split[2].equals(aID+"")){
				    	StudentPO student=new StudentPO(split[0],split[1],aID,null);
				    	studentList.add(student);
				    }
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return studentList;
	}
	
	public boolean writeTime(String time){
		String[] split=new String[2];
		String tmp=null;
		String result="";
		String[] split2=time.split(" ");
		int flag=0;
		try{
			FileReader fr=new FileReader("src/intime");
			BufferedReader br=new BufferedReader(fr);
			tmp=br.readLine();
			result=result+tmp+"\n";
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				if(Long.parseLong(split[0])<Long.parseLong(split2[0])){
					result=result+tmp+"\n";
				}
				else{
					if(flag==0){
						result=result+split2[0]+" "+split2[1]+"\n"+tmp+"\n";
						flag=1;
					}
					else{
						result=result+tmp+"\n";
					}
				}
			}
			if(flag==0){
				result=result+split2[0]+" "+split2[1]+"\n";
			}
			FileWriter fw=new FileWriter("src/intime");
			fw.write(result);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	
	public String showLoginTime(String stuID){
		String tmp=null;
		try{
			FileReader fr=new FileReader("src/intime");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				String[] split=tmp.split(" ");
				   if(split[0].equals(stuID)){
					   return split[1];
				   }
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean addStudent2(String stuID){
		String result="";
		String tmp=null;
		String[] split=new String[2];
		int flag=0;
		try{
			FileReader fr=new FileReader("src/xscj");
			BufferedReader br=new BufferedReader(fr);
			tmp=br.readLine();
			result=result+tmp+"\n";
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				    if(Long.parseLong(split[0])<Long.parseLong(stuID)){
				    	result=result+tmp+"\n";
				    }
				    else if(Long.parseLong(split[0])>Long.parseLong(stuID)){
				    	   if(flag==0){
				    		   result=result+stuID+" "+"暂无信息"+"\n"+tmp+"\n";
				    		   flag=1;
				    	   }
				    	   else{
				    		   result=result+tmp+"\n";
				    	   }
				    }
			}
			if(flag==0){
				result=result+stuID+" "+"暂无信息";
			}
			FileWriter fw=new FileWriter("src/xscj");
			fw.write(result);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	
}
