package programmers;

import java.util.Arrays;

/*
 * 정수 배열 arr과 정수 n이 매개변수로 주어집니다. 
 * arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을, 
 * arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.
 */
public class Solution_배열_길이에_따라서_다른_연산 {
	public static void main(String[] args) {
		int[] arr = {49, 12, 100, 276, 33};
		for(int n : solution(arr, 27)) {
			System.out.println(n);
		};
	}
	
	public static int[] solution(int[] arr, int n) {
        if(checkPram(arr, n)) {
        	return null;
        }
        
        if(arr.length%2 == 0) {
        	for(int i = 0; i <= arr.length; i++) {
        		if(i%2 != 0) {
        			arr[i] = arr[i] + n;
        		}
        		
        	}
        	return arr;
        }
        
        for(int i = 0; i <= arr.length; i++) {
    		if(i%2 == 0) {
    			arr[i] = arr[i] + n;
    		}
    	}
        
//        for(int idx = arr.length%2 == 0 ? 1 : 0; idx <= arr.length; idx +=2) {
//        	arr[idx] = arr[idx] + n;
//        }
        
        return arr;
    }
	
	/*
	 * 1 ≤ arr의 길이 ≤ 1,000
	 * 1 ≤ arr의 원소 ≤ 1,000
	 * 1 ≤ n ≤ 1,000
	 */
	private static boolean checkPram(int[] arr, int n) {
		if(checkArr(arr.length)) {
			return false;
		}
		
		int count = (int) Arrays.stream(arr).filter(i -> checkArr(i)).count();
		if(count != 0) {
			return false;
		}
		
		return true;
	}

	private static boolean checkArr(int num) {
		if(num < 1 || num > 1000) {
			return false;
		}
		
		return true;
	}
}
