package baekjoon2941;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'c' && i < str.length() - 1) {
				if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
					i++;
				}
			} else if (ch == 'd' && i < str.length() - 1) {
				if (str.charAt(i + 1) == '-') {
					i++;
				} else if (str.charAt(i + 1) == 'z' && i < str.length() - 2) {
					if (str.charAt(i + 2) == '=') {
						i += 2;
					}
				}
			} else if (ch == 'l' && i < str.length() - 1) {
				if (str.charAt(i + 1) == 'j') {
					i++;
				}
			} else if (ch == 'n' && i < str.length() - 1) {
				if (str.charAt(i + 1) == 'j') {
					i++;
				}
			} else if (ch == 's' && i < str.length() - 1) {
				if (str.charAt(i + 1) == '=') {
					i++;
				}
			} else if (ch == 'z' && i < str.length() - 1) {
				if (str.charAt(i + 1) == '=') {
					i++;
				}
			}
			cnt++;
		}
		System.out.println(cnt);

	}

}