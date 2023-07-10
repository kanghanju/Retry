package Programmers.level0;
import java.util.*;

public class The_Most_FrequentValue {
	
	public static int solution(int[] array) {
		
		int[] count = new int[1000];
		
		for(int i = 0; i < array.length; i++)
			count[array[i]]++;
		
		int maxCnt = 0;
		int answer = -1;
		
		for(int i = 0; i < count.length; i++) {
			if(count[i] > maxCnt) {
				maxCnt = count[i];
				answer = i;
			}
			else if(maxCnt == count[i]) {
				answer =  -1;
				//return -1을 하면 배열을 끝까지 돌기 전에(최빈값을 찾아내기 전에)
				//나온 횟수가 같은 수들이 있어서 종료된다. 
			}
				
		}
		return answer;
		
	}
	

	public static void main(String[] args){
    	System.out.print(solution(new int[] {1,2,3,3,3,4}));
    }

}
