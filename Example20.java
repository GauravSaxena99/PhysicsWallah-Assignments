/* Create a calculator using switch statement to perform addition, subtraction, multiplication 
 and division.*/

import java.util.*;
class A
{
float num1;
float num2;
char c;
float result;
	void getValues(float x,float y,char z)
	{
	num1=x;
	num2 = y;
	c =z;
	switch(c)
	{
	case '+':
	result = num1+num2;
	System.out.println(result);
	break;
	case '-':
	result = num1-num2;
	System.out.println(result);
	break;
	case '*':
	result=num1*num2;
	System.out.println(result);
	break;
	case '/':
	result = num1/num2;
	System.out.println(result);
	break;
	case '%':
	result = num1%num2;
	System.out.println(result);
	break;
	default:
	System.out.println("Invalid Operation");
	break;
	}

		
	}
}

//Main class
class Example20
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	A obj = new A();
	System.out.println("Enter the first number");
	float a = sc.nextFloat();
	System.out.println("Enter the second number");
	float b = sc.nextFloat();
	System.out.println("Enter the operation");
	char c = sc.next().charAt(0);
	obj.getValues(a,b,c);
	}
}
	
