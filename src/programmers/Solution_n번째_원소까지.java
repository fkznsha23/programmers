package programmers;

import java.util.Arrays;

/*
 * 정수 리스트 num_list와 정수 n이 주어질 때, 
 * num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_n번째_원소까지 {
	public static void main(String[] args) {
		int [] array = {5, 2, 1, 7, 5};
		System.out.println(solution(array, 3));
	}
	
	public static int[] solution(int[] array, int n) {
        int[] answer = {};
        
        if(checkPram(array, n)) {
        	int[] newArray = new int[n];
        	for(int i = 0; i < n; i++) {
        		newArray[i] = array[i];
        	}
        	answer = newArray;
//        	answer = Arrays.copyOfRange(array, 0, n);
        }
        
        return answer;
    }
	
	/*
	 * 2 ≤ num_list의 길이 ≤ 30
	 * 1 ≤ num_list의 원소 ≤ 9
	 * 1 ≤ n ≤ num_list의 길이
	 */
	private static boolean checkPram(int[] array, int n) {
		int size = array.length;
		if(size < 2 || size > 30) {
			return false;
		}
		
		int count = (int) Arrays.stream(array).filter(i -> i >= 1).filter(i -> i <= 9).count();
		if(count != size) {
			return false;
		}
		
		if(n < 1 || n > size) {
			return false;
		}
		
		return true;
	}
}
