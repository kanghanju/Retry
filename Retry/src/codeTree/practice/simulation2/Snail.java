package codeTree.practice.simulation2;
import java.util.*;

public class Snail {
	static int n,m;
    static int[][] arr;
    static int dir,curX,curY = 0;
    static int[] dirX = {0,1,0,-1};
    static int[] dirY = {1,0,-1,0};//동남서북

    public static boolean isRange(int x,int y){
        return (x>=0 && x<n && y>=0 && y<m);
    }

    public static void move(){
        int i = 2;
        while(i<=n*m){
            
            int dx = curX + dirX[dir];
            int dy = curY + dirY[dir];

            if(!isRange(dx,dy)||arr[dx][dy]!=0){//if else문하면 방향만 바꾸고 i++이 돼버린다
                dir = (dir+1)%4;
            }
            
            curX += dirX[dir];//curX = dx라고 쓰면 dir이 바뀌기 전의 값이 들어가므로 에러가 발생
            curY += dirY[dir];
            arr[curX][curY] = i++;
            
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        arr[0][0] = 1;

        move();

        for(int i = 0; i<n; i++){
            for(int j =0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	}

}
