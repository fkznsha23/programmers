package programmers;

public class Solution_점위치_구하기 {
	public static void main(String[] args) {
		int[] dots = {-7, 9};
		System.out.println(solution(dots));
	}
	
	public static int solution(int[] dots) {
        int answer = 0;
        
        if(checkDot(dots)) {
        	if(dots[0] < 0) {
        		answer = minusX(dots);
        		return answer;
        	}
        	answer = plusX(dots);
        }
        
        return answer;
    }

	private static int minusX(int[] dots) {
		if(dots[1] < 0) {
			return 3;
		}
		return 2;
	}

	private static int plusX(int[] dots) {
		if(dots[1] < 0) {
			return 4;
		}
		return 1;
	}

	/*
	 * dot의 길이 = 2
	 * dot[0]은 x좌표를, dot[1]은 y좌표를 나타냅니다
	 * -500 ≤ dot의 원소 ≤ 500
	 * dot의 원소는 0이 아닙니다.
	 */
	private static boolean checkDot(int[] dots) {
		if(checkSize(dots) && checkContent(dots)) {
			return true;
		}
		return false;
	}

	private static boolean checkSize(int[] dots) {
		if(dots.length != 2) {
			return false;
		}
		return true;
	}

	private static boolean checkContent(int[] dots) {
		for(int num : dots) {
			if(num >= -500 && num <= 500) {
				return true;
			}
		}
		return false;
	}
}
