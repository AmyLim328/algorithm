package baekjoon3052;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		int[] remainder = new int[10];
		for (int i = 0; i < remainder.length; i++) {
			remainder[i] = num[i] % 42;
		}

		TreeSet ts = new TreeSet();
		for (int i = 0; i < remainder.length; i++) {
			ts.add(remainder[i]);
		}

		Iterator it = ts.iterator();

		int cnt = 0;
		while (it.hasNext()) {
			it.next();
			cnt++;
		}

		System.out.println(cnt);

	}

}
