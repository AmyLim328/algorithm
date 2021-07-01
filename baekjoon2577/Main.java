package baekjoon2577;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Input number : ");

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int mul = A * B * C;

		// 1.

//		int cnt0 = 0, cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0, cnt5 = 0, cnt6 = 0, cnt7 = 0, cnt8 = 0, cnt9 = 0;
//		for (int i = 0; i < String.valueOf(mul).length(); i++) {
//			if (String.valueOf(mul).charAt(i) == '0')
//			cnt0++;
//		else if (String.valueOf(mul).charAt(i) == '1')
//			cnt1++;
//		else if (String.valueOf(mul).charAt(i) == '2')
//			cnt2++;
//		else if (String.valueOf(mul).charAt(i) == '3')
//			cnt3++;
//		else if (String.valueOf(mul).charAt(i) == '4')
//			cnt4++;
//		else if (String.valueOf(mul).charAt(i) == '5')
//			cnt5++;
//		else if (String.valueOf(mul).charAt(i) == '6')
//			cnt6++;
//		else if (String.valueOf(mul).charAt(i) == '7')
//			cnt7++;
//		else if (String.valueOf(mul).charAt(i) == '8')
//			cnt8++;
//		else if (String.valueOf(mul).charAt(i) == '9')
//			cnt9++;
//		}
//		System.out.println(cnt0);
//		System.out.println(cnt1);
//		System.out.println(cnt2);
//		System.out.println(cnt3);
//		System.out.println(cnt4);
//		System.out.println(cnt5);
//		System.out.println(cnt6);
//		System.out.println(cnt7);
//		System.out.println(cnt8);
//		System.out.println(cnt9);

		// 2.

		int[] cnt = new int[10]; // 0 ~ 9
		for (int i = 0; i < String.valueOf(mul).length(); i++) {
			cnt[String.valueOf(mul).charAt(i) - '0']++;
		}
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}

	}

}
