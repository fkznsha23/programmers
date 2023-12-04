package programmers;

/*
 * 머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다. 
 * 할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며, 
 * 편지를 가로로만 적을 때, 축하 문구 message를 적기 위해 
 * 필요한 편지지의 최소 가로길이를 return 하도록 solution 함수를 완성해주세요.
 */
public class Solution_편지 {
	public static void main(String[] args) {
		System.out.println(solution("i like you~"));
	}
	
	public static int solution(String message) {
		boolean check = checkMessage(message);
        int answer = 0;
        
        if(check && messageContent(message) != 0) {
        	answer = message.length()*2;
        }
        return answer;
    }
	
	/*
	 * 공백도 하나의 문자로 취급합니다.
	 * 1 ≤ message의 길이 ≤ 50
	 * 편지지의 여백은 생각하지 않습니다.
	 * message는 영문 알파벳 대소문자, ‘!’, ‘~’ 또는 공백으로만 이루어져 있습니다.
	 */
	private static boolean checkMessage(String message) {
		if(checkMessageLength(message)) {
			return true;
		}
		return false;
	}

	private static int messageContent(String message) {
		char[] cm = message.toCharArray();
		int count = 0;
		for(int i = 0; i < cm.length; i++) {
			if(cm[i] >= 'a' && cm[i] <= 'z') {
				count++;
			}
			if(cm[i] >= 'A' && cm[i] <= 'Z') {
				count++;
			}
			if(cm[i] == '!' || cm[i] == '~' || cm[i] == ' ') {
				count++;
			}
		}
		return count;
	}

	private static boolean checkMessageLength(String message) {
		int len = message.length();
		if(len >= 1 && len <= 50) {
			return true;
		}
		return false;
	}
}
