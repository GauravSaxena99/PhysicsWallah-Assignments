//Q2 - Input two different string and print them in same line.
import java.util.*;
class A
{
String a,b;

void getStrings(String x, String y)
{
a=x;
b=y;
}

void showStrings()
{
System.out.println(a+ " " + b) ;
}
}

//Main Class
class Example7
{
	public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	A obj = new A();
	System.out.println("Enter the Strings");
	String a = sc.nextLine();
	String b = sc.nextLine();
	obj.getStrings(a,b);
	obj.showStrings();
}
}