//Another Program for printing Unicode Values of Character
//Other Methods
import java.lang.*;
class input2
{
char a='A';
int x=Character.getNumericValue(a); //by using Character.getNumericValue(); method
void show()
{
System.out.println("The Unicode value of A is: " + x);
}

}

class Example2
{
	public static void main(String args[])
	{
	input2 obj = new input2();
	obj.show();
	}
}
