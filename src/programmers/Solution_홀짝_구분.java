package programmers;

import java.util.Scanner;

// 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
public class Solution_홀짝_구분 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(checkNum(n)) {
        	String answer = n%2 == 0 ? n + " is even" : n + " is odd";
        	System.out.println(answer);
        }
    }
	
	// 1 ≤ n ≤ 1,000
	private static boolean checkNum(int n) {
		if(n < 1 || n > 1000) {
			return false;
		}
		
		return true;
	}
}
