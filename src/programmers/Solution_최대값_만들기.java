package programmers;

import java.util.Arrays;

/*
 * 정수 배열 numbers가 매개변수로 주어집니다. 
 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_최대값_만들기 {
	public static void main(String[] args) {
		int[] intArray = {0, 31, 24, 10, 1, 9};
		System.out.println(solution(intArray));
	}
	
	public static int solution(int[] numbers) {
		boolean check = checkNumbers(numbers);
		
        int answer = 0;
        if(check) {
        	Arrays.parallelSort(numbers);
        	int size = numbers.length;
        	int max = numbers[size - 1];
        	int secondMax = numbers[size - 2];
        	
        	answer = max*secondMax;
        }
        return answer;
    }

	/*
	 * 0 ≤ numbers의 원소 ≤ 10,000
	 * 2 ≤ numbers의 길이 ≤ 100
	 */
	private static boolean checkNumbers(int[] numbers) {
		int size = numbers.length;
		if(size < 2 || size > 100) {
			return false;
		}
		
		for(int num : numbers) {
			if(num < 0 || num > 10000) {
				return false;
			}
		}
		
		return true;
	}
}
