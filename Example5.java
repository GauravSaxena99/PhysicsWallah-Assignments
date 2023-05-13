//Program to Swap two numbers uisng third variable

import java.util.*;
class swap
{
int x,y,z;
void BeforeSwap(int a,int b)
{
x=a;
y=b;
System.out.println("Before Swapping m = "+ x + "\n n = "+ y);
}

void AfterSwap(int a,int b)
{
x=a;
y=b;
//Swapping
z=x;
x=y;
y=z;
System.out.println("After Swapping m = "+ x + "\n n = "+ y);
}
}

//Main Class
class Example5
{
	public static void main(String args[])
{
	System.out.println("Enter the Values of m and n");
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
	swap obj = new swap();
	obj.BeforeSwap(m,n);
	obj.AfterSwap(m,n);
}
}

