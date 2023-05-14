//Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
//100), write a program to calculate his total marks and percentage marks.

import java.util.*;
class A
{
int a,b,c,total,percentage;
void getMarks(int x,int y,int z)
{
a=x;
b=y;
c=z;
}
void total_percentage()
{
total = a+b+c;
percentage = (total*100)/300;
}
void showResult()
{
System.out.println("Total Marks = " + total + " and Percentage is = " + percentage+"%");
}
}

class Example8
{
	public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	A obj = new A();
	System.out.println("Enter the Marks out of 100");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	obj.getMarks(a,b,c);
	obj.total_percentage();
	obj.showResult();
}
}


