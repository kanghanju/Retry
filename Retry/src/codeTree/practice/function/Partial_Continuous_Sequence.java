package codeTree.practice.function;

import java.util.Scanner;

public class Partial_Continuous_Sequence {

	public static boolean isPartial(int[] arr,int[] arr2) {
		
		
		
		for(int i = 0; i<arr.length-arr2.length+1;i++) {
			boolean isTrue = true;
			for(int j = 0; j<arr2.length;j++) {
				if(arr[i+j] != arr2[j]) {
					isTrue = false;
					continue;
				}
				
			}
			
			if(isTrue) {
				return true;
			}
		}
		
		return false;
		
	}



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];

		for(int i = 0; i<n1; i++)
			arr1[i] = sc.nextInt();

		for(int i = 0; i<n2;i++) 
			arr2[i] = sc.nextInt();

		if(isPartial(arr1,arr2)== true) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}

	}

}
