package dataservice.coursedataservice;
import po.*;
public class CourseDataService_Driver {
	public void drive(CourseDataService courseDataService){
		CoursePO courseDataPO = courseDataService.find(121250102);
		if(courseDataPO.getID()!=0)
			System.out.println("exists");
		courseDataService.insert(new CoursePO(5,"软件工程与计算","121250102","仙2 304","星期一1至2节",null,1,1));
		courseDataService.delete(new CoursePO(5,"软件工程与计算","121250102","仙2 304","星期一1至2节",null,1,1));
		courseDataService.update(new CoursePO(5,"软件工程与计算","121250102","仙2 304","星期一1至2节",null,1,1));
	}
}
