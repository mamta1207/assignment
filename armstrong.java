import java.util.Scanner;
class armstrong
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no.");
		int n=sc.nextInt();
		int m=n;
		int len=0,rem;
		double res=0;
		while(m!=0)
		{
			m=m/10;
			++len;
		}
		m=n;
		while(n!=0)
		{
			rem=n%10;
			res=res+Math.pow(rem,len);
			n=n/10;
		}
		if(res==m)
		{
			System.out.println("armstrong no.");
		}
		else
		{
			System.out.println("non-armstrong no.");
		}
	}
}