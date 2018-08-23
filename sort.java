class sort
{
	public static void main (String args[])
	{
		int[] arr=new int[]{1,1,1,1,0,0,1,0};
		System.out.println("array is: ");
		for(int i=0;i<8;i++)
		{
			System.out.print(arr[i]+",");
		}
		int temp;
		for(int i=0;i<8;i++)
		{
			for(int j=i+1;j<8;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nsorted array is: ");
		for(int i=0;i<8;i++)
		{
			System.out.print(arr[i]+",");
		}
	}
}