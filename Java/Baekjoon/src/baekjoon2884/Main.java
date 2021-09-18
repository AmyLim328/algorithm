package baekjoon2884;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();

		if (m - 45 >= 0) {
			m -= 45;
		}

		else if (m - 45 < 0) {
			m += 15;
			h--;
		}

		if (h < 0) {
			h = 23;
		}
		
		System.out.println(h + " " + m);

	}
	
}