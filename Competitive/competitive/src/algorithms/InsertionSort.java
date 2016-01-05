package algorithms;

import java.util.Scanner;

public class InsertionSort {

	public static int[] insert(int[] arr){
		int len = arr.length;
		int j =0,temp = 0;
		for(int i=1;i<len;i++){
			j = i;
			while(j > 0 && arr[j] < arr[j -1]){
				//arr[i] to be shifted left
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j = (j-1);
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int len = console.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter elements");
		for(int i = 0;i < len;i++){
			arr[i] = console.nextInt();
		}
		arr = insert(arr);
		for(int i =0; i <len;i++){
			System.out.println(arr[i]);
		}
	}

}
