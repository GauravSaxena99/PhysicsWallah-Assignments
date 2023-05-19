//Write a program to print absolute value of a number entered by the user.

import java.util.*;

class A
{	
	int a;
	void getValues(int x)
	{
	a=x;
	if(a<0)
	{
	a=a*-1;
	System.out.println("Absolute value is :" + a);
	}
	else
	{
	System.out.println(a);	
	}
	}
}
//Main class
class Example17
{
	public static void main(String args[])	
	{
	Scanner sc = new Scanner(System.in);
	A obj = new A();
	System.out.println("Enter the value");
	int a=sc.nextInt();
	obj.getValues(a);
	}
}
	