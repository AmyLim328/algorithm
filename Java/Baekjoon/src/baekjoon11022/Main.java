package baekjoon11022;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int [] a = new int [t];
		int [] b = new int [t];
		
		for (int i = 0; i < t; i ++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d \n", i + 1, a[i], b[i], a[i] + b[i]);
		}

	}
	
}