package level1;

//���ڿ� �ٷ�� �⺻
//solution : ���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�
//"a234" false "1234" true

public class Programmers_12918 {
	public boolean solution(String s) {
		
		boolean answer = true;
		// ���ڿ� ���� 4 �Ǵ� 6 Ȯ��
		if (s.length() == 4 || s.length() == 6) {
			// ���ڿ� ���̸�ŭ �ݺ�
			for (int i = 0; i < s.length(); i++) {
				// ���ڰ� �ƴϸ� false
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
