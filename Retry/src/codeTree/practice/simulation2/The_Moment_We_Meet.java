package codeTree.practice.simulation2;
import java.util.*;

public class The_Moment_We_Meet {
	static int n,m;
    static int curA,curB=0;
    static int[] A = new int[1000001];
    static int[] B = new int[1000001];
    static int timeA=1,timeB = 1;

    static void moveA(char d,int t){
        if(d=='L'){
            for(int i = 0; i<t; i++){
                A[timeA++] = --curA; 
            }
            
        }else{
            for(int i = 0; i<t; i++){
                A[timeA++] = ++curA; 
            }
        }
    }

    static void moveB(char d,int t){
        if(d=='L'){
            for(int i = 0; i<t; i++){
                B[timeB++] = --curB; 
            }
            
        }else{
            for(int i = 0; i<t; i++){
                B[timeB++] = ++curB; 
            }
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 0; i<n; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            moveA(d,t);
        }

        for(int i = 0; i<m; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            moveB(d,t);
        }

        int ans = -1;
        for(int i = 1; i<timeA; i++){
            if(A[i]==B[i]){
                ans = i;
                break;
            }
        }
        
        System.out.print(ans);

	}

}
