/*Q5 - Given few lines of input(number of lines unknown) where each line has two
strings, concatenate the strings. */

import java.util.*;
class A
{
String a, b;

void getStrings()
{
	Scanner sc = new Scanner(System.in);
	a = sc.next(); //Java next() method can read the input before the space id found. It cannot read two words separated by space.
	b =sc.next(); //	    It retains the cursor in the same line after reading the input. 
	
}

void add()
{
System.out.println(a+b);
}
}

//Main class
class Example10
{
	public static void main(String args[])
	{
	A obj = new A();
	A obj1 = new A();
	A obj2 = new A();
	System.out.println("Enter the Strings : ");
		
	obj.getStrings();
	obj1.getStrings();
	obj2.getStrings();
	System.out.println("\nHere are Strings\n");
	obj.add();
	obj1.add();
	obj2.add();
	}
}
