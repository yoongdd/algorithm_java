package level1;

import java.util.Arrays;

//K¹øÂ°¼ö
public class Programmers_42748 {

	public int[] solution(int[] array, int[][] commands) {

		int[] answer = new int[commands.length];

		for(int l = 0; l < commands.length; l++) {

			int i = commands[l][0]-1;
			int j = commands[l][1]-1;
			int k = commands[l][2]-1;
			
			int[] tmp= new int[j-i+1];
			int n = 0;
			
			for(int m = i; m <= j ; m++) {
				tmp[n] = array[m];
				n++;
			}
			
			Arrays.sort(tmp);
			answer[l] = tmp[k];
		}
		
		for(int a =0; a < answer.length; a++) {			
			System.out.print(answer[a]+" ");
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Programmers_42748 solution = new Programmers_42748();
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		solution.solution(array, commands);
	}
}
