package Programmers.level0;

public class Removing_SpecificCharacters {

public static String solution(String my_string,String letter) {
		
		String answer = "";
		
		answer = my_string.replace(letter, "");
		
		return answer;
	}
	
	/*
	 * public String replace(CharSequence target,CharSequence replacement)
	 * 
		Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence. 
		The replacement proceeds from the beginning of the string to the end, for example, replacing "aa" with "b" in the string "aaa" will result in "ba" rather than "ab".
	 * 
	 * */

	public static void main(String[] args){
    	System.out.println(solution("BcBdbe","B"));
    }
}
