package level1;

import java.util.Arrays;

//완주하지 못한 선수
public class Programmers_42576 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";

		Arrays.sort(participant);
		Arrays.sort(completion);

		int i = 0;
		for (i = 0; i < completion.length; i++) {
			if (!(participant[i].equals(completion[i]))) {
				answer = participant[i];
				break;
			}
		}
		answer = participant[i];
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Programmers_42576 solution = new Programmers_42576();

		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = { "josipa", "filipa", "marina", "nikola" };

		solution.solution(participant, completion);
	}

}
