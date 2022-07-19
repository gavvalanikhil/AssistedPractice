package implemtConstructers;

//parameterized constructor
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}


public class paramConstrDemo {
	public static void main(String[] args) {

		Std std1=new Std(2,"Nick");
		Std std2=new Std(10,"Nikhil");
		std1.display();
		std2.display();
			}


}
