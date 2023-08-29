package DSA;
import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,4,6,7,3,1};

        // Selection Sort
        for(int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[smallest]) {
                    smallest = j; // Here smallest holds Index value
                }
            }
            //swap
            int temp = arr[smallest]; // arr[smallest] -> means value of the index of smallest
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
	}
}