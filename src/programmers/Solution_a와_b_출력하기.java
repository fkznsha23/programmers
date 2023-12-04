package programmers;

import java.util.Scanner;

// -100,000 ≤ a, b ≤ 100,000
public class Solution_a와_b_출력하기 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean c = checkNumber(a, b);
        
        if(c) {
        	System.out.println("a = " + a);
        	System.out.println("b = " + b);
        }

    }

	private static boolean checkNumber(int a, int b) {
		if(-100000 > a && b > 100000) {
			return false;
		}
		return true;
	}
}
