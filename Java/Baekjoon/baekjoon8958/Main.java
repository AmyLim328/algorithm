package baekjoon8958;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		String[] ox = new String[t];
		for (int i = 0; i < t; i++) {
			ox[i] = sc.next();
		}
		int[] res = new int[ox.length];
		for (int i = 0; i < ox.length; i++) {
			int o = 0;
			for (int j = 0; j < ox[i].length(); j++) {
				if (ox[i].charAt(j) == 'O') {
					o++;
					res[i] += o;
				} else if (ox[i].charAt(j) == 'X') {
					o = 0;
				}
			}
			System.out.println(res[i]);
		}

	}
}
