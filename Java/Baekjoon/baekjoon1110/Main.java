package baekjoon1110;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int newNum = n;
		int a, b;
		int cnt = 0;

		while (true) {
			a = newNum / 10;
			b = newNum % 10;
			newNum = b * 10 + (a + b) % 10;
			cnt++;

			if (n == newNum) {
				break;
			}
		}

		System.out.println(cnt);

	}
}
