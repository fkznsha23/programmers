package programmers;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * 정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요. 
 * 음수가 없다면 -1을 return합니다.
 */
public class Solution_첫번째로_나온_음수 {
	public static void main(String[] args) {
		int[] array = {12, 4, 15, 46, 38, -2, 15};
		System.out.println(solution(array));
	}
	
	public static int solution(int[] array) {
        int answer = 0;
        
        if(checkArray(array)) {
        	try {
        		int minus = IntStream.of(array).filter(i -> i < 0).findFirst().getAsInt();
        		return Arrays.stream(array).boxed().collect(Collectors.toList()).indexOf(minus);
			} catch (NoSuchElementException e) {
				answer = -1;
			}
        	
        	answer = -1;
        }
        
        return answer;
    }
	
	/*
	 * 5 ≤ num_list의 길이 ≤ 100
	 * -10 ≤ num_list의 원소 ≤ 100
	 */
	private static boolean checkArray(int[] array) {
		int size = array.length;
		if(size < 5 || size > 100) {
			return false;
		}
		
		int count = (int) IntStream.of(array).filter(i -> i < -10).filter(i -> i > 100).count();
		if(count != 0) {
			return false;
		}
		
		return true;
	}
}
