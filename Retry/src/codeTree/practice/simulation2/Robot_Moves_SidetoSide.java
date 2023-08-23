package codeTree.practice.simulation2;
import java.util.*;

public class Robot_Moves_SidetoSide {
	static final int MAX = 1000000;
    static int[] A = new int[MAX+1];
    static int[] B = new int[MAX+1];
    static int curA,curB = 0;
    static int timeA=1,timeB = 1;

    static void moveA(int time,char dir){
        if(dir=='L'){
            while(time-->0){
                A[timeA++] = --curA;
            }
        }else{
            while(time-->0){
                A[timeA++] = ++curA;
            }
        }
    }

    static void moveB(int time,char dir){
        if(dir=='L'){
            while(time-->0){
                B[timeB++] = --curB;
            }
        }else{
            while(time-->0){
                B[timeB++] = ++curB;
            }
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i<n; i++){
            int time = sc.nextInt();
            char dir = sc.next().charAt(0);
            moveA(time,dir);
        }

        for(int i = 0; i<m; i++){
            int time = sc.nextInt();
            char dir = sc.next().charAt(0);
            moveB(time,dir);
        }

        int maxTime = (timeA>timeB)?timeA:timeB;
        int ans = 0;
        
        if(maxTime == timeA) {
        	for(int i = timeB; i<timeA; i++) {
        		B[i] = B[i-1];
        	}
        }else {
        	for(int i = timeA; i<timeB; i++) {
        		A[i] = A[i-1];
        	}
        	
        }
        
        
        for(int i = 1; i<maxTime; i++){
            if(A[i] == B[i] && A[i-1] != B[i-1]){
                ans++;
                System.out.println("i: "+i);
            }
        }

        System.out.print(ans);
	}

}
