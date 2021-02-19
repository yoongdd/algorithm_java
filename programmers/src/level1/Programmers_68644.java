package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//두 개 뽑아서 더하기
public class Programmers_68644 {
	
	public int[] solution(int[] numbers) {
		
		List<Integer> answerList = new ArrayList<Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int sum = numbers[i] + numbers[j];
				if(!answerList.contains(sum)) {
					answerList.add(sum);
				}
			}
		}

		int[] answer = new int[answerList.size()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = answerList.get(i);
		}
		
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {
		Programmers_68644 solution = new Programmers_68644();
		int[] numbers = { 2, 1, 3, 1, 4 };
		solution.solution(numbers);
	}
}
