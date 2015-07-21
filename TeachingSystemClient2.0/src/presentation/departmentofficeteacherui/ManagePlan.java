package presentation.departmentofficeteacherui;


import presentation.userui.LoginUI;
import vo.TeachPlanVO;
import businesslogic.teacherbl.TeacherDealController;
import businesslogic.teachplanbl.TeachPlanDealController;
import businesslogicservice.teachplanblservice.TeachPlanBLService;

public class ManagePlan {

	public static String publishPlan(String a1,String a2,String a3,String a4,String a5,String a6,String a7,String a8){
		String plan="大一上学期:"+a1+";大一下学期:"+a2+";大二上学期:"+a3+";大二下学期:"+a4+";大三上学期:"+a5+";大三下学期:"+a6+";大四上学期:"+a7+";大四下学期:"+a8;
		long aID=new TeacherDealController().showHisAID(LoginUI.userID);
		TeachPlanVO vo=new TeachPlanVO(aID,"",plan);
		new TeachPlanDealController().inputTeachPlan(vo);
		return "提交成功";
	}
	public static String[] showTeachPlan(){
		long aID=new TeacherDealController().showHisAID(LoginUI.userID);
		TeachPlanDealController a = new TeachPlanDealController();
		TeachPlanVO planvo = a.showTeachPlan(aID);
		String plan = planvo.plan;		
		String a1=null, a2=null, a3=null, a4=null, a5=null, a6=null, a7=null, a8=null;
        if(plan.equals("暂无信息")){
			a1="NO_DATA";
			a2="NO_DATA";
			a3="NO_DATA";
			a4="NO_DATA";
			a5="NO_DATA";
			a6="NO_DATA";
			a7="NO_DATA";
			a8="NO_DATA";
		}
        else{
        	String[] temp = plan.split(";");
    		String[] mtemp = temp[0].split(":");
    		a1=mtemp[1];
    		String[] mtemp1 = temp[1].split(":");
    		a2=mtemp1[1];
    		String[] mtemp2 = temp[2].split(":");
    		a3=mtemp2[1];
    		String[] mtemp3 = temp[3].split(":");
    		a4=mtemp3[1];
    		String[] mtemp4 = temp[4].split(":");
    		a5=mtemp4[1];
    		String[] mtemp5 = temp[5].split(":");
    		a6=mtemp5[1];
    		String[] mtemp6 = temp[6].split(":");
    		a7=mtemp6[1];
    		String[] mtemp7 = temp[7].split(":");
    		a8=mtemp7[1];
        }
		
		String[] result = {a1,a2,a3,a4,a5,a6,a7,a8};
		return result;
	};
}
