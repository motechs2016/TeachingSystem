package vo;

public class FrameVO {
      public   String modules;
      public  String character;
      public   String catagory;
      public String name;
      public   int credit;
      public String time;
       
       public FrameVO(String module, String  character, String catagory, String name,int credit, String time){
    	   this.modules=module;
    	   this.character=character;
    	   this.catagory=catagory;
    	   this.name=name;
    	   this.credit=credit;
    	   this.time=time;
       }
}
