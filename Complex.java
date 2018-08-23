import java.util.Scanner;
class Complex
{
	int real;
	int image;
	public void Display(int real,int image)
	{
		System.out.println("complex no. is: ");
		System.out.println(real+"+"+image+"i");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Complex c1=new Complex();
		System.out.println("enter real part: ");
		int r=sc.nextInt();
		System.out.println("enter imaginary part: ");
		int i=sc.nextInt();
		c1.Display(r,i);
	}
}