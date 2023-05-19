/* Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and 
 calculate Profit or Loss.
Explanation : Formula for profit and loss
Profit = S.P - C.P
Loss = C.P - S.P
(S.P is Selling Price and C.P is Cost Price)*/

import java.util.*;
class A
{	
	int SP,CP;
	void getValues(int x, int y)
	{
	SP =x;
	CP =y;
	if(SP>CP)
	{
	int Profit = SP-CP;
	System.out.println("Profit : " + Profit);
	}
	else if(CP > SP)
	{
	int Loss = CP-SP;
	System.out.println("Loss :" + Loss);
	}
	}
}
//Main class
class Example18
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	A obj = new A();
	System.out.println("Enter the Selling Price and then Cost Price");
	int SP = sc.nextInt();
	int CP = sc.nextInt();
	obj.getValues(SP,CP);
	}
}