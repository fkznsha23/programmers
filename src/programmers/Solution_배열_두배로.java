package programmers;

import java.util.stream.IntStream;

/*
 * 정수 배열 numbers가 매개변수로 주어집니다. 
 * numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_배열_두배로 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		for(int num : solution(numbers)) {
			System.out.println(num);
		}
	}
	public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        if(checkNumbers(numbers)) {
        	answer = IntStream.of(numbers).map(i -> i*2).toArray();
        }
        
        return answer;
    }

	/*
	 * -10,000 ≤ numbers의 원소 ≤ 10,000
	 * 1 ≤ numbers의 길이 ≤ 1,000
	 */
	private static boolean checkNumbers(int[] numbers) {
		int size = (int) IntStream.of(numbers).count();
		if(size < 1 || size > 1000) {
			return false;
		}
		
		int check = (int) IntStream.of(numbers).filter(i -> i >= -10000)
											   .filter(i -> i <= 10000)
											   .count();
		if(size != check) {
			return false;
		}
		
		return true;
	}
}
