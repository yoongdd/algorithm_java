package level1;

//���ڼ��ڼ��ڼ��ڼ��ڼ�?
public class Programmers_12922 {

	public String solution(int n) {
		String answer = "";

		for (int i = 0; i < n; i++) {
			if (i%2 != 1) answer += "��";
			else answer += "��";
		}

		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Programmers_12922 solution = new Programmers_12922();
		int n = 6;
		solution.solution(n);
	}
}
