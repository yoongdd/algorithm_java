package level1;

//���ڼ��ڼ��ڼ��ڼ��ڼ�?
public class Programmers_12922 {

	public String solution(int n) {
		
		return new String(new char[n/2+1]).replace("\0", "����").substring(0, n);
	}

	public static void main(String[] args) {
		Programmers_12922 solution = new Programmers_12922();
		int n = 6;
		solution.solution(n);
	}
}
