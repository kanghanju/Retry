package codeTree.practice;

import java.util.Scanner;

public class LCM_Using_Recursive_Function {
	public static int n;
	public static int[] arr = new int[11];
	
	
	public static int lcm(int a,int b) {
		int gcd = 1;
		for(int i = 1; i<= Math.min(a, b); i++) {
			if(a%i==0 && b%i==0)
				gcd = i;
		}
		
		return a*b/gcd;
	}
	
	
	public static int getLCMAll(int n) {
		if(n==0)
			return arr[0];
		
		return lcm(getLCMAll(n-1),arr[n]);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(int i = 1; i<=n;i++)
			arr[i] = sc.nextInt();
		
		System.out.print(getLCMAll(n));

	}

}
