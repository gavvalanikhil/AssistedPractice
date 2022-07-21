package EmailValidation;
import java.util.ArrayList;
import java.util.Scanner;
public class mailIdValidate {
	public static void valid(ArrayList<String>list) {
		System.out.println("Enter the mail ID: ");
		//for user input of mail
		Scanner input = new Scanner(System.in);
	      String sc=input.next();
	      int count=0;
		 //String[] list = null;
		for(String element:list) {
	    	  if(element.equals(sc)) {
	    		  count=1;
	    		  break;
	    	  }
	      }
		if(count==1)
		{
			System.out.println("Congrats, The given email is valid");
		}
		else
		{
			System.out.println("Sorry, The given email is not valid");
		}
	}
	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<String>();
		//enter the list of mails in arraylist
		  list.add("nikhilgavvala@gmail.com");
	      list.add("hellonick@gmail.com");
	      list.add("nickwick@gmail.com");
	      list.add("mahendrakarlikhita@gmail.com");
	      list.add("supersony@gmail.com");
	      
	      //MailIdValidate a =new MailIdValidate();
	      mailIdValidate.valid(list);
	    
	     
	}

}
