package dataservice.coursedataservice;
import po.*;
public class CourseDataService_Driver {
	public void drive(CourseDataService courseDataService){
		CoursePO courseDataPO = courseDataService.find(121250102);
		if(courseDataPO.getID()!=0)
			System.out.println("exists");
		courseDataService.insert(new CoursePO(5,"������������","121250102","��2 304","����һ1��2��",null,1,1));
		courseDataService.delete(new CoursePO(5,"������������","121250102","��2 304","����һ1��2��",null,1,1));
		courseDataService.update(new CoursePO(5,"������������","121250102","��2 304","����һ1��2��",null,1,1));
	}
}
