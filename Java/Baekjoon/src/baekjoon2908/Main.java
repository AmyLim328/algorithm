package baekjoon2908;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		StringBuffer sb1 = new StringBuffer(a);
		String reservedA = sb1.reverse().toString();

		StringBuffer sb2 = new StringBuffer(b);
		String reservedB = sb2.reverse().toString();

		if (Integer.parseInt(reservedA) > Integer.parseInt(reservedB)) {
			System.out.println(reservedA);
		} else if (Integer.parseInt(reservedA) < Integer.parseInt(reservedB)) {
			System.out.println(reservedB);
		}

	}
	
}