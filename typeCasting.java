public class typeCasting {
public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		char a='B';
		System.out.println("Value of a: "+a);
		
		int b=a;
		System.out.println("Value of b: "+b);
		
		float c=a;
		System.out.println("Value of c: "+c);
		
		long d=a;
		System.out.println("Value of d: "+d);
		
		double e=a;
		System.out.println("Value of e: "+e);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x=66.5;
		int y=(int)x;
		float z=(float)x;
		long p=(long)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		System.out.println("Value of z: "+z);
		System.out.println("Value of p: "+p);
		
	}

	

}
