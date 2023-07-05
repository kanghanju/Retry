package Programmers.level0;

public class Addition_of_Fractions {
	
	public static int gcd(int a,int b) {
		if(a>b) {
			while(b>0) {
				int r = a%b;
				a = b;
				b = r;
			}
			return a;
		}else {
			while(a>0) {
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
	
	
	public static int[] solution(int numer1,int denom1,int numer2,int denom2) {
		
		int answer[] = new int[2];
		
		answer[0] = numer1*denom2 + numer2*denom1;
		answer[1] = denom1 * denom2;
		
		int r = gcd(answer[0],answer[1]);
		answer[0] = answer[0]/r;
		answer[1] = answer[1]/r;
		
		return answer;
			
	}

	public static void main(String[] args) {
		System.out.println(solution(9,2,1,3));

	}
	
}
