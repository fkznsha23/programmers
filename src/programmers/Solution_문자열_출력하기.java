package programmers;

import java.util.Scanner;

public class Solution_문자열_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        boolean b = checkText(a);
        
        if(b) {
        	System.out.println(a.trim());
        }
    }

	private static boolean checkText(String a) {
		if(a.length() < 1 && a.length() >1000000) {
			return false;
		}
		return true;
	}
}