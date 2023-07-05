package Programmers.level0;
import java.util.Arrays;

public class Cut_array {

	public static int[] solution(int[] numbers,int num1,int num2) {
		int[] arr = Arrays.copyOfRange(numbers, num1, num2+1);
		return arr; //주소값을 보여줌 
			
	}

	public static void main(String[] args) {
		int[] arr = {1,3,5};
		System.out.println(solution(arr,1,2));

	}

}
