package searching;

import java.util.Scanner;
public class LinearSearch2
{
	static int searchElements(int[] newArr, int e)
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
		return pos;  //7  or  -3  
	}
	
	public static void main(String[] args)
	{
		int[] arr;
		int size, i, key, pos=-1;
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
		
		pos=searchElements(arr,key);
		
		if(pos==-1)
		{
			System.out.println("Data not found");
		}
		else
		{
			System.out.println("The element is found at position "+(pos+1));
		}
	}
}