package codeTree.practice;

import java.util.Scanner;

public class GuessingDay {

	static int[] date = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	static String[] day = {"Mon","Tue","wed","Thu","Fri","Sat","Sun"};
	static String answer = "";
	
	public static int numOfDays(int m1,int d1) {
		int answer = 0;
		
		while(m1>1) { 
			answer += date[m1-1];
			m1 = m1-1;
		}
		
		return answer + d1;
	}
	
	
	public static String getDay(int d) {
		if(d>0) {
			return day[d%7];
		}else {
			while(d<0) {
				d+=7;
			}
			return day[d%7];
		}
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        
        int answer = numOfDays(m2,d2) - numOfDays(m1,d1);
     
        
        System.out.print(getDay(answer));
    }
	
}
