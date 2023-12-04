package programmers;

import java.util.ArrayList;
import java.util.List;

// 0 ≤ end_num ≤ start_num ≤ 50
public class Solution_카운트다운 {
	public static void main(String[] args) {
		System.out.println(solution(10, 5));
	}
	
	public static int[] solution(int start, int end_num) {
        int[] answer = {};
        
        boolean check = checkNum(start, end_num);
        if(check) {
        	List<Integer> numList = new ArrayList<>();
        	for(int i = start; i >= end_num; i--) {
        		numList.add(i);
        	}
        	answer = numList.stream().mapToInt(i -> i).toArray();
        }
        
        return answer;
    }

	private static boolean checkNum(int start, int end_num) {
		if(start > 50 && end_num < 0) {
			return false;
		}
		return true;
	}
}
