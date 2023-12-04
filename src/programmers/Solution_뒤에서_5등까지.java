package programmers;

import java.util.Arrays;

public class Solution_뒤에서_5등까지 {
	public static void main(String[] args) {
		int[] answer = {12, 4, 15, 46, 38, 1, 14};
		int[] newAnswer = solution(answer);
		
		System.out.println(newAnswer);
	}
	
	public static int[] solution(int[] num_list) {
        int[] answer = num_list;
        boolean good = checkAnswer(answer);
        
        int[] newAnswer = {};
        if(good) {
        	newAnswer = cutAnswer(answer);
        }
        return newAnswer;
    }

	private static int[] cutAnswer(int[] answer) {
		Arrays.sort(answer);
		int[] newAnswer = new int[5];
		
		for(int i = 0; i < 5; i++) {
			newAnswer[i] = answer[i];
		}
		return newAnswer;
	}

	private static boolean checkAnswer(int[] answer) {
		if(answer.length < 1 && answer.length > 30) {
			return false;
		}
		
		for(int number : answer) {
			if(number < 1 && number > 100) {
				return false;
			}
		}
		
		return true;
	}
}
