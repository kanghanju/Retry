package codeTree.practice.simulation2;
import java.util.*;

public class Coming_Back {
	//static int[][] arr = new int[2001][2001];왜 적은거지? 필요없음
    static int n,dir,x,y;
    static int[] dx = {1,-1,0,0};//동서남북
    static int[] dy = {0,0,-1,1};
    static int time = 0;

    static int move(char c, int d){
        if(c=='W'){
            dir = 1;
        }else if(c=='S'){
            dir = 2;
        }else if(c=='N'){
            dir = 3;
        }else{
            dir = 0;
        }

        while(d-->0){
            time++;
            x = x + dx[dir];
            y = y + dy[dir];

            if(x==0 && y==0){
                return time;
            }
        }
        
        return -1;

    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int result = -1;
        for(int i = 0; i<n; i++){
            char c = sc.next().charAt(0);
            int d = sc.nextInt();
            result = move(c,d);
            if(result != -1)break;
        }

        System.out.print(result); //result 대신 time을 써서 틀림 
	}

}
