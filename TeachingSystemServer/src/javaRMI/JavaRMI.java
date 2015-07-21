package javaRMI;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import po.CoursePO;
import po.FramePO;
import po.StudentPO;
import po.TeachPlanPO;
import po.TeacherPO;
import po.UserPO;
import data.coursedata.CourseData;
import data.framedata.FrameData;
import data.studentdata.StudentData;
import data.teacherdata.TeacherData;
import data.teachplandata.TeachPlanData;
import data.userdata.*;

public class JavaRMI {
ServerSocket serverSock;
ArrayList<Socket> client;

public void go(){
	client=new ArrayList<Socket>();
	try{
		serverSock=new ServerSocket(4000);
		while(true){
			Socket clientSock=serverSock.accept();
			client.add(clientSock);
			Thread t=new Thread(new ClientHandler(clientSock));
			t.start();
		}
	}catch(Exception e){
		e.printStackTrace();
	}
}

public class ClientHandler implements Runnable{
	Socket sock;
	BufferedReader br;
	
	public ClientHandler(Socket clientSock){
		try{
			sock=clientSock;
			InputStreamReader is=new InputStreamReader(sock.getInputStream());
			br=new BufferedReader(is);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void run(){
		String messageGet=null;
		try{
			while((messageGet=br.readLine())!=null){
				
				String[] split=messageGet.split(" ");
				
				if(split[0].equals("login")){
					String userType=new UserData().find(split[1],split[2]);
						sendMessageToClient(sock,userType);
				}
				
				if(split[0].equals("heartbeat")){
					sendMessageToClient(sock,"receive");
				}
				
				if(split[0].equals("register")){
					UserPO user=new UserPO(split[2],null,split[3],split[1]);
					if(new UserData().insert(user)){
						sendMessageToClient(sock,"register successfully");
					}
					else{
						sendMessageToClient(sock,"register fail");
					}
				}
				
				if(split[0].equals("showFramelist")){
					ArrayList<FramePO> list=new FrameData().showFrameList();
					if(list.size()==0)
						sendMessageToClient(sock,"null");
					else{
					String info="";
					for(int i=0;i<=list.size()-1;i++){
						info=info+list.get(i).getModules()+" "+list.get(i).getCharacter()+" "+list.get(i).getCategory()+" "+list.get(i).getName()+" "+list.get(i).getCredit()+" "+list.get(i).getTime()+";";
					}
					sendMessageToClient(sock,info);
					}
	        	}
				if(split[0].equals("showTeacher")){
					ArrayList<TeacherPO> list=new TeacherData().showTeacher();
					if(list.size()==0)
						sendMessageToClient(sock,"null");
					else{
					String info="";
					for(int i=0;i<=list.size()-1;i++){
						info=info+list.get(i).getID()+" "+list.get(i).getName()+" "+list.get(i).getAID()+";";
					}
					sendMessageToClient(sock,info);
			    	}
				}
				if(split[0].equals("showStudent")){
					ArrayList<StudentPO> list=new StudentData().showStudent();
					if(list.size()==0)
						sendMessageToClient(sock,"null");
					else{
					String info="";
					for(int i=0;i<=list.size()-1;i++){
						info=info+list.get(i).getID()+" "+list.get(i).getName()+" "+list.get(i).getAID()+";";
					}
					sendMessageToClient(sock,info);
					}
				}
				if(split[0].equals("showCourse")){
					ArrayList<CoursePO> list=new CourseData().showCourse();
					if(list.size()==0)
						sendMessageToClient(sock,"null");
					else{
					String info="";
					for(int i=0;i<=list.size()-1;i++){
						info=info+list.get(i).getID()+" "+list.get(i).getName()+" "+list.get(i).getTeachernum()+" "+list.get(i).getTime()+" "+list.get(i).getPlace()+" "+list.get(i).getAID()+";";
					}
					sendMessageToClient(sock,info);
					}
				}
				if(split[0].equals("showStudentwithID")){
					StudentPO po=new StudentData().find(split[1]);
					String info=po.getID()+" "+po.getName()+" "+po.getAID();
					sendMessageToClient(sock,info);
				}
				if(split[0].equals("showScorewithID")){
					ArrayList<CoursePO> list=new CourseData().find(split[1]);
					if(list.size()==0){
						sendMessageToClient(sock,"null");
					}
					else{
					String info="";
					for(int i=0;i<=list.size()-1;i++){
						info=info+list.get(i).getID()+" "+list.get(i).getName()+" "+list.get(i).getScore()+";";
					}
					sendMessageToClient(sock,info);
					}
				}
				if(split[0].equals("showCoursewithStudentID")){
					ArrayList<CoursePO> list=new CourseData().find(split[1]);
					if(list.size()==0)
						sendMessageToClient(sock,"null");
					else{
					String info="";
					for(int i=0;i<=list.size()-1;i++){
						info=info+list.get(i).getID()+" "+list.get(i).getName()+" "+list.get(i).getTeachernum()+" "+list.get(i).getTime()+" "+list.get(i).getPlace()+" "+list.get(i).getAID()+";";
					}
					sendMessageToClient(sock,info);
					}
				}
				if(split[0].equals("inputFrame")){
					FramePO po=new FramePO(split[1],split[2],split[3],split[4],Integer.parseInt(split[5]),split[6]);
					new FrameData().insert(po);
				}
				if(split[0].equals("editFrame")){
					FramePO po=new FramePO(split[1],split[2],split[3],split[4],Integer.parseInt(split[5]),split[6]);
					new FrameData().update(po,Integer.parseInt(split[7]));
				}
				if(split[0].equals("showTeachPlanwithAID")){
					TeachPlanPO po=new TeachPlanData().find(Long.parseLong(split[1]));
					String info=po.getDepartment()+" "+po.getPlan();
					sendMessageToClient(sock,info);
				}
				if(split[0].equals("selectCourse")){
					boolean can=new CourseData().selectCourse(new CoursePO(Long.parseLong(split[1]),null,null,null,null,null,0,0),new StudentPO(split[2],null,0,null));
					if(can==true)
						sendMessageToClient(sock,"true");
					else
						sendMessageToClient(sock,"false");
				}
				if(split[0].equals("addStudent")){
					StudentPO po=new StudentPO(split[1],split[2],Long.parseLong(split[3]),null);
					new StudentData().insert(po);	
			}
				if(split[0].equals("addTeacher")){
					TeacherPO po=new TeacherPO(split[1],split[2],null,split[3],null);
					boolean message=new TeacherData().insert(po);
					if(message==true)
						sendMessageToClient(sock,"true");
					else
						sendMessageToClient(sock,"false");
				}
				if(split[0].equals("showCoursewithCourseID")){
					CoursePO po=new CourseData().find(Long.parseLong(split[1]));
					String stuinfo="";
					int i=0;
					if(po.getStudentList().size()==0){
						stuinfo="null";
					}
					else{
					for(i=0;i<=po.getStudentList().size()-2;i++){
						stuinfo=stuinfo+po.getStudentList().get(i).getID()+"@0¡¢";
					}
					stuinfo=stuinfo+po.getStudentList().get(i).getID()+"@0";
					}
					String info=po.getID()+" "+po.getName()+" "+po.getTeachernum()+" "+po.getTime()+" "+po.getPlace()+" "+stuinfo+" "+po.getAID();
					sendMessageToClient(sock,info);
				}
				if(split[0].equals("showHisAID")){
					long aID=new TeacherData().showHisAID(split[1]);
					sendMessageToClient(sock,aID+"");
				}
				if(split[0].equals("showCoursewithAID")){
					ArrayList<CoursePO> list=new CourseData().showCoursewithAID(split[1]);
					 if(list.size()==0)
						sendMessageToClient(sock,"null");
					else{
					String info="";
					for(int i=0;i<=list.size()-1;i++){
						info=info+list.get(i).getID()+" "+list.get(i).getName()+" "+list.get(i).getTeachernum()+" "+list.get(i).getTime()+" "+list.get(i).getPlace()+";";
					}
					sendMessageToClient(sock,info);
					}
				}
				if(split[0].equals("InputTeachPlan")){
					TeachPlanPO po=new TeachPlanPO(split[1],split[2]);
					new TeachPlanData().insert(po);
				}
				if(split[0].equals("editCourse")){
					CoursePO po=new CoursePO(Long.parseLong(split[1]),split[2],split[3],split[5],split[4],null,0,0);
					new CourseData().update(po);
				}
				if(split[0].equals("showAllUser")){
				   ArrayList<UserPO> userlist=new UserData().findAll();
				   String info="";
				   for(int i=0;i<=userlist.size()-1;i++){
					   info=info+userlist.get(i).getType()+" "+userlist.get(i).getID()+" "+userlist.get(i).getPassword()+";";
				   }
				   sendMessageToClient(sock,info);
				}
				if(split[0].equals("publishCourse")){
					CoursePO po=new CoursePO(Long.parseLong(split[1]),split[2],split[3],split[5],split[4],null,Long.parseLong(split[6]),0);
					boolean message=new CourseData().insert(po);
					if(message==true)
						sendMessageToClient(sock,"success");
					else
						sendMessageToClient(sock,"fail");
				}
				if(split[0].equals("quitCourse")){
				 new CourseData().quitCourse(Long.parseLong(split[1]),split[2]);
				}
				if(split[0].equals("showTeacherwithTeacherID")){
					TeacherPO po=new TeacherData().find(split[1]);
					sendMessageToClient(sock,po.getID()+" "+po.getName()+" "+po.getAID());
				}
				if(split[0].equals("showCoursewithTeacherID")){
					ArrayList<CoursePO> courselist=new CourseData().find(new TeacherPO(split[1],"","","",null));
					if(courselist.size()==0)
						sendMessageToClient(sock,"null");
					else{
					String info="";
					for(int i=0;i<=courselist.size()-1;i++){
						info=info+courselist.get(i).getID()+" "+courselist.get(i).getName()+";";
					}
					sendMessageToClient(sock,info);
				}
			}
				if(split[0].equals("fillCourseInfo")){
					new CourseData().fillCourseInfo(Long.parseLong(split[1]), split[2]);
				}
				if(split[0].equals("recordScore")){
					CoursePO course=new CoursePO(Long.parseLong(split[1]),"","","","",null,0,0);
					StudentPO student=new StudentPO(split[2],"",0,null);
					new CourseData().recordScore(course,student,Integer.parseInt(split[3]));
				}
				if(split[0].equals("people")){
					boolean message=new CourseData().people(Long.parseLong(split[1]),Long.parseLong(split[2]));
					if(message==true)
						sendMessageToClient(sock,"true");
					else
						sendMessageToClient(sock,"false");
				}
				if(split[0].equals("showPeople")){
				ArrayList<String> peoplelist=new CourseData().showPeople();
				String info="";
				if(peoplelist.size()==0)
					sendMessageToClient(sock,"null");
				else{
				for(int i=0;i<=peoplelist.size()-1;i++){
					info=info+peoplelist.get(i)+";";
				       }
				sendMessageToClient(sock,info);
				     }
				}
				if(split[0].equals("showPeoplewithAID")){
					ArrayList<String> peoplelist=new CourseData().showPeople(Long.parseLong(split[1]));
					String info="";
					if(peoplelist.size()==0)
						sendMessageToClient(sock,"null");
					else{
					for(int i=0;i<=peoplelist.size()-1;i++){
						info=info+peoplelist.get(i)+";";
					       }
					sendMessageToClient(sock,info);
					     }
				}
				if(split[0].equals("findPeople")){
					String select_Info=new CourseData().findPeople(split[1]);
					sendMessageToClient(sock,select_Info);
				}
				if(split[0].equals("addOne")){
					new CourseData().addOne(split[1]);
				}
				if(split[0].equals("deleteOne")){
					new CourseData().deleteOne(split[1]);
				}
				if(split[0].equals("writeTime")){
					new StudentData().writeTime(split[1]+" "+split[2]);
				}
				if(split[0].equals("QueryHisRegisterTime")){
					String info=new StudentData().showLoginTime(split[1]);
					sendMessageToClient(sock,info);
				}
				if(split[0].equals("publishCourseCredit")){
					new CourseData().publishCourseCredit(Long.parseLong(split[1]),Long.parseLong(split[2]));
				}
				if(split[0].equals("showScore2")){
					ArrayList<CoursePO> list=new CourseData().showScore2(split[1],Integer.parseInt(split[2]));
					if(list.size()==0){
						sendMessageToClient(sock,"null");
					}
					else{
						String info="";
						for(int i=0;i<=list.size()-1;i++){
							info=info+list.get(i).getID()+" "+list.get(i).getName()+" "+list.get(i).getScore()+";";
						}
						sendMessageToClient(sock,info);
					}
				}
				if(split[0].equals("showCourse2")){
					ArrayList<CoursePO> list=new CourseData().showCourse2(Integer.parseInt(split[1]));
					 if(list.size()==0)
						sendMessageToClient(sock,"null");
					else{
					String info="";
					for(int i=0;i<=list.size()-1;i++){
						info=info+list.get(i).getID()+" "+list.get(i).getName()+" "+list.get(i).getTeachernum()+" "+list.get(i).getTime()+" "+list.get(i).getPlace()+";";
					}
					sendMessageToClient(sock,info);
					}
				}
				if(split[0].equals("showAllScore")){
					ArrayList<CoursePO> list=new CourseData().showAllScore(split[1]);
					if(list.size()==0){
						sendMessageToClient(sock,"null");
					}
					else{
						String info="";
						for(int i=0;i<=list.size()-1;i++){
							info=info+list.get(i).getID()+" "+list.get(i).getName()+" "+list.get(i).getScore()+";";
						}
						sendMessageToClient(sock,info);
					}
				}
				if(split[0].equals("addStudent2")){
					new StudentData().addStudent2(split[1]);
				}
				if(split[0].equals("showAIDwithAcademyName")){
					long aID=new TeachPlanData().showAID(split[1]);
					sendMessageToClient(sock,aID+"");
				}
				if(split[0].equals("selectCourseTmp")){
					new CourseData().selectCourseTmp(split[1],split[2]);
				}
				if(split[0].equals("addToSelectInfo")){
					new CourseData().addToSelectInfo(Long.parseLong(split[1]));
				}
				if(split[0].equals("isFull")){
					boolean message=new CourseData().isFull(split[1]);
					if(message==true)
						sendMessageToClient(sock,"true");
					else
						sendMessageToClient(sock,"false");
				}
				if(split[0].equals("findCourseIDByCourseName")){
					String message=new CourseData().findCourseIDByCourseName(split[1]);
					sendMessageToClient(sock, message);
				}
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
}
}

public void sendMessageToClient(Socket clientsocket,String message){
	try{
	PrintWriter writer=new PrintWriter(clientsocket.getOutputStream());
	writer.println(message);
	writer.flush();
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
