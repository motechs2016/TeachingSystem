package businesslogic.framebl;

public class FrameItem {
	  public   String modules;
      public  String character;
      public   String catagory;
      public String name;
      public   int credit;
      public String time;
      
      public FrameItem(String modules,String character, String catagory,String name, int credit,String time){
    	  this.modules=modules;
    	  this.character=character;
    	  this.catagory=catagory;
    	  this.name=name;
    	  this.credit=credit;
    	  this.time=time;
      }
}
