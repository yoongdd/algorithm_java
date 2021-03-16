package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//나누어 떨어지는 숫자 배열
public class Programmers_12910 {
	public int[] solution(int[] arr, int divisor) {

		List<Integer> answerList = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0)
				answerList.add(arr[i]);
		}
		
		if (answerList.isEmpty()) {
			answerList.add(-1);
		}

		int[] answer = new int[answerList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
		}
		Arrays.sort(answer);

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

		return answer;
	}

	public static void main(String[] args) {

		Programmers_12910 solution = new Programmers_12910();
		int[] arr = { 3, 2, 6 };
		int divisor = 10;
		solution.solution(arr, divisor);

	}

}
