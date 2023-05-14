//nput name, roll number and field of interest from user and print in the format below :
//Name: xyz, Roll number: xyz, Field of interest: xyz

import java.util.*;
class A
{
String name,FOI;
int rollno;

void getValue(String x, int z, String y)
{
name = x;
FOI = y;
rollno = z;
}

void showValues()
{
System.out.println(name + " " + rollno + " " + FOI);
}

}

class Example6
{
	public static void main(String args[])
	{
Scanner sc = new Scanner(System.in);
A obj = new A(); 
System.out.println("Enter the Name, Roll No. ,Field of Interest");
String a = sc.nextLine();
int b = sc.nextInt();
sc.nextLine();
String c = sc.nextLine();
obj.getValue(a,b,c);
obj.showValues();
	}
}


//The issue is with the Scanner class, specifically with the nextInt() method. After you enter the //roll number, you need to call the nextLine() method before getting the field of interest input. //This is because nextInt() only reads the integer value and leaves the newline character in the //input buffer, which is then read by the next nextLine() call.

//Here, we added a sc.nextLine() call after the nextInt() call to consume the newline character left //in the input buffer.