package keywordsAndCustomExceptions;

public class ThrowsDemo {
	void Division() throws ArithmeticException
    {
        int a=75,b=0,res;
res = a / b;
        System.out.print("\n\tThe result is : " + res);
    }
     public static void main(String[] args)
    {
ThrowsDemo Td = new ThrowsDemo();
         try
        {
            Td.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        System.out.print("\n\tEnd of the program.");
    }


}
