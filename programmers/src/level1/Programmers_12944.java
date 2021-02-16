package level1;

//Æò±Õ ±¸ÇÏ±â
public class Programmers_12944 {
	public double solution(int[] arr) {
		double answer = 0;
		for (int i = 0; i < arr.length; i++) {
			answer += (arr[i]);
		}
		answer = answer / arr.length;
		
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Programmers_12944 solution = new Programmers_12944();
		int[] arr = { 1, 2, 3, 4 };
		solution.solution(arr);
	}

}
