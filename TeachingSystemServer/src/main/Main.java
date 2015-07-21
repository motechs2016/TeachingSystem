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

public class ClearCourseThread extends Thread{              //���̲߳��ϲ�ѯʱ�䣬�����2.20��8.20������վɵĿγ̵�������Ϣ���˺�Ժϵ������ʦ�����µĿγ�
	public void run(){
		while(true){
			String time=String.format("%tc", new Date());
			String[] split=time.split(" ");
			boolean c=(split[1].equals("����")&&Integer.parseInt(split[2])==20)||(split[1].equals("����")&&Integer.parseInt(split[2])==20);
			c=true;
			if(c){
				new CourseData().clearSelectionInfo();
				try{                                                                                                                            //����������߳�˯��2����
					long gap=5184000000l;
					Thread.sleep(gap);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else{
				try{
					Thread.sleep(86400000);                                             //Ϊ�˽�ʡϵͳ�������߳�˯��24Сʱ���ڶ����ٲ�ѯ
				}catch(Exception e){
					e.printStackTrace();
				   }
			}
		}
	}
}

public class QueryTimeThread  extends Thread{                 //���ϲ�ѯϵͳʱ�䣬�����ǰ��9.1��3.1, ���ո�Ժϵ�Ľ�ѧ�ƻ���ѧ�����������ѧ�ڵı��޿�
	public void run(){
		while(true){
		String time=String.format("%tc", new Date());
		String[] split=time.split(" ");
		boolean c=split[1].equals("����")&&Integer.parseInt(split[2])==1||split[1].equals("����")&&Integer.parseInt(split[2])==1;
		c=true;
		if(c){                                                 //��ѧ�������Ӧ�꼶��Ӧѧ�ڵĿγ�
			new CourseData().updateTheirMajorCourse();
			try{                                                                                                                            //����������߳�˯��2���£�ʹ���ٴ�����ʱ����3�º�9��
				long gap=5184000000l;
				Thread.sleep(gap);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		else{
		try{
			Thread.sleep(86400000);                                             //Ϊ�˽�ʡϵͳ�������߳�˯��24Сʱ���ڶ����ٲ�ѯ
		}catch(Exception e){
			e.printStackTrace();
		   }
		}
		}
	}
}

public class DecideCourseSelectionThread extends Thread{   //���ϲ�ѯʱ�䣬�����9.9~9.10��3.9~3.10����ִ��ѡ���㷨ȷ��ѡ�εĽ��
	public void run(){
		while(true){
			String time=String.format("%tc", new Date());
			String[] split=time.split(" ");
			boolean c=(split[1].equals("����")&&Integer.parseInt(split[2])<=10&&Integer.parseInt(split[2])>=9)||(split[1].equals("����")&&Integer.parseInt(split[2])<=10&&Integer.parseInt(split[2])>=9);
			c=true;
			if(c){
				//ѡ���㷨
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
			        	   min=max_people;                                                                                      //ȡ��ѡ����/�������������еĽ�С��
			           for(int m=0;m<=min-1;m++){
			        	   new CourseData().selectCourse(school_course_list.get(i), array[m]);
			           }
					}
				}
				try{                                                                                                                            //����������߳�˯��2����
					long gap=5184000000l;
					Thread.sleep(gap);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			else{
			try{
				Thread.sleep(86400000);                                             //Ϊ�˽�ʡϵͳ�������߳�˯��24Сʱ���ڶ����ٲ�ѯ
			}catch(Exception e){
				e.printStackTrace();
			   }
			}
		}
	}
}

}
