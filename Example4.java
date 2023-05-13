//Program to calculate cube of an Number
import java.util.*;

class Cube
{
int num;
void getValue(int a)
{
num=a;
}

int result()
{
int sum = num*num*num;
//System.out.println("This Function Runs");
return sum;

}

String show(int CubeNum)
{
return "Cube of number is " + CubeNum;
}

}

//Main class

class Example4
{
	public static void main(String [] args)
	{
	Cube obj = new Cube();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number :");
	int age = sc.nextInt();
	obj.getValue(age);
	int here = obj.result();
	String result2 = obj.show(here);
	System.out.println(result2);

	}
}	

 