package programmers;

/*
 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
 * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_배열뒤집기 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		System.out.println(solution(array));
	}
	
	public static int[] solution(int[] num_list) {
		boolean check = checkArrays(num_list);
		
        int[] answer = {};
        
        if(check) {
        	answer = reversArray(num_list);
        }
        
        return answer;
    }
	
	/*
	 * 1 ≤ num_list의 길이 ≤ 1,000
	 * 0 ≤ num_list의 원소 ≤ 1,000
	 */
	private static boolean checkArrays(int[] num_list) {
		int size = num_list.length;
		if(size < 1 || size > 1000) {
			return false;
		}
		
		for(int num : num_list) {
			if(num < 0 || num > 1000) {
				return false;
			}
		}
		
		return true;
	}
	
	private static int[] reversArray(int[] num_list) {
		int size = num_list.length;
		int[] array = new int[size];
		for(int i = 0; i < size; i++) {
			int index = size - 1;
			array[i] = num_list[index - i];
		}
		
		return array;
	}
}
