package programmers;
/*
	0 ≤ numbers의 원소 ≤ 1,000
	1 ≤ numbers의 길이 ≤ 100
	정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
*/

import java.util.Arrays;
import java.util.OptionalDouble;

public class Solution_배열의_평균값 {
	public static void main(String[] args) {
		int[] sol = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		System.out.println(solution(sol));
	}
	
	public static double solution(int[] numbers) {
        double answer = 0;
        
        boolean check = checknumbers(numbers);
        if(check) {
        	OptionalDouble answer2 = Arrays.stream(numbers).average();
        	answer = answer2.getAsDouble();
        }
        
        return answer;
    }

	private static boolean checknumbers(int[] numbers) {
		if(numbers.length < 1 && numbers.length > 100) {
			return false;
		}
		
		for(int num : numbers) {
			if(num < 0 && num > 1000) {
				return false;
			}
		}
		return true;
	}
}
