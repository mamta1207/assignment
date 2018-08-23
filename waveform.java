import java.util.Scanner;
class waveform
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
		for(int i=0;i<10;i=i+2)
		{
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println("waveform array is: ");
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+",");
		}
	}
}