package level1;

//���ڿ� �� p�� y�� ����
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
