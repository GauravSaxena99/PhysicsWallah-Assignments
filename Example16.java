 //Write a program which takes the values of length and breadth from user and check if it is a square or not

import java.util.*;

class A
{
int length,breadth;
	void getValues(int x,int y)
	{
	length =x;
	breadth=y;
		if(length == breadth)
		{
		System.out.println("It is a square");
		}
		else
		{
		System.out.println("It is not square");
		}
	}
}
//Main class
class Example16
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	A obj = new A();
	System.out.println("Enter the Lenght and breadth :");
	int a = sc.nextInt();
	int b = sc.nextInt();
	obj.getValues(a,b);
	}
}
	
