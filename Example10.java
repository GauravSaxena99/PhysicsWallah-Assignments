/*Q5 - Given few lines of input(number of lines unknown) where each line has two
strings, concatenate the strings. */

import java.util.*;
class A
{
String a, b;
void getStrings(String x, String y)
{
a=x;
b=y;
}

void add()
{
System.out.println(a + " " + b);
}
}

//Main class
class Example10
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	A obj = new A();
	System.out.println("Enter the Strings : ");
	String a = sc.nextLine();
	String b =sc.nextLine();	
	obj.getStrings(a,b);
	obj.getStrings(a,b);
	obj.getStrings(a,b);
	obj.add();
	obj.add();
	obj.add();
	}
}