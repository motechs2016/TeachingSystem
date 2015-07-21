package po;

public class FramePO {
	String modules;
	String character;     //课程性质
	String category;      //课程类别
	String name;
	int credit;
	String time;
	public FramePO(String m,String c,String ca,String na,int cr,String t){
		modules = m;
		character = c;
		category = ca;
		name=na;
		credit = cr;
		time = t;
	}
	public String getModules(){
		return modules;
	}
	public String getCharacter(){
		return character;
	}
	public String getCategory(){
		return category;
	}
	public String getName(){
		return name;
	}
	public int getCredit(){
		return credit;
	}
	public String getTime(){
		return time;
	}

}
