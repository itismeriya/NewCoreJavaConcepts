package sorting;

public class SortArrayElements {
	public static void main(String[] args)
	{
		int[] arr=new int[] {8,3,4,5,7,1,2,9};
		int temp=0;
		System.out.println("The elements of original array : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\n\nThe elements in ascending order : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
