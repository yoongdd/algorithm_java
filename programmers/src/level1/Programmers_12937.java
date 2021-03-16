package level1;

//Â¦¼ö¿Í È¦¼ö
public class Programmers_12937 {
	public String solution(int num) {
		String answer = "";

		if (num % 2 == 0)
			answer = "Even";
		else
			answer = "Odd";

		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Programmers_12937 solution = new Programmers_12937();
		int num = 0;
		solution.solution(num);
	}
}
