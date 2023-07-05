package Programmers.level0;

public class Repeatedly_Printing_Characters {


	public static String solution(String my_string,int n) {
		String answer = "";
		String[] str = my_string.split("");

		for(int i = 0; i< my_string.length();i++) {
			answer += str[i].repeat(n);
		}


		return answer;
	}
	
	/*
	 * public String repeat(int count)
		Returns a string whose value is the concatenation of this string repeated count times.
		If this string is empty or count is zero then the empty string is returned.
	 * */
	
	//char은 repeat못함 문자열로 바꿔야된다. 


	public static void main(String[] args){
		System.out.print(solution("hello",3));
	}

}

