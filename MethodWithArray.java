package DSA;

import java.util.Scanner;
public class MethodWithArray {
	static void factorial(int[]arr) {
		int fact;
		for(int n:arr) {
			fact=1;
			
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			System.out.println("factorial is:"+fact);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr;
		int size,i;
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter size of an array");
			size=sc.nextInt();
			arr=new int[size];
			System.out.println("Enter"+size+" "+"elements in ana array");
			for(i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
		}
		System.out.println("Enter elemets are: ");
		for(i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
		factorial(arr);
	}
}
