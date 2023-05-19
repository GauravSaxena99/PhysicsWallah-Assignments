/* Write a program to print positive number entered by the user, if user enters a negative 
 number, it is skipped*/

import java.util.*;

class A
{
int a;
	void getValues(int x)
	{
	a=x; 
	if(a < 0) 
	{
	System.out.println("The Number is negative and Skipped");
	}
	else
	{
	System.out.println("Here="+a);
	}
	}
}
//Main class
class Example19
{	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	A obj = new A();
	System.out.println("Enter the Number");
	int a=sc.nextInt();
	obj.getValues(a);
	}
}
	