package po;
import java.util.ArrayList;
public class CoursePO {
	long id;
	String name;
	String teachernum;
	String place;
	String time;
	ArrayList<StudentPO> studentlist = new ArrayList<StudentPO>();
	long aID;
	int score;
	
	public CoursePO(long i,String n,String t,String p,String ti,ArrayList l1,long aID,int score){
		id = i;
		name = n;
		teachernum = t;
		place = p;
		time = ti;
		studentlist = l1;
		this.aID=aID;
		this.score=score;
	}
	
	public long getID(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getTeachernum(){
		return teachernum;
	}
	public String getPlace(){
		return place;
	}
	public String getTime(){
		return time;
	}
	public ArrayList<StudentPO> getStudentList(){
		return studentlist;
	}
	
	public long getAID(){
		return aID;
	}

	public int getScore(){
		return score;
	}
}
