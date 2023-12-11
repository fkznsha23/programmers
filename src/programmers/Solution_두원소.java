package programmers;

import java.util.Arrays;

/*
 * 정수 리스트 num_list가 주어질 때, 
 * 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 
 * 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_두원소 {
	public static void main(String[] args) {
		int[] arr = {2, 1, 6};
		for(int a : solution(arr)) {
			System.out.println(a);
		}
	}
	
	public static int[] solution(int[] arr) {
		if(!checkArr(arr)) {
			return null;
		}
		
		int size = arr.length;
        int[] answer = Arrays.copyOf(arr, size + 1);
        answer[size] = arr[size - 1] > arr[size - 2] ? arr[size - 1] - arr[size - 2] : arr[size - 1]*2;
        
        return answer;
    }

	/*
	 * 2 ≤ num_list의 길이 ≤ 10
	 * 1 ≤ num_list의 원소 ≤ 9
	 */
	private static boolean checkArr(int[] arr) {
		int size = arr.length;
		if(size < 2 || size > 10) {
			return false;
		}
		
		int count = (int) Arrays.stream(arr).filter(i -> i >= 1 && i <= 9).count();
		if(count != size) {
			return false;
		}
		
		return true;
	}
}
