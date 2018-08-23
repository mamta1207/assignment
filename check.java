import java.util.Scanner;
class check
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no.");
		int n=sc.nextInt();
		int[] arr=new int[]{1,4,6,7,8,9,10};
		int flag=0;
		for(int i=0;i<7;i++)
		{
			if(n==arr[i])
			{
				flag=1;
			}
		}
		System.out.println("the array is: ");
		for(int i=0;i<7;i++)
		{
			System.out.print(arr[i]+",");
		}
		if(flag==1)
		{
			System.out.println("\n"+n+" no. exists");
		}
		else
		{
			System.out.println("\n"+n+" no. doesn't exists");
		}
	}
}