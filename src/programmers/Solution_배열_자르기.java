package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, 
 * numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class Solution_배열_자르기 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		for(int num : solution(numbers, 1, 3)) {
			System.out.println(num);
		}
	}
	public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        
        if(checkNumbers(numbers, num1, num2)) {
        	List<Integer> list = new ArrayList<>();
        	for(int i = num1; i <= num2; i++) {
        		list.add(numbers[i]);
        	}
        	answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        
        return answer;
        // return Arrays.copyOfRange(numbers, num1, num2 + 1); 
    }
	
	/*
	 * 2 ≤ numbers의 길이 ≤ 30
	 * 0 ≤ numbers의 원소 ≤ 1,000
	 * 0 ≤num1 < num2 < numbers의 길이
	 */
	private static boolean checkNumbers(int[] numbers, int num1, int num2) {
		int size = numbers.length;
		if(size < 2 || size > 30) {
			return false;
		}
		
		int count = (int) Arrays.stream(numbers).filter(i -> i < 0).filter(i -> i > 1000).count();
		if(count != 0) {
			return false;
		}
		
		if(num1 < 0 || num1 >= num2 || num2 > size) {
			return false;
		}
		
		return true;
	}
}
