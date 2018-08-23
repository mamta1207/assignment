import java.util.Scanner;
class prime
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no.");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0&&i!=1)
			{
				System.out.println(i+"\n");
			}
		}
	}
}