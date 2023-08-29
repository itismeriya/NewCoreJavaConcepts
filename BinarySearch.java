package searching;
import java.util.*;
public class BinarySearch {
	static int searchBinary(int[] arr,int key)
	{
		int low = 0;
	    int high = arr.length-1;
	    while (low<= high)
	    {
	    	int mid = (low+high)/2;
	        if(arr[mid] == key)
	        {
	        	return mid;
	        } 
	        else if(key > arr[mid]) 
	        {
	        	low = mid+1;
	        }
	        else 
	        {
	        	high = mid-1;
	        }
	    }
	    return -1;
	}
	    
	public static void main(String[] args) 
	{
		int[] arr = {12,23,25,29,34,38,43,47};
		//System.out.println(arr);
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number you want to search : ");
	    int number = sc.nextInt();
	    int position = searchBinary(arr,number);
	    if (position == -1)
	    {
	    	System.out.println("Data not found");
	    }
	    else 
	    {
	    	System.out.println("Data found at position " + (position+1));
	    }
	}
}
