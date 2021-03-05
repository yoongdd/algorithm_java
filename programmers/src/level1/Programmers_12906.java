package level1;

import java.util.ArrayList;
import java.util.List;

//같은 숫자는 싫어
public class Programmers_12906 {

	public int[] solution(int[] arr) {

		List<Integer> answerList = new ArrayList<Integer>();
		answerList.add(arr[0]);
		
		// 비교
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				answerList.add(arr[i + 1]);
			}
		}

		System.out.print(answerList);

		int[] answer = new int[answerList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		Programmers_12906 solution = new Programmers_12906();
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		solution.solution(arr);
	}
}
