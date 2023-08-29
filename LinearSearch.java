package DSA;
import java.util.Scanner;

public class LinearSearch {
	
	static boolean linearSearch(int[] newArr,int e){
		boolean flag= false;
//		int pos=-1;
		for(int i=0;i<newArr.length;i++) {
			if(newArr[i]==e) {
//				pos=i;
				flag = true;
				System.out.println("element found at: "+(i+1)+"position");
				break;
			}
		}
		return flag;
//		if(pos != -1)
//			System.out.println("element found at: "+(pos+1));
//		else
//			System.out.println("data not found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr;
		int size,i,key;
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter size of an array");
			size=sc.nextInt();
			arr=new int[size];
			System.out.println("Enter"+size+" "+"elements in ana array");
			for(i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter elemets are: ");
			for(i=0;i<size;i++) {
				System.out.println(arr[i]+" ");
			}
			
			System.out.println("Enter elemets to search: ");
			key=sc.nextInt();
		}
		linearSearch(arr,key);

	}

}
