import java.util.Scanner;
class secondLarge
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 10 no.s array: ");
		int arr[]=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		int first=-1;
		int second=-1;
		for(int i=0;i<10;i++)
		{
			if(arr[i] > first)
			{
				second = first;
				first = arr[i];
			}
			else if(arr[i]>second && arr[i]<first)
			{
				second = arr[i];
			}	
		}
		System.out.println("second largest no. is: "+second);
	}
}