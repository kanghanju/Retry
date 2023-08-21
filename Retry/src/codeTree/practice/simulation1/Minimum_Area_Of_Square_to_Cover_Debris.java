package codeTree.practice.simulation1;
import java.util.*;

public class Minimum_Area_Of_Square_to_Cover_Debris {
	static final int OFFSET = 1000;
    static final int MAX = 2000;
    static final int N = 2;

    static int[][] arr = new int[MAX+1][MAX+1];
    static int[] x1 = new int[N];
    static int[] x2 = new int[N];
    static int[] y1 = new int[N];
    static int[] y2 = new int[N];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        for(int i = 0; i<N;i++){
            x1[i] = sc.nextInt()+OFFSET;
            y1[i] = sc.nextInt()+OFFSET;
            x2[i] = sc.nextInt()+OFFSET;
            y2[i] = sc.nextInt()+OFFSET;
        }
        
        for(int i = 0; i<N;i++)
            for(int x=x1[i]; x<x2[i]; x++)
                for(int y=y1[i]; y<y2[i]; y++)
                    arr[x][y] = i+1;
                
        //아직 1로 남아있는 칸 중 최소,최대 x,y를 구한다

        int maxX = 0, maxY = 0;
        int minX = MAX, minY = MAX;
        boolean isTrue = false;

        for(int i =0; i<=MAX; i++){
            for(int j =0 ; j<=MAX; j++){
                if(arr[i][j]==1){
                    isTrue = true;
                    maxX = Math.max(maxX,i);
                    maxY = Math.max(maxY,j);
                    minX = Math.min(minX,i);
                    minY = Math.min(minY,j);
                }
            }
        }

        int area=0;
        if(isTrue){
            area = (maxX-minX+1)*(maxY-minY+1); //주의!!!
        }else{
            area = 0;
        }

        System.out.print(area);
	}

}
