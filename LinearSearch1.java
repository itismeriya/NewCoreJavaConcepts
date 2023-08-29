package searching;

import java.util.Scanner;
public class LinearSearch1 
{
	static void searchElements(int[] newArr, int e)
	{
		int pos=-1;  //indicating data not found
		for(int i=0; i<newArr.length; i++)
		{
			if(newArr[i]==e)
			{
				pos=i;  //pos=6
				break;
			}
		}
		
		if(pos!=-1)
		{
			System.out.println("The element is found at position "+(pos+1));
		}
		else
		{
			System.out.println("Data not found");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr;
		int size, i, key;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		size = sc.nextInt(); //5
		arr = new int[size]; //instantiating
		
		System.out.println("Enter "+size+" elements in the array : ");
		for(i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The array elements are : ");
		
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter the element which you want to search : ");
		key = sc.nextInt();
		
		searchElements(arr,key);
	}
}