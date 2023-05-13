//Program to calculate area of rectangle

class rectangle
{
int len,bre,s;

int area(int a,int b)
{
len=a;
bre=b;
int area2= len*bre;
return area2;
}

String show(int totalarea)
{
return "Area of Rectangle is " + totalarea;
}
}

class Example3
{
	public static void main(String args[])
{
	rectangle obj = new rectangle();
	int result = obj.area(4,3);
	String Result = obj.show(result);
	//System.out.print("Area of Rectangle is :"+ result);
	System.out.print(Result);

}
}