//Take character and print its Ascii value
//Using Many Methods

class input
	{
char a;
int z,n = 'A'; 	//Charater to integer method 
char b='B',c='C';
int x= (int)b;	//Type casting
int y = (int)c;	//Type casting

void in(char x)
{ 
a=x;
z=a; //type conversion method
}
void show()
{
System.out.println("The Ascii value of Charater is " + z);
}
	}

class Example{
	public static void main (String args[])
{
input obj = new input();
obj.in('g');
obj.show();
System.out.println(obj.n);
System.out.println(obj.x);
System.out.println(obj.y);



}
	}
