package baekjoon10809;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int[] res = new int[26];
		int letter = 'a';

		for (int i = 0; i < res.length; i++) {
			res[i] = S.indexOf(letter);
			letter++;
		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
