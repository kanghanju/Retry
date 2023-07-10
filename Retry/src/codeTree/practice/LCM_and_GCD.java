package codeTree.practice;

public class LCM_and_GCD {
	
	public static int gcd(int a,int b) {
		
		if(a>b) {
			while(b!=0) {
				int r = a%b;
				a = b;
				b = r;
			}
			return a;
		}else {
			while(a!=0) {
				int r = b%a;
				b = a;
				a = r;
			}
			return b;
			
		} 
	}
	
	
	public static int lcm(int a,int b) {
		return a*b/gcd(a,b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
