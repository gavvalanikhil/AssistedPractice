package calculator;

import java.util.*;

public class ArithmeticCalculator {
	public static void main(String args[])
	{
		//stores two numbers and result
		double num1,num2,result = 0;
		//for operation symbol
		char op;

		//to give user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers");
		//taking inputs
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();

		System.out.println("Enter the operator");
		//entering operator
		op = sc.next().charAt(0);


		//using switch case
		switch(op){
		//adding 2 numbers
		case '+':
			result = num1 + num2;
			break;
		//subtracting 2 numbers
		case '-':
			result = num1 - num2;
			break;
		//multiplying 2 numbers
		case '*':
			result = num1 * num2;
			break;
		//dividing 2 numbers
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("You entered wrong input");
			break;
		}
		System.out.println("The final result");

		System.out.println();
		
		//printing the result
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	}

}
