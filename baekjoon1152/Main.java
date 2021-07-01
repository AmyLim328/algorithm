package baekjoon1152;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine().trim();

		int cnt = 0;
		int word_cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str != null && str.charAt(0) != ' ') {
				if (str.charAt(i) == ' ')
					cnt++;
				else if (str != null && str.charAt(i) != ' ')
					word_cnt = 1;
			}
		}
		if (cnt > 0)
			word_cnt = cnt + 1;
		System.out.println(word_cnt);

	}
}
