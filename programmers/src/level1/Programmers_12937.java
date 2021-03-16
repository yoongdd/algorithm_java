package level1;

//정수 제곱근 판별
public class Programmers_12937 {
	public long solution(long n) {

		long answer = 0;

		double sqrt = Math.sqrt(n);
		int intSqrt = (int) sqrt;

		if (intSqrt == sqrt)
			answer = (long) Math.pow(intSqrt + 1, 2);
		else
			answer = -1;
		
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Programmers_12937 solution = new Programmers_12937();
		long n = 5;
		solution.solution(n);
	}
}
