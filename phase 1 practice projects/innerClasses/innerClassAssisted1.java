package innerClasses;

public class innerClassAssisted1 {
	private String msg="Welcome to core java"; 
	 
	 class Inner{  
	  void hello(){
		  System.out.println(msg+", Inner Classes implimentation");
		  }  
	 }  


	public static void main(String[] args) {

		innerClassAssisted1 obj=new innerClassAssisted1();
		innerClassAssisted1.Inner in=obj.new Inner();  
		in.hello();  
	}



}
