package codeTree.practice;

import java.util.Scanner;

public class Convert_To_Decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String binary = sc.next();
		int len = binary.length();
		int num = 0;
		int cnt =0;

		for(int i=len-1; i>=0; i--) {
			num += (binary.charAt(i)-'0')*Math.pow(2, cnt);
			cnt++;
		}

		System.out.print(num);
	}
}
