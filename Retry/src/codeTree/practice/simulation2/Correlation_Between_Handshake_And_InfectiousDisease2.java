package codeTree.practice.simulation2;
import java.util.*;


class Shake implements Comparable<Shake>{
    int time,x,y;

    public Shake(int time,int x,int y){
        this.time = time;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Shake o){
        if(this.time - o.time >0)return 1;
        else if(this.time == o.time)return 0;
        else return -1;
    }
}


public class Correlation_Between_Handshake_And_InfectiousDisease2 {
	static int[] person;
    static int[] covid;
    static int[] count;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); //k번만 전염가능
        int p = sc.nextInt(); //처음걸린얘 번호
        int t = sc.nextInt();

        person = new int[n+1]; // 1~n까지의 개발자  
        covid = new int[n+1];
        count = new int[n+1];
        Arrays.fill(count,k);
        covid[p] = 1;

        Shake[] shake = new Shake[t];

        for(int i = 0; i<t; i++){
            int time = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            shake[i] = new Shake(time,x,y);
        }

        Arrays.sort(shake);

        for(int i = 0; i<t; i++){
            int x = shake[i].x;
            int y = shake[i].y;
            
            if(covid[x]==1)count[x]--;
            if(covid[y]==1)count[y]--;
            
            if(count[x]>=0 && covid[x]==1)covid[y] = 1;
          

            if(count[y]>=0 && covid[y]==1)covid[x] = 1;

        }
        
        /*계속 틀린 코드
         * if(count[x]>0 && covid[x]==1){
                count[x]--;
                covid[y] = 1;
            }

            if(count[y]>0 && covid[y]==1){
                count[y]--;
                covid[x] = 1;
            }
         * */
        
        for(int i = 0; i<t; i++){
            System.out.println(shake[i].time+" "+shake[i].x+" "+shake[i].y);
        }

        for(int i = 1; i<=n; i++){
            System.out.print(covid[i]);
        }

	}

}
