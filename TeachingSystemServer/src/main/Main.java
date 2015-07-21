package main;

import javaRMI.*;
import java.util.ArrayList;
import java.util.Date;
import po.CoursePO;
import po.StudentPO;
import data.coursedata.CourseData;

public class Main {
	
public static void main(String[] args){
	Main main=new Main();
	JavaRMI rmi=new JavaRMI();
//	main.go();
	rmi.go();
}

public void go(){
	QueryTimeThread timethread=new QueryTimeThread();
	DecideCourseSelectionThread thread2=new DecideCourseSelectionThread();
	ClearCourseThread thread3=new ClearCourseThread();
	timethread.start();
	thread2.start();
	thread3.start();
}

public class ClearCourseThread extends Thread{              //该线程不断查询时间，如果是2.20和8.20，就清空旧的课程的所有信息，此后院系教务老师发布新的课程
	public void run(){
		while(true){
			String time=String.format("%tc", new Date());
			String[] split=time.split(" ");
			boolean c=(split[1].equals("八月")&&Integer.parseInt(split[2])==20)||(split[1].equals("二月")&&Integer.parseInt(split[2])==20);
			c=true;
			if(c){
				new CourseData().clearSelectionInfo();
				try{                                                                                                                            //完成任务后该线程睡眠2个月
					long gap=5184000000l;
					Thread.sleep(gap);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else{
				try{
					Thread.sleep(86400000);                                             //为了节省系统开销让线程睡眠24小时，第二天再查询
				}catch(Exception e){
					e.printStackTrace();
				   }
			}
		}
	}
}

public class QueryTimeThread  extends Thread{                 //不断查询系统时间，如果当前是9.1和3.1, 则按照各院系的教学计划给学生添加他们新学期的必修课
	public void run(){
		while(true){
		String time=String.format("%tc", new Date());
		String[] split=time.split(" ");
		boolean c=split[1].equals("九月")&&Integer.parseInt(split[2])==1||split[1].equals("三月")&&Integer.parseInt(split[2])==1;
		c=true;
		if(c){                                                 //给学生添加相应年级相应学期的课程
			new CourseData().updateTheirMajorCourse();
			try{                                                                                                                            //完成任务后该线程睡眠2个月，使得再次启动时不在3月和9月
				long gap=5184000000l;
				Thread.sleep(gap);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		else{
		try{
			Thread.sleep(86400000);                                             //为了节省系统开销让线程睡眠24小时，第二天再查询
		}catch(Exception e){
			e.printStackTrace();
		   }
		}
		}
	}
}

public class DecideCourseSelectionThread extends Thread{   //不断查询时间，如果在9.9~9.10或3.9~3.10，就执行选课算法确定选课的结果
	public void run(){
		while(true){
			String time=String.format("%tc", new Date());
			String[] split=time.split(" ");
			boolean c=(split[1].equals("九月")&&Integer.parseInt(split[2])<=10&&Integer.parseInt(split[2])>=9)||(split[1].equals("三月")&&Integer.parseInt(split[2])<=10&&Integer.parseInt(split[2])>=9);
			c=true;
			if(c){
				//选课算法
				ArrayList<CoursePO> school_course_list=new CourseData().showCourse();
				for(int i=0;i<=school_course_list.size()-1;i++){
					ArrayList<StudentPO> select_list=new CourseData().showSelectList(school_course_list.get(i).getID());
					StudentPO[] array=new StudentPO[select_list.size()];
					int[] nums=new int[select_list.size()];
					if(select_list.size()>=1){
						for(int j=0;j<=select_list.size()-1;j++){
							array[j]=select_list.get(j);
							nums[j]=new CourseData().showHisNumberOfCourse(select_list.get(j).getID());
						}
						//BubbleSort
			            for(int k=0;k<=select_list.size()-2;k++)
			            	for(int l=0;l<=select_list.size()-2;l++){
			            		if(nums[l]>nums[l+1]){
			            			int tmp=nums[l];
			                       nums[l]=nums[l+1];
			                       nums[l+1]=tmp;
			                       StudentPO po=array[l];
			                       array[l]=array[l+1];
			                       array[l+1]=po;
			            		}
			            	}
			           int max_people=new CourseData().showMaxPeople(school_course_list.get(i).getID());
			           int min=0;
			           if(select_list.size()<=max_people)
			        	   min=select_list.size();
			           else
			        	   min=max_people;                                                                                      //取已选人数/限制人数二者中的较小者
			           for(int m=0;m<=min-1;m++){
			        	   new CourseData().selectCourse(school_course_list.get(i), array[m]);
			           }
					}
				}
				try{                                                                                                                            //完成任务后该线程睡眠2个月
					long gap=5184000000l;
					Thread.sleep(gap);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else{
			try{
				Thread.sleep(86400000);                                             //为了节省系统开销让线程睡眠24小时，第二天再查询
			}catch(Exception e){
				e.printStackTrace();
			   }
			}
		}
	}
}

}
