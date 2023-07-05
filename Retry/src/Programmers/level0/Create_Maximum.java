package Programmers.level0;
import java.util.*;

public class Create_Maximum {


	public static int solution(int[] arr) {
		Arrays.sort(arr);

		return arr[arr.length-1]*arr[arr.length-2];
	}

	public static void main(String[] args){
		System.out.println(solution(new int[] {0,31,24,10,1,9}));
	}
}
