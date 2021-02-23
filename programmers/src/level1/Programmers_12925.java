package level1;

//문자열을 정수로 바꾸기
public class Programmers_12925 {
	public int solution(String s) {
	
		int answer = Integer.parseInt(s);
		System.out.println(answer);
		return answer;
		
	}

	public static void main(String[] args) {
		Programmers_12925 solution = new Programmers_12925();
		String s = "+1234";
		solution.solution(s);

	}

}
