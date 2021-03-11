package level1;

//문자열 내 p와 y의 개수
public class Programmers_12916 {
	boolean solution(String s) {
		boolean answer = true;
		
		int countP = 0;
		int countY = 0;
		
		String lowStr = s.toLowerCase();
		
		for(int i=0; i < s.length();i++) {
			if(lowStr.charAt(i) == 'p') countP++;
			if(lowStr.charAt(i) == 'y') countY++;
		}
		

		if(countP != countY) answer = false;
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {

		Programmers_12916 solution = new Programmers_12916();
		String s = "pPoooyY";
		solution.solution(s);
	}

}
