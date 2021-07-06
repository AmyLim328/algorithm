package baekjoon2908;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String B = sc.next();

		StringBuffer a = new StringBuffer(A);
		String reservedA = a.reverse().toString();

		StringBuffer b = new StringBuffer(B);
		String reservedB = b.reverse().toString();

		if (Integer.parseInt(reservedA) > Integer.parseInt(reservedB)) {
			System.out.println(reservedA);
		} else if (Integer.parseInt(reservedA) < Integer.parseInt(reservedB)) {
			System.out.println(reservedB);
		}

	}
}
