import java.util.Scanner;
class reverse
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no.");
		int n=sc.nextInt();
		int rem,rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse no. "+rev);
	}
}