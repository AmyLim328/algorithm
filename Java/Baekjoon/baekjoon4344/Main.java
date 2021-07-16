package baekjoon4344;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {

			int sum = 0;
			int cnt = 0;

			int array_length = sc.nextInt();
			int[] score = new int[array_length];

			for (int j = 0; j < array_length; j++) {
				score[j] = sc.nextInt();
			}
			for (int k = 0; k < array_length; k++) {
				sum += score[k];
			}
			double avg = (double) sum / array_length;

			for (int l = 0; l < array_length; l++) {
				if (score[l] > avg) {
					cnt++;
				}
			}
			double res = (((double) cnt / array_length) * 100);
			System.out.printf("%.3f%%\n", res);
		}

	}
}
