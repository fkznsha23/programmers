package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution_짝수_홀수_개수 {
	public static void main(String[] args) {
		int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8};
		
		System.out.println(solution(numArray));
	}
	
	public static int[] solution(int[] num_list) {
        int[] answer = {};
        
        boolean check = checkNumList(num_list);
        List<Integer> numList = new ArrayList<>();
        if(check) {
        	numList = addEven(numList, num_list);
        	numList = addOdd(numList, num_list);
        }
        answer = numList.stream().mapToInt(i -> i).toArray();
        return answer;
    }

	private static List<Integer> addOdd(List<Integer> numList, int[] num_list) {
		IntStream numStream = IntStream.of(num_list);
		int odd = (int)numStream.filter(i -> i%2 == 1).count();
    	numList.add(odd);
    	
    	return numList;
	}

	private static List<Integer> addEven(List<Integer> numList, int[] num_list) {
		IntStream numStream = IntStream.of(num_list);
    	int even = (int)numStream.filter(i -> i%2 == 0).count();
    	numList.add(even);
    	
    	return numList;
	}
	private static boolean checkNumList(int[] num_list) {
		if(num_list.length < 1 && num_list.length > 100) {
			return false;
		}
		
		IntStream numStream = IntStream.of(num_list);
		int a = (int) numStream.filter(i -> i < 0 || i > 1000).count();
		if(a != 0) {
			return false;
		}
		return true;
	}
}
