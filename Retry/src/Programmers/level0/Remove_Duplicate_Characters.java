package Programmers.level0;

public class Remove_Duplicate_Characters {
	
	public static String solution(String my_string) {
		String answer = "";
		
		for(int i = 0; i<my_string.length();i++) {
			if(!answer.contains(String.valueOf(my_string.charAt(i)))) {
				answer += my_string.charAt(i);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.print(solution("We are the world"));

	}

}
