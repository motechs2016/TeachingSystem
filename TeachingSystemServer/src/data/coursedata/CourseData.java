package data.coursedata;

import java.util.Date;
import java.util.ArrayList;
import po.CoursePO;
import po.StudentPO;
import po.TeacherPO;
import data.studentdata.StudentData;
import data.teacherdata.TeacherData;
import data.teachplandata.TeachPlanData;
import dataservice.coursedataservice.*;
import java.io.*;

public class CourseData implements CourseDataService{

	public CoursePO find(long ID){           
		String tmp=null;
		String split[]=new String[7];
		CoursePO po=null;
		try{
			FileReader fr=new FileReader("src/kctjxx");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				  if(split[0].equals(ID+"")){
					  TeacherPO teacher=new TeacherData().find(split[2]);
						String[] split2=split[5].split("、");
						ArrayList<StudentPO> list=new ArrayList<StudentPO>();
						for(int i=0;i<=split2.length-1;i++){
							String[] split3=split2[i].split("@");
							if(!split3[0].equals("000000000")){
							StudentPO student=new StudentPO(split3[0],null,0,null);
							list.add(student);
							}
						}
					  po=new CoursePO(Long.parseLong(split[0]),split[1],teacher.getName(),split[4],split[3],list,Long.parseLong(split[6]),0);
					  break;
				  }
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return po;
	}
	
	public ArrayList<CoursePO> find(String stuID){      
		String tmp=null;
		String[] split=new String[7];
		ArrayList<CoursePO> courselist=new ArrayList<CoursePO>();
		try{
			FileReader fr=new FileReader("src/kctjxx");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				String[] split2=split[5].split("、");
				for(int i=0;i<=split2.length-1;i++){
					String[] split3=split2[i].split("@");
					if(split3[0].equals(stuID)){				
						TeacherPO teacher=new TeacherData().find(split[2]);
						CoursePO po=new CoursePO(Long.parseLong(split[0]),split[1],teacher.getName(),split[4],split[3],null,Long.parseLong(split[6]),Integer.parseInt(split3[1]));
						courselist.add(po);
						break;
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return courselist;
	}
	
	public ArrayList<CoursePO> find(TeacherPO teacher){          
		ArrayList<CoursePO> courselist=new ArrayList<CoursePO>();
	    ArrayList<StudentPO> studentlist=new ArrayList<StudentPO>();
		String[] split=new String[7];
		String tmp=null;
		try{
			FileReader fr=new FileReader("src/kctjxx");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				   if(split[2].equals(teacher.getID())){
					   courselist.add(new CoursePO(Long.parseLong(split[0]),split[1],split[2],split[4],split[3],null,Long.parseLong(split[6]),0));
				   }
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return courselist;
	}
	
	public boolean insert(CoursePO po){  
		String split[]=new String[7];
		String result="";
		String tmp=null;
		int flag=0;
		try{
			FileReader fr=new FileReader("src/kctjxx");
			BufferedReader br=new BufferedReader(fr);
			tmp=br.readLine();
			result=result+tmp+"\n";
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				  if(Long.parseLong(split[0])==po.getID()){
					  return false;
				  }
				   if(Long.parseLong(split[0])<po.getID()){
					   result=result+tmp+"\n";
					   
				   }
				   if(Long.parseLong(split[0])>po.getID()){
					   if(flag==0){
						   result=result+po.getID()+" "+po.getName()+" "+po.getTeachernum()+" "+po.getTime()+" "+po.getPlace()+" "+"000000000@0"+" "+po.getAID()+"\n"+tmp+"\n";
						   flag=1;
					   }
					   else{
						   result=result+tmp+"\n";
					   }
				   }
			}
			if(flag==0){
				result=result+po.getID()+" "+po.getName()+" "+po.getTeachernum()+" "+po.getTime()+" "+po.getPlace()+" "+"000000000@0"+" "+po.getAID()+"\n";
			}
			FileWriter fw=new FileWriter("src/kctjxx");
			fw.write(result);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	
	public void delete(CoursePO po){
	
	}
	
	public void update(CoursePO po){       
               String[] split=new String[7];
               String tmp=null;
               String result="";
              try{
            	  FileReader fr=new FileReader("src/kctjxx");
            	  BufferedReader br=new BufferedReader(fr);
            	  tmp=br.readLine();
            	  result=result+tmp+"\n";
            	  while((tmp=br.readLine())!=null){
            		  split=tmp.split(" ");
            		     if(split[0].equals(po.getID()+"")){
            		    	 result=result+po.getID()+" "+po.getName()+" "+po.getTeachernum()+" "+po.getTime()+" "+po.getPlace()+" "+split[5]+" "+split[6]+"\n";
            		     }
            		     else{
            		    	 result=result+tmp+"\n";
            		     }
            	  }
            	  FileWriter fw=new FileWriter("src/kctjxx");
            	  fw.write(result);
            	  fw.close();
              }catch(Exception e){
            	  e.printStackTrace();
              }
	}
	
	public void recordScore(CoursePO course,StudentPO student,int score){  
		  String result="";
		  String []split=new String[7];
		  String tmp=null;
		  try{
			  FileReader fr=new FileReader("src/kctjxx");
			  BufferedReader br=new BufferedReader(fr);
			  tmp=br.readLine();
			  result=result+tmp+"\n";
			  while((tmp=br.readLine())!=null){
				  split=tmp.split(" ");
				   if(split[0].equals(course.getID()+"")){
					   String[] split2=split[5].split("、");
					    String mid="";
					    int i=0;
					    for(;i<=split2.length-2;i++){
					    	String[] split3=split2[i].split("@");
					    	  if(split3[0].equals(student.getID())){
					    		  mid=mid+student.getID()+"@"+score+"、";
					    	  }
					    	  else{
					    		  mid=mid+split2[i]+"、";
					    	  }
					    }
					    String[] split4=split2[i].split("@");
					    if(split4[0].equals(student.getID())){
					    	mid=mid+student.getID()+"@"+score;
					    }
					    else{
					    	mid=mid+split2[i];
					    }
					    result=result+split[0]+" "+split[1]+" "+split[2]+" "+split[3]+" "+split[4]+" "+mid+" "+split[6]+"\n";
				   }
				   else{
					   result=result+tmp+"\n";
				   }
			  }
			  FileWriter fw=new FileWriter("src/kctjxx");
			  fw.write(result);
			  fw.close();
		  }catch(Exception e){
			  e.printStackTrace();
		  }
		
	}
	
	public ArrayList<CoursePO> showCourse(){ 
		String tmp=null;
		String[] split=new String[7];
		ArrayList<CoursePO> list=new ArrayList<CoursePO>();
		try{
			FileReader fr=new FileReader("src/kctjxx");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				TeacherPO teacher=new TeacherData().find(split[2]);
				CoursePO course=new CoursePO(Long.parseLong(split[0]),split[1],teacher.getName(),split[4],split[3],null,Long.parseLong(split[6]),100);
				list.add(course);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean selectCourse(CoursePO course,StudentPO student){ 
		String[] split=new String[7];
		String[] split2=null;
		String tmp=null;
		String result="";
		String studentField="";
		try{
			FileReader fr=new FileReader("src/kctjxx");
			BufferedReader br=new BufferedReader(fr);
			tmp=br.readLine();
			result=result+tmp+"\n";
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				if(Long.parseLong(split[0])==course.getID()){
					String replace=split[5]+"、"+student.getID()+"@"+0;
					split2=replace.split("、");
					for(int i=0;i<=split2.length-2;i++)
						for(int j=0;j<=split2.length-2;j++){
							char[] s1=new char[9];
							split2[j].getChars(0, 9, s1,0);
							char[] s2=new char[9];
							split2[j+1].getChars(0,9,s2,0);
							long num1=Long.parseLong(new String(s1));
							long num2=Long.parseLong(new String(s2));
							String theTmp=null;
							    if(num1>num2){
							    	theTmp=split2[j];
							    	split2[j]=split2[j+1];
							    	split2[j+1]=theTmp;
							    }
							    if(num1==num2)
							    	return false;
						}
					for(int i=0;i<=split2.length-2;i++){
						studentField=studentField+split2[i]+"、";
					}
					studentField=studentField+split2[split2.length-1];
					result=result+split[0]+" "+split[1]+" "+split[2]+" "+split[3]+" "+split[4]+" "+studentField+" "+split[6]+"\n";
				}
				else{
					result=result+tmp+"\n";
				}
			}
			FileWriter fw=new FileWriter("src/kctjxx");
			fw.write(result);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	
	public void fillCourseInfo(Long ID, String info){ 
		String tmp=null;
		String result="";
		String[] split=new String[2];
		int flag=0;
		try{
			FileReader fr=new FileReader("src/kcdg");
			BufferedReader br=new BufferedReader(fr);
			tmp=br.readLine();
			result=result+tmp+"\n";
			while((tmp=br.readLine())!=null){
			     split=tmp.split(" ");
			       if(Long.parseLong(split[0])<ID){
			    	   result=result+tmp+"\n";
			       }
			       else{
			    	   if(flag==0){
			    		   if(Long.parseLong(split[0])>ID){
			    			   result=result+ID+" "+info+"\n"+tmp+"\n";
			    			   flag=1;
			    		   }
			    	   }
			    	   else{
			    		   result=result+tmp+"\n"; 
			    	   }
			       }
			}
			if(flag==0)
				 result=result+ID+" "+info;
			FileWriter fw=new FileWriter("src/kcdg");
			fw.write(result);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public ArrayList<CoursePO> showCoursewithAID(String aID){ 
		String tmp=null;
		String split[]=new String[7];
		ArrayList<CoursePO> courselist=new ArrayList<CoursePO>();
		try{
			FileReader fr=new FileReader("src/kctjxx");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				  split=tmp.split(" ");
				     if(split[6].equals(aID)){
				    	 CoursePO po=new CoursePO(Long.parseLong(split[0]),split[1],split[2],split[4],split[3],null,0,0);
				    	   courselist.add(po);
				     }
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return courselist;
	}
	
	public boolean quitCourse(long courseID,String stuID){
		String split[]=new String[7];
		String result="";
		String tmp=null;
		String stu="";
		try{
			FileReader fr=new FileReader("src/kctjxx");
			BufferedReader br=new BufferedReader(fr);
			tmp=br.readLine();
			result=result+tmp+"\n";
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				  if(split[0].equals(courseID+"")){
					  String[] split2=split[5].split("、");
					  int i=0;
					  if(split2.length>=3){
					  for(;i<=split2.length-3;i++){
						  String[] split3=split2[i].split("@");
						    if(split3[0].equals(stuID)){
						    	//do nothing
						    }
						    else{
						    	stu=stu+split3[0]+"@0"+"、";
						    }
					  }
					String[] split4=split2[i].split("@");
					i++;
					String[] split5=split2[i].split("@");
					if(stuID.equals(split4[0])){
						stu=stu+split5[0]+"@0";
					}
					else if(stuID.equals(split5[0])){
						stu=stu+split4[0]+"@0";
					}
					else{
						stu=stu+split4[0]+"@0、"+split5[0]+"@0";
					}
					result=result+split[0]+" "+split[1]+" "+split[2]+" "+split[3]+" "+split[4]+" "+stu+" "+split[6]+"\n";
					  }
					  else{
						  result=result+split[0]+" "+split[1]+" "+split[2]+" "+split[3]+" "+split[4]+" "+"000000000@0"+" "+split[6]+"\n";
					  }	
				  }
				  else{
					  result=result+tmp+"\n";
				  }
				  
			}
			FileWriter fw=new FileWriter("src/kctjxx");
			fw.write(result);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean people(long courseID, long maxPeople){ 
		String split[]=new String[2];
		String tmp=null;
		String result="";
		int flag=0;
		try{
			FileReader fr=new FileReader("src/kcrs");
			BufferedReader br=new BufferedReader(fr);
			tmp=br.readLine();
			result=result+tmp+"\n";
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				  if(split[0].equals(courseID+"")){
					  return false;
				  }
				  else if(Long.parseLong(split[0])<courseID){
					  result=result+tmp+"\n";
				  }
				  else if(Long.parseLong(split[0])>courseID){
					  if(flag==0){
						  result=result+courseID+" "+"0@"+maxPeople+"\n"+tmp+"\n";
						  flag=1;
					  }
					  else{
					 result=result+tmp+"\n";
					  }
				  }
			}
			if(flag==0)
				  result=result+courseID+" "+"0@"+maxPeople+"\n";
			FileWriter fw=new FileWriter("src/kcrs");
			fw.write(result);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	
	public ArrayList<String> showPeople(){
		ArrayList<String> list=new ArrayList<String>();
		String[] split=new String[2];
		String tmp=null;
		try{
			FileReader fr=new FileReader("src/kcrs");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				list.add(split[1]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<String> showPeople(long aID){
		String[] split=new String[2];
		String tmp=null;
		ArrayList<String> list=new ArrayList<String>();
		try{
			FileReader fr=new FileReader("src/kcrs");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				 if(findAID(Long.parseLong(split[0]))==aID){
					 list.add(split[1]);
				 }
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	public int showMaxPeople(long courseID){            
		String[] split=new String[2];
		String tmp=null;
		try{
			FileReader fr=new FileReader("src/kcrs");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				 if(split[0].equals(courseID+"")){
					 String[] split2=split[1].split("@");
					 return Integer.parseInt(split2[1]);
				 }
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	
	public long findAID(long courseID){
		String[] split=new String[7];
		String tmp=null;
		try{
			FileReader fr=new FileReader("src/kctjxx");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				  if(split[0].equals(courseID+"")){
					  return Long.parseLong(split[6]);
				  }
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	
	public String findPeople(String ID){
		String[] split=new String[2];
		String tmp=null;
		try{
			FileReader fr=new FileReader("src/kcrs");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				  if(split[0].equals(ID)){
					  return split[1];
				  }
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean addOne(String ID){
		String[] split=new String[2];
		String tmp=null;
		String result="";
		try{
			FileReader fr=new FileReader("src/kcrs");
			BufferedReader br=new BufferedReader(fr);
			tmp=br.readLine();
			result=result+tmp+"\n";
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				  if(split[0].equals(ID)){
					  String[] split2=split[1].split("@");
					  long selected_people=Long.parseLong(split2[0]);
					  selected_people++;
					  result=result+split[0]+" "+selected_people+"@"+split2[1]+"\n";
				  }
				  else{
					  result=result+tmp+"\n";
				  }
			}
			FileWriter fw=new FileWriter("src/kcrs");
			fw.write(result);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean deleteOne(String ID){
		String[] split=new String[2];
		String tmp=null;
		String result="";
		try{
			FileReader fr=new FileReader("src/kcrs");
			BufferedReader br=new BufferedReader(fr);
			tmp=br.readLine();
			result=result+tmp+"\n";
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				  if(split[0].equals(ID)){
					  String[] split2=split[1].split("@");
					  long selected_people=Long.parseLong(split2[0]);
					  selected_people--;
					  result=result+split[0]+" "+selected_people+"@"+split2[1]+"\n";
				  }
				  else{
					  result=result+tmp+"\n";
				  }
			}
			FileWriter fw=new FileWriter("src/kcrs");
			fw.write(result);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	
	public void updateTheirMajorCourse(){
		String[] split=String.format("%tc", new Date()).split(" ");
		int current_year=Integer.parseInt(split[5]);
		if(split[1].equals("九月")){
			ArrayList<StudentPO> studentlist=new StudentData().showStudent();
			for(int i=0;i<=studentlist.size()-1;i++){
				String ID=studentlist.get(i).getID();
				long aID=studentlist.get(i).getAID();
				String loginTime=new StudentData().showLoginTime(ID);
				String[] split2=loginTime.split("/");
				int login_year=Integer.parseInt(split2[1]);
				String term=null;
				switch(current_year-login_year){
				case 0: term="大一"; break;
				case 1: term="大二";break;
				case 2: term="大三";break;
				case 3: term="大四";break;
				}
				ArrayList<String> majorCourseList=new TeachPlanData().showMajorCourse(aID,term,"上学期");
				for(int j=0;j<=majorCourseList.size()-1;j++){
					long courseID=findCourseID(majorCourseList.get(j));
					CoursePO po=new CoursePO(courseID,majorCourseList.get(j),null,null,null,null,0,0);
					selectCourse(po,studentlist.get(i));
				}
			}
		}
		
		else if(split[1].equals("三月")){
			ArrayList<StudentPO> studentlist=new StudentData().showStudent();
			for(int i=0;i<=studentlist.size()-1;i++){
				String ID=studentlist.get(i).getID();
				long aID=studentlist.get(i).getAID();
				String loginTime=new StudentData().showLoginTime(ID);
				String[] split2=loginTime.split("/");
				int login_year=Integer.parseInt(split2[1]);
				String term=null;
				switch(current_year-login_year){
				case 1: term="大一"; break;
				case 2: term="大二";break;
				case 3: term="大三";break;
				case 4: term="大四";break;
				}
				ArrayList<String> majorCourseList=new TeachPlanData().showMajorCourse(aID,term,"下学期");
				for(int j=0;j<=majorCourseList.size()-1;j++){
					long courseID=findCourseID(majorCourseList.get(j));
					CoursePO po=new CoursePO(courseID,majorCourseList.get(j),null,null,null,null,0,0);
					selectCourse(po,studentlist.get(i));
				}
			}
		}
		
	}
	
	public long findCourseID(String courseName){   //查看该名称的课程的编号
		String tmp=null;
		try{
			FileReader fr=new FileReader("src/kctjxx");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				String[] split=tmp.split(" ");
				  if(split[1].equals(courseName))
					  return Long.parseLong(split[0]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	
	public void clearSelectionInfo(){
		try{
			//先记录成绩
			ArrayList<StudentPO> studentlist=new StudentData().showStudent();
			for(int i=0;i<=studentlist.size()-1;i++){
				StudentPO po=studentlist.get(i);
				String tmp=null;
				String[] split=new String[7];
				String result="";
				FileReader reader=new FileReader("src/kctjxx");
				BufferedReader bufferedReader=new BufferedReader(reader);
				bufferedReader.readLine();
				while((tmp=bufferedReader.readLine())!=null){
					split=tmp.split(" ");
					if(split[5].contains(po.getID()+"")){
						String[] split2=split[5].split("、");
						 for(int j=0;j<=split2.length-1;j++){
							 if(split2[j].contains(po.getID()+"")){
								 String[] split3=split2[j].split("@");
								 result=result+"、"+split[0]+"@"+split[1]+"@"+getCredit(Long.parseLong(split[0]))+"@"+split3[1];
							 }
						 }
					}
				}
				result=result.replaceFirst("、", ";");
				String result2="";
				FileReader reader2=new FileReader("src/xscj");
				BufferedReader bufferedReader2=new BufferedReader(reader2);
				String[] ss=new String[2];
				String tmp2=null;
				tmp2=bufferedReader2.readLine();
				result2=result2+tmp2+"\n";
				while((tmp2=bufferedReader2.readLine())!=null){
					ss=tmp2.split(" ");
					if(ss[0].equals(po.getID()+"")){
						if(ss[1].equals("暂无信息")){
							result=result.replaceFirst(";", " ");
							result2=result2+ss[0]+" "+result.trim()+"\n";
						}
						else{
							result2=result2+ss[0]+" "+ss[1]+result+"\n";
						}
					}
					else{
						result2=result2+tmp2+"\n";
					}
				}
				FileWriter fw=new FileWriter("src/学生成绩");
				fw.write(result2);
				fw.close();
			}
			//再清空各种课程信息
			FileWriter fw=new FileWriter("src/kctjxx");
			String result="课程编号 课程名 任课老师工号 上课时间 上课地点 上课学生学号+学生该科成绩 开课院系";
			fw.write(result);
			fw.close();
			FileWriter fw2=new FileWriter("src/kcrs");
			String result2="课程编号 已选人数@限制人数";
			fw2.write(result2);
			fw2.close();
			FileWriter fw3=new FileWriter("src/kcxf");
			String result3="课程编号 课程学分";
			fw3.write(result3);
			fw3.close();
			FileWriter fw4=new FileWriter("src/xkxx");
			String result4="课程编号 选择该课的学生";
			fw4.write(result4);
			fw4.close();
			FileWriter fw5=new FileWriter("src/kcdg");
			String result5="课程编号 课程大纲";
			fw5.write(result5);
			fw5.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public boolean publishCourseCredit(long courseID, long credit){
		String[] split=new String[2];
		String tmp=null;
		String result="";
		int flag=0;
		try{
			FileReader fr=new FileReader("src/kcxf");
			BufferedReader br=new BufferedReader(fr);
			tmp=br.readLine();
			result=result+tmp+"\n";
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				  if(Long.parseLong(split[0])<courseID){
					  result=result+tmp+"\n";
				  }
				  else if(Long.parseLong(split[0])==courseID){
					  return false;
				  }
				  else{
					  if(flag==0){
						  result=result+courseID+" "+credit+"\n"+tmp+"\n";
						  flag=1;
					  }
					  else{
						  result=result+tmp+"\n";
					  }
				  }
			}
			if(flag==0){
				result=result+courseID+" "+credit;
			}
			FileWriter fw=new FileWriter("src/kcxf");
			fw.write(result);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	
	public ArrayList<CoursePO> showScore2(String stuID, int term){
		String[] split=new String[2];
		String tmp=null;
		ArrayList<CoursePO> courselist=new ArrayList<CoursePO>();
		try{
			FileReader fr=new FileReader("src/学生成绩");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				  if(split[0].equals(stuID)){
					  String[] split2=split[1].split(";");
					  if(split[1].equals("暂无信息")){
						  return courselist;
					  }
					  if(split2.length<term+1){
						  return courselist;
					  }
					  String[] split3=split2[term].split("、");
					  for(int i=0;i<=split3.length-1;i++){
						  String[] split4=split3[i].split("@");
						  CoursePO course=new CoursePO(Long.parseLong(split4[0]),split4[1],null,null,null,null,0,Integer.parseInt(split4[3]));
						  courselist.add(course);
					  }
				  }
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return courselist;
	}
	
	public ArrayList<CoursePO> showCourse2(int aID){
		String tmp=null;
		String split[]=new String[7];
		ArrayList<CoursePO> courselist=new ArrayList<CoursePO>();
		try{
			FileReader fr=new FileReader("src/kctjxx");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				  split=tmp.split(" ");
				     if(split[6].equals(aID+"")){
				    	 TeacherPO teacher=new TeacherData().find(split[2]);
				    	 CoursePO po=new CoursePO(Long.parseLong(split[0]),split[1],teacher.getName(),split[4],split[3],null,0,0);
				    	  courselist.add(po);
				     }
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return courselist;
	}
	
	public ArrayList<CoursePO> showAllScore(String stuID){
		String[] split=new String[2];
		String tmp=null;
		ArrayList<CoursePO> courselist=new ArrayList<CoursePO>();
		try{
			FileReader fr=new FileReader("src/学生成绩");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				  if(split[0].equals(stuID)){
					  if(split[1].equals("暂无信息")){
						  return courselist;
					  }
					  String[] split2=split[1].split(";");
					  for(int i=0;i<=split2.length-1;i++){
						  String[] split3=split2[i].split("、");
						     for(int j=0;j<=split3.length-1; j++){
						    	 String[] split4=split3[j].split("@");
						    	 CoursePO po=new CoursePO(Long.parseLong(split4[0]),split4[1],null,null,null,null,0,Integer.parseInt(split4[3]));
						    	 courselist.add(po);
						     }
					  }
				  }
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return courselist;
	}
	
	public boolean selectCourseTmp(String courseID, String stuID){    //保存选课信息
		String split[]=new String[2];
		String tmp=null;
		String result="";
		try{
			FileReader fr=new FileReader("src/xkxx");
			BufferedReader br=new BufferedReader(fr);
			tmp=br.readLine();
			result=result+tmp+"\n";
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				if(split[0].equals(courseID)){
					result=result+split[0]+" "+split[1]+"、"+stuID+"\n";
				}
				else{
					result=result+tmp+"\n";
				}
			}                                                                                                                        //直接push
			FileWriter fw=new FileWriter("src/xkxx");
			fw.write(result);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean addToSelectInfo(long courseID){
		String split[]=new String[2];
		String tmp=null;
		String result="";
		int flag=0;
		try{
			FileReader fr=new FileReader("src/xkxx");
			BufferedReader br=new BufferedReader(fr);
			tmp=br.readLine();
			result=result+tmp+"\n";
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				if(Long.parseLong(split[0])==courseID){
					return false;
				}
				if(Long.parseLong(split[0])<courseID){
					result=result+tmp+"\n";
				}
				if(Long.parseLong(split[0])>courseID){
					if(flag==0){
						result=result+courseID+" "+"000000000"+"\n"+tmp+"\n";
						flag=1;
					}
					else{
						result=result+tmp+"\n";
					}
				}
			}
			if(flag==0){
				result=result+courseID+" "+"000000000";
			}
			FileWriter fw=new FileWriter("src/xkxx");
			fw.write(result);
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	
	public ArrayList<StudentPO> showSelectList(long courseID){              //查看暂时选择该课的学生列表
		String[] split=new String[2];
		String tmp=null;
		ArrayList<StudentPO> studentlist=new ArrayList<StudentPO>();
		try{
			FileReader fr=new FileReader("src/xkxx");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				if(Long.parseLong(split[0])==courseID){
					String[] split2=split[1].split("、");
					if(split2.length==1)
						return studentlist;
					else{
						for(int i=1;i<=split2.length-1;i++){
							StudentPO po=new StudentPO(split2[i],"",0,null);
							studentlist.add(po);
						}
						return studentlist;
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public int showHisNumberOfCourse(String stuID){
		String[] split=new String[2];
		String tmp=null;
		int number=0;
		try{
			FileReader fr=new FileReader("src/xscj");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				if(split[0].equals(stuID)){
					if(split[1].equals("暂无信息"))
						return 0;
					String[] split2=split[1].split(";");
					for(int i=0;i<=split2.length-1;i++){
						String[] split3=split2[i].split("、");
						number=number+split3.length;
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return number;
	}
	
	public boolean isFull(String stuID){
		String[] split=new String[2];
		String tmp=null;
		int counter=0;
		try{
			FileReader fr=new FileReader("src/xkxx");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				String[] split2=split[1].split("、");
				for(int i=0;i<=split2.length-1;i++){
					if(split2[i].equals(stuID))
						counter++;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		if(counter>=3)
			return true;
		else
			return false;
	}
	
	public int getCredit(long courseID){
		String[] split=new String[2];
		String tmp=null;
		try{
			FileReader fr=new FileReader("src/kcxf");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				if(Long.parseLong(split[0])==courseID){
					return Integer.parseInt(split[1]);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	
	public String findCourseIDByCourseName(String courseName){
		String tmp=null;
		String[] split=new String[7];
		try{
			FileReader fr=new FileReader("src/kctjxx");
			BufferedReader br=new BufferedReader(fr);
			br.readLine();
			while((tmp=br.readLine())!=null){
				split=tmp.split(" ");
				if(split[1].equals(courseName)) return split[0];
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return "null";
	}
		
}
