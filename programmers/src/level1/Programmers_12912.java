package level1;

//�� ���� ������ ��
public class Programmers_12912 {
	public long solution(int a, int b) {
		long answer = 0;

		if (a > b) {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		} else if (a < b) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else {
			answer = a;
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {

		Programmers_12912 solution = new Programmers_12912();

		solution.solution(5, 12);
	}

}
