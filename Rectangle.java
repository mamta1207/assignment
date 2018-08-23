import java.util.Scanner;
class Rectangle
{
	int length;
	int breadth;
	public void CalculateArea(int length,int breadth)
	{
		int area=length*breadth;
		System.out.println("area is: "+area);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int len,bre;
		Rectangle r1=new Rectangle();
		System.out.println("enter the length: ");
		len=sc.nextInt();
		System.out.println("enter the breadth: ");
		bre=sc.nextInt();
		r1.CalculateArea(len,bre);
	}
}