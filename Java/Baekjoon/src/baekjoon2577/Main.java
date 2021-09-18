package baekjoon2577;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int mul = A * B * C;
		int[] cnt = new int[10];
		
		for (int i = 0; i < String.valueOf(mul).length(); i++) {
			cnt[String.valueOf(mul).charAt(i) - '0']++;
		}
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}

	}
	
}