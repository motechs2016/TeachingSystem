package po;

public class TeachPlanPO {
	String department;
	String plan;
	
	public TeachPlanPO(String d,String p){
		department = d;
		plan = p;
	}
	
	public String getDepartment(){
		return department;
	}
	public String getPlan(){
		return plan;
	}

}
