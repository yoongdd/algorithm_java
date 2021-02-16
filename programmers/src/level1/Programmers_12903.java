package level1;

//가운데 글자 가져오기
public class Programmers_12903 {
	public String solution(String s) {
		
		String answer = "";
		int center = (s.length() / 2);
		
		if ((s.length() % 2) == 0) {
			answer = s.substring(center-1, center+1);
		} else {
			answer = s.substring(center, center+1);
		}
		
		System.out.println(answer);
		return answer;
	}


	public static void main(String[] args) {
		Programmers_12903 solution = new Programmers_12903();
		String s = "abcde";
		solution.solution(s);

	}

}
