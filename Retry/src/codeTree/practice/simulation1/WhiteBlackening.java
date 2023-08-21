package codeTree.practice.simulation1;
import java.util.*;

public class WhiteBlackening {
	static int[] blackCnt = new int[200001];
    static int[] whiteCnt = new int[200001];
    static char[] arr = new char[200001];
    static int cur=100000;

    public static void move(int num,char c){
        if(c == 'R'){
            for(int i=cur; i<cur+num;i++){
                blackCnt[i]+=1;
                arr[i] = 'b';
            }
            cur = cur+num-1;
        }else{
           for(int i=cur;i>cur-num;i--){
                whiteCnt[i]+=1;
                arr[i] = 'w';
           }
           cur = cur-num+1;
        }
    
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int num = sc.nextInt();
            char c = sc.next().charAt(0);
            move(num,c);
        }
        
        int white=0;
        int gray = 0;
        int black = 0;
        for(int i = 0; i<200001; i++){
            if(blackCnt[i]>=2 && whiteCnt[i]>=2){
                gray++;
            }else if(arr[i]=='b'){
                black++;
            }else if(arr[i]=='w'){
                white++;
            }
        }

        System.out.print(white+" "+black+" "+gray);
	}

}
