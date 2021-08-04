package beakjoon11720;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String str = sc.next();
		int res = 0;
		for (int i = 0; i < n; i++) {
			res += str.charAt(i) - '0';
		}
		System.out.println(res);
	}
}
