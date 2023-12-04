package programmers;

import java.util.ArrayList;
import java.util.List;

/*
 * 정수가 담긴 리스트 num_list가 주어질 때, 
 * 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 
 * 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_길이에_따른_연산 {
	public static void main(String[] args) {
		int[] array = {2, 3, 4, 5};
		
		System.out.println(solution(array));
	}
	
	public static int solution(int[] nums) {
		int answer = 0;
		
        int size = checkNum(nums);
        if(size != 0) {
        	List<Integer> list = changeList(nums);
        	if(size >= 11) {
        		answer = addAll(list);
        		return answer;
        	}
        	answer = MultiplAll(list);
        }
        
        return answer;
    }
	
	private static List<Integer> changeList(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for(int num : nums) {
			list.add(num);
		}
		return list;
	}

	private static int addAll(List<Integer> list) {
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		return sum;
	}

	private static int MultiplAll(List<Integer> list) {
		int multi = list.get(0);
		
		for(int i = 1; i < list.size(); i++) {
			multi *= list.get(i);
		}
		
		return multi;
	}

	/*
	 * 2 ≤ nums의 길이 ≤ 20
	 * 1 ≤ nums의 원소 ≤ 9
	 */
	private static int checkNum(int[] nums) {
		int size = nums.length;
		if(size < 2 || size > 20) {
			size = 0;
			return size;
		}
		
		for(int num : nums) {
			if(num < 1 || num > 9) {
				size = 0;
				return size;
			}
		}
		
		return size;
	}
}
