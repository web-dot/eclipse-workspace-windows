package dst;

import java.util.Arrays;

public class Array {
	/*
	public static void fillArray() {
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100);
		}
	}*/
	/*
	public static void selectionSort(int[] array) {
		int n = array.length;
		for(int i = 0; i < n; i++) {
			int index_of_min = i;
			for(int j = i; j < n; j++) {
				if(array[index_of_min] > array[j]) {
					index_of_min = j;
					//System.out.println(arr[i]);
				}
			}
			int temp = array[i];
			array[i] = array[index_of_min];
			array[index_of_min] = temp;
			System.out.println(array[i]);
		}
	}*/
	//{49, 20, 1, 86, 18}
	public static int[] selectionSort(int[] arr) {
		int min;
		for(int i = 0; i < arr.length; i++) {
			min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			if(i != min) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
				System.out.println(Arrays.toString(arr));
				
			}
		}
		return arr;
	}
	
	//FIND MIN
	public static int MIN(int[] arr){
		int MIN = arr[0];
		int LOC;
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] < MIN) {
				MIN = arr[j];
				LOC = j;
			}
		}
		return MIN;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] arr = new int[] {5, 2, 3, 7};
		int min = MIN(arr);
		System.out.println(min);
		//System.out.println(MIN(arr));

	}
}
