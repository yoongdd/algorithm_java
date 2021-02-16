package level1;

//문자열 다루기 기본
//solution : 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수
//"a234" false "1234" true

public class Programmers_12918 {
	public boolean solution(String s) {
		
		boolean answer = true;
		// 문자열 길이 4 또는 6 확인
		if (s.length() == 4 || s.length() == 6) {
			// 문자열 길이만큼 반복
			for (int i = 0; i < s.length(); i++) {
				// 숫자가 아니면 false
				if (s.charAt(i) < '0' || s.charAt(i) > '9') {
					answer = false;
					return answer;
				}
			}
		} else {
			answer = false;
			return answer;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Programmers_12918 solution = new Programmers_12918();
		String s = "a123";
		solution.solution(s);

	}

}
