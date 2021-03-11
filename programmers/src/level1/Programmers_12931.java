package level1;

//자릿수 더하기
public class Programmers_12931 {
	public int solution(int n) {
		int answer = 0;

		while (n > 0) {
			answer += n % 10;
			n = n / 10;
		}
		
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Programmers_12931 solution = new Programmers_12931();
		int n = 987;
		solution.solution(n);

	}

}
