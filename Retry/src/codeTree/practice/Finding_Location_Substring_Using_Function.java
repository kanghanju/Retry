package codeTree.practice;

import java.util.Scanner;

public class Finding_Location_Substring_Using_Function {

public static boolean isPart(int index,String n,String m) {
		
		if(n.length()-index < m.length()) {
			return false;
		}
		
		for(int i = 0; i<m.length(); i++) {
			if(n.charAt(index+i) != m.charAt(i)) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static int findIdx(String n,String m) {
		
		for(int i = 0; i<n.length(); i++) {
			if(isPart(i,n,m)) {
				return i;
			}
		}
		
		return -1;
	}
		
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String m = sc.next();
		
		System.out.print(findIdx(n,m));
		
		
	}

}
