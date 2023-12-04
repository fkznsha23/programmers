package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution_0떼기 {
	public static void main(String[] args) {
		System.out.println(solution("854130"));
	}
	
	public static String solution(String n_str) {
		boolean check = check(n_str);
        String answer = "";
        if(check) {
        	int count = removeZero(n_str);
        	answer = n_str.substring(count);
        }
        return answer;
    }
	
	private static boolean check(String n_str) {
		if(!n_str.matches("^[0-9]*")) {
			return false;
		}
		int n = Integer.valueOf(n_str);
		
		if(n < 2 && n > 10) {
			return false;
		}
		
		IntStream sst = IntStream.of(n);
		int count = (int) sst.filter(i -> i != 0).count();
		if(count == 0) {
			return false;
		}
		
		return true;
	}
	
	private static int removeZero(String n_str) {
		List<String> list = new ArrayList<>();
		for(int i = 0; i < n_str.length(); i++) {
			list.add(n_str.substring(i,i + 1));
		}
		
		int count = 0;
		for(String st : list) {
			if(Integer.valueOf(st) != 0) {
				break;
			}
			count++;
		}
		
		return count;
	}
}
