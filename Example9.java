/*Q4 - Given two numbers, return their sum in the following format:
Int t representing number of test cases
T lines of Two integers representing the numbers to be added */
import java.util.*;
class A
{
 int a,b,c,sum;

int getValues(int x,int y, int z)
{
a=x;
b=y;
c=z;
sum = a+b+c;
return sum;
}
}

//Main class
class Example9
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	A  obj = new A();
	//int t = 3;
	System.out.println("Enter the Numbers");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();	
	int result = obj.getValues(a,b,c);
	System.out.println(result);
	}
}
	